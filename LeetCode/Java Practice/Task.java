import java.util.ArrayList;
public class Task{

	public static ArrayList<Object> getIntegers(Object[] arrays){
		ArrayList<Object> output = new ArrayList<>();
		
		for(Object value : arrays){

			if(value instanceof String ) output.add(value);
		}
	  return output;
	}

	public static void main (String... args){
	Object[] arrays = {1,3,"dfghj", 1.0, 6,'e'};
	
	  System.out.println(getIntegers(arrays));


	

	
	
	}


}
