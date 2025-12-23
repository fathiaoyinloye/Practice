package Revisions.tickTacToe;
import Revisions.tickTacToe.Exceptions.InvalidInputException;

import java.util.Scanner;

public class TicTacToeMain {


    //static TicTacToe  ticTacToe = new TicTacToe(Player.FIRST);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        startGame();
    }

    public static void startGame() {
        TicTacToe game = chooseWhoBegins();
        if (game == null) {
            System.out.println("Invalid Input, Please Choose either 1 or 2");
            chooseWhoBegins();
        }
        else{
            chooseInputPositionOnGrid(game);
            printGrind(game);

        }
    }

    public static void chooseInputPositionOnGrid(TicTacToe game){
        printGrind(game);
        System.out.print("Choose Input Position: ");
        char choice = scanner.next().charAt(0);
        try {
            game.chooseInputPosition(choice);
        }
        catch (InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }

    public static TicTacToe chooseWhoBegins() {
        printMenu();
        System.out.print("Choose your choice from menu above: ");
        String choice = scanner.next();
        switch (choice) {
            case "1" -> {
                 TicTacToe game = new TicTacToe(Player.FIRST);
                 return game;
            }
            case "2" -> {
                TicTacToe game = new TicTacToe(Player.SECOND);
                return game;

            }
        }
        return null;
    }


    public static void printMenu(){
        String output = """
                *****************************
                *   WELCOME TO THE GAME     *
                *****************************
                *   Who Is Going First?     *
                *===========================*
                * 1. First Player plays 'O' *
                * 2. Second Player plays 'X'*
                *****************************

                """;
        System.out.println(output);
    }
    public static void printGrind(TicTacToe ticTacToe){
        System.out.println(ticTacToe);
    }

}
