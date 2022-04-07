/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.edu.ucsi.gym;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Registration extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
public static boolean regexPhoneNumber(String str) {
    String regexPhoneNumber ="^(?:[0-9] ?){6,14}[0-9]$"; 
    boolean result = str.matches(regexPhoneNumber);
    return result;
}
 
 public static boolean regexEmail(String email){
    String checker = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";   
    boolean result = email.matches(checker);
    return result;
 }

   
    public Registration() {
        super("Registration");
        initComponents();
        Icon logo = lbLogo.getIcon();
        ImageIcon icon1 = (ImageIcon)logo;
        Image img = icon1.getImage().getScaledInstance(400, 550, Image.SCALE_SMOOTH);
        lbLogo.setIcon(new ImageIcon(img));
        con = SQLConnection.ConnectorDb();

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        formPanel = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtUserEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        lbPhoneNumber = new javax.swing.JLabel();
        lbUserID = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        repeatpassword = new javax.swing.JPasswordField();
        txtAddress = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        formHeader = new javax.swing.JLabel();
        formHeader1 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setForeground(new java.awt.Color(255, 204, 0));
        formPanel.setToolTipText("");
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(153, 153, 153));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setToolTipText("");
        txtName.setBorder(null);
        txtName.setMargin(new java.awt.Insets(50, 50, 50, 50));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        formPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 260, 40));

        txtUserEmail.setBackground(new java.awt.Color(153, 153, 153));
        txtUserEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtUserEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserEmail.setToolTipText("");
        txtUserEmail.setBorder(null);
        txtUserEmail.setMargin(new java.awt.Insets(50, 50, 50, 50));
        txtUserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserEmailActionPerformed(evt);
            }
        });
        formPanel.add(txtUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 260, 40));

        txtPhoneNumber.setBackground(new java.awt.Color(153, 153, 153));
        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNumber.setToolTipText("");
        txtPhoneNumber.setBorder(null);
        txtPhoneNumber.setMargin(new java.awt.Insets(50, 50, 50, 50));
        txtPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNumberFocusLost(evt);
            }
        });
        formPanel.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 260, 40));

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        formPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 550, 180, 50));

        lbPhoneNumber.setBackground(java.awt.Color.black);
        lbPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPhoneNumber.setText("Phone Number");
        formPanel.add(lbPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 140, 40));

        lbUserID.setBackground(java.awt.Color.black);
        lbUserID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUserID.setText("Full Name");
        formPanel.add(lbUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 140, 40));

        lbPassword.setBackground(java.awt.Color.black);
        lbPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPassword.setText("Repeat Password");
        formPanel.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 150, 40));

        lbUserName.setBackground(java.awt.Color.black);
        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUserName.setText("Password");
        formPanel.add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 140, 40));

        lbAddress.setBackground(java.awt.Color.black);
        lbAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAddress.setText("Address");
        formPanel.add(lbAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 140, 40));

        lbEmail.setBackground(java.awt.Color.black);
        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEmail.setText("Email");
        formPanel.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 140, 40));

        repeatpassword.setBackground(new java.awt.Color(153, 153, 153));
        repeatpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        repeatpassword.setForeground(new java.awt.Color(255, 255, 255));
        repeatpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        repeatpassword.setToolTipText("");
        repeatpassword.setBorder(null);
        repeatpassword.setMargin(new java.awt.Insets(50, 50, 50, 50));
        repeatpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                repeatpasswordFocusLost(evt);
            }
        });
        repeatpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatpasswordActionPerformed(evt);
            }
        });
        formPanel.add(repeatpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 280, 40));

        txtAddress.setBackground(new java.awt.Color(153, 153, 153));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setToolTipText("");
        txtAddress.setBorder(null);
        txtAddress.setMargin(new java.awt.Insets(50, 50, 50, 50));
        formPanel.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 280, 40));

        passwordtxt.setBackground(new java.awt.Color(153, 153, 153));
        passwordtxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordtxt.setToolTipText("");
        passwordtxt.setBorder(null);
        passwordtxt.setMargin(new java.awt.Insets(50, 50, 50, 50));
        formPanel.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 280, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        formPanel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 330, -1, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lbLogo.setIcon(new javax.swing.ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\Logo.png")); // NOI18N

        formHeader.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        formHeader.setForeground(new java.awt.Color(255, 255, 255));
        formHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formHeader.setText("UCSI Gym");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formHeader)
                .addGap(38, 38, 38)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        formPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 730));

        formHeader1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        formHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formHeader1.setText("User Registration");
        formPanel.add(formHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        signUpBtn.setBackground(new java.awt.Color(0, 0, 0));
        signUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Create Account");
        signUpBtn.setBorder(null);
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtnMouseClicked(evt);
            }
        });
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        formPanel.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 180, 50));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("<html>"+"Between 8 and 14 Charachters.<br />"+"A mixture of uppercase and lowercase letters.<br />"+"A mixture of letters and numbers.<br />"+"</html>");
        formPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 260, 50));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        formPanel.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 191, -1, 40));

        getContentPane().add(formPanel);
        formPanel.setBounds(0, 0, 1260, 720);

        setSize(new java.awt.Dimension(1273, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserEmailActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
      
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void repeatpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repeatpasswordActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
            this.setVisible(false);
            Login window2 = new Login();
            window2.setVisible(true);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseClicked
        // TODO add your handling code here:
        
            String password = new String(repeatpassword.getPassword());
            String password2 = new String(passwordtxt.getPassword());
            char[] arrpassword = repeatpassword.getPassword();
            char[] arrpassword2 = passwordtxt.getPassword();
            boolean ok = true;
            try {  
                Double.parseDouble(txtPhoneNumber.getText());
              } catch(NumberFormatException e){  
                JOptionPane.showMessageDialog(this, "Cannot use Letters in Phone Number");
                ok = false;
              }
            if(txtName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Name");
                ok = false;
                return;
            }
            else if(txtUserEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Email");
                ok = false;
                return;
            }
            else if(txtAddress.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Address");
                ok = false;
                return;
            }

            else if(txtPhoneNumber.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Phone Number");
                ok = false;
                return;
            }
            else if(password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Missing Password");
                ok = false;
                return;
            }
            else if (!Arrays.equals(arrpassword, arrpassword2)) {
                JOptionPane.showMessageDialog(this, "Password is not matching!");
                ok = false;
                return;
            }
            if(!regexPhoneNumber(txtPhoneNumber.getText())){
                JOptionPane.showMessageDialog(this, "Incorrect Phone Number Format!");
                ok = false;
                return; 
            }
            else if(!regexEmail(txtUserEmail.getText())){
                JOptionPane.showMessageDialog(this, "Incorrect Email Format!");
                ok = false;
                return;
            }
            else if((password.length()<8 || password.length()>14)){
                JOptionPane.showMessageDialog(this, "Password Needs to be between 8 and 14 characters!"+ password.length());
                ok = false;
                return;
            }
            boolean containsUpper = false;
            boolean containsLower = false;
            boolean containsNumber = false;
            boolean containsSpecial = false;

            for (char c : arrpassword) {
                System.out.println("Start");
                if (Character.isUpperCase(c)) {
                    containsUpper = true;
                System.out.println(c);
                }
                else if(Character.isLowerCase(c)){
                    containsLower = true;
                    System.out.println(c);
                }
                else if (Character.isDigit(c)){
                    containsNumber = true;
                    System.out.println(c);
                }
                else{
                    containsSpecial = true;
                    System.out.println(c);
                }
            }
            if (!containsUpper) {
                JOptionPane.showMessageDialog(this, "Password Needs to have atleast 1 Upper Case Letter!");
                System.out.println(arrpassword);
                ok = false;
            }
            else if(!containsLower){
                JOptionPane.showMessageDialog(this, "Password Needs to have atleast 1 Lower Case Letter!");
                System.out.println(arrpassword);
                ok = false;
            }
            else if(!containsNumber){
                JOptionPane.showMessageDialog(this, "Password Needs to have atleast 1 Number!");
                System.out.println(arrpassword);
                ok = false;
            }
            if(ok){
                try{
                    String sql= "insert into gymapp.users (email, name, phone, address, password) values(?,?,?,?,?);";
                    pst = con.prepareStatement(sql);
                    pst.setString(1,  txtUserEmail.getText());
                    pst.setString(2, txtName.getText());
                    pst.setString(3, txtPhoneNumber.getText());
                    pst.setString(4, txtAddress.getText());
                    pst.setString(5, password);
                    JOptionPane.showMessageDialog(null, "Account Created!\n Welcome to UCSI Gym!");
                    this.setVisible(false);
                    Login window2 = new Login();
                    window2.setVisible(true);
                    System.out.println(pst);
                    pst.execute();          
                    con.close();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        
    }//GEN-LAST:event_signUpBtnMouseClicked

    private void repeatpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeatpasswordFocusLost
        // TODO add your handling code here:
        char[] password = repeatpassword.getPassword();
        char[] password2 = passwordtxt.getPassword();

        if (!Arrays.equals(password, password2)) {
            JOptionPane.showMessageDialog(this, "Password is not matching!");
         }
    }//GEN-LAST:event_repeatpasswordFocusLost

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
            repeatpassword.setEchoChar((char)0);
        }else{
            repeatpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        if (jCheckBox2.isSelected()){
            passwordtxt.setEchoChar((char)0);
        }else{
            passwordtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registration form=new Registration();
                        form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel formHeader;
    private javax.swing.JLabel formHeader1;
    private javax.swing.JPanel formPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhoneNumber;
    private javax.swing.JLabel lbUserID;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JPasswordField repeatpassword;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserEmail;
    // End of variables declaration//GEN-END:variables
}
