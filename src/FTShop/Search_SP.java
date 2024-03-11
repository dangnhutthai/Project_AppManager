/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FTShop;
import Connection.MySQLConnect;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginContext;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import FTShop.FTShop;

/**
 *
 * @author ADMIN
 */
public class Search_SP extends javax.swing.JFrame {
   private static final String Username = "root";
    private static final String Password = "dangnhutthai";
    private static final String Dataconn =  "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
    
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q,i;
    
    /**
     * Creates new form FTShop
     */
    public Search_SP() {
        initComponents();
    }
    /**
     * Creates new form Search_SP
     */
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JbtnExitshowproduct = new javax.swing.JButton();
        Jbtnreset = new javax.swing.JButton();
        jbtnupdate = new javax.swing.JButton();
        jbtnStatistic = new javax.swing.JButton();
        jbtnSortbyproducttype = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtidproduct = new javax.swing.JTextField();
        jtxtnameproduct = new javax.swing.JTextField();
        jtxtprice = new javax.swing.JTextField();
        jtxtdiscribe = new javax.swing.JTextField();
        jtxtcolor = new javax.swing.JTextField();
        jtxtidtypeproduct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtSortpricebyproducttype = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxtstatisticsbyGender = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jbtnreturnftshop = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtxtsearchbycolor = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtxtsearchbyname = new javax.swing.JTextPane();
        jbtnsearchbyname = new javax.swing.JButton();
        jbtnsearchbyColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Show Products");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));

