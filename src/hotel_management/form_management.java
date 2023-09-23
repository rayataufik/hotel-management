package hotel_management;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_management extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = hotel_management.koneksi.koneksi();
    
    public void form() {
        Object[] form = {
            "NAMA PELANGGAN","NO KAMAR","TYPE KAMAR","TANGGAL MASUK","TANGGAL KELUAR"
        };
        tabModel = new DefaultTableModel (null,form);
        table_pelanggan.setModel(tabModel);
    }
    
    public void tampilData(String where) throws SQLException{
        try{
            st = cn.createStatement();
            tabModel.getDataVector() .removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM tambah_pelanggan" + where);
            
            while (rs.next()){
                Object[] data = {
                    rs.getString("nama_pelanggan"),
                    rs.getString("no_kamar"),
                    rs.getString("type_kamar"),
                    rs.getString("tanggal_masuk"),
                    rs.getString("tanggal_keluar"),
                };
                tabModel.addRow(data);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void reset() {
        inputNama.setText("");
        inputNoKamar.setText("");
        inputTanggalMasuk.setText("");
        InputTanggalKeluar.setText("");
    }
    public form_management() throws SQLException{
        initComponents();
        form();
        tampilData("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inpuTypeKamar = new javax.swing.JComboBox<String>();
        inputNoKamar = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        inputTanggalMasuk = new javax.swing.JTextField();
        InputTanggalKeluar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pelanggan = new javax.swing.JTable();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(178, 190, 195));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL VIVO MANAGEMENT RESERVATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(290, 290, 290))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NAMA PELANGGAN");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NO KAMAR");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TYPE KAMAR");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("TANGGAL MASUK");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("TANGGAL KELUAR");

        inpuTypeKamar.setBackground(new java.awt.Color(178, 190, 195));
        inpuTypeKamar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standar", "Superior", "Deluxe", "" }));
        inpuTypeKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpuTypeKamarActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(178, 190, 195));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(178, 190, 195));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(178, 190, 195));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        table_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Pelanggan", "No Kamar", "Type Kamar", "Tanggal Masuk", "Tanggal Keluar"
            }
        ));
        table_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_pelanggan);

        reset.setBackground(new java.awt.Color(178, 190, 195));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNoKamar)
                            .addComponent(inpuTypeKamar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTanggalMasuk)
                            .addComponent(InputTanggalKeluar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(inputNoKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inpuTypeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(InputTanggalKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(edit)
                            .addComponent(submit))
                        .addGap(18, 18, 18)
                        .addComponent(reset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO tambah_pelanggan (nama_pelanggan,no_kamar,type_kamar,tanggal_masuk,tanggal_keluar) VALUES('" + inputNama.getText() + "','"
                + inputNoKamar.getText() + "','"
                + inpuTypeKamar.getSelectedItem()+ "','"
                + inputTanggalMasuk.getText() + "','"
                + InputTanggalKeluar.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inputNama.setText("");
            inputNoKamar.setText("");
            inpuTypeKamar.setSelectedItem("Standar");
            inputTanggalMasuk.setText("");
            InputTanggalKeluar.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitActionPerformed

    private void inpuTypeKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpuTypeKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpuTypeKamarActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE tambah_pelanggan set "
                + "nama_pelanggan='"        + inputNama.getText() +"', "
                + "no_kamar='"              + inputNoKamar.getText() +"', "
                + "type_kamar='"            + inpuTypeKamar.getSelectedItem() +"', "
                + "tanggal_masuk='"         + inputTanggalMasuk.getText() +"', "
                + "tanggal_keluar='"        + InputTanggalKeluar.getText() +"'"
                + "WHERE no_kamar='"        + tabModel.getValueAt(table_pelanggan.getSelectedRow(), 1) +"'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Berhasil Diupate");
             reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try {
        int jawab;

        if((jawab= JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM tambah_pelanggan WHERE no_kamar='"
                    + tabModel.getValueAt(table_pelanggan.getSelectedRow(), 1) +"'"
            );
            tampilData("");
            reset();
        }
        }catch (Exception e) {
            e.printStackTrace();
        } // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void table_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pelangganMouseClicked
            inputNama.setText(table_pelanggan.getValueAt(table_pelanggan.getSelectedRow(), 0) .toString());
            inputNoKamar.setText(table_pelanggan.getValueAt(table_pelanggan.getSelectedRow(), 1) .toString());
            inpuTypeKamar.setSelectedItem(table_pelanggan.getValueAt(table_pelanggan.getSelectedRow(), 2) .toString());
            inputTanggalMasuk.setText(table_pelanggan.getValueAt(table_pelanggan.getSelectedRow(), 3) .toString());
            InputTanggalKeluar.setText(table_pelanggan.getValueAt(table_pelanggan.getSelectedRow(), 4) .toString());
            submit.setEnabled(true);
            delete.setEnabled(true);
            edit.setEnabled(true);
    }//GEN-LAST:event_table_pelangganMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();      // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new form_management().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(form_management.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputTanggalKeluar;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> inpuTypeKamar;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNoKamar;
    private javax.swing.JTextField inputTanggalMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTable table_pelanggan;
    // End of variables declaration//GEN-END:variables
}
