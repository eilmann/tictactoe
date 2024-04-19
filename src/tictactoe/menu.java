package tictactoe;

import javax.sound.sampled.*;
import java.io.*;
import javax.swing.ImageIcon;

/**
 * The `menu` class represents the game menu of the Tic Tac Toe game.
 */
public class menu extends javax.swing.JFrame {

    private settings Settings;
    private static Clip clip;
    private boolean isMuted = false;
    private int gameMode = 1;
    
    private game1 Game1;
    private game2 Game2;
    private game3 Game3;
    private game4 Game4;
    private vsbot1 Vsbot1;
    private vsbot2 Vsbot2;
    private vsbot3 Vsbot3;
    private vsbot4 Vsbot4;
    
    settings SettingsConf = new settings();
    
    /**
     * Creates a new `menu` object with the specified music settings.
     */
    public menu(String musicPath, boolean musicPlay, boolean musicLoop) {
        initComponents();
        playMusic(musicPath, musicPlay, musicLoop);
    }
    
    /**
     * Creates a new `menu` object with the specified game mode.
     */
    public menu(int gameMode) {
        initComponents();
        this.gameMode=gameMode;
        System.out.println(gameMode);
    }
    
    /**
     * Plays the background music.
     */
    public static void playMusic(String filePath, boolean play, boolean loop) {

        if(play == true){
            try {
                File audioFile = new File (filePath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                
                clip = AudioSystem.getClip();
                clip.open(audioStream);
                
                if(loop){
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } else {
                    clip.start();
                }
            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e){
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Mutes the background music.
     */
    public void muteMusic(){
        clip.stop();
        isMuted = true;
    }
    
    /**
     * Unmutes the background music.
     */
    private void unmuteMusic(){
        clip.start();
        isMuted = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        volumeButton = new javax.swing.JToggleButton();
        backgroundGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setName("frame1"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 340, 140, 135);

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(settingsButton);
        settingsButton.setBounds(80, 430, 40, 40);

        volumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/volume.png"))); // NOI18N
        volumeButton.setBorderPainted(false);
        volumeButton.setContentAreaFilled(false);
        volumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(volumeButton);
        volumeButton.setBounds(260, 430, 40, 40);

        backgroundGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroundGif.gif"))); // NOI18N
        jPanel1.add(backgroundGif);
        backgroundGif.setBounds(0, 0, 375, 570);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Settings button use to redirect to the Settings page
    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:setVisible(false);
        setVisible(false);
                Settings = new settings(this);
                Settings.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    // Toggle button for mute and the unmute background music
    private void volumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeButtonActionPerformed
        // TODO add your handling code here:
        if(volumeButton.isSelected()){
            muteMusic();
            volumeButton.setIcon(new ImageIcon(getClass().getResource("/image/volume-mute.png")));
        } else {
            unmuteMusic();
            volumeButton.setIcon(new ImageIcon(getClass().getResource("/image/volume.png")));
        }
    }//GEN-LAST:event_volumeButtonActionPerformed

    // Play button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // The game mode will be determine based on the stated condition
        if (gameMode == 1){
            setVisible(false);
            Vsbot1 = new vsbot1();
            Vsbot1.setVisible(true);
        } else if (gameMode == 2) {
            setVisible(false);
            Vsbot2 = new vsbot2();
            Vsbot2.setVisible(true);
        } else if (gameMode == 3) {
            setVisible(false);
            Vsbot3 = new vsbot3();
            Vsbot3.setVisible(true);
        } else if (gameMode == 4) {
            setVisible(false);
            Vsbot4 = new vsbot4();
            Vsbot4.setVisible(true);
        } else if (gameMode == 5) {
            setVisible(false);
            Game1 = new game1();
            Game1.setVisible(true);
        } else if (gameMode == 6) {
            setVisible(false);
            Game2 = new game2();
            Game2.setVisible(true);
        } else if (gameMode == 7) {
            setVisible(false);
            Game3 = new game3();
            Game3.setVisible(true);
        } else if (gameMode == 8) {
            setVisible(false);
            Game4 = new game4();
            Game4.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu Menu = new menu("src/music/background_music.wav", true, true);
                Menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundGif;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton settingsButton;
    private javax.swing.JToggleButton volumeButton;
    // End of variables declaration//GEN-END:variables
}
