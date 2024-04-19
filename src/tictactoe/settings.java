package tictactoe;

import java.sql.*;
import javax.swing.JOptionPane;

public class settings extends javax.swing.JFrame {

    private menu Y;
    private int gameMode;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private int timer;
    private int moveCount;
    private int boardMode;
    private int boardSize;

    public settings() {
        initComponents();
        con = dbConnect.connectDB();
        getSetting();
    }
    
    public settings(menu Y) {
        initComponents();
        this.Y = Y;
        con = dbConnect.connectDB();
        getSetting();
    }

    public void getSetting(){
        int i=0;
        try{ 
            String sql ="SELECT *FROM setting WHERE id = 1";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                gameMode = rs.getInt(i=1);
                timer = rs.getInt(i=2);
                moveCount = rs.getInt(i=3);
                boardSize = rs.getInt(i=6);
                System.out.println("gameMode = "+gameMode+ " boardinfo = "+moveCount+" counter = "+timer);
            }  
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        if(timer==0){
            timerToggle.setSelected(true);
            timerToggle.setText("Off");
        } else {
            timerToggle.setSelected(false);
            timerToggle.setText("On");
        }
        if(moveCount==0){
            infoToggle.setSelected(true);
            infoToggle.setText("Off");
        } else {
            infoToggle.setSelected(false);
            infoToggle.setText("On");
        }
        
        
        if(gameMode==0){
            gamemodeCB.setSelectedItem("Singleplayer");
  
        }
        else{
            gamemodeCB.setSelectedItem("Multiplayer");
    
        }
        if(boardSize==0){
            boardCB.setSelectedItem("3 x 3");
  
        }
        else if(boardSize==1){
            boardCB.setSelectedItem("4 x 4");
    
        }
        else if(boardSize==2){
            boardCB.setSelectedItem("5 x 5");
    
        }
        else if(boardSize==3){
            boardCB.setSelectedItem("6 x 6");
    
        }
           
    }
        
        
    
    public void determineGameModeAndBoard() {
    String selectedGameMode = (String) gamemodeCB.getSelectedItem();
    
    if (selectedGameMode.equals("Singleplayer")) {
        // Set game mode to singleplayer

        if ("3 x 3".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 3x3
            try{ 
            String sql ="UPDATE setting SET boardMode = 1 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=1;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("4 x 4".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 4x4
            try{ 
            String sql ="UPDATE setting SET boardMode = 2 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=2;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("5 x 5".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 5x5
            try{ 
            String sql ="UPDATE setting SET boardMode = 3 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=3;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("6 x 6".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 6x6
            try{ 
            String sql ="UPDATE setting SET boardMode = 4 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=4;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    } else if (selectedGameMode.equals("Multiplayer")) {
        // Set game mode to multiplayer

        if ("3 x 3".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 3x3
            try{ 
            String sql ="UPDATE setting SET boardMode = 5 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=5;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("4 x 4".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 4x4
            try{ 
            String sql ="UPDATE setting SET boardMode = 6 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=6;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("5 x 5".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 5x5
            try{ 
            String sql ="UPDATE setting SET boardMode = 7 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=7;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        } else if ("6 x 6".equals((String)boardCB.getSelectedItem())) {
            // Set board size to 6x6
            try{ 
            String sql ="UPDATE setting SET boardMode = 8 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            boardMode=8;
            System.out.println("gameMode = "+gameMode+"boardMode ="+boardMode+"boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gamemodeCB = new javax.swing.JComboBox<>();
        boardCB = new javax.swing.JComboBox<>();
        applyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timerToggle = new javax.swing.JToggleButton();
        infoToggle = new javax.swing.JToggleButton();
        backgroundGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(375, 570));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Settings");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 10, 110, 40);

        gamemodeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Singleplayer", "Multiplayer" }));
        gamemodeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamemodeCBActionPerformed(evt);
            }
        });
        jPanel2.add(gamemodeCB);
        gamemodeCB.setBounds(200, 60, 110, 22);

        boardCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 3", "4 x 4", "5 x 5", "6 x 6" }));
        jPanel2.add(boardCB);
        boardCB.setBounds(200, 110, 110, 22);

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(applyButton);
        applyButton.setBounds(130, 240, 72, 23);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Game Mode");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 60, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Board");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 110, 80, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Timer");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 160, 80, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Move Counter");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 210, 80, 20);

        timerToggle.setText(" ");
        timerToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerToggleActionPerformed(evt);
            }
        });
        jPanel2.add(timerToggle);
        timerToggle.setBounds(200, 160, 110, 23);

        infoToggle.setText(" ");
        infoToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoToggleActionPerformed(evt);
            }
        });
        jPanel2.add(infoToggle);
        infoToggle.setBounds(200, 210, 110, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 280, 330, 280);

        backgroundGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroundGif.gif"))); // NOI18N
        jPanel1.add(backgroundGif);
        backgroundGif.setBounds(0, 0, 375, 570);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        // TODO add your handling code here:
        determineGameModeAndBoard();
        setVisible(false);
        
        
        if(boardCB.getSelectedItem().equals("3 x 3")){
            try{ 
            String sql ="UPDATE setting SET boardsize = 0 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            }            
            catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
        }
        else if(boardCB.getSelectedItem().equals("4 x 4")){
            try{ 
            String sql ="UPDATE setting SET boardsize = 1 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else if(boardCB.getSelectedItem().equals("5 x 5")){
            try{ 
            String sql ="UPDATE setting SET boardsize = 2 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else if(boardCB.getSelectedItem().equals("6 x 6")){
            try{ 
            String sql ="UPDATE setting SET boardsize = 3 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        menu Menu = new menu(boardMode);
        Menu.setVisible(true);
    }//GEN-LAST:event_applyButtonActionPerformed

    private void timerToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerToggleActionPerformed
        // TODO add your handling code here:j
        if(timer==0){
            timerToggle.setText("On");
            try{ 
            String sql ="UPDATE setting SET timer = 1 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            timer=1;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else{
            timerToggle.setText("Off");
            try{ 
            String sql ="UPDATE setting SET timer = 0 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            timer=0;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_timerToggleActionPerformed

    private void gamemodeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamemodeCBActionPerformed
        if(gamemodeCB.getSelectedItem().equals("Singleplayer")){
             try{ 
            String sql ="UPDATE setting SET gameMode = 0 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            gameMode=0;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }else if(gamemodeCB.getSelectedItem().equals("Multiplayer")){
            try{ 
            String sql ="UPDATE setting SET gameMode = 1 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            gameMode=1;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_gamemodeCBActionPerformed

    private void boardCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardCBActionPerformed

    private void infoToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoToggleActionPerformed
        // TODO add your handling code here:
        if(moveCount==0){
            infoToggle.setText("On");
            try{ 
            String sql ="UPDATE setting SET moveCount = 1 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            moveCount=1;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else{
            infoToggle.setText("Off");
            try{ 
            String sql ="UPDATE setting SET moveCount = 0 WHERE id = 1";
            st = con.createStatement();
            st.executeUpdate(sql);
            moveCount=0;
            System.out.println("board = "+gameMode+ "boardinfo = "+moveCount+"counter = "+timer);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }                
    }//GEN-LAST:event_infoToggleActionPerformed
    
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
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel backgroundGif;
    private javax.swing.JComboBox<String> boardCB;
    private javax.swing.JComboBox<String> gamemodeCB;
    private javax.swing.JToggleButton infoToggle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton timerToggle;
    // End of variables declaration//GEN-END:variables
}
