class Sample<T> // Generic class
{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenricClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample<Integer> s1=new Sample<Integer>();
		s1.setData(15);
		System.out.println("Display from generic class of type integer: " +s1.getData());
		Sample<String> s2=new Sample<String>();
		s2.setData("Java Genrics");
		System.out.println("Display from generic class of type integer: " +s2.getData());
		Sample<Float> s3=new Sample<Float>();
		s3.setData(120.35f);
		System.out.println("Display from generic class of type integer: "+s3.getData());

	}

}
