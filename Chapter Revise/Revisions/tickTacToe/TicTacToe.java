package Revisions.tickTacToe;

import Revisions.tickTacToe.Exceptions.InvalidInputException;

public class TicTacToe {
    private char[][]  grind= new char[3][3];
    private Player player;
    private GameStatus gameStatus;
    private int numberOfBoxChosen;


    public TicTacToe(Player player){
        this.player = player;
        restartGame();
        gameStatus = GameStatus.ISGOING;
        int number = 1;
    }



    public  void chooseInputPosition(char choice){
        int row = getRow(choice);
        int column = getColumn(choice);
        if(row == -1 || column == -1) throw new InvalidInputException();
        else if(grind[row][column] == 'X' || grind[row][column] == 'O') throw new InvalidInputException();
        else {grind[row][column] = player.getElement();
            numberOfBoxChosen++;
            boolean result = false;
            if(numberOfBoxChosen >= 5){
               result =  checkIfPlayerWins();
            }
            if(result) gameStatus = GameStatus.WON;
            changeCurrentPlayer();
        }


    }
    public boolean checkIfPlayerWins(){
        if(gameIsWonByRow() || gameIsWonByColumn() || gameIsWonDigonally()) return true;

        return false;
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

    private void changeGameStatusToRestart(){
        gameStatus = GameStatus.RESTART;
        restartGame();
    }


    private void restartGame(){
        int number = 1;
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                grind[count][counter] = (char) ('0' + number++);

            }
        }
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

    private boolean gameIsWonByRow(){
            for(int count = 0; count < 3; count++){
                int check  = 0;
                for(int counter = 0; counter < 3; counter++){
                if(grind[count][counter] == player.getElement()) check++;
                }
                if(check == 3) return true;
            }
        return false;
    }

    private boolean gameIsWonByColumn(){
        int column = 0;
        for(int count = 0; count < 3; count++){
            int check  = 0;
            for(int counter = 0; counter < 3; counter++) {
                if (grind[counter][column] == player.getElement()) check++;
            }
            if(check == 3) return true;
            column++;
        }
        return false;
    }

    private boolean gameIsWonDigonally () {
        if(grind[0][0] == player.getElement() && grind[1][1] == player.getElement() && grind[2][2] == player.getElement()) return true;
        else if (grind[0][2] == player.getElement() && grind[1][1] == player.getElement() && grind[2][0] == player.getElement()) return true;

        return false;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getNumberOfBoxChosen() {
        return numberOfBoxChosen;
    }
}