        JbtnExitshowproduct.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JbtnExitshowproduct.setText("Exit");
        JbtnExitshowproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnExitshowproductActionPerformed(evt);
            }
        });

        Jbtnreset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jbtnreset.setText("Reset");
        Jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnresetActionPerformed(evt);
            }
        });

        jbtnupdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnupdate.setText("Update");
        jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });

        jbtnStatistic.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnStatistic.setText("Statistics");
        jbtnStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStatisticActionPerformed(evt);
            }
        });

        jbtnSortbyproducttype.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnSortbyproducttype.setText("Sort");
        jbtnSortbyproducttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSortbyproducttypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JbtnExitshowproduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jbtnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtnStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnSortbyproducttype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSortbyproducttype, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbtnExitshowproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDProduct", "NameProduct", "Price", "Discribe", "Color", "IDTypeProduct"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Statistics By Gender");

        jScrollPane2.setViewportView(jTxtSortpricebyproducttype);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sort Price Gender");

        jScrollPane3.setViewportView(jTxtstatisticsbyGender);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtidproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtnameproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtidtypeproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtdiscribe, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtidproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtnameproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jtxtdiscribe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtidtypeproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));

        jbtnreturnftshop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnreturnftshop.setText("FTShop");
        jbtnreturnftshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnreturnftshopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnreturnftshop, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnreturnftshop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jtxtsearchbycolor);

        jScrollPane7.setViewportView(jtxtsearchbyname);

        jbtnsearchbyname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnsearchbyname.setText("Search by name");
        jbtnsearchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchbynameActionPerformed(evt);
            }
        });

        jbtnsearchbyColor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnsearchbyColor.setText("Search by Color");
        jbtnsearchbyColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchbyColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnsearchbyname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jbtnsearchbyColor))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnsearchbyColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsearchbyname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 950, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void JbtnExitshowproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnExitshowproductActionPerformed
        // TODO add your handling code here:
        frame = new  JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","MySQL Connector",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_JbtnExitshowproductActionPerformed

    private void JbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnresetActionPerformed
        // TODO add your handling code here:
        jtxtprice.setText("");
        jtxtcolor.setText("");
        jtxtidproduct.setText("");
        jtxtdiscribe.setText("");
        jtxtnameproduct.setText("");
        jtxtidtypeproduct.setText("");
    }//GEN-LAST:event_JbtnresetActionPerformed

    private void jbtnsearchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchbynameActionPerformed
        // TODO add your handling code here:
        jtxtcolor.setText("");
        jtxtdiscribe.setText("");
        jtxtidproduct.setText("");
        jtxtidtypeproduct.setText("");
        jtxtnameproduct.setText("");
        jtxtprice.setText("");
           
         DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try{  
            
            CallableStatement csmt = null;
            int searchname = JOptionPane.showConfirmDialog(null, "confirm if you want to search with "+jtxtsearchbyname.getText(), "Warning", JOptionPane.YES_NO_OPTION);
            if(searchname == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(Dataconn,Username,Password);
                csmt = sqlconn.prepareCall("{call sp_SearchByName(?)}");
                
                csmt.setString(1, jtxtsearchbyname.getText());
                
                ResultSet result = csmt.executeQuery();
                JOptionPane.showMessageDialog(this, "Record updated");
                ResultSetMetaData stData = result.getMetaData();
                printDB(result, stData.getColumnCount());
                
                jtxtidproduct.setText("");
                jtxtprice.setText("");
                jtxtnameproduct.setText("");
                jtxtdiscribe.setText("");
                jtxtcolor.setText("");
                jtxtidtypeproduct.setText("");
                jtxtsearchbycolor.setText("");
            }if(jtxtsearchbyname.equals("") && jtxtsearchbycolor.equals("")){
                printDB(rs, ALLBITS);
            }        
        }catch(ClassNotFoundException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }//GEN-LAST:event_jbtnsearchbynameActionPerformed

    private void jbtnreturnftshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnreturnftshopActionPerformed
        new FTShop().setVisible(true);
    }//GEN-LAST:event_jbtnreturnftshopActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        jtxtidproduct.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        jtxtnameproduct.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtprice.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtdiscribe.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtcolor.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        jtxtidtypeproduct.setText(RecordTable.getValueAt(SelectedRows, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    public void upDateDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(Dataconn, Username,Password);
            pst = sqlconn.prepareStatement("Select * from sanpham");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            printDB(rs, stData.getColumnCount());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    
        public void printDB(ResultSet rs, int columns) {
            q = columns;
            try{
                DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                RecordTable.setRowCount(0);

                while(rs.next()){
                    Vector columnData = new Vector();

                    for (i = 1; i<=q;i++){
                        columnData.add(rs.getString("ma_san_pham"));
                        columnData.add(rs.getString("ten_san_pham"));
                        columnData.add(rs.getString("gia_san_pham"));
                        columnData.add(rs.getString("mo_ta_san_pham"));
                        columnData.add(rs.getString("mau_sac"));
                        columnData.add(rs.getString("ma_loai_san_pham"));
                }
                    RecordTable.addRow(columnData);}
        }catch(SQLException ex) {
        
        }
}

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(Dataconn,Username,Password);
            pst = sqlconn.prepareStatement("update sanpham set ma_san_pham=?, ten_san_pham=?, gia_san_pham=?, mo_ta_san_pham=?, mau_sac=?, ma_loai_san_pham=? where ma_san_pham=?");

            pst.setString(1, jtxtidproduct.getText());
            pst.setString(2, jtxtnameproduct.getText());
            pst.setString(3, jtxtprice.getText());
            pst.setString(4, jtxtdiscribe.getText());
            pst.setString(5, jtxtcolor.getText());
            pst.setString(6, jtxtidtypeproduct.getText());

            JOptionPane.showMessageDialog(this, "Record Updated");
            upDateDB();

        }catch(ClassNotFoundException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jbtnsearchbyColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchbyColorActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try{  
            
            CallableStatement csmt = null;
            int searchname = JOptionPane.showConfirmDialog(null, "confirm if you want to search with "+jtxtsearchbycolor.getText(), "Warning", JOptionPane.YES_NO_OPTION);
            if(searchname == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(Dataconn,Username,Password);
                csmt = sqlconn.prepareCall("{call sp_SearchByColor(?)}");
                
                csmt.setString(1, jtxtsearchbycolor.getText());
                
                ResultSet result = csmt.executeQuery();
                JOptionPane.showMessageDialog(this, "Record updated");
                ResultSetMetaData stData = result.getMetaData();
                printDB(result, stData.getColumnCount());
                
                jtxtidproduct.setText("");
                jtxtprice.setText("");
                jtxtnameproduct.setText("");
                jtxtdiscribe.setText("");
                jtxtcolor.setText("");
                jtxtidtypeproduct.setText("");
                jtxtsearchbyname.setText("");
            }if(jtxtsearchbyname.equals("") && jtxtsearchbycolor.equals("")){
                printDB(rs, ALLBITS);       
            }
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnsearchbyColorActionPerformed

    private void jbtnStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStatisticActionPerformed
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
            
        try{  
            
            CallableStatement csmt = null;
            int searchname = JOptionPane.showConfirmDialog(null, "confirm if you want to search with "+jTxtstatisticsbyGender.getText(), "Warning", JOptionPane.YES_NO_OPTION);
            if(searchname == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(Dataconn,Username,Password);
                csmt = sqlconn.prepareCall("{call count_filter(?, ?)}");
                
                csmt.setString(1, jTxtstatisticsbyGender.getText());
                csmt.registerOutParameter(2, java.sql.Types.INTEGER);
                ResultSet result = csmt.executeQuery();
                ResultSetMetaData stData = result.getMetaData();
                if(!jTxtstatisticsbyGender.equals("")){
                JOptionPane.showMessageDialog(null,"So san pham thuoc nhom nguoi dung "+ jTxtstatisticsbyGender.getText()+" la: "+csmt.getInt("sosp"));
                jtxtidproduct.setText("");
                jtxtprice.setText("");
                jtxtnameproduct.setText("");
                jtxtdiscribe.setText("");
                jtxtcolor.setText("");
                jtxtidtypeproduct.setText("");
                }
                
          }
            else if(jTxtstatisticsbyGender.equals("")){
                csmt = sqlconn.prepareCall("{call count_AllProduct()}");
                ResultSet result = csmt.executeQuery();
                ResultSetMetaData stData = result.getMetaData();
                JOptionPane.showMessageDialog(null, "Tất cả số lượng sản phẩm sau thống kê là: "+csmt.getInt(1));
               
            }
        }catch(ClassNotFoundException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jbtnStatisticActionPerformed

    private void jbtnSortbyproducttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSortbyproducttypeActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try{  
            
            CallableStatement csmt = null;
            int searchname = JOptionPane.showConfirmDialog(null, "confirm if you want to search with "+jTxtSortpricebyproducttype.getText(), "Warning", JOptionPane.YES_NO_OPTION);
            if(searchname == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(Dataconn,Username,Password);
                csmt = sqlconn.prepareCall("{call sp_SortPriceByType(?)}");
                
                csmt.setString(1, jTxtSortpricebyproducttype.getText());
                ResultSet result = csmt.executeQuery();
                JOptionPane.showMessageDialog(this, "Record updated");
                ResultSetMetaData stData = result.getMetaData();
                printDB(result, stData.getColumnCount());
                
                jtxtidproduct.setText("");
                jtxtprice.setText("");
                jtxtnameproduct.setText("");
                jtxtdiscribe.setText("");
                jtxtcolor.setText("");
                jtxtidtypeproduct.setText("");
          }
            else if(jTxtSortpricebyproducttype.equals("")){
                csmt = sqlconn.prepareCall("call sp_SortAllProduct()");
                ResultSet result = csmt.executeQuery();
                JOptionPane.showMessageDialog(this, "Record updated");
                ResultSetMetaData stData = result.getMetaData();
                printDB(result, stData.getColumnCount());
            }
        }catch(ClassNotFoundException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(FTShop.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jbtnSortbyproducttypeActionPerformed

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
            java.util.logging.Logger.getLogger(Search_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_SP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_SP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnExitshowproduct;
    private javax.swing.JButton Jbtnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTxtSortpricebyproducttype;
    private javax.swing.JTextPane jTxtstatisticsbyGender;
    private javax.swing.JButton jbtnSortbyproducttype;
    private javax.swing.JButton jbtnStatistic;
    private javax.swing.JButton jbtnreturnftshop;
    private javax.swing.JButton jbtnsearchbyColor;
    private javax.swing.JButton jbtnsearchbyname;
    private javax.swing.JButton jbtnupdate;
    private javax.swing.JTextField jtxtcolor;
    private javax.swing.JTextField jtxtdiscribe;
    private javax.swing.JTextField jtxtidproduct;
    private javax.swing.JTextField jtxtidtypeproduct;
    private javax.swing.JTextField jtxtnameproduct;
    private javax.swing.JTextField jtxtprice;
    private javax.swing.JTextPane jtxtsearchbycolor;
    private javax.swing.JTextPane jtxtsearchbyname;
    // End of variables declaration//GEN-END:variables
}
