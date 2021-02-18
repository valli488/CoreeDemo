
public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("James Gosling");
		int l=str.length();
		System.out.println("The length of String is:"+ 1);
		System.out.println("The capacity of String is:"+ str.capacity());
		System.out.println("the reverse string is: "+ str.reverse());
		
		System.out.println("The substring: "+str.substring(0,5));
		str.replace(5, 10, "Java");
		System.out.println(str);
		str.delete(2, 5);
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}
