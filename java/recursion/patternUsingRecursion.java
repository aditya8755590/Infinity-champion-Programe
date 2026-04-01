import java.util.*;
public class patternUsingRecursion {
      public static void main(String[] args) {
       //****
       //*** 
       //** 
       //*
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       printPattern(n,0);
System.out.println("Second triagle ");
        normal(n,0);
       
      }
      public static void printPattern(int n,int m){
       if(n==0){
        return;
       }
      if(m<n){
       System.out.print("*");
       printPattern(n, m+1);
      }
      else{
       System.out.println();
       printPattern(n-1,0);
      }

      }

      static void normal(int n,int m){
       if(n==0){
        return;
       }
      if(m<n){
       normal(n, m+1);
       System.out.print("*");
      }
      else{
       normal(n-1,0);
       System.out.println();
      }

      }
     
}
