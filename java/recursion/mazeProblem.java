import java.util.*;
public class mazeProblem {
 static int n=3;
 public static void main(String[] args) {
  // for count 
  System.out.println(permu("", 3, 3));
  //System.out.println(count(1,1)+"ans");
 }
 // for count 
 // static int count(int r,int l){
 //  if(l==n||r==n){
 //   return 1;
 //  }
 //  int right=count(r,l+1);
 //  int down=count(r+1,l);
 //  return right+down;}

// now wnat to return all the permutation of paths
static ArrayList<String> permu(String ans,int r,int d){
 if(r==1&&d==1){
ArrayList<String> list=new ArrayList<>();
list.add(ans);
return list;
 }
 ArrayList<String> list=new ArrayList<>();
 // if we want to momve the maze in to digonally 
 // if(d>1&&r>1){
 //  list.addAll(permu(ans+'V',r-1,d-1));
 // }
 if(d>1){
 list.addAll(permu(ans+'D',r,d-1));}
 if(r>1){
 list.addAll(permu(ans+'R',r-1,d));
}
return list;
}
//  if I also want to move digonally so one cll is added when both r,d is minus and for this the condition is 
// condition is r>1&&d>1  so you can add the traking 

}
