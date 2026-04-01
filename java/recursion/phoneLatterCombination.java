import java.util.*;
public class phoneLatterCombination {
 public static void main(String[] args) {
  //ArrayList<String> list=new ArrayList<>();
  System.out.println(keypad("","12"));
 }
 public static ArrayList keypad(String ans,String num){
  if(num.length()==0){
   ArrayList<String> list=new ArrayList<>();
   list.add(ans);
   return list;
  }
  int key=(int)num.charAt(0)-'0';
  ArrayList<String> list=new ArrayList<>();
  for(int i=(key-1)*3;i<key*3;i++){
   // ArrayList<String> list=new ArrayList<>();
   char ch=(char)('a'+i);
  list.addAll(keypad(ans+ch, num.substring(1)));

  }
  return list;
  

 }
 
}
