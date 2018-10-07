/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CountryController;
import entities.Country;
import entities.Region;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.SessionFactory;
import view.SerbaSerbi.pesan;

/**
 *
 * @author Lenovo
 */
public class CountryView extends javax.swing.JInternalFrame {
    private final CountryController controller;
    private TableRowSorter<TableModel> rowSorter;
    private String[] cmbItem = {"countryId","countryName","regionId","regionName"};
    private SerbaSerbi ss;
    
    /**
     * Creates new form CountryView execute internal form
     * @param sessionFactory koneksi ke hibernet
     */
    public CountryView(SessionFactory sessionFactory) {
        initComponents();
        controller = new CountryController(sessionFactory);
        bindingCountries(controller.getAll());
        controller.loadCmbCountry(cmbRegionId); 
        tblCountry.setRowSorter(rowSorter);
        ss = new SerbaSerbi();
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
        jLabel1 = new javax.swing.JLabel();
        txtCountryId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbRegionId = new javax.swing.JComboBox<>();
        btnSaveC = new javax.swing.JButton();
        btnDropC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCountryName = new javax.swing.JTextField();
        cmbKategoriCountry = new javax.swing.JComboBox<>();
        txtFindCountry = new javax.swing.JTextField();
        btnFindC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCountry = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Master Countries");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)), "Countries Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Country Id       :");

        txtCountryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryIdActionPerformed(evt);
            }
        });
        txtCountryId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountryIdKeyTyped(evt);
            }
        });

        jLabel2.setText("Region             :");

        cmbRegionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegionIdActionPerformed(evt);
            }
        });

        btnSaveC.setText("SAVE");
        btnSaveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCActionPerformed(evt);
            }
        });

        btnDropC.setText("DROP");
        btnDropC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropCActionPerformed(evt);
            }
        });

        jLabel3.setText("Country Name :");

        txtCountryName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountryNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCountryId)
                            .addComponent(cmbRegionId, 0, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveC)
                            .addComponent(btnDropC))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCountryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSaveC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbRegionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDropC))
                .addGap(21, 21, 21))
        );

        cmbKategoriCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country Id", "Country Name", "Region Id", "Region Name" }));

        txtFindCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindCountryKeyReleased(evt);
            }
        });

        btnFindC.setText("FIND");
        btnFindC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCActionPerformed(evt);
            }
        });

        tblCountry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCountry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cmbKategoriCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFindCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFindC)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKategoriCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFindCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCountryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryIdActionPerformed
    /**
     * dok btnSaveOrUpdate
     * @param evt event
     */
    private void btnSaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCActionPerformed
        // TODO add your handling code here:
        String abcd = cmbRegionId.getSelectedItem()+"";
        String subRegionId = abcd.substring(0,1);
        Country country = new Country();
        country = new Country(txtCountryId.getText().toUpperCase());
        country.setCountryName(txtCountryName.getText());
        Region region = new Region(new BigDecimal(subRegionId)); 
        country.setRegionId(region);
        boolean isUpdate = false;
        if(!txtCountryId.isEnabled()){
            isUpdate = true;
        }
        if (isUpdate) {   
            controller.saveOrUpdate(country);        //txtCountryId.getText(),txtCountryName.getText(),  subRegionId, false);
            JOptionPane.showMessageDialog(this, pesan.update.getPesan(), "Update", JOptionPane.INFORMATION_MESSAGE);
            bindingCountries(controller.getAll());}
        else {controller.saveOrUpdate(country);    //txtCountryId.getText(),txtCountryName.getText(), subRegionId, true);
            JOptionPane.showMessageDialog(this, pesan.save.getPesan(), "Simpan", JOptionPane.INFORMATION_MESSAGE);
            bindingCountries(controller.getAll());
            txtCountryId.setEditable(true);                       
         }
       //cmbRegionId.setSelectedIndex(0);
    }//GEN-LAST:event_btnSaveCActionPerformed

    /**
     * dok btnDrop
     * @param evt event
     */
    private void btnDropCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropCActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?","Pertanyaan",JOptionPane.YES_NO_OPTION);
        Country country = new Country();
        country = new Country(txtCountryId.getText());
        if (response == JOptionPane.YES_OPTION) {
        controller.delete(country);
        JOptionPane.showMessageDialog(this, pesan.delete.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
        }else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, pesan.cancle.getPesan(), "Delete", JOptionPane.INFORMATION_MESSAGE);
            bindingCountries(controller.getAll());
        }       
        bindingCountries(controller.getAll());
        cmbRegionId.setSelectedIndex(0);
    }//GEN-LAST:event_btnDropCActionPerformed

    /**
     * dok cmbRegionId
     * @param evt event
     */
    private void cmbRegionIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbRegionIdMouseEntered
        // TODO add your handling code here:
