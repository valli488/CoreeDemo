import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
         ArrayList<String>al=new ArrayList<String>();
         al.add("Jim");
         al.add("Jeery");
         al.add("John");
         al.add(1,"Jive");
         System.out.println("element at 2nd position:"+al.get(2));
         ListIterator<String>Itr=al.listIterator();
         System.out.println("Traversing elements forward directoin...");
         while(Itr.hasNext())
         {
        	 System.out.println(Itr.next());
         }
         System.out.println("traversing elements in backward dir");
         while(Itr.hasPrevious()) {
        	 System.out.println(Itr.previous());
         }
	}
}
         
