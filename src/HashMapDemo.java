import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args)
	{
		HashMap<Integer,String> languages=new HashMap<>();
		languages.put(3, "python");
		languages.put(3, "Javascript");
		System.out.println("HashMap: "+languages);
		String value=languages.get(1);
		System.out.println("value at index1: "+value);
		System.out.println("value at index1: "+languages.get(3));
		System.out.println("keys: "+languages.keySet());
		System.out.println("keys: "+languages.values());
		System.out.println("key/value mappings: "+languages.entrySet());
		languages.replace(2, "c++");
		//iterator through keys only
		System.out.println("keys");
		for(Integer key : languages.keySet())
		{
			System.out.println(key+"- "+ languages.get(key) );
			System.out.println(",");
		}
		
		
		
		
		
		
	}

}
