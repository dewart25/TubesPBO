/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuota.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    /**
     * Creates new form beli
     */
    /* private void tampil(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("noHp");
        model.addColumn("pulsa");
        model.addColumn("kuota_GB");
        
        try {
            int no = 1;
            String sql = "SELECT * FROM rekap";
            java.sql.Connection conn = (Connection)LoginKuota.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3)});
            }
            tabelRekap.setModel(model);
        }
    }
  */
    public MenuUtama() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        miniBeli = new javax.swing.JLabel();
        exitBeli = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BeliSm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_pilihPulsa = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelRekap = new javax.swing.JTable();
        txtnoHp = new javax.swing.JTextField();
        cb_pilihKuota = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(375, 500));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Hp");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 130, 40, 30);

        jLabel2.setText(" ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 50, 3, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selamat Datang");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 60, 160, 40);

        miniBeli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        miniBeli.setForeground(new java.awt.Color(255, 255, 255));
        miniBeli.setText("-");
        miniBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniBeliMouseClicked(evt);
            }
        });
        jPanel1.add(miniBeli);
        miniBeli.setBounds(326, 12, 20, 22);

        exitBeli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBeli.setForeground(new java.awt.Color(255, 255, 255));
        exitBeli.setText("X");
        exitBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBeliMouseClicked(evt);
            }
        });
        jPanel1.add(exitBeli);
        exitBeli.setBounds(344, 16, 10, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\warna computer\\Documents\\NetBeansProjects\\tubes\\src\\com\\kuota\\program\\icon\\Beli.back1.png")); // NOI18N
        jLabel1.setText("  ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 140);

        BeliSm.setBackground(new java.awt.Color(255, 255, 255));
        BeliSm.setText("Beli");
        BeliSm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliSmActionPerformed(evt);
            }
        });
        jPanel1.add(BeliSm);
        BeliSm.setBounds(60, 210, 70, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\warna computer\\Documents\\NetBeansProjects\\tubes\\src\\com\\kuota\\program\\icon\\Beli.back2.png")); // NOI18N
        jLabel4.setText("  ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 360, 140, 140);

        cb_pilihPulsa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH PULSA (Rupiah) -", "5000", "10000", "15000", "20000", "25000" }));
        cb_pilihPulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pilihPulsaActionPerformed(evt);
            }
        });
        jPanel1.add(cb_pilihPulsa);
        cb_pilihPulsa.setBounds(60, 190, 170, 20);

        tabelRekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Hp", "Pulsa", "Kuota"
            }
        ));
        jScrollPane2.setViewportView(tabelRekap);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 260, 260, 130);
        jPanel1.add(txtnoHp);
        txtnoHp.setBounds(110, 130, 120, 30);

        cb_pilihKuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH KUOTA (GB) -", "1", "2", "3", "4", "5" }));
        cb_pilihKuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pilihKuotaActionPerformed(evt);
            }
        });
        jPanel1.add(cb_pilihKuota);
        cb_pilihKuota.setBounds(60, 170, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miniBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBeliMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBeliMouseClicked

    private void exitBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBeliMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBeliMouseClicked

    private void BeliSmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliSmActionPerformed
        // TODO add your handling code here:
        String Username ="root";
        String Password ="";
        String Host ="localhost";
        String Databases ="kuota";
        String Url ="";
        
        try {
                if(txtnoHp.getText().equals("") ||cb_pilihPulsa.getSelectedItem().equals("")|| cb_pilihKuota.getSelectedItem().equals("") ){
                JOptionPane.showMessageDialog(rootPane, "No Hp Tidak Boleh Kosong!", "Pesan", JOptionPane.ERROR_MESSAGE);
                }
                Class.forName("com.mysql.jdbc.Driver");
                Url="jdbc:mysql://"+ Host +"/"+ Databases + "?user=" + Username + "&password="+ Password;
                    
                try (Connection conn = DriverManager.getConnection(Url); PreparedStatement pStatement = conn.prepareStatement("INSERT INTO rekap(no_telp,pulsa,kuota_GB)" + "VALUES (?,?,?)")) {
                        
                    pStatement.setString(1, txtnoHp.getText());
                    pStatement.setString(2, (String) cb_pilihPulsa.getSelectedItem());
                    pStatement.setString(3, (String) cb_pilihKuota.getSelectedItem());
                        
                    if(pStatement.executeUpdate()>0)
                        JOptionPane.showMessageDialog(this,
                            "Pembelian Sukses", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                        
                        else
                            JOptionPane.showMessageDialog(this,
                                    "Pembelian Gagal", "Informasi",
                                    JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                        txtnoHp.getText("");
                        cb_pilihPulsa.getSelectedItem("");
                        cb_pilihKuota.getSelectedItem("");
                
            }
        catch(ClassNotFoundException e) {
        System.out.println("jdbc.Driver tidak ditemukan");
}
        catch (SQLException e){
        System.out.println("Koneksi Gagal " + e.toString());
}
    }//GEN-LAST:event_BeliSmActionPerformed

    private void cb_pilihPulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pilihPulsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pilihPulsaActionPerformed

    private void cb_pilihKuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pilihKuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pilihKuotaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeliSm;
    private javax.swing.JComboBox<String> cb_pilihKuota;
    private javax.swing.JComboBox<String> cb_pilihPulsa;
    private javax.swing.JLabel exitBeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel miniBeli;
    private javax.swing.JTable tabelRekap;
    private javax.swing.JTextField txtnoHp;
    // End of variables declaration//GEN-END:variables
}
    /*    
    private Object[][] getData(){
        String User4 ="root";
        String Password4 ="";
        String Host4 ="localhost";
        String Databases4 ="kuota";
        String Url4="";

        Object[][] data1= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Url4="jdbc:mysql://"+ Host4 +"/"+ Databases4 + "?user=" + User4 + "&password="+ Password4;
                Connection conn=DriverManager.getConnection(Url4);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM rekap");
            
                rs.last();
                int rowCount= rs.getRow();
                rs.beforeFirst();

                data1= new Object[rowCount][3];
                int no=-1;
                while (rs.next()) {
                no=no+1;

                data1[no][0]=rs.getString("no_telp");
                data1[no][1]=rs.getString("pulsa");
                data1[no][2]=rs.getString("kuota_GB");
                
            }
                st.close();
                conn.close();
            }
                catch(ClassNotFoundException e) {
                System.out.println("jdbc.Driver tidak ditemukan");
            }
                catch (SQLException e){
                System.out.println("koneksi gagal " + e.toString());
            }

                return data1;
            }
                private void tampilTabel() {
                String[] columnNames = {"no_telp", "pulsa", "kuota_GB"};
                JTable table = new JTable(getData(), columnNames);
                srlPain2.setViewportView(table);
            }
            } */
