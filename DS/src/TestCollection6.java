import java.util.*;  
class TestCollection6{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravicha");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ravi");  
  al2.add("Hanumat");
  al2.add("Hanumat1");  
  
  //al.retainAll(al2);  
  al.removeAll(al2);
  
  System.out.println("iterating the elements after retaining the elements of al2...");  
  Iterator<String> itr=al.iterator();  
  for(String s: al)
  {
	  System.out.println("s" + s);
  }
  for(String s2: al2)
  {
	  System.out.println("s2" + s2);
  }
  
//  while(itr.hasNext()){  
//   System.out.println(itr.next());  
//  }  
 }  
}  