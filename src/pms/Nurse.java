/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms;

import java.sql.*;
import java.awt.*;
import java.util.Properties;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.util.*;   
import javax.activation.*;  

/**
 *
 * @author Abid
 */
public class Nurse extends javax.swing.JFrame implements User {

    /**
     * Creates new form Doctor
     */
    UtilDateModel model;
    Properties px;
    JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;
    ResultSet rss,res;
    Connection co=null;
    public Nurse() {
        co=SqlConn.dbCon();
        try
        {
            rss=co.prepareStatement("select id,name from info").executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            res=co.prepareStatement("select vid as 'Visit ID',pid as 'Patient ID',did as 'Doctor ID',datetime as 'Date Time' from visits").executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        initComponents();
        jPanel3.setBackground(new Color(0,0,0,100));
        //jPanel7.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
        
        model = new UtilDateModel();
		Properties px = new Properties();
		px.put("text.today", "Today");
		px.put("text.month", "Month");
		px.put("text.year", "Year");
		datePanel = new JDatePanelImpl(model, px);
		// Don't know about the formatter, but there it is...
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(410, 90, 170, 30);
                
        
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
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(204, 0, 51));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8_Heart_with_Pulse_32px_1.png"))); // NOI18N
        jPanel8.add(jLabel6);
        jLabel6.setBounds(10, 10, 32, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Patient Record");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(50, 15, 110, 16);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 0, 250, 50);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8_Feedback_32px.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31);
        jLabel31.setBounds(190, 340, 40, 40);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(null);
        jPanel14.add(jTextField11);
        jTextField11.setBounds(9, 11, 200, 40);

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Send");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4);
        jButton4.setBounds(10, 60, 63, 29);

        jPanel1.add(jPanel14);
        jPanel14.setBounds(10, 280, 220, 100);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel44.setText("Blood Pressure");
        jPanel15.add(jLabel44);
        jLabel44.setBounds(40, 10, 110, 16);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setText("Breathing Rate");
        jPanel15.add(jLabel45);
        jLabel45.setBounds(40, 50, 110, 16);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setText("Heart Rate");
        jPanel15.add(jLabel46);
        jLabel46.setBounds(40, 90, 90, 16);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setText("Sugar Levels");
        jPanel15.add(jLabel47);
        jLabel47.setBounds(40, 130, 100, 16);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setText("Body Temperature(C)");
        jPanel15.add(jLabel48);
        jLabel48.setBounds(40, 170, 140, 16);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setText("WBC Count");
        jPanel15.add(jLabel49);
        jLabel49.setBounds(40, 210, 90, 16);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setText("RBC Count");
        jPanel15.add(jLabel50);
        jLabel50.setBounds(40, 250, 100, 16);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setText("Amount");
        jPanel15.add(jLabel51);
        jLabel51.setBounds(40, 290, 100, 16);

        jLabel52.setText("Genetic Conditions");
        jPanel15.add(jLabel52);
        jLabel52.setBounds(40, 330, 120, 14);

        jLabel53.setText("Amount Spent");
        jPanel15.add(jLabel53);
        jLabel53.setBounds(40, 360, 80, 14);

        jLabel54.setText("jLabel18");
        jPanel15.add(jLabel54);
        jLabel54.setBounds(240, 360, 40, 14);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setText("jLabel18");
        jPanel15.add(jLabel55);
        jLabel55.setBounds(230, 10, 70, 16);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setText("jLabel18");
        jPanel15.add(jLabel56);
        jLabel56.setBounds(230, 50, 70, 16);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel57.setText("jLabel18");
        jPanel15.add(jLabel57);
        jLabel57.setBounds(230, 90, 70, 16);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel58.setText("jLabel18");
        jPanel15.add(jLabel58);
        jLabel58.setBounds(230, 130, 70, 16);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setText("jLabel18");
        jPanel15.add(jLabel59);
        jLabel59.setBounds(230, 170, 70, 16);

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setText("jLabel18");
        jPanel15.add(jLabel60);
        jLabel60.setBounds(230, 210, 70, 16);

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel61.setText("jLabel18");
        jPanel15.add(jLabel61);
        jLabel61.setBounds(230, 250, 70, 16);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel62.setText("jLabel18");
        jPanel15.add(jLabel62);
        jLabel62.setBounds(230, 290, 70, 16);

        jLabel63.setText("jLabel18");
        jPanel15.add(jLabel63);
        jLabel63.setBounds(240, 330, 40, 14);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel15.add(jSeparator3);
        jSeparator3.setBounds(310, 10, 10, 300);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setText("Patient Remarks");
        jPanel15.add(jLabel64);
        jLabel64.setBounds(350, 10, 85, 16);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel65.setText("Doctor Remarks");
        jPanel15.add(jLabel65);
        jLabel65.setBounds(350, 160, 90, 16);

        jScrollPane3.setViewportView(jTextPane1);

        jPanel15.add(jScrollPane3);
        jScrollPane3.setBounds(350, 30, 200, 100);

        jScrollPane4.setViewportView(jTextPane2);

        jPanel15.add(jScrollPane4);
        jScrollPane4.setBounds(350, 180, 200, 100);

        jButton7.setBackground(new java.awt.Color(204, 0, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel15.add(jButton7);
        jButton7.setBounds(330, 300, 70, 15);

        jPanel7.add(jPanel15);
        jPanel15.setBounds(0, 0, 600, 330);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8_Search_32px_1.png"))); // NOI18N
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel66);
        jLabel66.setBounds(560, 20, 32, 32);

        jTextField24.setText("Search");
        jPanel7.add(jTextField24);
        jTextField24.setBounds(7, 20, 540, 30);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setToolTipText("");

        jTable2.setModel(buildTableModel(res));
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(8, 59, 580, 270);

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View Details");
        jButton6.setBorder(null);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel7.add(jButton6);
        jButton6.setBounds(470, 330, 110, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 10, 610, 370);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 630, 400));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 135, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("v1.0");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 60, 34, 14);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8_Delete_20px_1.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        jPanel3.add(jLabel12);
        jLabel12.setBounds(860, 0, 20, 20);

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(860, 0, 20, 20);

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Euphorium");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 210, 60);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/icons8_Back_Arrow_32px_2.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel24);
        jLabel24.setBounds(10, 140, 32, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pms/pediatric1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 960, 180));

        setSize(new java.awt.Dimension(881, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    void insert_patient(String name,String gender, java.sql.Date dob, int height, int weight, String genetic, String allergies,
						String bgrp,String email,String pass) throws Exception {
		String sta="";
        sta = "insert into cred values(null,?,?,?,?)";
        PreparedStatement ps=co.prepareStatement(sta);
		String hashed = BCrypt.hashpw(pass, BCrypt.gensalt());
        ps.setString(1, name);
    	ps.setString(2, hashed);
        ps.setString(3,"Patient");
        ps.setString(4, email);
		ps.executeUpdate();
                String dd="select max(uid) from cred;";
                
//		sta="select uid from cred where name="+name;
//		PreparedStatement pss=co.prepareStatement(sta);
//		ResultSet rr=pss.executeQuery();
                ResultSet k=co.prepareStatement(dd).executeQuery();
                int id=0;
                if(k.next())
                    id=k.getInt(1);;
		String sql = "INSERT INTO INFO VALUES(?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement pst = co.prepareStatement(sql);
		pst.setString(1, gender);
		pst.setDate(2, dob);
		pst.setInt(3, height);
		pst.setInt(4, weight);
		pst.setString(5, genetic);
		pst.setString(6, allergies);
		pst.setString(7, "0"); // THE AMOUNT THE PATIENT HAS SPENT TILL NOW; THIS WILL GET UPDATED UPON EACH VISIT
		pst.setString(8, bgrp);
		pst.setInt(9, id);
		pst.setString(10, name);
		pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Patient inserted with ID: "+id);

	}
    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        reset();
        try
        {
            res=co.prepareStatement("select vid as 'Visit ID',pid as 'Patient ID',did as 'Doctor ID',datetime as 'Date Time' from visits").executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        jTable2.setModel(buildTableModel(res));
        jPanel8.setBackground(new Color(204,0,51));
        jPanel7.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jPanel5.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel5.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        jPanel14.setVisible(true);
        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
                
		//properties.put("mail.smtp.auth", "true");
		//properties.put("mail.smtp.starttls.enable", "true");
		//properties.put("mail.smtp.host", "smtp.gmail.com");
		//properties.put("mail.smtp.port", "587");
		
		
                jPanel14.setVisible(false);
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    int cc(String s)
    {
        return(Integer.parseInt(s));
    }
    float ff(String s)
    {
        //System.out.println(s);
        if (s != null && !s.isEmpty())
        return(Float.parseFloat(s));
        else return 0.0f;
    }
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jPanel15.setVisible(true);
        int column = 0;
        int row = jTable2.getSelectedRow();
        int id = (int) jTable2.getModel().getValueAt(row, column);
        try
        {
            PreparedStatement pst=co.prepareStatement("select bp,br,hr,bs,temp,wbc,rbc,amount,p_rem,d_rem from visits where vid="+id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                jLabel55.setText(rs.getString(1));
                jLabel56.setText(rs.getString(2));
                jLabel57.setText(rs.getString(3));
                jLabel58.setText(rs.getString(4));
                jLabel59.setText(rs.getString(5));
                jLabel60.setText(rs.getString(6));
                jLabel61.setText(rs.getString(7));
                jLabel62.setText(rs.getString(8));
                jTextPane1.setText(rs.getString(9));
                jTextPane2.setText(rs.getString(10));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jPanel15.setVisible(false);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        String sql="(select vid as 'Visit ID',pid as 'Patient ID',did as 'Doctor ID',datetime as 'Date Time' from visits WHERE D_REM LIKE '%"+jTextField24.getText()+"%') union (select vid as 'Visit ID',pid as 'Patient ID',did as 'Doctor ID',datetime as 'Date Time' from visits where pid in (select id from info where name like '%"+jTextField24.getText()+"%'));";
        
        try{
        PreparedStatement pst= co.prepareStatement(sql);
        ResultSet rs= pst.executeQuery();
        jTable2.setModel(buildTableModel(rs));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No results found");
        }
        
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new Home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked
    
    
    void insert_visit(int patient_id,
		int doctor_id ,
		float blood_pressure,
		float breathing_rate,
		float heart_rate,
		float sugar_level,
		float body_temp,
		float wbc,
		float rbc,
		float amount,
		String patient_remarks,
		String doctor_remarks)  throws Exception{

		// inserting a new visit ie already existing patient

		// schema for VISIT(vid int, pid int, did int, datetime timestamp, blood pressure float, breathing rate float, heart rate float, blood sugar levels float, body temperature float, wbc count float, rbc count float, amount float, patient remarks varchar(200), doctor remarks varchar(200))

		/*
		When the user enters his patient id, his last visit's info pops up in corresponding text boxes on the screen.
   		Info means relevant info like blood pressure, breathing rate, heart rate....onwards
   		Info like doctor id and timestamp have to be manually entered by doctor
   		visit id auto increment primary key
   		*/

		
		

		String sql = "INSERT INTO VISITS VALUES(NULL,?,?,NULL,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = co.prepareStatement(sql);
		pst.setInt(1, patient_id);
		pst.setInt(2, doctor_id);
		//pst.setString(3, "null");
		pst.setFloat(3, blood_pressure);
		pst.setFloat(4, breathing_rate);
		pst.setFloat(5, heart_rate);
		pst.setFloat(6, sugar_level);
		pst.setFloat(7, body_temp);
		pst.setFloat(8, wbc);
		pst.setFloat(9, rbc);
		pst.setFloat(10, amount);
		pst.setString(11, patient_remarks);
		pst.setString(12, doctor_remarks);
                //System.out.println(pst);
		pst.executeUpdate();

		//Updating the total amount spent in the info table
		sql = "UPDATE INFO SET AMOUNT_SPENT = AMOUNT_SPENT + ? WHERE ID = ?";
		pst = co.prepareStatement(sql);
		pst.setFloat(1, amount);
		pst.setInt(2, patient_id);
		pst.executeUpdate();


	}
    
    
    void modify_patient(int patientID, String gender, int height, int weight, String genetic,
						String allergies, String bgrp) throws Exception {

		String sql = "UPDATE INFO SET GENDER  = ?, HEIGHT = ?, WEIGHT = ?, GENETIC = ?, ALLERGIES = ?, bgrp = ? WHERE ID = ?;";
		PreparedStatement pst = co.prepareStatement(sql);
		pst.setString(1, gender);
		pst.setFloat(2, height);
		pst.setFloat(3, weight);
		pst.setString(4, genetic);
		pst.setString(5, allergies);
		pst.setString(6, bgrp);
		pst.setInt(7, patientID);
		pst.executeUpdate();

	}
    
    public static DefaultTableModel buildTableModel(ResultSet rs)
        {
            Vector<String> columnNames= new Vector<String>();
            Vector<Vector<Object>> data= new Vector<Vector<Object>>();
            try{
            ResultSetMetaData metaData = rs.getMetaData();
            
            
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnLabel(column));
            }

            
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return new DefaultTableModel(data, columnNames);
            
            

        }
    void reset()
    {
        jPanel8.setBackground(new Color(51,51,51));
        jPanel7.setVisible(false);
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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
