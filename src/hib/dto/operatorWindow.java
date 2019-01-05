/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.dto;

import java.util.List;
import static java.lang.ProcessBuilder.Redirect.from;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class operatorWindow extends javax.swing.JFrame {

    /**
     * Creates new form opertorWindow
     */
    public operatorWindow() {
        initComponents();

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session   session=sf.openSession();//used to open table
        Transaction tx=session.beginTransaction();
          DefaultTableModel dtm2=(DefaultTableModel)jTable1.getModel();
           Query q=session.createQuery("from Student");
           List<Student> data=q.list();
           for(Student st:data)
           {
           
               Object obj[]={st.getStuName(),st.getReason(),st.getbTime(),st.getcName(),st.getcNo(),st.getBackupTopic()};
               dtm2.addRow(obj);
           }
      
        
         
          DefaultTableModel dtm3=(DefaultTableModel)jTable2.getModel();
           Query q1=session.createQuery("from Operator");
           List<Operator> data1=q1.list();
           for(Operator op:data1)
           {
           
               Object obj[]={op.getDate(),op.getTime(),op.getTopic()};
               dtm3.addRow(obj);
           }
       tx.commit();
       
        session.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Backup Topic", "Batch Time", "Course Name", "Contact Number", "Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 740, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("View requests", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Day");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 90, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Time");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Topic");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 90, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        jTabbedPane1.addTab("Arrange backup", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Topic"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 580, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("View", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setText("Enter the date to delete backup class");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, -1));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 80, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel10.setText("Date");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 830, 570));

        jTabbedPane1.addTab("Delete", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 590));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 13, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int result=JOptionPane.showConfirmDialog(this,"Do you want to sign out?","Sign Out Message",JOptionPane.YES_NO_OPTION);
           if(result==0)
           {
               new HomePage().setVisible(true);
               dispose();
               
           }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session   session=sf.openSession();//used to open table
        Transaction tx=session.beginTransaction();

        String day=jTextField1.getText();
        String date=jTextField2.getText();
        String time=jTextField3.getText();
        String topic=jTextField4.getText();

        Operator op=new Operator(day,date,time,topic);

        session.save(op);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(this, "Back up arranged!");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      
        String topic1=jTextField5.getText();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session   session=sf.openSession();//used to open table
        Transaction tx=session.beginTransaction();
        
        Operator op=(Operator)session.get(Operator.class,topic1);
     
if(op==null)
{
        JOptionPane.showMessageDialog(this, "No record found!");
        jTextField5.setText("");
}

else
{
    session.delete(op);
    tx.commit();
    JOptionPane.showMessageDialog(this, "Record deleted successfully!");
    jTextField5.setText("");
session.close();
}


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(operatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operatorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operatorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
