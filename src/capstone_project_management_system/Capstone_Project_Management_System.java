/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone_project_management_system;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edris
 */
public class Capstone_Project_Management_System {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Connection con;
        Statement state = null;
        
        con = dbConnect.connect();
        Introduction_Form Introduction_Form = new Introduction_Form();
        Introduction_Form.setVisible(true);
        if(con!=null){
            Thread thread = new Thread()
            {
                @Override
                public void run()
                {
                    for(int i = 0; i<=10;i++)
                    {
                        try 
                        {
                            Thread.sleep(800);
                        }
                        catch (InterruptedException ex) {
                            Logger.getLogger(Capstone_Project_Management_System.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
                        if(i==1)
                        {
                            Introduction_Form.progress.setValue(10);
                        }
                        if(i==2)
                        {
                            Introduction_Form.progress.setValue(20);
                        }
                        if(i==3)
                        {
                            Introduction_Form.progress.setValue(30);
                        }
                        if(i==4)
                        {
                            Introduction_Form.progress.setValue(30);
                        }
                        if(i==5)
                        {
                            Introduction_Form.progress.setValue(50);
                        }
                        if(i==6)
                        {
                            Introduction_Form.progress.setValue(60);
                        }
                        if(i==7)
                        {
                            Introduction_Form.progress.setValue(70);
                        }
                        if(i==8)
                        {
                            Introduction_Form.progress.setValue(80);
                        }
                        if(i==9)
                        {
                            Introduction_Form.progress.setValue(90);
                        }
                        if(i==10)
                        {
                            Introduction_Form.progress.setValue(100);
                            Select_User_Form Select_User_Form = new Select_User_Form();
                            Select_User_Form.setVisible(true);
                            Introduction_Form.dispose();
                        }
                    }
                }   
            };
        
            thread.start();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Check your database!!!");
        }
    }
    
}
