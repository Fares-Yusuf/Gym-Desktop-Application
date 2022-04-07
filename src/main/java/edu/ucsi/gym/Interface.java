/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.edu.ucsi.gym;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrielamaria
 */
public class Interface extends javax.swing.JFrame {
    
    String em;
    /**
     * Creates new form Interface
     */
    public Interface(String Email) {
        em = Email;
        initComponents();
        Icon trainer1 = dietPlanLogo.getIcon();
        ImageIcon icon1 = (ImageIcon)trainer1;
        Image img1 = icon1.getImage().getScaledInstance(260, 260, Image.SCALE_SMOOTH);
        dietPlanLogo.setIcon(new ImageIcon(img1));
        dietPlanLogo.requestFocus();

    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        panelForTitle = new javax.swing.JPanel();
        dietPlanTitle = new javax.swing.JLabel();
        btnOptions = new javax.swing.JButton();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        bookingButton = new javax.swing.JButton();
        membershipButton = new javax.swing.JButton();
        dietPlanButton = new javax.swing.JButton();
        BMILabel = new javax.swing.JLabel();
        BMITextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        BMIDescription = new javax.swing.JLabel();
        dietPlanLogo = new javax.swing.JLabel();
        btnProfile = new javax.swing.JButton();
        btnBookings = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 113));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 113));

        panelForTitle.setBackground(new java.awt.Color(65, 65, 65));

        dietPlanTitle.setBackground(new java.awt.Color(255, 255, 255));
        dietPlanTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        dietPlanTitle.setForeground(new java.awt.Color(255, 255, 255));
        dietPlanTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dietPlanTitle.setText("Diet plan");

        btnOptions.setBackground(new java.awt.Color(101, 101, 101));
        btnOptions.setForeground(new java.awt.Color(255, 255, 255));
        btnOptions.setIcon(new javax.swing.ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\user.png")); // NOI18N
        btnOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOptionsMouseClicked(evt);
            }
        });
        btnOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForTitleLayout = new javax.swing.GroupLayout(panelForTitle);
        panelForTitle.setLayout(panelForTitleLayout);
        panelForTitleLayout.setHorizontalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dietPlanTitle)
                .addGap(425, 425, 425)
                .addComponent(btnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelForTitleLayout.setVerticalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForTitleLayout.createSequentialGroup()
                .addGroup(panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dietPlanTitle)
                    .addComponent(btnOptions))
                .addGap(0, 0, 0))
        );

        heightLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heightLabel.setText("Height:");

        heightTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heightTextField.setForeground(new java.awt.Color(153, 153, 153));
        heightTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        heightTextField.setText("in Meters");
        heightTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heightTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightTextFieldFocusLost(evt);
            }
        });
        heightTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heightTextFieldMouseClicked(evt);
            }
        });
        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        weightLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        weightLabel.setText("Weight:");

        weightTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        weightTextField.setForeground(new java.awt.Color(153, 153, 153));
        weightTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weightTextField.setText("in kilograms");
        weightTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                weightTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                weightTextFieldFocusLost(evt);
            }
        });
        weightTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightTextFieldMouseClicked(evt);
            }
        });

        calculateButton.setBackground(new java.awt.Color(0, 0, 0));
        calculateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(255, 255, 255));
        calculateButton.setText("Calculate");
        calculateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        bookingButton.setBackground(new java.awt.Color(0, 0, 0));
        bookingButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookingButton.setForeground(new java.awt.Color(255, 255, 255));
        bookingButton.setText("Booking");
        bookingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingButtonActionPerformed(evt);
            }
        });

        membershipButton.setBackground(new java.awt.Color(0, 0, 0));
        membershipButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        membershipButton.setForeground(new java.awt.Color(255, 255, 255));
        membershipButton.setText("Membership");
        membershipButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        membershipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipButtonActionPerformed(evt);
            }
        });

        dietPlanButton.setBackground(new java.awt.Color(0, 0, 0));
        dietPlanButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dietPlanButton.setForeground(new java.awt.Color(255, 255, 255));
        dietPlanButton.setText("Diet Plan");
        dietPlanButton.setEnabled(false);
        dietPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietPlanButtonActionPerformed(evt);
            }
        });

        BMILabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BMILabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BMILabel.setText("BMI");

        BMITextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BMITextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BMITextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMITextFieldActionPerformed(evt);
            }
        });

        generateButton.setBackground(new java.awt.Color(0, 0, 0));
        generateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Generate diet plan");
        generateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 0, 0));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        BMIDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BMIDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dietPlanLogo.setIcon(new javax.swing.ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\calculator.jpeg")); // NOI18N

        btnProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.setEnabled(false);
        btnProfile.setMaximumSize(new java.awt.Dimension(73, 36));
        btnProfile.setMinimumSize(new java.awt.Dimension(73, 36));
        btnProfile.setPreferredSize(new java.awt.Dimension(73, 36));
        btnProfile.setVisible(false);
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });

        btnBookings.setBackground(new java.awt.Color(0, 0, 0));
        btnBookings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnBookings.setText("Schedule");
        btnBookings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookings.setEnabled(false);
        btnBookings.setMaximumSize(new java.awt.Dimension(73, 36));
        btnBookings.setMinimumSize(new java.awt.Dimension(73, 36));
        btnBookings.setPreferredSize(new java.awt.Dimension(73, 36));
        btnBookings.setVisible(false);
        btnBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingsMouseClicked(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setEnabled(false);
        btnLogout.setMaximumSize(new java.awt.Dimension(73, 36));
        btnLogout.setMinimumSize(new java.awt.Dimension(73, 36));
        btnLogout.setPreferredSize(new java.awt.Dimension(73, 36));
        btnLogout.setVisible(false);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(dietPlanLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBookings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BMILabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BMIDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(BMITextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(153, 153, 153))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(membershipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dietPlanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelForTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dietPlanLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBookings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(BMILabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BMITextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMIDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membershipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dietPlanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1259, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        double h = Double.parseDouble(heightTextField.getText());
        double w = Double.parseDouble(weightTextField.getText());
        double bmi = w / (h*h);
        String cal = String.format("%.2f", bmi);
        BMITextField.setText(cal);
        
        if (bmi <= 18.5){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("    Underweight");
        }
        else if (bmi <= 24.9){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("   Normal weight");
        }
        else if (bmi <= 29.9){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("     Overweight");
        }
        else if (bmi < 35) {
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("          Obese");
          
        }
       
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        String result2 = BMITextField.getText();
        double result = Double.parseDouble(result2);
        ImageIcon dab = new ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\underweight.png");
        ImageIcon dab2 = new ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\normalweight.png");
        ImageIcon dab3 = new ImageIcon("C:\\Education\\UCSI Y2S1\\Business Systems Development Tools\\Assignment\\netbeans\\Gym\\Resources\\overweight.png");
        //JOptionPane.showMessageDialog(null, "test", "test", JOptionPane.INFORMATION_MESSAGE,dab);
         
        if (result <= 18.5){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("    Underweight");
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE,dab);
        }
        else if (result <= 24.9){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("   Normal weight");
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE,dab2);
        }
        else if (result <= 29.9){
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("     Overweight");
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE,dab3);
        }
        else if (result < 35) {
            BMIDescription.setForeground(Color.DARK_GRAY);
            BMIDescription.setText("          Obese");
            JOptionPane.showMessageDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE,dab3);

        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        heightTextField.setText("");
        weightTextField.setText("");
        BMITextField.setText("");
        BMITextField.setOpaque(true);
        BMITextField.setBackground(null);    
        BMIDescription.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void dietPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietPlanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietPlanButtonActionPerformed

    private void membershipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipButtonActionPerformed
        // TODO add your handling code here:
        Membership load = new Membership(em);
        setVisible(false);
        load.setVisible(true);
    }//GEN-LAST:event_membershipButtonActionPerformed

    private void BMITextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMITextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMITextFieldActionPerformed

    private void heightTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heightTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldMouseClicked

    private void weightTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightTextFieldMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_weightTextFieldMouseClicked

    private void weightTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightTextFieldFocusGained
        // TODO add your handling code here:
        if(weightTextField.getText().equals("in kilograms")){
        weightTextField.setText("");
        weightTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_weightTextFieldFocusGained

    private void weightTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightTextFieldFocusLost
        // TODO add your handling code here:
        if (weightTextField.getText().isEmpty()) {
            weightTextField.setForeground(Color.GRAY);
            weightTextField.setText("in kilograms");
        }
    }//GEN-LAST:event_weightTextFieldFocusLost

    private void heightTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTextFieldFocusGained
        // TODO add your handling code here:
        if(heightTextField.getText().equals("in Meters")){
           heightTextField.setText("");
           heightTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_heightTextFieldFocusGained

    private void heightTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTextFieldFocusLost
        // TODO add your handling code here:
        if (heightTextField.getText().isEmpty()) {
            heightTextField.setForeground(Color.GRAY);
            heightTextField.setText("in Meters");
        }
    }//GEN-LAST:event_heightTextFieldFocusLost

    private void btnOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOptionsMouseClicked
        // TODO add your handling code here:
        if (btnProfile.isEnabled()){
            btnProfile.setEnabled(false);
            btnProfile.setVisible(false);
            btnLogout.setEnabled(false);
            btnLogout.setVisible(false);
            btnBookings.setVisible(false);
            btnBookings.setEnabled(false);
            return;
        }
        btnProfile.setEnabled(true);
        btnProfile.setVisible(true);
        btnLogout.setEnabled(true);
        btnLogout.setVisible(true);
        btnBookings.setEnabled(true);
        btnBookings.setVisible(true);
    }//GEN-LAST:event_btnOptionsMouseClicked

    private void btnOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOptionsActionPerformed

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        // TODO add your handling code here:
        Profile load = new Profile(em);
        setVisible(false);
        load.setVisible(true);
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingsMouseClicked
        // TODO add your handling code here:
        Schedule load = new Schedule(em);
        setVisible(false);
        load.setVisible(true);
    }//GEN-LAST:event_btnBookingsMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        Login load = new Login();
        setVisible(false);
        load.setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void bookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingButtonActionPerformed
        // TODO add your handling code here:
        Booking load = new Booking(em);
        setVisible(false);
        load.setVisible(true);

    }//GEN-LAST:event_bookingButtonActionPerformed
    
   
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface("").setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BMIDescription;
    private javax.swing.JLabel BMILabel;
    private javax.swing.JTextField BMITextField;
    private javax.swing.JButton bookingButton;
    private javax.swing.JButton btnBookings;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOptions;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton dietPlanButton;
    private javax.swing.JLabel dietPlanLogo;
    private javax.swing.JLabel dietPlanTitle;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton membershipButton;
    private javax.swing.JPanel panelForTitle;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
   
}
