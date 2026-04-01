public class palindromatic_pattern {
 public static void main(String[] args) {
//outer
int n=5;
for(int i=1; i<=n;i++){
// spaces
for (int j=1; j<=n-i; j++) {
System.out.print(" ");
}
//numbers decresing
for (int j=i; j>=1; j--) {
System.out.print(j+ " ");
}
// number increing
for (int j=2; j<=i; j++) {
 System.out.print(j + " ");
 }

System.out. println();
}
}
}