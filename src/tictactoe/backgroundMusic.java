package tictactoe;

/**
 * The `backgroundMusic` class is responsible for playing the background music in the Tic Tac Toe game.
 */
public class backgroundMusic {
    public static void main(String[] args){
        String musicPath = "src/music/background_music.wav"; // Path to the background music file
        boolean musicPlay = true; // Flag to control music playback
        boolean musicLoop = true; // Flag to control music looping
        menu Menu = new menu(musicPath, musicPlay, musicLoop); // Create an instance of the menu class and pass the music settings
        Menu.show(); // Show the game menu
    }
}
