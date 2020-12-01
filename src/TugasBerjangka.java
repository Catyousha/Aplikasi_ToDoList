import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Koneksi.Db_Koneksi;
import java.sql.SQLException;
import com.mysql.jdbc.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;

public class TugasBerjangka extends tugas {

    private DefaultTableModel tabModel;
    private javax.swing.JCheckBox check;
    private String tglM, tglS;
    
    public TugasBerjangka() {
        initComponents();
        
        IDTugas.setEnabled(false);
        
        tabModel = new DefaultTableModel();
        tabModel.addColumn("ID Tugas");
        tabModel.addColumn("Nama Tugas");
        tabModel.addColumn("Status Tugas");
        tabModel.addColumn("Tanggal Mulai");
        tabModel.addColumn("Tanggal Berakhir");
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
        TanggalMulai = new com.toedter.calendar.JDateChooser();
        TanggalKadaluarsa = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EditTugas = new javax.swing.JButton();
        IDTugas = new javax.swing.JTextField();
        StatusTugas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

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
                "", "Nama Tugas", "Status Tugas", "Tanggal Mulai", "Tanggal Berakhir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

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

        TanggalMulai.setDateFormatString("yyyy-MM-dd");

        TanggalKadaluarsa.setDateFormatString("YYYY-MM-dd");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal Mulai :");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Tanggal Berakhir :");

        EditTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        EditTugas.setText("Simpan Perubahan");
        EditTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTugasActionPerformed(evt);
            }
        });

        IDTugas.setVisible(false);

        StatusTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        StatusTugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Selesai", "Selesai" }));
        StatusTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusTugasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TanggalKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditTugas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TugasBerjangka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(TugasHariIni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TugasRutin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TugasUmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TambahTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(StatusTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IDTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(HapusTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TambahTugas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TanggalKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditTugas)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TanggalMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StatusTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(IDTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HapusTugas))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StatusTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusTugasActionPerformed

    }//GEN-LAST:event_StatusTugasActionPerformed

    private void TambahTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTugasActionPerformed
        if(getTglM().length() == 0){
            setTugas(getNamaTugas(),getStatusTugas(),getTglS(),getHari());   
        } else{
            setTugas(getNamaTugas(),getStatusTugas(),getTglM(),getTglS(),getHari());   
        }
        
        tampilData();
    }//GEN-LAST:event_TambahTugasActionPerformed

    private void EditTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTugasActionPerformed
        editTugas(getIDTugas(), getNamaTugas(),getStatusTugas(),getTglM(),getTglS());
        tampilData();
    }//GEN-LAST:event_EditTugasActionPerformed

    private void HapusTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusTugasActionPerformed
        deleteTugas(getIDTugas());
        tampilData();
    }//GEN-LAST:event_HapusTugasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = jTable1.rowAtPoint(evt.getPoint());
            id = jTable1.getModel().getValueAt(row, 0).toString();
            nama = jTable1.getValueAt(row, 0).toString();
            status = jTable1.getValueAt(row, 1).toString();
            tglM = jTable1.getValueAt(row, 2).toString();
            tglS = jTable1.getValueAt(row, 3).toString();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int srow = jTable1.getSelectedRow();
            java.util.Date d = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow,3).toString());
            TanggalMulai.setDate(d);
            java.util.Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow,4).toString());
            TanggalKadaluarsa.setDate(d2);
            
            setIDTugas(String.valueOf(id));
            setTugas(String.valueOf(nama));
            setStatusTugas(String.valueOf(status));
            setTglM(String.valueOf(tglM));
            setTglS(String.valueOf(tglS));
            
            IDTugas.setText(String.valueOf(id));
            NamaTugas.setText(String.valueOf(nama));
            StatusTugas.setSelectedItem(String.valueOf(status));

        }catch(Exception e){

        }
    }//GEN-LAST:event_jTable1MouseClicked

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

    
    public void setIDTugas(String id){
        this.id = id;
    }
    
    public void setStatusTugas(String status){
        this.status = status;
    }
    
    public void setTugas(String nama){
        this.nama = nama;
    }
    
    public void setTglM(String tglM){
        this.tglM = tglM;
    }
    
    public void setTglS(String tglS){
        this.tglS = tglS;
    }
    
    public String getNamaTugas(){
        return NamaTugas.getText();
    }
    
    public String getIDTugas(){
        return IDTugas.getText();
    }
    
    public String getStatusTugas(){
        status = (String) StatusTugas.getSelectedItem();
        return status;
    }
    
    public String getTglM(){
        tglM = ((JTextField)TanggalMulai.getDateEditor().getUiComponent()).getText();
        return tglM;
    }
    
    public String getTglS(){
        tglS = ((JTextField)TanggalKadaluarsa.getDateEditor().getUiComponent()).getText();
        return tglS;
    }
    
    public void tampilData() {
        
        tabModel.getDataVector( ).removeAllElements( );
        tabModel.fireTableDataChanged( );
     
        //menampilkan data database kedalam tabel
        try {
            Statement stat = (Statement) Db_Koneksi.getKoneksi( ).createStatement( );
            String sql        = "SELECT * FROM tugas WHERE Jenis=2";
            ResultSet res   = stat.executeQuery(sql);
           
            while (res.next()) {
                Object[] data = new Object[5];
                  
                data[0] = res.getString("IDTugas") ;
                data[1] = res.getString("NamaTugas");
                data[2] = res.getString("StatusTugas");
                data[3] = res.getDate("TglMulai");
                data[4] = res.getDate("TglKadaluarsa");

                tabModel.addRow(data);

            }
        } catch (SQLException err) {
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
        
    }
    
    public void setTugas(String nama, String status, String selesai, String hari){

        try{

            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "INSERT INTO tugas VALUES(null,'"+nama+"','"+status+"','"+getTglHariIni()+"','"+selesai+"','"+hari+"','"+getTglHariIni()+"',2)";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Ditambahkan");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Ditambahkan!");

        }
        
    }
    
    public void setTugas(String nama, String status, String mulai, String selesai, String hari){
        
        try{
            
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "INSERT INTO tugas VALUES(null,'"+nama+"','"+status+"','"+mulai+"','"+selesai+"','"+hari+"','"+getTglHariIni()+"',2)";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Ditambahkan");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Ditambahkan!");
            
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
            JOptionPane.showMessageDialog(null, "Tugas Gagal Dihapus!" );
        }
    }
    
    public void editTugas(String id, String nama, String status, String mulai, String selesai){
        
        try{
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "UPDATE tugas SET NamaTugas='"+nama+"', StatusTugas='"+status+"', TglMulai='"+mulai+"', TglKadaluarsa='"+selesai+"' WHERE IDTugas="+id;
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Diubah");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Tugas Gagal Diubah!" );
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
            java.util.logging.Logger.getLogger(TugasBerjangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasBerjangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasBerjangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasBerjangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasBerjangka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTugas;
    private javax.swing.JButton HapusTugas;
    private javax.swing.JTextField IDTugas;
    private javax.swing.JTextField NamaTugas;
    private javax.swing.JComboBox<String> StatusTugas;
    private javax.swing.JButton TambahTugas;
    private com.toedter.calendar.JDateChooser TanggalKadaluarsa;
    private com.toedter.calendar.JDateChooser TanggalMulai;
    private javax.swing.JButton TugasBerjangka;
    private javax.swing.JButton TugasHariIni;
    private javax.swing.JButton TugasRutin;
    private javax.swing.JButton TugasUmum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
