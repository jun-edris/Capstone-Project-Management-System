/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone_project_management_system;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Edris
 */
public class User_LogIn_Form extends javax.swing.JFrame {

    /**
     * Creates new form User_LogIn_Form
     */
    public static String user_ID = null;
    public static String name = null;
    Connection con = null;
    Statement state = null;
    ResultSet rs;
    public User_LogIn_Form() {
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        user_login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-52.png"))); // NOI18N
        jLabel5.setText(" BACK");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 100, 40);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("LOG IN");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 290, 260, 40);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(180, 260, 260, 10);

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(180, 230, 260, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(180, 210, 260, 10);

        user_login.setBackground(new java.awt.Color(255, 255, 255));
        user_login.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        user_login.setForeground(new java.awt.Color(0, 0, 0));
        user_login.setBorder(null);
        user_login.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(user_login);
        user_login.setBounds(180, 180, 260, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-password-52.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 230, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-username-50.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 180, 35, 30);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("USER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 80, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oki2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Select_User_Form Select_User_Form = new Select_User_Form();
        Select_User_Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            con = dbConnect.connect();

            String query = "SELECT * FROM user WHERE username = '" +user_login.getText()+ "' && password = '" +String.valueOf(jPasswordField1.getPassword())+ "' ";
            state = (Statement) con.createStatement();
            rs = state.executeQuery(query);
            if(rs.next())
            {
                name = rs.getString("First_name") +" "+ rs.getString("Mid_name").charAt(0) +". "+ rs.getString("Last_Name");
                user_ID = rs.getString("user_id");
                User_Dashboard User_Dashboard = new User_Dashboard();
                User_Dashboard.setVisible(true);
                this.dispose();
                //jLabel2.setText(usr_id); mu okay na
            }
            else
            {
                JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS");
            }
        }
        catch(HeadlessException | SQLException c)
        {
            JOptionPane.showMessageDialog(null, c);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(User_LogIn_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_LogIn_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_LogIn_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_LogIn_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_LogIn_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField user_login;
    // End of variables declaration//GEN-END:variables
}