//        String abd = cmbRegionId.getSelectedItem()+"";
//        String subAbd = abd.substring(0,1);
    }//GEN-LAST:event_cmbRegionIdMouseEntered

    /**
     * dok btnFind
     * @param evt event
     */
    private void btnFindCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCActionPerformed
        // TODO add your handling code here:
        if (!txtFindCountry.getText().equalsIgnoreCase("")) { 
/*use inisialisasi string categori*/
//            if (cmbKategoriCountry.getSelectedItem().equals("Region Id")){
//            bindingCountries(controller.search("regionId", new BigDecimal(txtFindCountry.getText())));
//            } else if (cmbKategoriCountry.getSelectedItem().equals("Region Name")){
//            bindingCountries(controller.search("regionName", txtFindCountry.getText()));
//            }else if (cmbKategoriCountry.getSelectedItem().equals("Country Id")){
//            bindingCountries(controller.search("countryId", txtFindCountry.getText()));
//            }else if (cmbKategoriCountry.getSelectedItem().equals("Country Name"))
//            bindingCountries(controller.search("countryName", txtFindCountry.getText()));  

/*use array*/  //bindingCountries(controller.search(cmbItem[cmbKategoriCountry.getSelectedIndex()], txtFindCountry.getText()));
 /*use enum*/  bindingCountries(controller.searchCountry((String) cmbKategoriCountry.getSelectedItem(), txtFindCountry.getText()));

/*use rowSorter*/ 
//            String text = txtFindCountry.getText();
//            if (text.trim().length() == 0) {
//                rowSorter.setRowFilter(null);
//            } else {
//                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategoriCountry.getSelectedIndex() + 1));
//            }
        JOptionPane.showMessageDialog(this, 
        pesan.find.getPesan(), "Search", 
        JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFindCActionPerformed

    /**
     * dok ketika salah satu row di tabel di klik
     * @param evt get data
     */
    private void tblCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCountryMouseClicked
        // TODO add your handling code here:
        int row = tblCountry.getSelectedRow();
        txtCountryId.setText(tblCountry.getValueAt(row, 1).toString());
        txtCountryName.setText(tblCountry.getValueAt(row, 2).toString());
        cmbRegionId.setSelectedItem(tblCountry.getValueAt(row, 3)+" - "+tblCountry.getValueAt(row, 4).toString());
        edit();   
    }//GEN-LAST:event_tblCountryMouseClicked

    /**
     * dok ketika enter inpputan di tekfield find country
     * @param evt get inpputaan
     */
    private void txtFindCountryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindCountryKeyReleased
        // TODO add your handling code here:
                if (txtFindCountry.getText().equals("")) {
                bindingCountries(controller.getAll()); 
            }else if (!txtFindCountry.getText().equalsIgnoreCase("")){
                btnFindC.setEnabled(true);
            }
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
/*use inisialisasi string categori*/
//            if (cmbKategoriCountry.getSelectedItem().equals("Region Id")){
//            bindingCountries(controller.search("regionId", (txtFindCountry.getText())));
//            } else if (cmbKategoriCountry.getSelectedItem().equals("Region Name")){
//            bindingCountries(controller.search("regionName", txtFindCountry.getText()));
//            }else if (cmbKategoriCountry.getSelectedItem().equals("Country Id")){
//            bindingCountries(controller.search("countryId", txtFindCountry.getText()));
//            }else if (cmbKategoriCountry.getSelectedItem().equals("Country Name"))
//            bindingCountries(controller.search("countryName", txtFindCountry.getText()));
/*use array*/  //bindingCountries(controller.search(cmbItem[cmbKategoriCountry.getSelectedIndex()], txtFindCountry.getText()));
/*use enum*/  bindingCountries(controller.searchCountry((String) cmbKategoriCountry.getSelectedItem(), txtFindCountry.getText()));
/*use rowSorter*/ 
//            String text = txtFindCountry.getText();
//            if (text.trim().length() == 0) {
//                rowSorter.setRowFilter(null);
//            } else {
//                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, cmbKategoriCountry.getSelectedIndex() + 1));
//            }
        }
        
    }//GEN-LAST:event_txtFindCountryKeyReleased

    private void cmbRegionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRegionIdActionPerformed

    /**
     * filter inputan hanya berupa huruf
     * @param evt get inputan
     */
    private void txtCountryIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountryIdKeyTyped
        // TODO add your handling code here:
        ss.filterAngka(evt);
    }//GEN-LAST:event_txtCountryIdKeyTyped

    /**
     * filter berupa huruf
     * @param evt get inputan
     */
    private void txtCountryNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountryNameKeyTyped
        // TODO add your handling code here:
        ss.filterAngka(evt);
    }//GEN-LAST:event_txtCountryNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDropC;
    private javax.swing.JButton btnFindC;
    private javax.swing.JButton btnSaveC;
    private javax.swing.JComboBox<String> cmbKategoriCountry;
    private javax.swing.JComboBox<String> cmbRegionId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCountry;
    private javax.swing.JTextField txtCountryId;
    private javax.swing.JTextField txtCountryName;
    private javax.swing.JTextField txtFindCountry;
    // End of variables declaration//GEN-END:variables
 
     /**
     * dok bindingCountries
     * @param countrys berupa list<object>
     */
private void bindingCountries(List<Object> countrys) {
    String [] header = {"No","Country Id","Country Name","Region Id","Region Name"};
        String [][] data = new String[countrys.size()][header.length];
        int i = 0;
        for (Object object : countrys) {
            Country c =  (Country) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = c.getCountryId();
            data[i][2] = c.getCountryName();
            data[i][3] = c.getRegionId().getRegionId()+"";
            data[i][4] = c.getRegionId().getRegionName();
            i++;
        }
        tblCountry.setModel(new DefaultTableModel(data, header));
        this.rowSorter = new TableRowSorter<>(tblCountry.getModel());
        reset();     
    }
    
    /**
     * dok reset
     */
    public  void reset(){
        txtCountryId.setText("");
        txtCountryId.setEnabled(true);
        txtCountryName.setText("");
        btnDropC.setEnabled(false);
        btnSaveC.setEnabled(true);
        btnFindC.setEnabled(false);
        tblCountry.setRowSorter(rowSorter);
    }
    
    /**
     * dok edit
     */
    private void edit(){
        txtCountryId.setEnabled(false);
        btnSaveC.setEnabled(true);
        btnDropC.setEnabled(true);
    }
   

}
