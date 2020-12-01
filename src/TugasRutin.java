import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Koneksi.Db_Koneksi;
import java.sql.SQLException;
import com.mysql.jdbc.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class TugasRutin extends tugas {

    private DefaultTableModel tabModel;
    private javax.swing.JCheckBox check;
    
    public TugasRutin() {
        initComponents();
        IDTugas.setEnabled(false);
        
        tabModel = new DefaultTableModel();
        tabModel.addColumn("ID Tugas");
        tabModel.addColumn("Nama Tugas");
        tabModel.addColumn("Hari");
        jTable1.setModel(tabModel);
        TableColumnModel tcm = jTable1.getColumnModel();
        tcm.removeColumn(tcm.getColumn(0));
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TugasUmum = new javax.swing.JButton();
        TugasBerjangka = new javax.swing.JButton();
        TugasHariIni = new javax.swing.JButton();
        TugasRutin = new javax.swing.JButton();
        HapusTugas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NamaTugas = new javax.swing.JTextField();
        TambahTugas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDTugas = new javax.swing.JTextField();
        EditTugas = new javax.swing.JButton();
        HariRutinitas = new javax.swing.JComboBox<>();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 195, 201));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 500));

        TugasUmum.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        TugasUmum.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TugasUmum.setText("Tugas Umum");
        TugasUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TugasUmumActionPerformed(evt);
            }
        });

        TugasBerjangka.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        TugasBerjangka.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TugasBerjangka.setText("Tugas Berjangka");
        TugasBerjangka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TugasBerjangkaActionPerformed(evt);
            }
        });

        TugasHariIni.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        TugasHariIni.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TugasHariIni.setText("Tugas Hari Ini");
        TugasHariIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TugasHariIniActionPerformed(evt);
            }
        });

        TugasRutin.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        TugasRutin.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TugasRutin.setText("Daftar Rutinitas");
        TugasRutin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TugasRutinActionPerformed(evt);
            }
        });

        HapusTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        HapusTugas.setText("Hapus");
        HapusTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusTugasActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 243, 240));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Nama Tugas :");

        NamaTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        NamaTugas.setSelectionColor(new java.awt.Color(255, 153, 153));

        TambahTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TambahTugas.setText("Tambahkan");
        TambahTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahTugasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Rutinitas Hari :");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Tugas yang muncul adalah tugas rutin yang telah ditambahkan sebelumnya");

        IDTugas.setEditable(false);
        IDTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTugasActionPerformed(evt);
            }
        });
        IDTugas.setVisible(false);

        EditTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        EditTugas.setText("Simpan Perubahan");
        EditTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTugasActionPerformed(evt);
            }
        });

        HariRutinitas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        HariRutinitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TugasUmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TugasBerjangka, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(TugasHariIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TugasRutin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HariRutinitas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TambahTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HapusTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditTugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TugasUmum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TugasBerjangka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TugasHariIni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TugasRutin)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TambahTugas))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EditTugas)
                    .addComponent(HariRutinitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HapusTugas))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTugasActionPerformed
        setTugas(getNamaTugas(), getHariRutinitas());
        tampilData();
    }//GEN-LAST:event_TambahTugasActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try{
            int row = jTable1.rowAtPoint(evt.getPoint());
            id = jTable1.getModel().getValueAt(row, 0).toString();
            nama = jTable1.getValueAt(row, 0).toString();
            hari = jTable1.getValueAt(row, 1).toString();
            
            setIDTugas(String.valueOf(id));
            setTugas(String.valueOf(nama));
            setHariRutinitas(String.valueOf(hari));

            IDTugas.setText(String.valueOf(id));
            NamaTugas.setText(String.valueOf(nama));
            HariRutinitas.setSelectedItem(String.valueOf(hari));

        }catch(Exception e){

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void HapusTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusTugasActionPerformed
        deleteTugas(getIDTugas());
        tampilData();
    }//GEN-LAST:event_HapusTugasActionPerformed

    private void EditTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTugasActionPerformed
        editTugas(getIDTugas(),getNamaTugas(),getHariRutinitas());
        tampilData();
    }//GEN-LAST:event_EditTugasActionPerformed

    private void TugasUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TugasUmumActionPerformed
        tUmum();
    }//GEN-LAST:event_TugasUmumActionPerformed

    private void TugasBerjangkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TugasBerjangkaActionPerformed
        tBerjangka();
    }//GEN-LAST:event_TugasBerjangkaActionPerformed

    private void TugasHariIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TugasHariIniActionPerformed
        tHari();
    }//GEN-LAST:event_TugasHariIniActionPerformed

    private void TugasRutinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TugasRutinActionPerformed
        tRutin();
    }//GEN-LAST:event_TugasRutinActionPerformed

    private void IDTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTugasActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public void setIDTugas(String id){
        this.id = id;
    }
    
    public void setTugas(String nama){
        this.nama = nama;
    }
    
    public void setHariRutinitas(String hari){
        this.hari = hari;
    }
    
    public String getNamaTugas(){
        return NamaTugas.getText();
    }
    
    public String getIDTugas(){
        return IDTugas.getText();
    }
    
    public String getStatusTugas(){
        return StatusTugas;
    }
    
    public String getHariRutinitas(){
        status = (String) HariRutinitas.getSelectedItem();
        return status;
    }
    
    public void tampilData() {
        
        tabModel.getDataVector( ).removeAllElements( );
        tabModel.fireTableDataChanged( );
        String cek;
        check = new javax.swing.JCheckBox();
     
        //menampilkan data database kedalam tabel
        try {
            Statement stat = (Statement) Db_Koneksi.getKoneksi( ).createStatement( );
            String sql        = "SELECT * FROM tugas WHERE Jenis=4 OR Jenis=5";
            ResultSet res   = stat.executeQuery(sql);
           
            while (res.next()) {
                Object[] data = new Object[3];
                data[0] = res.getString("IDTugas") ;
                data[1] = res.getString("NamaTugas");
                data[2] = res.getString("HariRutinitas");

                tabModel.addRow(data);

            }
        } catch (SQLException err) {
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
        
    }
    
    public void setTugas(String nama, String harirutinitas){
        try{
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "INSERT INTO tugas VALUES(null,'"+nama+"','',NULL, NULL,'"+harirutinitas+"','"+getTglHariIni()+"',4)";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Ditambahkan");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Ditambahkan!" );
        }
        
    }
    
    public void editTugas(String id, String nama, String hari){
        
        try{
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "UPDATE tugas SET NamaTugas='"+nama+"', HariRutinitas='"+hari+"' WHERE IDTugas="+id;
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Diubah");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Diubah!");
        }
    }
    
    public void deleteTugas(String id){
        
        try{
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "DELETE FROM tugas WHERE IDTugas="+id;
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Dihapus");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Dihapus!");
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TugasRutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasRutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasRutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasRutin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasRutin().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTugas;
    private javax.swing.JButton HapusTugas;
    private javax.swing.JComboBox<String> HariRutinitas;
    private javax.swing.JTextField IDTugas;
    private javax.swing.JTextField NamaTugas;
    private javax.swing.JButton TambahTugas;
    private javax.swing.JButton TugasBerjangka;
    private javax.swing.JButton TugasHariIni;
    private javax.swing.JButton TugasRutin;
    private javax.swing.JButton TugasUmum;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
