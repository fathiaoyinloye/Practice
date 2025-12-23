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
                1       2       3
                4       5       6
                7       8       9
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
        game.chooseInputPosition('1');
        assertEquals('O',game.getGrind()[0][0]);

    }


    @Test
    public void testThatFirstPlayerPlays_grindATPositionChangesToO_playerChangesToNextPlayer(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('1');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());

    }


    @Test
    public void playerInputedAnInvaldInputThrowsInvalidInputException(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('i'));
    }


    @Test
    public void testThatFirstPlayerPlays_nextPlayerTryToPlayInSamePosition_throwInvalidInputException(){
        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('1');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('O'));


    }


    @Test
    public void testThatGameCanBeWonByRow(){

        TicTacToe game = new TicTacToe(Player.FIRST);
        assertEquals(Player.FIRST, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('1');
        assertEquals('O',game.getGrind()[0][0]);
        assertEquals(Player.SECOND, game.getPlayer());
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('O'));
        game.chooseInputPosition('5');
        game.chooseInputPosition('2');
        game.chooseInputPosition('9');
        assertEquals(Player.FIRST, game.getPlayer());
        game.chooseInputPosition('3');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }


    @Test
    public void testThatGameCanBeWonByColumn(){

        TicTacToe game = new TicTacToe(Player.SECOND);
        assertEquals(Player.SECOND, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('2');
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('X'));
        game.chooseInputPosition('1');
        game.chooseInputPosition('5');
        game.chooseInputPosition('9');
        assertEquals(Player.SECOND, game.getPlayer());
        game.chooseInputPosition('8');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }


    @Test
    public void testThatGameCanBeWonDiagonally(){
        TicTacToe game = new TicTacToe(Player.SECOND);
        assertEquals(Player.SECOND, game.getPlayer());
        assertEquals(GameStatus.ISGOING, game.getGameStatus());
        game.chooseInputPosition('1');
        assertThrows(InvalidInputException.class, () -> game.chooseInputPosition('X'));
        game.chooseInputPosition('2');
        game.chooseInputPosition('5');
        game.chooseInputPosition('6');
        assertEquals(Player.SECOND, game.getPlayer());
        game.chooseInputPosition('9');
        assertEquals(GameStatus.WON, game.getGameStatus());


    }
}
