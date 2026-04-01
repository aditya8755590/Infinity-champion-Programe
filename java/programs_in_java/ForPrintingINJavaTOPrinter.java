import javax.print.*;
import java.io.*;
public class ForPrintingINJavaTOPrinter {
    public static void printToPrinter(String text) {
        try {
            // Convert text into a byte array stream
            InputStream inputStream = new ByteArrayInputStream(text.getBytes());

            // Define the document flavor (what type of data we are printing)
            DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

            // Create the document
            Doc doc = new SimpleDoc(inputStream, flavor, null);

            // Locate default print service (printer)
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();

            if (service != null) {
                // Create a print job
                DocPrintJob job = service.createPrintJob();

                // Print the document
                job.print(doc, null);

                System.out.println("Printing started... check the printer!");
            } else {
                System.out.println("No printer found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // For testing
 public static void main(String[] args) {
        printToPrinter("Hello Interviewer!\nThis text is coming directly from my Java program.");
    }
    
}