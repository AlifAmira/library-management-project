
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tisha
 */
public class Findmember extends javax.swing.JFrame {

    /**
     * Creates new form Findmember
     */
    public Findmember() {
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

        fname = new javax.swing.JLabel();
        fID = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        i2 = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        fname.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 51, 102));
        fname.setText("Name :");
        getContentPane().add(fname);
        fname.setBounds(30, 40, 70, 30);

        fID.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        fID.setForeground(new java.awt.Color(255, 51, 102));
        fID.setText("ID       :");
        getContentPane().add(fID);
        fID.setBounds(30, 130, 60, 30);

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        getContentPane().add(n2);
        n2.setBounds(150, 40, 243, 45);

        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });
        getContentPane().add(i2);
        i2.setBounds(150, 120, 243, 43);

        find.setBackground(new java.awt.Color(255, 204, 51));
        find.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        find.setForeground(new java.awt.Color(255, 51, 204));
        find.setText("Edit");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find);
        find.setBounds(220, 230, 140, 40);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 230, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
         Menu Me=new Menu();// TODO add your handling code here:
         Me.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
       try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "E:/addMember11";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            
            String er = i2.getText();
            String sr = "SELECT * FROM member WHERE identification='"+er+"'" ;
            stmt.execute(sr);            
            	ResultSet result= stmt.getResultSet();            
            	while(result.next())
            	{       
            	}
                
            
            JOptionPane.showMessageDialog(null, "found");
            
            
    }                                    
       catch (Exception err) {
            System.out.println("ERROR: " + err);
        }                             
             // TODO add your handling code here:
    }//GEN-LAST:event_findActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i2ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

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
            java.util.logging.Logger.getLogger(Findmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Findmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Findmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Findmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Findmember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fID;
    private javax.swing.JButton find;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField i2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField n2;
    // End of variables declaration//GEN-END:variables
}
