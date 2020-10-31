/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrailway;

import static clientrailway.PassengerDetailsForm.PassName11;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author abhi
 */
public class OrderMeals extends javax.swing.JFrame {

    /**
     * Creates new form OrderMeals
     */
    private String trainNo,numberOfPlate;
    private String seatNumber,dateOfJourney,menu;
    
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
    java.time.LocalDate textFieldAsDate;
    
    public OrderMeals() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seatnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        trainno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateofjourney = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        bookmeal = new javax.swing.JButton();
        Menu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        plates = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 46, 155));
        jLabel1.setText("Pre-Order Meals");

        jLabel2.setText("Seat Number");

        jLabel3.setText("Train Number");

        jLabel4.setText("Date of Journey");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        bookmeal.setText("Book Meal");
        bookmeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookmealActionPerformed(evt);
            }
        });

        Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg Deluxe", "Non-Veg Deluxe", "Veg Normal", "Non-veg Normal" }));

        jLabel6.setText("Number of Plates");

        plates.setText("1");

        jLabel7.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(exit))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seatnumber)
                            .addComponent(trainno)
                            .addComponent(dateofjourney)
                            .addComponent(bookmeal)
                            .addComponent(Menu, 0, 172, Short.MAX_VALUE)
                            .addComponent(plates))
                        .addGap(139, 139, 139))))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateofjourney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(plates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(bookmeal))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        Dashboarduser dashboard = new Dashboarduser();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void bookmealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookmealActionPerformed
        // TODO add your handling code here:
        int res=0;
        try{
            
            trainNo = trainno.getText();
            seatNumber = seatnumber.getText();
            dateOfJourney = dateofjourney.getText();
            menu = (String) Menu.getSelectedItem();
            numberOfPlate = plates.getText();
            
            
            try{
                textFieldAsDate = java.time.LocalDate.parse(dateOfJourney, formatter);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Invalid Date! Please enter the date in DD/MM/YYYY format!");  
                System.out.println(e);
                return;
            }

            if(trainNo.equals("")||seatnumber.equals("")||numberOfPlate.equals("")){
                JOptionPane.showMessageDialog(this, "All Fields Are necessary, you cannot leave any field empty");
                return;
            }
            
            
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            
            dout.writeUTF("userBookMeal");
            dout.writeUTF(trainNo);
            dout.writeUTF(seatNumber);
            dout.writeUTF(dateOfJourney);
            dout.writeUTF(menu);
            dout.writeUTF(numberOfPlate);
            dout.writeUTF(Login.loggedInUser);
            dout.writeUTF("null");
            dout.flush();
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            res = din.read();
            
            dout.close();
            s.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        if(res==1){
            JOptionPane.showMessageDialog(null, "Your meal booking is successful");
            dispose();
            Dashboarduser dashboard = new Dashboarduser();
            dashboard.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "You don't having booking in this train for this date or seat number is wrong");
        }
        
        
    }//GEN-LAST:event_bookmealActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JButton bookmeal;
    private javax.swing.JTextField dateofjourney;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField plates;
    private javax.swing.JTextField seatnumber;
    private javax.swing.JTextField trainno;
    // End of variables declaration//GEN-END:variables
}