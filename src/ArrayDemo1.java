import java.util.*;
public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] n1= {2,3,12,4,5,-2};

        int[] n3 = new int[5];
 
        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
		//copying entire n2 array to n1
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2= " + Arrays.toString(n2));
        //copying element from  index 2 on n1 array
        //copying element to index1 of n3 array
        //2 elements will be copies
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3= " + Arrays.toString(n3));
        		
        		

	}

}
