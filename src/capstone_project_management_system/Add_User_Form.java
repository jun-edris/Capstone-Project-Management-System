/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone_project_management_system;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Edris
 */
public class Add_User_Form extends javax.swing.JFrame {

    /**
     * Creates new form Add_User_Form
     */
    Connection con = null;
    Statement state = null;
    ResultSet rs;
    public Add_User_Form() {
        initComponents();
        
    }
    public void add_User()
    {
        try
        {
            
            con = dbConnect.connect();
            
                    String query = "INSERT INTO user VALUES (NULL,'"+jTextField8.getText()+"','"+jTextField9.getText()+"','"+fname.getText().toUpperCase().charAt(0) + fname.getText().substring(1, fname.getText().length())+"','"+midname.getText().toUpperCase().charAt(0) + midname.getText().substring(1, midname.getText().length())+"','"+lname.getText().toUpperCase().charAt(0) + lname.getText().substring(1, lname.getText().length())+"')";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.execute();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, e);
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

        sex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        midname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("First name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 110, 70, 19);

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        fname.setBorder(null);
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(30, 130, 230, 28);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 160, 230, 2);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Register");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 60, 90, 32);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Last name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 160, 70, 19);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 210, 230, 2);

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        lname.setBorder(null);
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(30, 180, 230, 28);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Middle name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 210, 80, 19);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(30, 260, 230, 2);

        midname.setBackground(new java.awt.Color(255, 255, 255));
        midname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        midname.setForeground(new java.awt.Color(0, 0, 0));
        midname.setBorder(null);
        midname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                midnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                midnameKeyReleased(evt);
            }
        });
        jPanel1.add(midname);
        midname.setBounds(30, 230, 230, 28);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Username");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 270, 70, 19);

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(30, 320, 230, 2);

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(30, 290, 230, 28);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 330, 70, 19);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(30, 380, 230, 2);

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setBorder(null);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(30, 350, 230, 28);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 410, 180, 40);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 460, 290, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-52.png"))); // NOI18N
        jLabel6.setText(" BACK");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 10, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fn = fname.getText();
        String ln = lname.getText();
        String mn = midname.getText();
        String username = jTextField8.getText();
        String pass = jTextField9.getText();
        try{
            if(fn.isEmpty() && ln.isEmpty() && mn.isEmpty() && username.isEmpty() && pass.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please FILL ALL FIELDS!!!");
            }
            else if(fn.isEmpty() || ln.isEmpty() || mn.isEmpty() || username.isEmpty() || pass.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "You have forgot to fill some!!!");
            }
            else
            {
                add_User();
                Admin_Dashboard Admin_Dashboard = new Admin_Dashboard();
                Admin_Dashboard.setVisible(true);
                this.dispose();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        /*if(fn.isEmpty() && ln.isEmpty() && mn.isEmpty() && add.isEmpty() && Age.isEmpty() && username.isEmpty() && pass.isEmpty() && SeX.isEmpty() && course.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Please");
        }
        else if(!fn.isEmpty() && !ln.isEmpty() && !mn.isEmpty() && !add.isEmpty() && !Age.isEmpty() && !username.isEmpty() && !pass.isEmpty() && !SeX.isEmpty() && course.getSelectedIndex() != 0)
        {
            JOptionPane.showMessageDialog(this, "DATA SUCCESSFULLY ADDED");
            add_User();
            Admin_Dashboard Admin_Dashboard = new Admin_Dashboard();
            Admin_Dashboard.setVisible(true);
            this.dispose();
                    
        }*/       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
        jLabel5.setText("");

        try
        {
            int pos = fname.getCaretPosition();

            fname.setCaretPosition(pos);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_fnameKeyReleased

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
        char c = evt.getKeyChar();
        if(c == KeyEvent.VK_SHIFT || Character.isLetter(c) || Character.isISOControl(c) || Character.isSpace(c) || c == KeyEvent.VK_SHIFT){
            fname.setEditable(true);
            jLabel5.setText("");
        }else{
            fname.setEditable(false);
            jLabel5.setText("NOTE: PLEASE USE LETTERS ONLY!");
        }
    }//GEN-LAST:event_fnameKeyPressed

    private void midnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midnameKeyReleased
        jLabel5.setText("");

        try
        {
            int pos = midname.getCaretPosition();
            midname.setCaretPosition(pos);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_midnameKeyReleased

    private void midnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midnameKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c) || Character.isSpace(c) || c == KeyEvent.VK_SHIFT){
            midname.setEditable(true);
            jLabel5.setText("");
        }else{
            midname.setEditable(false);
            jLabel5.setText("NOTE: PLEASE USE LETTERS ONLY!");
        }
    }//GEN-LAST:event_midnameKeyPressed

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
        jLabel5.setText("");

        try
        {
            int pos = lname.getCaretPosition();
            lname.setCaretPosition(pos);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_lnameKeyReleased

    private void lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c) || Character.isSpace(c) || c == KeyEvent.VK_SHIFT){
            lname.setEditable(true);
            jLabel5.setText("");
        }else{
            lname.setEditable(false);
            jLabel5.setText("NOTE: PLEASE USE LETTERS ONLY!");
        }
    }//GEN-LAST:event_lnameKeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Admin_Dashboard Admin_Dashboard = new Admin_Dashboard();
        Admin_Dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Add_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField midname;
    private javax.swing.ButtonGroup sex;
    // End of variables declaration//GEN-END:variables
}
