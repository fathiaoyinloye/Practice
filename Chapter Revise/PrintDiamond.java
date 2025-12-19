public class PrintDiamond{
  public static void main (String... args){
	int starBegin = 5;
  	int starEnds = 5;
  	for(int count = 1; count <= 9; count++){

  		for(int counter = 1; counter <= 9; counter++){
  		    	if(counter >= starBegin && counter <= starEnds) System.out.print("*");
            else System.out.print(" ");
  	  }

  	  System.out.println();  	  	      
  	if(count >= 5){ starBegin+= 1;starEnds -= 1;}
	  else if(count < 5){starBegin-= 1; starEnds += 1;}
  	}
  

  
  }
}
