package Revisions.tickTacToe;

public enum Player {

    FIRST('O'),
    SECOND('X');

    private char element;
     Player(char element){
        this.element = element;

    }
    public char getElement(){
         return element;
    }

}
