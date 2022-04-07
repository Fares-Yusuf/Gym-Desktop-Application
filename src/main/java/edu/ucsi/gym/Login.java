
package main.java.edu.ucsi.gym;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    public Login() {
        super("Login");
        initComponents();
        Icon logo = lblLogoLogin.getIcon();
        ImageIcon icon1 = (ImageIcon)logo;
        System.out.println(lblLogoLogin.getWidth());
        Image img = icon1.getImage().getScaledInstance(400, 550, Image.SCALE_SMOOTH);
        lblLogoLogin.setIcon(new ImageIcon(img));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNoAccount = new javax.swing.JLabel();
        lbUserEmail = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        lbPassword = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        passwordBox = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        lblLogoLogin = new javax.swing.JLabel();
        lbUserLogin1 = new javax.swing.JLabel();
        lbUserLogin = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(999999999, 999999999));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        lbNoAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNoAccount.setText("Don't Have An Account?");

        lbUserEmail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbUserEmail.setText("Email");

        txtUserEmail.setBackground(new java.awt.Color(153, 153, 153));
        txtUserEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtUserEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserEmail.setBorder(null);

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        lbPassword.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbPassword.setText("Password");

        signupBtn.setBackground(new java.awt.Color(0, 0, 0));
        signupBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(null);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        passwordBox.setBackground(new java.awt.Color(153, 153, 153));
        passwordBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordBox.setForeground(new java.awt.Color(255, 255, 255));
        passwordBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordBox.setBorder(null);
        passwordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBoxActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 708));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 708));
        jPanel3.setPreferredSize(new java.awt.Dimension(598, 708));

        lblLogoLogin.setIcon(new javax.swing.ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\Logo.png")); // NOI18N
        lblLogoLogin.setToolTipText("");

        lbUserLogin1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbUserLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbUserLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserLogin1.setText("UCSI Gym");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(lblLogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUserLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUserLogin1)
                .addGap(18, 18, 18)
                .addComponent(lblLogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        lbUserLogin.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserLogin.setText("User Login");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbPassword)
                            .addComponent(txtUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserEmail)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbNoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUserLogin)
                .addGap(72, 72, 72)
                .addComponent(lbUserEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1259, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1273, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        this.setVisible(false);
        Registration window2 = new Registration();
        window2.setVisible(true);
    }//GEN-LAST:event_signupBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        String userEmail = txtUserEmail.getText();
        String password = new String(passwordBox.getPassword());
        String[] result = login(userEmail, password);
     
        try{
        if(!result[0].equals(userEmail) && result[1].equals(password) ){
            JOptionPane.showMessageDialog(this, "Wrong User Email or Password");
        }
        else{
            this.setVisible(false);
            Membership load = new Membership(userEmail);
            load.setVisible(true);
        }}catch(Exception e){
            JOptionPane.showMessageDialog(this, "Wrong User Email or Password");

        }     
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordBoxActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
            passwordBox.setEchoChar((char)0);
        }else{
            passwordBox.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login form = new Login();
                form.setVisible(true);
            }
        });
    }
    
    
    
    public String [] login(String Email,  String Password){
    
        String [] result = new String[2];
        try {
            System.out.println("Start");
            con = SQLConnection.ConnectorDb();
            pst = con.prepareStatement("SELECT email, password FROM gymapp.users WHERE email=? AND password = ?");
            pst.setString(1, Email);
            pst.setString(2, Password);

            rs = pst.executeQuery();
            System.out.println(pst);

            while(rs.next()){
                System.out.println("rs");
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                result[0]=rs.getString(1);
                result[1]=rs.getString(2);
            }
            con.close();
       } 
        
         catch (Exception ex) {
           System.out.print(ex);
        }
        
     
     return result;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbNoAccount;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserEmail;
    private javax.swing.JLabel lbUserLogin;
    private javax.swing.JLabel lbUserLogin1;
    private javax.swing.JLabel lblLogoLogin;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField txtUserEmail;
    // End of variables declaration//GEN-END:variables
}
