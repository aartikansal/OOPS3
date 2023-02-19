package Interfaces;

public class GameRunner {
    public static void main(String[] args) {
        //MarioGame game = new MarioGame();
        GamingConsole game = new ChessGame();//polymorphism --Interface provides common action
        //ChessGame game = new ChessGame();
        game.up();
        game.right();
        game.right();
        game.left();


    }
}
