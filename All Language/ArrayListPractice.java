import java.util.ArrayList;

public class ArrayListPractice{

	public static void main (String... args){

	ArrayList <String> grocery = new ArrayList <String>();
		
		grocery.add("Almond Milk");
		grocery.add("Egg");
		grocery.add("Fish");

		int size = grocery.size();
		 grocery.set(0, "Milk");
		System.out.println(size);

		for(String items : grocery){
			System.out.println(items);



		}
	}



}