package Practice;
import java.util.ArrayList;
import java.util.List;

public class ListComparision {

  public static void main(String[] args) {
    List<String>  list = new ArrayList<String>();

    list.add("1");
    list.add("2");
    list.add("3");
 
    list.add("java2s.com");


    List<String> list1 = new ArrayList<String>();

    list1.add("1");
    list1.add("2");
    list1.add("3");
 
    list1.add("javas.com");
    

    System.out.println("List has:" + list);
    System.out.println("List1 has:" + list1);

    boolean b  = list.equals(list1);
  
    System.out.println(b);
  }
}