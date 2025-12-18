public class PrintTriagle{
  public static void main (String... args){
    for(int count = 1; count <=10; count++){
      for(int counter = 1; counter <= count; counter ++){
            System.out.print("* ");
      }
            System.out.println();
    }
              System.out.println();
   for(int count = 10; count >=1; count--){
      for(int counter = count; counter >= 1; counter--){
            System.out.print("* ");
      }
            System.out.println();
    }
    System.out.println();
    int check = 0;
   for(int count = 10; count >=1; count--){
      for(int counter = 1; counter <= 10; counter++){
          if(counter <= check)  System.out.print("  ");
          else System.out.print("* ");
      }
            System.out.println();
            count++;
            check++;
            if(check == 10) break;
    }  
    System.out.println();
    int checker = 10;
   for(int count = 10; count >=1; count--){
      for(int counter = 1; counter <= 10; counter++){
          if(counter < checker)  System.out.print("  ");
          else System.out.print(" *");
      }
            System.out.println();
            count++;
            checker--;
            if(checker == 0) break;
    }
  }
}
