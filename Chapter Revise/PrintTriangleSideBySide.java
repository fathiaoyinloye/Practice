public class PrintTriangleSideBySide{
  public static void main (String... args){
    int firstStar = 1;
    int firstSpace = 12;
    int secondStar = 22;
    int secondSpace = 24;
    int thirdStar =25;
    int thirdSpace = 45;

    for(int count = 10 ; count >= 1; count--){
          for(int counter = 1; counter <= 46; counter++){
              if(counter <= firstStar ) System.out.print("*");
                else if(counter <= firstSpace )System.out.print(" ");
                else if(counter <= secondStar )System.out.print("*");
                else if(counter <= secondSpace )System.out.print(" ");
                else if(counter >= thirdStar  && counter <= 34 )System.out.print("*");
                else if(counter <= thirdSpace )System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
            firstStar++;
            secondStar--;
            secondSpace++;
            thirdStar++;
            thirdSpace--;
    }

  }
}
