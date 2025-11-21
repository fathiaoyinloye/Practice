public class LeetCodeMoney {
       	public static void main (String... args){
	int n = 10;
	int sumMoney = 0;
                int y = 7;
                int x = 1;
	
            for(int count = 1; count <= n ; count++){
	System.out.println(count);

                 sumMoney += count;

	            if(count == y ){
	                    count = x;
	                    y += 1;
	                    x += 1;
	                    n -= 6;

	            }


            }

		System.out.println(sumMoney);



	}

}