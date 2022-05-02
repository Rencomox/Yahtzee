package com.vhscs3.yahtzee;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vhscs3.yahtzee.MainFrame;
import java.awt.Color;

/**
 *
 * @author 
 */
public class yahtzee2 extends javax.swing.JPanel {


    private int numRolls = 0;
    private final int[] diceValues = new int[5];
    private static final int n_categories = 16;
    private boolean[] categoryScored = new boolean[n_categories];
    private boolean p1True = true;
    
    public yahtzee2() {
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dieLabel0 = new javax.swing.JLabel();
        dieLabel1 = new javax.swing.JLabel();
        dieLabel2 = new javax.swing.JLabel();
        dieLabel3 = new javax.swing.JLabel();
        dieLabel4 = new javax.swing.JLabel();
        pTurn = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1's", null, null},
                {"2's", null, null},
                {"3's", null, null},
                {"4's", null, null},
                {"5's", null, null},
                {"6's", null, null},
                {"Upper Total", null, null},
                {"Bonus", null, null},
                {"3 of a Kind", null, null},
                {"4 of a Kind", null, null},
                {"Small Straight", null, null},
                {"Large Straight", null, null},
                {"Full House", null, null},
                {"Yahtzee", null, null},
                {"Chance", null, null},
                {"Grand Total", null, null}
            },
            new String [] {
                "Category", "Table 1", "Table 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Roll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Roll Number : ");

        dieLabel0.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        dieLabel0.setText("2");
        dieLabel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dieLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        dieLabel1.setText("3");
        dieLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dieLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        dieLabel2.setText("4");
        dieLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dieLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        dieLabel3.setText("1");
        dieLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dieLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        dieLabel4.setText("5");
        dieLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pTurn.setText("Turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(dieLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieLabel4)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(pTurn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dieLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dieLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dieLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dieLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dieLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(pTurn)))
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int randNum = (int)(Math.random() * 6) + 1;
        if(dieLabel0.getBackground() != Color.red)
        {
            dieLabel0.setText(Integer.toString(randNum));
            diceValues[0] = randNum;
        }        
        randNum = (int)(Math.random() * 6) + 1;
        
        if(dieLabel1.getBackground() != Color.red)
        {
            dieLabel1.setText(Integer.toString(randNum));
            diceValues[1] = randNum;
        }      
        randNum = (int)(Math.random() * 6) + 1;
        
        if(dieLabel2.getBackground() != Color.red)
        {
            dieLabel2.setText(Integer.toString(randNum));
            diceValues[2] = randNum;
        }     
        randNum = (int)(Math.random() * 6) + 1;
        
        if(dieLabel3.getBackground() != Color.red)
        {
            dieLabel3.setText(Integer.toString(randNum));
            diceValues[3] = randNum;
        }      
        
        randNum = (int)(Math.random() * 6) + 1;
        
        if(dieLabel4.getBackground() != Color.red)
        {
            dieLabel4.setText(Integer.toString(randNum));
            diceValues[4] = randNum;
        }      
        numRolls++;
        jLabel1.setText("Roll Counter: "+ numRolls);
        if(numRolls == 3)
        {
            jButton1.setEnabled(false);
            jLabel1.setText("Roll Counter: no more roles");
            numRolls = 0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void dieLabel0MouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(numRolls >= 1 && numRolls < 3 && dieLabel0.getBackground() != Color.red)
        {
            dieLabel0.setBackground(Color.red);
            dieLabel0.setOpaque(true);
        }
        else if(numRolls >= 1 && numRolls < 3)
        {
            dieLabel0.setBackground(Color.white);
            dieLabel0.setOpaque(true);
        }
    }                                      

    private void dieLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(numRolls >= 1 && numRolls < 3 && dieLabel1.getBackground() != Color.red)
        {
            dieLabel1.setBackground(Color.red);
            dieLabel1.setOpaque(true);
        }
        else if(numRolls >= 1 && numRolls < 3)
        {
            dieLabel1.setBackground(Color.white);
            dieLabel1.setOpaque(true);
        }
    }                                      

    private void dieLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(numRolls >= 1 && numRolls < 3 && dieLabel2.getBackground() != Color.red)
        {
            dieLabel2.setBackground(Color.red);
            dieLabel2.setOpaque(true);
        }
        else if(numRolls >= 1 && numRolls < 3)
        {
            dieLabel2.setBackground(Color.white);
            dieLabel2.setOpaque(true);
        }
    }                                      

    private void dieLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(numRolls >= 1 && numRolls < 3 && dieLabel3.getBackground() != Color.red)
        {
            dieLabel3.setBackground(Color.red);
            dieLabel3.setOpaque(true);
        }
        else if(numRolls >= 1 && numRolls < 3)
        {
            dieLabel3.setBackground(Color.white);
            dieLabel3.setOpaque(true);
        }
    }                                      

    private void dieLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(numRolls >= 1 && numRolls < 3 && dieLabel4.getBackground() != Color.red)
        {
            dieLabel4.setBackground(Color.red);
            dieLabel4.setOpaque(true);
        }
        else if(numRolls >= 1 && numRolls < 3)
        {
            dieLabel4.setBackground(Color.white);
            dieLabel4.setOpaque(true);
        }
    }                                      

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                          
        int row = jTable1.rowAtPoint(evt.getPoint());
        int category = row +1;
        if(p1True)
        {
            if(category >= 1 && category <= 6)
            {
                int score = Yahtzee.getUpperScore(diceValues, category);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else if(category == 9)
            {
                int score =Yahtzee.getThreeOfAKindScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else if(category == 10)
            {
                int score =Yahtzee.getFourOfAKindScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else if(category == 11)
            {
                int score =Yahtzee.getSmallStraightScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else if(category == 12)
            {
                int score =Yahtzee.getLargeStraightScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else if(category == 13)
            {
                int score =Yahtzee.total(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            else
            {
                int score =Yahtzee.getYahtzeeScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 1);
            }
            p1True = false;
        }
        else
        {
            if(category >= 1 && category <= 6)
            {
                int score = Yahtzee.getUpperScore(diceValues, category);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else if(category == 9)
            {
                int score =Yahtzee.getThreeOfAKindScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else if(category == 10)
            {
                int score =Yahtzee.getFourOfAKindScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else if(category == 11)
            {
                int score =Yahtzee.getSmallStraightScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else if(category == 12)
            {
                int score =Yahtzee.getLargeStraightScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else if(category == 13)
            {
                int score =Yahtzee.total(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            else
            {
                int score =Yahtzee.getYahtzeeScore(diceValues);
                jTable1.setValueAt(Integer.toString(score), row, 2);
            }
            p1True = true;
        }
        if(p1True)
        {
            pTurn.setText("Player turn: 1");
        }
        else
        {
            pTurn.setText("Player turn: 2");
        }
        jButton1.setEnabled(true);
        numRolls = 0;
        dieLabel0.setBackground(Color.white);
        dieLabel0.setOpaque(true);
        dieLabel0.setText("?");
        
        dieLabel1.setBackground(Color.white);
        dieLabel1.setOpaque(true);
        dieLabel1.setText("?");
        
        dieLabel2.setBackground(Color.white);
        dieLabel2.setOpaque(true);
        dieLabel2.setText("?");
        
        dieLabel3.setBackground(Color.white);
        dieLabel3.setOpaque(true);
        dieLabel3.setText("?");
        
        dieLabel4.setBackground(Color.white);
        dieLabel4.setOpaque(true);
        dieLabel4.setText("?");
    }
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
                new yahtzee2().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pTurn;
}
    // End of variables declaration//GEN-END:variables