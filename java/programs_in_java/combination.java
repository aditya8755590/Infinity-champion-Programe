import java.util.*;
public class combination {
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
for(int i=1;i<=T;i++){
int n=sc.nextInt();
int r=sc.nextInt();
System.out.println(combination1(n,r));
 }
}
public static int combination1(int n,int r){
	int numinator=fact(n);
	int deniominator=fact(r)*fact(n-r);
	int ans=numinator/deniominator;
	return ans;

}
public static int fact(int num){
	int factor=1;
	while(num>0){
		factor=factor*num;
		num--;
	}
	return factor;
}
    

}