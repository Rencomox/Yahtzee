
//import com.vhscs3.yahtzee.MainFrame;
import com.vhscs3.yahtzee.MainFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Poo 2
/**
 *
 * @author User
 */
public class MainFrame_1 extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private JLabel[] labels = new JLabel[5];
    private boolean[] catScore = new boolean[16];
    private boolean[] catScore1 = new boolean[16];
    private int[] diceValues = new int[5];
    private int column = 2;
    private boolean failed = false;
    public MainFrame_1() {
        initComponents();
        dieLabel0.setBackground(Color.WHITE);
        dieLabel0.setOpaque(true);
        dieLabel1.setBackground(Color.WHITE);
        dieLabel1.setOpaque(true);
        dieLabel2.setBackground(Color.WHITE);
        dieLabel2.setOpaque(true);
        dieLabel3.setBackground(Color.WHITE);
        dieLabel3.setOpaque(true);
        dieLabel4.setBackground(Color.WHITE);
        dieLabel4.setOpaque(true);
        labels = new JLabel[] {dieLabel0, dieLabel1, dieLabel2, dieLabel3, dieLabel4};
        for(int i = 0; i < 16; i++){
            catScore[i] = false;
        }
        for(int i = 0; i < 16; i++){
            catScore1[i] = false;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        yahtzeeTable = new javax.swing.JTable();
        dieLabel0 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dieLabel1 = new javax.swing.JLabel();
        dieLabel2 = new javax.swing.JLabel();
        dieLabel3 = new javax.swing.JLabel();
        dieLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        yahtzeeTable.setEnabled(false);
        yahtzeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ones", null, null},
                {"Twos", null, null},
                {"Threes", null, null},
                {"Fours", null, null},
                {"Fives", null, null},
                {"Sixes", null, null},
                {"Sum", null, null},
                {"Bonus", null, null},
                {"Three of a kind", null, null},
                {"Four of a kind", null, null},
                {"Full House", null, null},
                {"Small straight", null, null},
                {"Large straight", null, null},
                {"Chance", null, null},
                {"Yahtzee", null, null},
                {"Total Score", null, null}
            },
            new String [] {
                "", "Player 1", "Player 2"
            }
        ));
        yahtzeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yahtzeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(yahtzeeTable);

        dieLabel0.setBackground(new java.awt.Color(255, 255, 255));
        dieLabel0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dieLabel0.setText("?");
        dieLabel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dieLabel0.setOpaque(true);
        dieLabel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieLabel0MouseClicked(evt);
            }
        });

        jButton1.setText("Roll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Roll 0");

        dieLabel1.setBackground(new java.awt.Color(255, 255, 255));
        dieLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dieLabel1.setText("?");
        dieLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dieLabel1.setOpaque(true);
        dieLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieLabel1MouseClicked(evt);
            }
        });

        dieLabel2.setBackground(new java.awt.Color(255, 255, 255));
        dieLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dieLabel2.setText("?");
        dieLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dieLabel2.setOpaque(true);
        dieLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieLabel2MouseClicked(evt);
            }
        });

        dieLabel3.setBackground(new java.awt.Color(255, 255, 255));
        dieLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dieLabel3.setText("?");
        dieLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dieLabel3.setOpaque(true);
        dieLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieLabel3MouseClicked(evt);
            }
        });

        dieLabel4.setBackground(new java.awt.Color(255, 255, 255));
        dieLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dieLabel4.setText("?");
        dieLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dieLabel4.setOpaque(true);
        dieLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dieLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dieLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dieLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dieLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dieLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dieLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dieLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dieLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dieLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dieLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll < 3){
            for(int i = 0; i < 5; i++){
                if(labels[i].getBackground() == Color.WHITE){
                    labels[i].setText(Integer.toString((int)(Math.random() * 6) + 1));
                }
            }
            jLabel1.setText("Roll " + (roll + 1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dieLabel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieLabel0MouseClicked
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll != 0){
            if(dieLabel0.getBackground() == Color.RED){
                dieLabel0.setBackground(Color.WHITE);
                dieLabel0.setOpaque(true);
            }
            else{
                dieLabel0.setBackground(Color.RED);
                dieLabel0.setOpaque(true);
            }
        }
    }//GEN-LAST:event_dieLabel0MouseClicked

    private void dieLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieLabel1MouseClicked
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll != 0){
            if(dieLabel1.getBackground() == Color.RED){
                dieLabel1.setBackground(Color.WHITE);
                dieLabel1.setOpaque(true);
            }
            else{
                dieLabel1.setBackground(Color.RED);
                dieLabel1.setOpaque(true);
            }
        }
    }//GEN-LAST:event_dieLabel1MouseClicked

    private void dieLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieLabel2MouseClicked
       String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll != 0){
            if(dieLabel2.getBackground() == Color.RED){
                dieLabel2.setBackground(Color.WHITE);
                dieLabel2.setOpaque(true);
            }
            else{
                dieLabel2.setBackground(Color.RED);
                dieLabel2.setOpaque(true);
            }
        }
    }//GEN-LAST:event_dieLabel2MouseClicked

    private void dieLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieLabel3MouseClicked
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll != 0){
            if(dieLabel3.getBackground() == Color.RED){
                dieLabel3.setBackground(Color.WHITE);
                dieLabel3.setOpaque(true);
            }
            else{
                dieLabel3.setBackground(Color.RED);
                dieLabel3.setOpaque(true);
            }
        }
    }//GEN-LAST:event_dieLabel3MouseClicked

    private void dieLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieLabel4MouseClicked
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        if(roll != 0){
            if(dieLabel4.getBackground() == Color.RED){
                dieLabel4.setBackground(Color.WHITE);
                dieLabel4.setOpaque(true);
            }
            else{
                dieLabel4.setBackground(Color.RED);
                dieLabel4.setOpaque(true);
            }
        }
    }//GEN-LAST:event_dieLabel4MouseClicked

    private void yahtzeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yahtzeeTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) yahtzeeTable.getModel();
        String num = jLabel1.getText();
        int roll = Integer.valueOf(num.substring(num.length() - 1));
        int row = yahtzeeTable.rowAtPoint(evt.getPoint());
        int cat = row + 1;
        boolean[] checkScore = new boolean[16];
        
        if(column == 2 && failed != true){
            column -= 1;
            checkScore = catScore;
        }
        else if(column == 1 && failed != true){
            column += 1;
            checkScore = catScore1;
        }
        for(int i = 0; i < 5; i++){
            diceValues[i] = Integer.valueOf(labels[i].getText().substring(labels[i].getText().length() - 1));
        }
        if(cat >= 1 && cat <= 6){
            int score = Yahtzee.getUpperScore(diceValues, cat);
            if(checkScore[cat - 1] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[cat - 1] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 8){
            int score = Yahtzee.getThreeOfAKindScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 9){
            int score = Yahtzee.getFourOfAKindScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 10){
            int score = Yahtzee.getFullHouseScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 11){
            int score = Yahtzee.getSmallStraightScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 12){
            int score = Yahtzee.getLargeStraightScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 13){
            int score = Yahtzee.total(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        if(row == 14){
            int score = Yahtzee.getYahtzeeScore(diceValues);
            if(checkScore[row] == false && roll > 0){
                model.setValueAt(Integer.toString(score), row, column);
                checkScore[row] = true;
                failed = false;
            }
            else{ failed = true;}
        }
        
        boolean sw = true;
        for(int i = 0; i < 6; i++){
            if(checkScore[i] == false){
                sw = false;
            }
        }
        for(int i = 0; i < 5; i++){
            labels[i].setBackground(Color.WHITE);
            labels[i].setOpaque(true);
        }
        int score1 = 0;
        if(sw){
            for(int i = 0; i < 6; i++){
                String val = (String) model.getValueAt(i, column);
                score1 += Integer.valueOf(val);
            }
            model.setValueAt(Integer.toString(score1), 6, column);
            checkScore[6] = true;
            if(score1 >= 63){
                model.setValueAt(Integer.toString(35), 7, column);
            }
            else{
                model.setValueAt(Integer.toString(0), 7, column);
            }
            checkScore[7] = true;
        }
        sw = true;
        for(int i = 0; i < 15; i++){
            if(checkScore[i] == false){
                sw = false;
            }
        }
        score1 = 0;
         if(sw){
            for(int i = 6; i < 15; i++){
                String val = (String) model.getValueAt(i, column);
                score1 += Integer.valueOf(val);
            }
            model.setValueAt(Integer.toString(score1), 15, column);
            checkScore[15] = true;
        }
         if( failed != true){
             jLabel1.setText("Roll 0");
         }
        if(column == 1){
            catScore = checkScore;
        }
        else if(column == 2){
            catScore1 = checkScore;
        }
        score1 = 0;
        int score2 = 0;
        if(catScore1[15] == true && catScore[15] == true){
            String val = (String) model.getValueAt(15, 1);
            score1 = Integer.valueOf(val);
            String val1 = (String) model.getValueAt(15, 2);
            score2 = Integer.valueOf(val1);
            if(score1 > score2){
                jLabel2.setText("player 1 wins!");
            }
            else if(score2 > score1){
                jLabel2.setText("player 2 wins!");
            }
            else{
                jLabel2.setText("it's a draw!");
            }
        }
       
    }//GEN-LAST:event_yahtzeeTableMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dieLabel0;
    private javax.swing.JLabel dieLabel1;
    private javax.swing.JLabel dieLabel2;
    private javax.swing.JLabel dieLabel3;
    private javax.swing.JLabel dieLabel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable yahtzeeTable;
    // End of variables declaration//GEN-END:variables
}
