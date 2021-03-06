/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminSide;

import railway.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static railway.JdbcConnection.classForName;
import static railway.JdbcConnection.getConnection;
import static railway.JdbcConnection.password;
import static railway.JdbcConnection.username;

/**
 *
 * @author abhi
 */
public class CancelTrain extends javax.swing.JFrame {

    /**
     * Creates new form CancelTrain
     */
    public CancelTrain() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-getWidth()/2,dim.height/2-getHeight()/2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        trainNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancelledfromDate = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        cancelTrain = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cancelledtill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 199, 11));
        jLabel1.setText("CANCEL TRAIN");

        jLabel2.setText("Train Number");

        jLabel3.setText("Cancelled From Date");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        cancelTrain.setText("Cancel Train");
        cancelTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTrainActionPerformed(evt);
            }
        });

        jLabel4.setText("Cancelled Till Date");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(exit)))
                .addGap(31, 31, 31)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelTrain)
                    .addComponent(trainNo)
                    .addComponent(cancelledfromDate, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(cancelledtill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(trainNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cancelledfromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cancelledtill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(cancelTrain))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        AdminPage admin = new AdminPage();
        admin.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void cancelTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTrainActionPerformed
        int num = Integer.valueOf(trainNo.getText());
        String cancelledFromDate = cancelledfromDate.getText();
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.LocalDate textFieldAsDate;
        
        String cancelledTillDate = cancelledtill.getText();
        java.time.LocalDate textFieldAsDate1;
        
        
        try{
                textFieldAsDate = java.time.LocalDate.parse(cancelledFromDate, formatter);
                textFieldAsDate1 = java.time.LocalDate.parse(cancelledTillDate, formatter);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid Date! Please enter the date in DD/MM/YYYY format!");  
            System.out.println(e);
            return;
        }
        
        
        
        Connection con=null;
        try {
            // TODO add your handling code here:
            Class.forName(classForName);
            con = DriverManager.getConnection(getConnection, username,password);
            String sql = "Insert into cancelledTrain values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            java.sql.Date sqlDateFrom = java.sql.Date.valueOf(textFieldAsDate);
            java.sql.Date sqlDateTo = java.sql.Date.valueOf(textFieldAsDate1);
            pst.setInt(1,num);
            pst.setDate(2, sqlDateFrom);
            
            pst.setDate(3, sqlDateTo);
            
            int x = pst.executeUpdate();
            trainNo.setText("");
            cancelledfromDate.setText("");
            cancelledtill.setText("");
            if(x==0){
                JOptionPane.showMessageDialog(null,"Some Error Occured maybe no any train with this train number");
            }
            else{
                JOptionPane.showMessageDialog(null,"Train cancelled successfully");
            }
        } catch (Exception ex) {
               JOptionPane.showMessageDialog(null,"Some Error Occured maybe no any train with this train number");
               ex.printStackTrace();
        }
            
    }//GEN-LAST:event_cancelTrainActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelTrain;
    private javax.swing.JTextField cancelledfromDate;
    private javax.swing.JTextField cancelledtill;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Panel panel1;
    private javax.swing.JTextField trainNo;
    // End of variables declaration//GEN-END:variables
}
