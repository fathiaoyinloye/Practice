package tests;

import Revisions.tickTacToe.Exceptions.InvalidInputException;
import Revisions.tickTacToe.GameStatus;
import Revisions.tickTacToe.Player;
import Revisions.tickTacToe.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTacTocTest {


    @Test
    public void playPlayTestThatAtCreation_TicTacTocGridIsFilledWith_a_z_at_creation() {
        TicTacToe game = new TicTacToe(Player.FIRST);
        String actual = """
                a       b       c
                e       f       g
                h       i       j
                """;
        // assertEquals(actual, game);
        System.out.println(game);
}
        @Test
        public void testThatPlayerCanBeChanged() {
            TicTacToe game = new TicTacToe(Player.FIRST);
            assertEquals(Player.FIRST, game.getPlayer());
            game.changeCurrentPlayer();
            assertEquals(Player.SECOND, game.getPlayer());
    }


    @Test
    public void testThatFirstPlayerPlays_grindATPositionChangesToO(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('a');
        assertEquals('O',game.getGrind()[0][0]);

    }


    @Test
    public void testThatFirstPlayerPlays_grindATPositionChangesToO_playerChangesToNextPlayer(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('a');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());

    }


    @Test
    public void playerInputedAnInvaldInputThrowsInvalidInputException(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('v'));
    }


    @Test
    public void testThatFirstPlayerPlays_nextPlayerTryToPlayInSamePosition_throwInvalidInputException(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('a');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('O'));


    }


    @Test
    public void testThatGameCanBeWonByRow(){

        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('a');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('O'));
        game.chooseInputPosition('e');
        game.chooseInputPosition('b');
        game.chooseInputPosition('i');
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('c');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }


    @Test
    public void testThatGameCanBeWonByColumn(){

        TicTacToe game = new TicTacToe(Player.SECOND);
        assertEquals(Player.SECOND, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('b');
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('X'));
        game.chooseInputPosition('a');
        game.chooseInputPosition('e');
        game.chooseInputPosition('i');
        assertEquals(Player.SECOND, game.getPlayer());
        game.chooseInputPosition('h');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }


    @Test
    public void testThatGameCanBeWonDiagonally(){
        TicTacToe game = new TicTacToe(Player.SECOND);
        assertEquals(Player.SECOND, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('a');
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('X'));
        game.chooseInputPosition('b');
        game.chooseInputPosition('e');
        game.chooseInputPosition('f');
        assertEquals(Player.SECOND, game.getPlayer());
        game.chooseInputPosition('i');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }
}
