public class butterfly_pattern {
    
    public static void main(String[] args) {
        int i,j,k,l,m;
        int n=20;
        for(i = 1; i <=n; i++) {
            for(j=0;j<=n-i;j++){
                System.out.print("*");
            }
            for(k=1;k<i;k++){
                System.out.print(" ");
            }
            for(l=1;l<i;l++){
                System.out.print(" ");
            }
            for(m=0;m<=n-i;m++){
                System.out.print("*");
            }
            System.out.println();

            
            
        }
        for(i=1;i<=n;i++){
            for(j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for( k=j;k<=n;k++){
                System.out.print(" ");
            }
            for(l=i;l<n;l++){
                System.out.print(" ");
            }
            for(m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

