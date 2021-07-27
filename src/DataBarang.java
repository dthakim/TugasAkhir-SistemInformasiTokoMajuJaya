import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class DataBarang extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    
    private void tampil_barang(){
        Object[]baris = {"Id Barang", "Nama Barang", "Tanggal Masuk", "Tanggal Kadaluwarsa", "Letak Rak"};
        tabmode= new DefaultTableModel(null, baris);
        table_barang.setModel(tabmode);
        String sql = "select * from data_barang order by id_barang asc";
        try {
            Connection con = new koneksi_mysql().getConnection();
            Statement stat = con.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_barang = hasil.getString("id_barang");
                String nama_barang = hasil.getString("nama_barang");
                String tanggal_masuk = hasil.getString("tanggal_masuk");
                String tanggal_kadaluwarsa = hasil.getString("tanggal_kadaluwarsa");
                String letak_barang = hasil.getString("letak_barang");
                String[]data = {id_barang, nama_barang, tanggal_masuk, tanggal_kadaluwarsa, letak_barang};
                tabmode.addRow(data);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public DataBarang() {
        initComponents();
        setLocationRelativeTo(null);
        tampil_barang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        RootPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idbarangField = new javax.swing.JTextField();
        namabarangField = new javax.swing.JTextField();
        tglCBB = new javax.swing.JComboBox<>();
        blnCBB = new javax.swing.JComboBox<>();
        thnCBB = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        thn1Btn = new javax.swing.JComboBox<>();
        bln1Btn = new javax.swing.JComboBox<>();
        tgl1Btn = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        rakCBB = new javax.swing.JComboBox<>();
        printBtn = new javax.swing.JButton();
        mainmenuBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(120, 224, 143));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        RootPanel.setBackground(new java.awt.Color(120, 224, 143));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA BARANG");

        table_barang.setBackground(new java.awt.Color(184, 233, 148));
        table_barang.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        table_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_barang);

        jLabel3.setText("Id Barang");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Tanggal Masuk");

        jLabel6.setText("Letak Barang");

        idbarangField.setBackground(new java.awt.Color(184, 233, 148));

        namabarangField.setBackground(new java.awt.Color(184, 233, 148));

        tglCBB.setBackground(new java.awt.Color(184, 233, 148));
        tglCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        blnCBB.setBackground(new java.awt.Color(184, 233, 148));
        blnCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        thnCBB.setBackground(new java.awt.Color(184, 233, 148));
        thnCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));

        addBtn.setBackground(new java.awt.Color(184, 233, 148));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(184, 233, 148));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(184, 233, 148));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(184, 233, 148));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        thn1Btn.setBackground(new java.awt.Color(184, 233, 148));
        thn1Btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));

        bln1Btn.setBackground(new java.awt.Color(184, 233, 148));
        bln1Btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        tgl1Btn.setBackground(new java.awt.Color(184, 233, 148));
        tgl1Btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel7.setText("Tanggal Kadaluwarsa");

        rakCBB.setBackground(new java.awt.Color(184, 233, 148));
        rakCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posisi", "Rak A1", "Rak A2", "Rak B1", "Rak B2", "Rak C1", "Rak C2", "Rak D1", "Rak D2", "Rak E1", "Rak E2", " ", " ", " " }));

        printBtn.setBackground(new java.awt.Color(184, 233, 148));
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        mainmenuBtn.setBackground(new java.awt.Color(184, 233, 148));
        mainmenuBtn.setText("Back To Main Menu");
        mainmenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("TOKO MAJU JAYA");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("JALAN KYAI HASAN GENGGONG NO. 301");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("KOTA PROBOLINGGO");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("JAWA TIMUR");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("SISTEM INFORMASI TOKO MAJU JAYA");

        javax.swing.GroupLayout RootPanelLayout = new javax.swing.GroupLayout(RootPanel);
        RootPanel.setLayout(RootPanelLayout);
        RootPanelLayout.setHorizontalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RootPanelLayout.createSequentialGroup()
                        .addGap(0, 342, Short.MAX_VALUE)
                        .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootPanelLayout.createSequentialGroup()
                                .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RootPanelLayout.createSequentialGroup()
                                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RootPanelLayout.createSequentialGroup()
                                                    .addGap(53, 53, 53)
                                                    .addComponent(jLabel10))
                                                .addGroup(RootPanelLayout.createSequentialGroup()
                                                    .addGap(76, 76, 76)
                                                    .addComponent(jLabel11)))
                                            .addGap(61, 61, 61))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(RootPanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel8)))
                                .addGap(337, 337, 337))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootPanelLayout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(RootPanelLayout.createSequentialGroup()
                        .addComponent(mainmenuBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(RootPanelLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RootPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RootPanelLayout.createSequentialGroup()
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idbarangField)
                                .addComponent(namabarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(RootPanelLayout.createSequentialGroup()
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(37, 37, 37)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RootPanelLayout.createSequentialGroup()
                                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tgl1Btn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tglCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bln1Btn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(blnCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(thnCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(thn1Btn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(RootPanelLayout.createSequentialGroup()
                                    .addComponent(rakCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(11, 11, 11)))
                    .addContainerGap())
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE))
        );
        RootPanelLayout.setVerticalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(resetBtn)
                    .addComponent(printBtn))
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(mainmenuBtn)
                .addGap(29, 29, 29))
            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RootPanelLayout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69)
                    .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RootPanelLayout.createSequentialGroup()
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(idbarangField, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(namabarangField, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(thnCBB, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addComponent(tglCBB, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addComponent(blnCBB, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tgl1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addComponent(bln1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addComponent(thn1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(rakCBB, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addGap(267, 267, 267))
                        .addGroup(RootPanelLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(226, 226, 226)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String id_barang="", nama_barang = "", tanggal_masuk="", tgl="", bln="", thn="", tanggal_kadaluwarsa="", tgl1="", bln1="", thn1="", letak_barang="";        
        
        id_barang = idbarangField.getText();
        nama_barang = namabarangField.getText();
        tgl = tglCBB.getSelectedItem().toString();
        bln = blnCBB.getSelectedItem().toString();
        thn = thnCBB.getSelectedItem().toString();
        tanggal_masuk = thn+"-"+bln+"-"+tgl;
        tgl1 = tgl1Btn.getSelectedItem().toString();
        bln1 = bln1Btn.getSelectedItem().toString();
        thn1 = thn1Btn.getSelectedItem().toString();
        tanggal_kadaluwarsa = thn1+"-"+bln1+"-"+tgl1;
        letak_barang = rakCBB.getSelectedItem().toString();

        try {
            Connection con = new koneksi_mysql().getConnection();
            String sql = "insert into data_barang values('"+id_barang+"', '"+nama_barang+"', '"+tanggal_masuk+"', '"+tanggal_kadaluwarsa+"', '"+letak_barang+"')";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed
    
    private void reset(){
        idbarangField.setText("");
        namabarangField.setText("");
        tglCBB.setSelectedIndex(0);
        blnCBB.setSelectedIndex(0);
        thnCBB.setSelectedIndex(0);
        tgl1Btn.setSelectedIndex(0);
        bln1Btn.setSelectedIndex(0);
        thn1Btn.setSelectedIndex(0);
        rakCBB.setSelectedIndex(0);
    }
    
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed
    
    private void table_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_barangMouseClicked
        // TODO add your handling code here:
        int tabelBarang = table_barang.getSelectedRow();
        idbarangField.setText(table_barang.getValueAt(tabelBarang, 0).toString());
        namabarangField.setText(table_barang.getValueAt(tabelBarang, 1).toString());        
        tglCBB.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(8, 10));
        blnCBB.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(5, 7));
        thnCBB.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(0, 4));
        tgl1Btn.setSelectedItem(table_barang.getValueAt(tabelBarang, 3).toString().substring(8, 10));
        bln1Btn.setSelectedItem(table_barang.getValueAt(tabelBarang, 3).toString().substring(5, 7));
        thn1Btn.setSelectedItem(table_barang.getValueAt(tabelBarang, 3).toString().substring(0, 4));
        rakCBB.setSelectedItem(table_barang.getValueAt(tabelBarang, 4).toString());
    }//GEN-LAST:event_table_barangMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String id_barang="", nama_barang = "", tanggal_masuk="", tgl="", bln="", thn="", tanggal_kadaluwarsa="", tgl1="", bln1="", thn1="", letak_barang="";
        
        id_barang = idbarangField.getText();
        nama_barang = namabarangField.getText();
        tgl = tglCBB.getSelectedItem().toString();
        bln = blnCBB.getSelectedItem().toString();
        thn = thnCBB.getSelectedItem().toString();
        tanggal_masuk = thn+"-"+bln+"-"+tgl;
        tgl1 = tgl1Btn.getSelectedItem().toString();
        bln1 = bln1Btn.getSelectedItem().toString();
        thn1 = thn1Btn.getSelectedItem().toString();
        tanggal_kadaluwarsa = thn1+"-"+bln1+"-"+tgl1;
        letak_barang = rakCBB.getSelectedItem().toString();

        try {
            Connection con = new koneksi_mysql().getConnection();
            String sql = "update data_barang set "
                    + "nama_barang='"+nama_barang+"', "
                    + "tanggal_masuk='"+tanggal_masuk+"', "
                    + "tanggal_kadaluwarsa='"+tanggal_kadaluwarsa+"', "
                    + "letak_barang='"+letak_barang+"'"
                    + "where id_barang='"+id_barang+"'";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Mengubah data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String id_barang="";
        id_barang = idbarangField.getText();
        try {
            Connection con = new koneksi_mysql().getConnection();
            String sql = "delete from data_barang where id_barang='"+id_barang+"'";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = new koneksi_mysql().getConnection();
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("LaporanToko.jasper"), null, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void mainmenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuBtnActionPerformed
        // TODO add your handling code here:
        this.hide();
        HalamanUtama n = new HalamanUtama();
        n.setVisible(true);
    }//GEN-LAST:event_mainmenuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RootPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> bln1Btn;
    private javax.swing.JComboBox<String> blnCBB;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField idbarangField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainmenuBtn;
    private javax.swing.JTextField namabarangField;
    private javax.swing.JButton printBtn;
    private javax.swing.JComboBox<String> rakCBB;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTable table_barang;
    private javax.swing.JComboBox<String> tgl1Btn;
    private javax.swing.JComboBox<String> tglCBB;
    private javax.swing.JComboBox<String> thn1Btn;
    private javax.swing.JComboBox<String> thnCBB;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
