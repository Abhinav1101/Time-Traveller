package clientrailway;

// Import packages
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class PassengerDetailsForm extends javax.swing.JFrame {

    String AC1, AC2, AC3, SL, from1, to1, no, type, seat1, name, arrtime, deptime,text;
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
java.time.LocalDate textFieldAsDate;
java.sql.Date sqlDate;
    private CachedRowSet crs=null;
    
static String PassName11;
     

    public PassengerDetailsForm() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTrainNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbSeat = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassengerName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_of_journey = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        prefferedBerth = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnBookTicket = new javax.swing.JButton();
        btnResetForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("PASSENGER DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Train Number");

        txtTrainNumber.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTrainNumber.setForeground(new java.awt.Color(0, 153, 153));
        txtTrainNumber.setName(""); // NOI18N
        txtTrainNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrainNumberKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Seat Type");

        cmbSeat.setBackground(new java.awt.Color(255, 204, 204));
        cmbSeat.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        cmbSeat.setForeground(new java.awt.Color(153, 0, 153));
        cmbSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC1", "AC2", "AC3", "Sleeper" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("From");

        txtFrom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(0, 153, 153));
        txtFrom.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("To");

        txtTo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTo.setForeground(new java.awt.Color(0, 153, 153));
        txtTo.setName(""); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Name");

        txtPassengerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassengerName.setForeground(new java.awt.Color(0, 153, 153));
        txtPassengerName.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Age");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(0, 153, 153));
        txtAge.setName(""); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Date of Journey");

        date_of_journey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date_of_journey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_of_journeyActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Gender");

        txtGender.setBackground(new java.awt.Color(255, 204, 204));
        txtGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGender.setForeground(new java.awt.Color(153, 0, 153));
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Berth Preference");

        prefferedBerth.setBackground(new java.awt.Color(255, 204, 204));
        prefferedBerth.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        prefferedBerth.setForeground(new java.awt.Color(153, 0, 153));
        prefferedBerth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lower", "Middle", "Upper", "SideLower", "SideUpper" }));

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 153));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBookTicket.setBackground(new java.awt.Color(255, 204, 204));
        btnBookTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBookTicket.setForeground(new java.awt.Color(153, 0, 153));
        btnBookTicket.setText("Book Ticket");
        btnBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTicketActionPerformed(evt);
            }
        });

        btnResetForm.setBackground(new java.awt.Color(255, 204, 204));
        btnResetForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnResetForm.setForeground(new java.awt.Color(153, 0, 153));
        btnResetForm.setText("Reset Form");
        btnResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(751, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(date_of_journey, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(156, 156, 156)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(65, 65, 65)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(prefferedBerth, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(225, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prefferedBerth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(16, 16, 16)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_of_journey, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrainNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrainNumberKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrainNumberKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void date_of_journeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_of_journeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_of_journeyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //        AdminPage pdf = new AdminPage();
        //        pdf.setVisible(true);
        TrainBetweenStation tbs=new TrainBetweenStation();
        tbs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookTicketActionPerformed
        int flag = -1;
        String from = txtFrom.getText();
        String to = txtTo.getText();
        String trno = txtTrainNumber.getText();
        String seat = (String) cmbSeat.getSelectedItem();
        String gender = (String) txtGender.getSelectedItem();
        PassName11 = txtPassengerName.getText();
        // Exception handling

        // ABHI USING PREV CODE WRITTEN BY HARSH TO MAKE IT USABLE FOR SOCKET
        text = date_of_journey.getText();
        try{
            textFieldAsDate = java.time.LocalDate.parse(text, formatter);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid Date! Please enter the date in DD/MM/YYYY format!");
            System.out.println(e);
            return;
        }

        if(from.equals("")||to.equals("")||trno.equals("")||PassName11.equals("")||txtAge.getText().equals("")||text.equals("")){
            JOptionPane.showMessageDialog(this, "All Fields Are necessary, you cannot leave any field empty");
        }

        // Iske bich me Abhi ka code hai

        /*
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3336/Passenger", "root", "Harsh@2000"); Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

                String query = "SELECT * FROM train WHERE StationFrom='" + from + "' AND StationTo= '" + to + "' AND train_no = '" + trno + "'";
                try (ResultSet result = statement.executeQuery(query)) {
                    while (result.next()) {

                        from1 = result.getString("StationFrom");
                        to1 = result.getString("StationTo");
                        no = result.getString("train_no");
                        name = result.getString("NameOfTrain");

                        type = result.getString("TrainType");
                        arrtime = result.getString("ArrTime");
                        deptime = result.getString("DepTime");
                        text = date_of_journey.getText();
                        try{
                            textFieldAsDate = java.time.LocalDate.parse(text, formatter);
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(this, "Invalid Date! Please enter the date in DD/MM/YYYY format!");
                            System.out.println(e);
                        }
                        sqlDate= java.sql.Date.valueOf(textFieldAsDate);
                        switch (seat) {
                            case "AC1":
                            seat1 = result.getString("AC1Fare");
                            break;
                            case "AC2":
                            seat1 = result.getString("AC2Fare");
                            break;
                            case "AC3":
                            seat1 = result.getString("AC3Fare");
                            break;
                            case "SL":
                            seat1 = result.getString("SLFare");
                            break;
                            default:
                            break;
                        }

                        if (from.equals(from1) && to.equals(to1) && trno.equals(no)) {
                            flag = 0;
                            break;
                        }
                    }

                    if (flag != 0) {
                        JOptionPane.showMessageDialog(this, "This train not found!!, Please enter other train!!");
                    } else {
                        try (Statement statement1 = conn.createStatement()) {

                            String query1 = "INSERT into passrecord(Username, pName, pGender, pAge, pAction, StationFrom, StationTo, train_no, TrainType, SeatFare, trainName,ArrTime,DeptTime,DateOfJourney) VALUES('" + Login.loggedInUser + "','" + txtPassengerName.getText() + "','" + gender + "','" + txtAge.getText() + "','" + seat + "','" + from1 + "','" + to1 + "', '" + no + "','" + type + "', '" + seat1 + "','" + name + "', '" + arrtime + "','" + deptime + "','" + sqlDate + "');";
                            statement1.executeUpdate(query1);
                            Ticket al;
                            al = new Ticket();
                            al.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        */

        //ABHINAV IS MAKING CHANGE HERE
        // this res variable will tell whether the booking is successful or failed and now res can be used for setting flag
        boolean res=false;
        String ticketFare="0";//it will get actual value from a sql query on server side here it is dummy

        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("bookTicket");
            dout.writeUTF(trno);
            dout.writeUTF(date_of_journey.getText());
            dout.writeUTF(seat);
            dout.writeUTF((String) prefferedBerth.getSelectedItem());

            // this will be used if booking done successfully
            // This will be used for insertion of passenger details in the database for future use

            dout.writeUTF(Login.loggedInUser);
            dout.writeUTF(PassName11);
            dout.writeUTF(gender);
            dout.writeUTF(txtAge.getText());
            //            dout.writeUTF(seat);
            dout.writeUTF(from);
            dout.writeUTF(to);
            dout.writeUTF(ticketFare);
            //            dout.writeUTF(trno);
            //            dout.writeUTF(text);
            //            dout.writeUTF(prefferedBerth.getText());

            dout.writeUTF("null");
            dout.flush();

            String str="";
            while(str.equals("")){
                DataInputStream din = new DataInputStream(s.getInputStream());
                str = din.readUTF();
                res = Boolean.parseBoolean(str);
                System.out.println("result = "+str);
            }

            if(res){
                ObjectInputStream objectIn = new ObjectInputStream(s.getInputStream());

                crs = (CachedRowSet)objectIn.readObject();
            }

            dout.close();
            s.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        if (!res) {
            JOptionPane.showMessageDialog(this, "This train not found or Some error Occured!!, Please enter other train or try Again!!");
        }
        else{
            Ticket al;
            al = new Ticket(crs);
            al.setVisible(true);
            this.setVisible(false);
        }

        //Iske bich me Abhi ka code hai

    }//GEN-LAST:event_btnBookTicketActionPerformed

    private void btnResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFormActionPerformed
        txtFrom.setText("");
        txtTrainNumber.setText("");
        txtTo.setText("");
        txtPassengerName.setText("");
        txtAge.setText("");

    }//GEN-LAST:event_btnResetFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookTicket;
    private javax.swing.JButton btnResetForm;
    private javax.swing.JComboBox<String> cmbSeat;
    private javax.swing.JTextField date_of_journey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> prefferedBerth;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtPassengerName;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTrainNumber;
    // End of variables declaration//GEN-END:variables
}
