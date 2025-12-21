package Revisions.tickTacToe;

import Revisions.tickTacToe.Exceptions.InvalidInputException;

public class TicTacToe {
    private char[][]  grind= new char[3][3];
    private int number = 97;
    private Player player;
    private GameStatus gameStatus;
    private int numberOfBoxChosen;


    public TicTacToe(Player player){
        this.player = player;
        gameStatus = GameStatus.ISGOING;
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                grind[count][counter] = (char) (number++);
            }
        }
    }



    public  void chooseInputPosition(char choice){
        int row = getRow(choice);
        int column = getColumn(choice);
        if(row == -1 || column == -1) throw new InvalidInputException();
        else if(grind[row][column] == 'X' || grind[row][column] == 'O') throw new InvalidInputException();
        else {grind[row][column] = player.getElement();
            changeCurrentPlayer();
            numberOfBoxChosen++;
            boolean result = false;
            if(numberOfBoxChosen >= 5){
               result =  checkIfPlayerWins(choice);
            }
            if(result) gameStatus = GameStatus.WON;

        }


    }
    public boolean checkIfPlayerWins(char choice){
        boolean result = false;
        result = gameIsWonByRow(choice);
        result = gameIsWonByColumn(choice);
        result = gameIsWonDigonally(choice);
        return result;
    }

    public void changeCurrentPlayer(){
        if(player == Player.FIRST) player = Player.SECOND;
        else player = Player.FIRST;
    }

    public Player getPlayer(){
            return player;
    }

    private int getRow(char choice){
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                if(grind[count][counter] == choice) return count;
            }
        }
        return -1;
    }

    private int getColumn(char choice){
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                if(grind[count][counter] == choice) return counter;
            }
        }
        return -1;
    }




  public void displayGrind(){
      for(int count = 0; count < 3; count++){
          for(int counter = 0; counter < 3; counter++){
              System.out.print(grind[count][counter] + "    ");
          }
          System.out.println();
      }
  }


    @Override
    public String toString(){
        StringBuilder printGrind = new StringBuilder();
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                printGrind.append( grind[count][counter] + "     ");
            }
            printGrind.append("\n");
        }
        return printGrind.toString();
    }

    public char[][] getGrind() {
        return grind;
    }

    private boolean gameIsWonByRow(char choice){
            for(int count = 0; count < 3; count++){
                int check  = 0;
                for(int counter = 0; counter < 3; counter++){
                if(grind[count][counter] == player.getElement()) {check++;
                    System.out.println("played" + player.getElement() + "check " + check);}
                }
                if(check == 3) return true;
            }
        return false;
    }

    private boolean gameIsWonByColumn(char choice){
        int column = 0;
        for(int count = 0; count < 3; count++){
            int check  = 0;
            for(int counter = 0; counter < 3; counter++) {
                if (grind[counter][column] == choice) check++;
            }
            if(check == 3) return true;
            column++;
        }
        return false;
    }

    private boolean gameIsWonDigonally (char choice) {
        if(grind[0][0] == choice && grind[1][1] == choice && grind[2][2] == choice) return true;
        else if (grind[0][2] == choice && grind[1][1] == choice && grind[2][0] == choice) return true;

        return false;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getNumberOfBoxChosen() {
        return numberOfBoxChosen;
    }
}
