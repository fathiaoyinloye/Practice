public class CalculateMoney{
     
    public static int getTotalMoney(int days){
        int moneyToIncreaseDaily = 0;
        int weekIncreasing = 7;
        int totalMoney = 0;
        int newMoneyValue = 1;
        for(int count = 1; count <= days; count++){
              moneyToIncreaseDaily ++;
            totalMoney += moneyToIncreaseDaily;
            if(moneyToIncreaseDaily == weekIncreasing){
                moneyToIncreaseDaily = newMoneyValue;
                weekIncreasing += 1;
                newMoneyValue ++;
            }


        }
     return totalMoney;  
    }
    }
