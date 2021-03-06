/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone_project_management_system;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edris
 */
public class User_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form User_Dashboard
     */
    //User_LogIn_Form User_LogIn_Form = new User_LogIn_Form();
    public static String g_course;
    public static String g_capstone_no;
    Connection con = null;
    Statement state = null;
    ResultSet rs, rs1, rs2, rs3;
    String logid;
    String log_name;
    String filename, filename1, filename2, filename3, filename4, filename5, filename6, filename7, filename8;
    User_LogIn_Form User_LogIn_Form = new User_LogIn_Form();
    String ss;
    public User_Dashboard() {
        initComponents();
        logid = User_LogIn_Form.user_ID;
        log_name = User_LogIn_Form.name;
        jLabel4.setText(log_name);
        show_table();
        show_book();
    }
    public void show_table()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try
        {
            con = dbConnect.connect();
            String query = "select * from capstone where user_id = '"+logid+"'";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next())
            {
                g_capstone_no = rs.getString("capstone_no");
                g_course = rs.getString("course_no");
                model.addRow(new Object[]{rs.getString("sy")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void show_book()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try
        {
            con = dbConnect.connect();
            String query = "select * from book inner join capstone where book.capstone_no = '"+g_capstone_no+"' and capstone.capstone_no = '"+g_capstone_no+"'";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("book_id"), rs.getString("sy"), rs.getString("book_title")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        sex1 = new javax.swing.ButtonGroup();
        sex2 = new javax.swing.ButtonGroup();
        sex3 = new javax.swing.ButtonGroup();
        sex4 = new javax.swing.ButtonGroup();
        sex5 = new javax.swing.ButtonGroup();
        sex6 = new javax.swing.ButtonGroup();
        sex7 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 1419));
        jPanel2.setLayout(null);

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jLabel35);
        jLabel35.setBounds(1150, 470, 150, 20);

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jLabel34);
        jLabel34.setBounds(900, 470, 150, 20);

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jLabel33);
        jLabel33.setBounds(660, 470, 150, 20);

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel32);
        jLabel32.setBounds(1150, 310, 150, 140);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel31);
        jLabel31.setBounds(900, 310, 150, 140);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel28);
        jLabel28.setBounds(660, 310, 150, 140);
        jPanel2.add(jLabel65);
        jLabel65.setBounds(140, 290, 300, 200);

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Authors:");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(640, 280, 60, 19);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(140, 520, 390, 78);

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Description:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(50, 520, 80, 19);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "School Year", "THESIS BOOK TITLE"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(0);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable2.getColumnModel().getColumn(1).setMinWidth(200);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(510, 90, 840, 170);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SCHOOL YEARS BEING A RESEARCH TEACHER"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(50, 90, 290, 170);

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("WELCOME ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 210, 50);

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("WELCOME ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(230, 30, 1120, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oki5.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 670);

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));

        jMenu1.setBackground(new java.awt.Color(102, 204, 255));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-32.png"))); // NOI18N
        jMenu1.setText("  HOME     ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Add_Book Add_Book = new Add_Book();
        Add_Book.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        int row = jTable2.getSelectedRow();
        String dataClicked = model1.getValueAt(row, 0).toString();
        try
        {
            con = dbConnect.connect();
            
            String query = "select * from students where book_id = '"+dataClicked+"'";
            String query1 = "select std_fname, std_lname, std_mname from students where book_id = '"+dataClicked+"'";
            String query2 = "select std_fname, std_lname, std_mname from students where book_id = '"+dataClicked+"' and std_id = 2";
            String query3 = "select std_fname, std_lname, std_mname from students where book_id = '"+dataClicked+"' and std_id = 3";
            state = con.createStatement();
            rs = state.executeQuery(query);
            rs1 = state.executeQuery(query1);
            rs2 = state.executeQuery(query2);
            rs3 = state.executeQuery(query3);
            
            while(rs1.next())
            {
                String person1 = rs.getString("std_fname") +" "+rs.getString("std_mname").charAt(0)+". "+ rs.getString("std_lname");
                //String person2 = rs.getString("std_")
                jLabel33.setText(person1);
            }
        }
        catch(Exception e)
        {
            
        }
        
        
        /*DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        int row = jTable2.getSelectedRow();
        String dataClicked = model1.getValueAt(row, 0).toString();
        try
        {
            con = dbConnect.connect();
            
            String query = "select * from book where book_id = '"+dataClicked+"'";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next())
            {
                Blob image = rs.getBytes("book_pic");
                ImageIcon icon = new ImageIcon(image);
                Image img = icon.getImage();
                Image g_img = img.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon G_img = new ImageIcon(g_img);
                jLabel28.setIcon(icon);
                jTextArea2.setText(rs.getString("book_desc"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }*/
        
    }//GEN-LAST:event_jTable2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.ButtonGroup sex1;
    private javax.swing.ButtonGroup sex2;
    private javax.swing.ButtonGroup sex3;
    private javax.swing.ButtonGroup sex4;
    private javax.swing.ButtonGroup sex5;
    private javax.swing.ButtonGroup sex6;
    private javax.swing.ButtonGroup sex7;
    // End of variables declaration//GEN-END:variables
}
