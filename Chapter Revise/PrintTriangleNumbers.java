public class PrintTriangleNumbers{
  public static void main (String... args){
	int number = 7;
	
	int starBegin = number;
  int starEnds = number;

  	for(int count = 1; count <= number; count++){
  	        int numberCheck = 2;
  	        int otherNumber = count;
  		for(int counter = 1; counter <= number * 2; counter++){

  		    	if(counter >= starBegin && counter <= starEnds) {
  		    	      if (counter <=number) System.out.print(otherNumber--);
  		    	      else System.out.print(numberCheck++);
  		    	      
  		    	      }
            else System.out.print(" ");
            
  	  }
      numberCheck += 1;
  	  System.out.println();  	  	      
	  starBegin-= 1; starEnds += 1;
  	}
  

  
  }
}

