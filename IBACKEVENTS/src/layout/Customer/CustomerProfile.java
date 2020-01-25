/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.Customer;

import Service.impl.CustomerServiceImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import layout.Event.*;
import layout.Customer.*;
import model.Customer;

/**
 *
 * @author P D R Deshan
 */
public class CustomerProfile extends javax.swing.JFrame {

    Customer cus;
    /**
     * Creates new form CustomerReg
     */
    public CustomerProfile() {
        initComponents();
    }
    
    public CustomerProfile(Customer Cus) {
        initComponents();
        
        this.cus=Cus;
        
        setLables(Cus);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cjf = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        company = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Registration");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lgw2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 650, 270, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Profile");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 700, 370, 110);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-out.png"))); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(200, 420, 210, 50);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disco-ball.png"))); // NOI18N
        jButton8.setText("My Events");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(200, 340, 210, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -70, 390, 910);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        cjf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cjf.setForeground(new java.awt.Color(255, 255, 255));
        cjf.setText("Username");
        jPanel2.add(cjf);
        cjf.setBounds(130, 250, 220, 60);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jLabel17);
        jLabel17.setBounds(19, 874, 0, 0);

        email.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        email.setForeground(new java.awt.Color(255, 204, 204));
        email.setText("112T");
        jPanel2.add(email);
        email.setBounds(310, 180, 125, 34);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Email :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(130, 180, 200, 34);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 204, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirm.png"))); // NOI18N
        jButton6.setText(" Confirm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(540, 720, 150, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Middle Name");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(330, 330, 220, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("First Name");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(130, 330, 220, 60);

        lname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(204, 0, 204));
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(lname);
        lname.setBounds(520, 370, 170, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(520, 330, 220, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(130, 410, 220, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Company");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(130, 500, 220, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Designation");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(450, 500, 220, 60);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Mobile No");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(130, 580, 220, 60);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("User Details");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(400, 50, 370, 110);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("New Password");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(450, 580, 150, 60);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 153));
        jLabel21.setText("New password won't be applied if it is lower than 8 characters.");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(350, 840, 400, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 204));
        jLabel22.setText("*");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(590, 600, 40, 14);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 204));
        jLabel24.setText("* Fill the fiels if you want to update the current password.");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(340, 820, 360, 20);

        newpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newpass.setForeground(new java.awt.Color(204, 0, 204));
        newpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(newpass);
        newpass.setBounds(450, 620, 240, 30);

        mobile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mobile.setForeground(new java.awt.Color(204, 0, 204));
        mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(mobile);
        mobile.setBounds(130, 620, 240, 30);

        designation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        designation.setForeground(new java.awt.Color(204, 0, 204));
        designation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(designation);
        designation.setBounds(450, 540, 240, 30);

        company.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        company.setForeground(new java.awt.Color(204, 0, 204));
        company.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(company);
        company.setBounds(130, 540, 240, 30);

        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(204, 0, 204));
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(address);
        address.setBounds(130, 450, 560, 30);

        fname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(204, 0, 204));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(fname);
        fname.setBounds(130, 370, 170, 30);

        mname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mname.setForeground(new java.awt.Color(204, 0, 204));
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(mname);
        mname.setBounds(330, 370, 170, 30);

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(204, 0, 204));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        jPanel2.add(username);
        username.setBounds(130, 290, 560, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(-330, 0, 1440, 890);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 204));
        jLabel23.setText("* Fill the fiels if you want to update the current password.");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(330, 800, 360, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(330, -50, 770, 890);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, -70, 1100, 910);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-6, -6, 1110, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
        new CustomerHome(cus).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new CustomerLogin().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            
            CustomerServiceImpl srv = new CustomerServiceImpl();
            if(!(newpass.getText().equals(""))){
                
                if(newpass.getText().length()>=8){
                    
                cus.setPassword(newpass.getText());}
                
                else{
                    JPanel pane3 = new JPanel();
                JOptionPane.showMessageDialog(pane3, "Password length is poor , Update will be proceed without changing the password.", "Poor Password", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            cus.setAddress(address.getText());
            cus.setCompany(company.getText());
            cus.setDesignation(designation.getText());
            cus.setFname(fname.getText());
            cus.setMname(mname.getText());
            cus.setLname(lname.getText());
            cus.setMobile(mobile.getText());
            cus.setUsername(username.getText());
            
            if(srv.updateCustomer(cus)){
                
                JPanel pane3 = new JPanel();
                JOptionPane.showMessageDialog(pane3, "Update Successfull.", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
            
            JPanel pane3 = new JPanel();
                JOptionPane.showMessageDialog(pane3, "Update Failed. ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public void setLables(Customer cus){
        
        username.setText(cus.getUsername());
        email.setText(cus.getEmail());
        fname.setText(cus.getFname());
        mname.setText(cus.getMname());
        lname.setText(cus.getLname());
        mobile.setText(cus.getMobile());
        company.setText(cus.getCompany());
        designation.setText(cus.getDesignation());
        
    }
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
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel cjf;
    private javax.swing.JTextField company;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
