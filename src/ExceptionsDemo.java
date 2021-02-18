
public class ExceptionsDemo {

	public static void main(String[] args) {
		String languages[]= {"C", "C++","java","Python"};
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println(languages[i]);
				}}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
