/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class vsbot2 extends javax.swing.JFrame {
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    // End of variables declaration
    
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

    /**
     * Creates new form vsbot2
     */
    public vsbot2() {
        initComponents();
        startTimer();
    }
    public vsbot2(int movecount, int timer) {
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

    // Check rows
    if (b1.equals("X") && b2.equals("X") && b3.equals("X") && b4.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b5.equals("X") && b6.equals("X") && b7.equals("X") && b8.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b9.equals("X") && b10.equals("X") && b11.equals("X") && b12.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b13.equals("X") && b14.equals("X") && b15.equals("X") && b16.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check columns
    if (b1.equals("X") && b5.equals("X") && b9.equals("X") && b13.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b2.equals("X") && b6.equals("X") && b10.equals("X") && b14.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton2.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b3.equals("X") && b7.equals("X") && b11.equals("X") && b15.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton3.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("X") && b8.equals("X") && b12.equals("X") && b16.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check diagonals
    if (b1.equals("X") && b6.equals("X") && b11.equals("X") && b16.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("X") && b7.equals("X") && b10.equals("X") && b13.equals("X")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++xCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        winStatus = 1;
    }


    if (b1.equals("O") && b2.equals("O") && b3.equals("O") && b4.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        jButton4.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b5.equals("O") && b6.equals("O") && b7.equals("O") && b8.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b9.equals("O") && b10.equals("O") && b11.equals("O") && b12.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b13.equals("O") && b14.equals("O") && b15.equals("O") && b16.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton13.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check columns
    if (b1.equals("O") && b5.equals("O") && b9.equals("O") && b13.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton5.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b2.equals("O") && b6.equals("O") && b10.equals("O") && b14.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton2.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton14.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b3.equals("O") && b7.equals("O") && b11.equals("O") && b15.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton3.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton15.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("O") && b8.equals("O") && b12.equals("O") && b16.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton8.setBackground(Color.ORANGE);
        jButton12.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    // Check diagonals
    if (b1.equals("O") && b6.equals("O") && b11.equals("O") && b16.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton1.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        jButton16.setBackground(Color.ORANGE);
        winStatus = 1;
    }

    if (b4.equals("O") && b7.equals("O") && b10.equals("O") && b13.equals("O")) {
        stopTimer();
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);

        ++oCount;
        gameScore();

        disableButton();
        jButton4.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton13.setBackground(Color.ORANGE);
        winStatus = 1;
    }

        else if(winStatus!=1 && moveMade==16)
        {
            stopTimer();
            JOptionPane.showMessageDialog(this, "Draw!!!", "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
        } 
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        setMinimumSize(new java.awt.Dimension(375, 570));
        setName("frameG2"); // NOI18N
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
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setToolTipText("");
        jButton1.setName(""); // NOI18N
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 80, 80));

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setToolTipText("");
        jButton2.setName(""); // NOI18N
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 10, 80, 80));

        jButton3.setBackground(java.awt.Color.black);
        jButton3.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setToolTipText("");
        jButton3.setName(""); // NOI18N
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 10, 80, 80));

        jButton4.setBackground(java.awt.Color.black);
        jButton4.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setToolTipText("");
        jButton4.setName(""); // NOI18N
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 10, 80, 80));

        jButton5.setBackground(java.awt.Color.black);
        jButton5.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setToolTipText("");
        jButton5.setName(""); // NOI18N
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 95, 80, 80));

        jButton6.setBackground(java.awt.Color.black);
        jButton6.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setToolTipText("");
        jButton6.setName(""); // NOI18N
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 95, 80, 80));

        jButton7.setBackground(java.awt.Color.black);
        jButton7.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setToolTipText("");
        jButton7.setName(""); // NOI18N
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 95, 80, 80));

        jButton8.setBackground(java.awt.Color.black);
        jButton8.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setToolTipText("");
        jButton8.setName(""); // NOI18N
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 95, 80, 80));

        jButton9.setBackground(java.awt.Color.black);
        jButton9.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setToolTipText("");
        jButton9.setName(""); // NOI18N
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 80, 80));

        jButton10.setBackground(java.awt.Color.black);
        jButton10.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setToolTipText("");
        jButton10.setName(""); // NOI18N
        jButton10.setOpaque(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 180, 80, 80));

        jButton11.setBackground(java.awt.Color.black);
        jButton11.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setToolTipText("");
        jButton11.setName(""); // NOI18N
        jButton11.setOpaque(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 180, 80, 80));

        jButton12.setBackground(java.awt.Color.black);
        jButton12.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setToolTipText("");
        jButton12.setName(""); // NOI18N
        jButton12.setOpaque(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 180, 80, 80));

        jButton13.setBackground(java.awt.Color.black);
        jButton13.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setToolTipText("");
        jButton13.setName(""); // NOI18N
        jButton13.setOpaque(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 265, 80, 80));

        jButton14.setBackground(java.awt.Color.black);
        jButton14.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setToolTipText("");
        jButton14.setName(""); // NOI18N
        jButton14.setOpaque(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 265, 80, 80));

        jButton15.setBackground(java.awt.Color.black);
        jButton15.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setToolTipText("");
        jButton15.setName(""); // NOI18N
        jButton15.setOpaque(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 265, 80, 80));

        jButton16.setBackground(java.awt.Color.black);
        jButton16.setFont(new java.awt.Font("Rockwell Condensed", 1, 70)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setToolTipText("");
        jButton16.setName(""); // NOI18N
        jButton16.setOpaque(true);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 265, 80, 80));

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
    }// </editor-fold>                        

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        resetGame();
    }                                           
                 

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        resetGame();

        player1Score.setText("0");
        player2Score.setText("0");

        xCount = 0;
        oCount = 0;
    }                                             

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        menu Menu = new menu("src/music/background_music.wav", false, false);
        Menu.show();
        dispose();
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton1.setText(startGame);

            jButton1.setText(startGame);
            jButton1.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                       
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton2.setText(startGame);

            jButton2.setText(startGame);
            jButton2.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton3.setText(startGame);

            jButton3.setText(startGame);
            jButton3.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton4.setText(startGame);

            jButton4.setText(startGame);
            jButton4.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton5.setText(startGame);

            jButton5.setText(startGame);
            jButton5.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton6.setText(startGame);

            jButton6.setText(startGame);
            jButton6.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton7.setText(startGame);

            jButton7.setText(startGame);
            jButton7.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton8.setText(startGame);

            jButton8.setText(startGame);
            jButton8.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jButton9.setText(startGame);

            jButton9.setText(startGame);
            jButton9.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jButton10.setText(startGame);

            jButton10.setText(startGame);
            jButton10.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jButton11.setText(startGame);

            jButton11.setText(startGame);
            jButton11.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jButton12.setText(startGame);

            jButton12.setText(startGame);
            jButton12.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jButton13.setText(startGame);

            jButton13.setText(startGame);
            jButton13.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jButton14.setText(startGame);

            jButton14.setText(startGame);
            jButton14.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
            jButton15.setText(startGame);
            jButton15.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
            jButton16.setText(startGame);
            jButton16.setEnabled(false);
            ++moveMade;
             move();
             choose_a_Player();
            winningGame();
            botMove();
    }   
    
    
        /**-----------Bot Implementation-----------**/ 
    private void botMove() {
    List<JButton> availableButtons = getAvailableButtons();
    if (!availableButtons.isEmpty()) {
        int randomIndex = (int) (Math.random() * availableButtons.size());
        JButton randomButton = availableButtons.get(randomIndex);
        randomButton.setText(startGame);
        randomButton.setEnabled(false);
        ++moveMade;
        move();
        choose_a_Player();
        winningGame();
    }
}

    private List<JButton> getAvailableButtons() {
    List<JButton> availableButtons = new ArrayList<>();
    for (Component component : jPanel2.getComponents()) {
        if (component instanceof JButton) {
            JButton button = (JButton) component;
            if (button.isEnabled()) {
                availableButtons.add(button);
            }
        }
    }
    return availableButtons;
}

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
            java.util.logging.Logger.getLogger(vsbot2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vsbot2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vsbot2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vsbot2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vsbot2().setVisible(true);
            }
        });
    }

                       
}
