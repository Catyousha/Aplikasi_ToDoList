import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;
import Koneksi.Db_Koneksi;
//import com.mysql.jdbc.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class TugasUmum extends Tugas {

    private DefaultTableModel tabModel;

    public TugasUmum() {
        initComponents();

        IDTugas_Input.setEnabled(false);

        tabModel = new DefaultTableModel();
        tabModel.addColumn("ID Tugas");
        tabModel.addColumn("Nama Tugas");
        tabModel.addColumn("Status Tugas");
        jTable1.setModel(tabModel);

        TableColumnModel tcm = jTable1.getColumnModel();
        tcm.removeColumn(tcm.getColumn(0));
        tampilData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TugasUmum = new javax.swing.JButton();
        TugasBerjangka = new javax.swing.JButton();
        TugasHariIni = new javax.swing.JButton();
        TugasRutin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NamaTugas_Input = new javax.swing.JTextField();
        TambahTugas = new javax.swing.JButton();
        IDTugas_Input = new javax.swing.JTextField();
        EditTugas = new javax.swing.JButton();
        HapusTugas1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        StatusTugas_Input = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(228, 195, 201));

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

        jTable1.setBackground(new java.awt.Color(255, 243, 240));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nama Tugas", "Status Tugas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        }

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Nama Tugas :");

        NamaTugas_Input.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        NamaTugas_Input.setSelectionColor(new java.awt.Color(255, 153, 153));
        NamaTugas_Input.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NamaTugas_InputCaretUpdate(evt);
            }
        });

        TambahTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        TambahTugas.setText("Tambahkan");
        TambahTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahTugasActionPerformed(evt);
            }
        });

        IDTugas_Input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                IDTugas_InputInputMethodTextChanged(evt);
            }
        });
        IDTugas_Input.setVisible(false);

        EditTugas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        EditTugas.setText("Simpan Perubahan");
        EditTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTugasActionPerformed(evt);
            }
        });

        HapusTugas1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        HapusTugas1.setText("Hapus");
        HapusTugas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusTugas1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Status :");

        StatusTugas_Input.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        StatusTugas_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Selesai", "Selesai" }));
        StatusTugas_Input.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusTugas_InputItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(IDTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StatusTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NamaTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HapusTugas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TambahTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TugasUmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TugasBerjangka, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(TugasHariIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TugasRutin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamaTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TambahTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditTugas)
                    .addComponent(jLabel2)
                    .addComponent(StatusTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDTugas_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HapusTugas1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTugasActionPerformed
        editTugas(getIDTugas(), getNamaTugas(), getStatusTugas());
        tampilData();
    }//GEN-LAST:event_EditTugasActionPerformed

    private void HapusTugas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusTugas1ActionPerformed
        deleteTugas(getIDTugas());
        tampilData();
    }//GEN-LAST:event_HapusTugas1ActionPerformed

    private void TambahTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTugasActionPerformed
        setTugas(getNamaTugas(), getStatusTugas());
        tampilData();
    }//GEN-LAST:event_TambahTugasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.rowAtPoint(evt.getPoint());
            String id = jTable1.getModel().getValueAt(row, 0).toString();
            String nama = jTable1.getValueAt(row, 0).toString();
            String status = jTable1.getValueAt(row, 1).toString();

            setIDTugas(String.valueOf(id));
            setNamaTugas(String.valueOf(nama));
            setStatusTugas(String.valueOf(status));
            
            IDTugas_Input.setText(getIDTugas());
            NamaTugas_Input.setText(getNamaTugas());
            StatusTugas_Input.setSelectedItem(getStatusTugas());

        } catch (Exception e) {

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

    private void StatusTugas_InputItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusTugas_InputItemStateChanged
        setStatusTugas((String) StatusTugas_Input.getSelectedItem());
    }//GEN-LAST:event_StatusTugas_InputItemStateChanged

    private void IDTugas_InputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_IDTugas_InputInputMethodTextChanged
        setIDTugas(IDTugas_Input.getText());
    }//GEN-LAST:event_IDTugas_InputInputMethodTextChanged

    private void NamaTugas_InputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NamaTugas_InputCaretUpdate
        setNamaTugas(NamaTugas_Input.getText());
    }//GEN-LAST:event_NamaTugas_InputCaretUpdate
 
    
    public void tampilData() {

        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();

        //menampilkan data database kedalam tabel
        try {
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "SELECT * FROM tugas WHERE Jenis=1";
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Object[] data = new Object[3];

                data[0] = res.getString("IDTugas");
                data[1] = res.getString("NamaTugas");
                data[2] = res.getString("StatusTugas");
                tabModel.addRow(data);
                
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

    }
    
    public void setTugas(String nama, String status) {
        try {
            if(status == null){
                status = "Belum Selesai";
            }
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "INSERT INTO tugas VALUES(null,'" + nama + "','" + status + "',null, null, null,'" + getTglHariIni() + "',1)";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Ditambahkan");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Tugas Gagal Ditambahkan!");
        }

    }

    public void deleteTugas(String id) {

        try {
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "DELETE FROM tugas WHERE IDTugas=" + id;
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Dihapus");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Tugas Gagal Dihapus!");
        }
    }

    public void editTugas(String id, String nama, String status) {

        try {
            Statement statement = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "UPDATE tugas SET NamaTugas='" + nama + "', StatusTugas='" + status + "' WHERE IDTugas=" + id;
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tugas Berhasil Diubah");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Tugas Gagal Diubah!");
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
            java.util.logging.Logger.getLogger(TugasUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasUmum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTugas;
    private javax.swing.JButton HapusTugas1;
    private javax.swing.JTextField IDTugas_Input;
    private javax.swing.JTextField NamaTugas_Input;
    private javax.swing.JComboBox<String> StatusTugas_Input;
    private javax.swing.JButton TambahTugas;
    private javax.swing.JButton TugasBerjangka;
    private javax.swing.JButton TugasHariIni;
    private javax.swing.JButton TugasRutin;
    private javax.swing.JButton TugasUmum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
