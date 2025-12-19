let number = 7;
let starBegin = number;
let starEnds = number;

  	for(let count = 1; count <= number; count++){
  	        let numberCheck = 2;
  	        let otherNumber = count;
  		for(let counter = 1; counter <= number * 2; counter++){

  		    	if(counter >= starBegin && counter <= starEnds) {
  		    	      if (counter <=number) process.stdout.write("" +otherNumber--);
  		    	      else process.stdout.write("" + numberCheck++);
  		    	      
  		    	      }
            else  process.stdout.write(" ");
            
  	  }
      numberCheck += 1;
  	  console.log("");  	  	      
	  starBegin-= 1; starEnds += 1;
  	}
  

  
  


