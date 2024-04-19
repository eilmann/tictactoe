/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class game4 extends javax.swing.JFrame {

    private JFrame frame;
    private settings Settings;
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    int moveMade = 0;
    int winStatus = 0;
    boolean checker;
    private Timer timer;
    int elapsedTime = 0;
    
    public game4() {
        initComponents();
        startTimer();
    }
    public game4(int movecount, int timer) {
        initComponents();
        startTimer();
        if (movecount == 0){
            moveMadeLable.setVisible(false);
        } else
            moveMadeLable.setVisible(true);
        
        if (timer == 0){
            timerLable.setVisible(false);
        } else
            timerLable.setVisible(true);
        
        
        
    }
    
    private void gameScore(){
        player1Score.setText(String.valueOf(xCount));
        player2Score.setText(String.valueOf(oCount));
    }
    
    private void disableButton(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton25.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton29.setEnabled(false);
        jButton30.setEnabled(false);
        jButton31.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton34.setEnabled(false);
        jButton35.setEnabled(false);
        jButton36.setEnabled(false);
    }
    
    private void enableButton(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        
        jButton1.setBackground(Color.BLACK);
        jButton2.setBackground(Color.BLACK);
        jButton3.setBackground(Color.BLACK);
        jButton4.setBackground(Color.BLACK);
        jButton5.setBackground(Color.BLACK);
        jButton6.setBackground(Color.BLACK);
        jButton7.setBackground(Color.BLACK);
        jButton8.setBackground(Color.BLACK);
        jButton9.setBackground(Color.BLACK);
        jButton10.setBackground(Color.BLACK);
        jButton11.setBackground(Color.BLACK);
        jButton12.setBackground(Color.BLACK);
        jButton13.setBackground(Color.BLACK);
        jButton14.setBackground(Color.BLACK);
        jButton15.setBackground(Color.BLACK);
        jButton16.setBackground(Color.BLACK);
        jButton17.setBackground(Color.BLACK);
        jButton18.setBackground(Color.BLACK);
        jButton19.setBackground(Color.BLACK);
        jButton20.setBackground(Color.BLACK);
        jButton21.setBackground(Color.BLACK);
        jButton22.setBackground(Color.BLACK);
        jButton23.setBackground(Color.BLACK);
        jButton24.setBackground(Color.BLACK);
        jButton25.setBackground(Color.BLACK);
        jButton26.setBackground(Color.BLACK);
        jButton27.setBackground(Color.BLACK);
        jButton28.setBackground(Color.BLACK);
        jButton29.setBackground(Color.BLACK);
        jButton30.setBackground(Color.BLACK);
        jButton31.setBackground(Color.BLACK);
        jButton32.setBackground(Color.BLACK);
        jButton33.setBackground(Color.BLACK);
        jButton34.setBackground(Color.BLACK);
        jButton35.setBackground(Color.BLACK);
        jButton36.setBackground(Color.BLACK);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        jButton15.setText("");
        jButton16.setText("");
        jButton17.setText("");
        jButton18.setText("");
        jButton19.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton23.setText("");
        jButton24.setText("");
        jButton25.setText("");
        jButton26.setText("");
        jButton27.setText("");
        jButton28.setText("");
        jButton29.setText("");
        jButton30.setText("");
        jButton31.setText("");
        jButton32.setText("");
        jButton33.setText("");
        jButton34.setText("");
        jButton35.setText("");
        jButton36.setText("");
    }
    
    private void resetGame() {
        moveMade = 0;
        move();
        enableButton();
        choose_a_Player();
        timerLable.setText(Integer.toString(0));
        restartTimer();
        winStatus =0;
    }
    
    private void move(){
        moveMadeLable.setText(String.valueOf(moveMade));
    }
    
    private void choose_a_Player(){
        
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private ActionListener timerActionListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            elapsedTime++;
            timerLable.setText(Integer.toString(elapsedTime));
        }
    };
    
    private void startTimer(){
        elapsedTime = 0; //reset the elapsed time
        timer = new Timer(1000,timerActionListener);
        timer.start(); //start the timer
    }
    
    private void stopTimer(){
        if (timer != null && timer.isRunning()){
            timer.stop(); //stop timer if the timer is currently counting
        }
    }
    
    private void restartTimer(){
        stopTimer();
        startTimer();
    }

    private void winningGame() {
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    String b10 = jButton10.getText();
    String b11 = jButton11.getText();
    String b12 = jButton12.getText();
    String b13 = jButton13.getText();
    String b14 = jButton14.getText();
    String b15 = jButton15.getText();
    String b16 = jButton16.getText();
    String b17 = jButton17.getText();
    String b18 = jButton18.getText();
    String b19 = jButton19.getText();
    String b20 = jButton20.getText();
    String b21 = jButton21.getText();
    String b22 = jButton22.getText();
    String b23 = jButton23.getText();
    String b24 = jButton24.getText();
    String b25 = jButton25.getText();
    String b26 = jButton26.getText();
    String b27 = jButton27.getText();
    String b28 = jButton28.getText();
    String b29 = jButton29.getText();
    String b30 = jButton30.getText();
    String b31 = jButton31.getText();
    String b32 = jButton32.getText();
    String b33 = jButton33.getText();
    String b34 = jButton34.getText();
    String b35 = jButton35.getText();
    String b36 = jButton36.getText();

    // Check rows
    if (b1.equals("X") && b2.equals("X") && b3.equals("X") && b4.equals("X") && b5.equals("X") && b6.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b7.equals("X") && b8.equals("X") && b9.equals("X") && b10.equals("X") && b11.equals("X") && b12.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b13.equals("X") && b14.equals("X") && b15.equals("X") && b16.equals("X") && b17.equals("X") && b18.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton17.setBackground(Color.ORANGE);
        jButton18.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b19.equals("X") && b20.equals("X") && b21.equals("X") && b22.equals("X") && b23.equals("X") && b24.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton19.setBackground(Color.ORANGE);
        jButton20.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton23.setBackground(Color.ORANGE);
        jButton24.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b25.equals("X") && b26.equals("X") && b27.equals("X") && b28.equals("X") && b29.equals("X") && b30.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton25.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton27.setBackground(Color.ORANGE);
        jButton28.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton30.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b31.equals("X") && b32.equals("X") && b33.equals("X") && b34.equals("X") && b35.equals("X") && b36.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton31.setBackground(Color.ORANGE);
        jButton32.setBackground(Color.ORANGE);
        jButton33.setBackground(Color.ORANGE);
        jButton34.setBackground(Color.ORANGE);
        jButton35.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check columns
    if (b1.equals("X") && b7.equals("X") && b13.equals("X") && b19.equals("X") && b25.equals("X") && b31.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        jButton19.setBackground(Color.ORANGE);
        jButton25.setBackground(Color.ORANGE);
        jButton31.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b2.equals("X") && b8.equals("X") && b14.equals("X") && b20.equals("X") && b26.equals("X") && b32.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton2.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton20.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton32.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b3.equals("X") && b9.equals("X") && b15.equals("X") && b21.equals("X") && b27.equals("X") && b33.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton3.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton27.setBackground(Color.ORANGE);
        jButton33.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("X") && b10.equals("X") && b16.equals("X") && b22.equals("X") && b28.equals("X") && b34.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton28.setBackground(Color.ORANGE);
        jButton34.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b5.equals("X") && b11.equals("X") && b17.equals("X") && b23.equals("X") && b29.equals("X") && b35.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton5.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton17.setBackground(Color.ORANGE);
        jButton23.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton35.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b6.equals("X") && b12.equals("X") && b18.equals("X") && b24.equals("X") && b30.equals("X") && b36.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton6.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton18.setBackground(Color.ORANGE);
        jButton24.setBackground(Color.ORANGE);
        jButton30.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check diagonals
    if (b1.equals("X") && b8.equals("X") && b15.equals("X") && b22.equals("X") && b29.equals("X") && b36.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b6.equals("X") && b11.equals("X") && b16.equals("X") && b21.equals("X") && b26.equals("X") && b31.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton31.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    
    // Check rows
    if (b1.equals("O") && b2.equals("O") && b3.equals("O") && b4.equals("O") && b5.equals("O") && b6.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b7.equals("O") && b8.equals("O") && b9.equals("O") && b10.equals("O") && b11.equals("O") && b12.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b13.equals("O") && b14.equals("O") && b15.equals("O") && b16.equals("O") && b17.equals("O") && b18.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton17.setBackground(Color.ORANGE);
        jButton18.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b19.equals("O") && b20.equals("O") && b21.equals("O") && b22.equals("O") && b23.equals("O") && b24.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton19.setBackground(Color.ORANGE);
        jButton20.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton23.setBackground(Color.ORANGE);
        jButton24.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b25.equals("O") && b26.equals("O") && b27.equals("O") && b28.equals("O") && b29.equals("O") && b30.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton25.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton27.setBackground(Color.ORANGE);
        jButton28.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton30.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b31.equals("O") && b32.equals("O") && b33.equals("O") && b34.equals("O") && b35.equals("O") && b36.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton31.setBackground(Color.ORANGE);
        jButton32.setBackground(Color.ORANGE);
        jButton33.setBackground(Color.ORANGE);
        jButton34.setBackground(Color.ORANGE);
        jButton35.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check columns
    if (b1.equals("O") && b7.equals("O") && b13.equals("O") && b19.equals("O") && b25.equals("O") && b31.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        jButton19.setBackground(Color.ORANGE);
        jButton25.setBackground(Color.ORANGE);
        jButton31.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b2.equals("O") && b8.equals("O") && b14.equals("O") && b20.equals("O") && b26.equals("O") && b32.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton2.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton20.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton32.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b3.equals("O") && b9.equals("O") && b15.equals("O") && b21.equals("O") && b27.equals("O") && b33.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton3.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton27.setBackground(Color.ORANGE);
        jButton33.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("O") && b10.equals("O") && b16.equals("O") && b22.equals("O") && b28.equals("O") && b34.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton28.setBackground(Color.ORANGE);
        jButton34.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b5.equals("O") && b11.equals("O") && b17.equals("O") && b23.equals("O") && b29.equals("O") && b35.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton5.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton17.setBackground(Color.ORANGE);
        jButton23.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton35.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b6.equals("O") && b12.equals("O") && b18.equals("O") && b24.equals("O") && b30.equals("O") && b36.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton6.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton18.setBackground(Color.ORANGE);
        jButton24.setBackground(Color.ORANGE);
        jButton30.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check diagonals
    if (b1.equals("O") && b8.equals("O") && b15.equals("O") && b22.equals("O") && b29.equals("O") && b36.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton22.setBackground(Color.ORANGE);
        jButton29.setBackground(Color.ORANGE);
        jButton36.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b6.equals("O") && b11.equals("O") && b16.equals("O") && b21.equals("O") && b26.equals("O") && b31.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        jButton21.setBackground(Color.ORANGE);
        jButton26.setBackground(Color.ORANGE);
        jButton31.setBackground(Color.ORANGE);
        winStatus = 1;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        timerLogo = new javax.swing.JLabel();
        timerLable = new javax.swing.JLabel();
        moveMadeLogo = new javax.swing.JLabel();
        moveMadeLable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        player1Logo = new javax.swing.JLabel();
        player2Logo = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        player1Score = new javax.swing.JLabel();
        player2Score = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(375, 570));
        jPanel1.setLayout(null);

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset(small).png"))); // NOI18N
        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        resetButton.setBounds(167, 12, 40, 39);

        timerLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stopwatch.png"))); // NOI18N
        jPanel1.add(timerLogo);
        timerLogo.setBounds(20, 10, 40, 40);

        timerLable.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        timerLable.setText("0");
        jPanel1.add(timerLable);
        timerLable.setBounds(60, 17, 40, 30);

        moveMadeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check(small).png"))); // NOI18N
        jPanel1.add(moveMadeLogo);
        moveMadeLogo.setBounds(325, 15, 32, 32);

        moveMadeLable.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        moveMadeLable.setText("0");
        jPanel1.add(moveMadeLable);
        moveMadeLable.setBounds(280, 17, 40, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setToolTipText("");
        jButton1.setName(""); // NOI18N
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 52, 52));

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setToolTipText("");
        jButton2.setName(""); // NOI18N
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 15, 52, 52));

        jButton3.setBackground(java.awt.Color.black);
        jButton3.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setToolTipText("");
        jButton3.setName(""); // NOI18N
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 15, 52, 52));

        jButton4.setBackground(java.awt.Color.black);
        jButton4.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setToolTipText("");
        jButton4.setName(""); // NOI18N
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 15, 52, 52));

        jButton5.setBackground(java.awt.Color.black);
        jButton5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setToolTipText("");
        jButton5.setName(""); // NOI18N
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 15, 52, 52));

        jButton6.setBackground(java.awt.Color.black);
        jButton6.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setToolTipText("");
        jButton6.setName(""); // NOI18N
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 15, 52, 52));

        jButton7.setBackground(java.awt.Color.black);
        jButton7.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setToolTipText("");
        jButton7.setName(""); // NOI18N
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 52, 52));

        jButton8.setBackground(java.awt.Color.black);
        jButton8.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setToolTipText("");
        jButton8.setName(""); // NOI18N
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 70, 52, 52));

        jButton9.setBackground(java.awt.Color.black);
        jButton9.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setToolTipText("");
        jButton9.setName(""); // NOI18N
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 52, 52));

        jButton10.setBackground(java.awt.Color.black);
        jButton10.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setToolTipText("");
        jButton10.setName(""); // NOI18N
        jButton10.setOpaque(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 70, 52, 52));

        jButton11.setBackground(java.awt.Color.black);
        jButton11.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setToolTipText("");
        jButton11.setName(""); // NOI18N
        jButton11.setOpaque(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 52, 52));

        jButton12.setBackground(java.awt.Color.black);
        jButton12.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setToolTipText("");
        jButton12.setName(""); // NOI18N
        jButton12.setOpaque(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 70, 52, 52));

        jButton13.setBackground(java.awt.Color.black);
        jButton13.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setToolTipText("");
        jButton13.setName(""); // NOI18N
        jButton13.setOpaque(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 52, 52));

        jButton14.setBackground(java.awt.Color.black);
        jButton14.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setToolTipText("");
        jButton14.setName(""); // NOI18N
        jButton14.setOpaque(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 125, 52, 52));

        jButton15.setBackground(java.awt.Color.black);
        jButton15.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setToolTipText("");
        jButton15.setName(""); // NOI18N
        jButton15.setOpaque(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 125, 52, 52));

        jButton16.setBackground(java.awt.Color.black);
        jButton16.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setToolTipText("");
        jButton16.setName(""); // NOI18N
        jButton16.setOpaque(true);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 125, 52, 52));

        jButton17.setBackground(java.awt.Color.black);
        jButton17.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setToolTipText("");
        jButton17.setName(""); // NOI18N
        jButton17.setOpaque(true);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 125, 52, 52));

        jButton18.setBackground(java.awt.Color.black);
        jButton18.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setToolTipText("");
        jButton18.setName(""); // NOI18N
        jButton18.setOpaque(true);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 125, 52, 52));

        jButton19.setBackground(java.awt.Color.black);
        jButton19.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setToolTipText("");
        jButton19.setName(""); // NOI18N
        jButton19.setOpaque(true);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 52, 52));

        jButton20.setBackground(java.awt.Color.black);
        jButton20.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setToolTipText("");
        jButton20.setName(""); // NOI18N
        jButton20.setOpaque(true);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 180, 52, 52));

        jButton21.setBackground(java.awt.Color.black);
        jButton21.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setToolTipText("");
        jButton21.setName(""); // NOI18N
        jButton21.setOpaque(true);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 52, 52));

        jButton22.setBackground(java.awt.Color.black);
        jButton22.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setToolTipText("");
        jButton22.setName(""); // NOI18N
        jButton22.setOpaque(true);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 180, 52, 52));

        jButton23.setBackground(java.awt.Color.black);
        jButton23.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setToolTipText("");
        jButton23.setName(""); // NOI18N
        jButton23.setOpaque(true);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 52, 52));

        jButton24.setBackground(java.awt.Color.black);
        jButton24.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setToolTipText("");
        jButton24.setName(""); // NOI18N
        jButton24.setOpaque(true);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 180, 52, 52));

        jButton25.setBackground(java.awt.Color.black);
        jButton25.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setToolTipText("");
        jButton25.setName(""); // NOI18N
        jButton25.setOpaque(true);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 52, 52));

        jButton26.setBackground(java.awt.Color.black);
        jButton26.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setToolTipText("");
        jButton26.setName(""); // NOI18N
        jButton26.setOpaque(true);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 235, 52, 52));

        jButton27.setBackground(java.awt.Color.black);
        jButton27.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setToolTipText("");
        jButton27.setName(""); // NOI18N
        jButton27.setOpaque(true);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 235, 52, 52));

        jButton28.setBackground(java.awt.Color.black);
        jButton28.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setToolTipText("");
        jButton28.setName(""); // NOI18N
        jButton28.setOpaque(true);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 235, 52, 52));

        jButton29.setBackground(java.awt.Color.black);
        jButton29.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setToolTipText("");
        jButton29.setName(""); // NOI18N
        jButton29.setOpaque(true);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 235, 52, 52));

        jButton30.setBackground(java.awt.Color.black);
        jButton30.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setToolTipText("");
        jButton30.setName(""); // NOI18N
        jButton30.setOpaque(true);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 235, 52, 52));

        jButton31.setBackground(java.awt.Color.black);
        jButton31.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setToolTipText("");
        jButton31.setName(""); // NOI18N
        jButton31.setOpaque(true);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 52, 52));

        jButton32.setBackground(java.awt.Color.black);
        jButton32.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setToolTipText("");
        jButton32.setName(""); // NOI18N
        jButton32.setOpaque(true);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 290, 52, 52));

        jButton33.setBackground(java.awt.Color.black);
        jButton33.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setToolTipText("");
        jButton33.setName(""); // NOI18N
        jButton33.setOpaque(true);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 52, 52));

        jButton34.setBackground(java.awt.Color.black);
        jButton34.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setToolTipText("");
        jButton34.setName(""); // NOI18N
        jButton34.setOpaque(true);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 290, 52, 52));

        jButton35.setBackground(java.awt.Color.black);
        jButton35.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setToolTipText("");
        jButton35.setName(""); // NOI18N
        jButton35.setOpaque(true);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 52, 52));

        jButton36.setBackground(java.awt.Color.black);
        jButton36.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setToolTipText("");
        jButton36.setName(""); // NOI18N
        jButton36.setOpaque(true);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 290, 52, 52));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 60, 350, 360);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross(small).png"))); // NOI18N
        jPanel3.add(player1Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        player2Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ring(small).png"))); // NOI18N
        jPanel3.add(player2Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 60, -1, -1));

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        jPanel3.add(newGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 100, -1));

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });
        jPanel3.add(mainMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, -1));

        player1Score.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        player1Score.setForeground(new java.awt.Color(255, 255, 255));
        player1Score.setText("0 ");
        player1Score.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        player1Score.setOpaque(true);
        jPanel3.add(player1Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        player2Score.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        player2Score.setForeground(new java.awt.Color(255, 255, 255));
        player2Score.setText("0 ");
        player2Score.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        player2Score.setOpaque(true);
        jPanel3.add(player2Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 76, 100, 30));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("=");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("=");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 76, -1, 30));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(11, 430, 350, 130);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        resetGame();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        // TODO add your handling code here:
        resetGame();

        player1Score.setText("0");
        player2Score.setText("0");

        xCount = 0;
        oCount = 0;
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // TODO add your handling code here:
        menu Menu = new menu("src/music/background_music.wav", false, false);
        Menu.show();
        dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton11.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton11.setEnabled(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton12.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton13.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton13.setEnabled(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton14.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton14.setEnabled(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jButton15.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton15.setEnabled(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jButton16.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton16.setEnabled(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jButton17.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton17.setEnabled(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jButton18.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton18.setEnabled(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jButton19.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton19.setEnabled(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jButton20.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton20.setEnabled(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jButton21.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton21.setEnabled(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        jButton22.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton22.setEnabled(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        jButton23.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton23.setEnabled(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        jButton24.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton24.setEnabled(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        jButton25.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton25.setEnabled(false);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jButton26.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton26.setEnabled(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jButton27.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton27.setEnabled(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        jButton28.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton28.setEnabled(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        jButton29.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton29.setEnabled(false);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        jButton30.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton30.setEnabled(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        jButton31.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton31.setEnabled(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        jButton32.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton32.setEnabled(false);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        jButton33.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton33.setEnabled(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        jButton34.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton34.setEnabled(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        jButton35.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton35.setEnabled(false);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        jButton36.setText(startGame);

        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
        jButton36.setEnabled(false);
    }//GEN-LAST:event_jButton36ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel moveMadeLable;
    private javax.swing.JLabel moveMadeLogo;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel player1Logo;
    private javax.swing.JLabel player1Score;
    private javax.swing.JLabel player2Logo;
    private javax.swing.JLabel player2Score;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel timerLable;
    private javax.swing.JLabel timerLogo;
    // End of variables declaration//GEN-END:variables
}
