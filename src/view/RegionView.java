/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.RegionController;
import entities.Region;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.SessionFactory;

/**
 * Deklarasi kelas RegionView dengan mengextends javax.swing.JInternalFrame dan menginisisai RegionController
 * @author 680183
 */
public class RegionView extends javax.swing.JInternalFrame {
    private final RegionController regionController;
    
    /**
     * Method konstruktor dari kelas RegionView dengan parameter sessionFactory
     */
    public RegionView(SessionFactory sessionFactory) {
        initComponents();
        regionController = new RegionController(sessionFactory);
        bindingRegions(regionController.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCategory = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegionId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        txtRegionName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegion = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Master Regions");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGION ID", "REGION NAME" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)), "Regions Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("REGION ID :");

        txtRegionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionIdActionPerformed(evt);
            }
        });

        jLabel2.setText("REGION NAME:");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDrop.setText("DROP");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegionId, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtRegionName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRegionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDrop)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnSearch.setText("FIND");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRegion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
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
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionIdActionPerformed
    /**
     * Method untuk button Save berfungsi melakukan aksi untuk menyimpan data baru dari Region
     * @param evt merupakan suatu event
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        regionController.saveOrUpdate(txtRegionId.getText(), txtRegionName.getText());
        bindingRegions(regionController.getAll());
        reset();
    }//GEN-LAST:event_btnSaveActionPerformed
    /**
     * Method untuk button Drop berfungsi melakukan aksi untuk menghapus data dari Region
     * @param evt merupakan suatu event
     */
    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you want to delete?","Pertanyaan",JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
        regionController.delete(txtRegionId.getText());
        bindingRegions(regionController.getAll());
        }else if (response == JOptionPane.NO_OPTION) {
            bindingRegions(regionController.getAll());
        }
        bindingRegions(regionController.getAll());
        reset();
    }//GEN-LAST:event_btnDropActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    /**
     * Method untuk menampilkan data Region di RegionView
     * dengan menggunakan event Key released
     * @param evt merupakan suatu event
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (cmbCategory.getSelectedItem()=="REGION ID"){
                bindingRegions(regionController.search("regionId", new BigDecimal (txtSearch.getText())));
            }
            else {
                bindingRegions(regionController.search("regionName", txtSearch.getText()));
            }
    }//GEN-LAST:event_btnSearchActionPerformed
   /**
    * Method untuk dapat mengeklik salah satu data yang tertampil di tbRegion
    * @param evt merupakan suatu event
    */
    private void tbRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegionMouseClicked
        // TODO add your handling code here:
        int row = tbRegion.getSelectedRow();     
            txtRegionId.setText(tbRegion.getValueAt(row, 1).toString());
            txtRegionName.setText(tbRegion.getValueAt(row, 2).toString());
        edit();
    }//GEN-LAST:event_tbRegionMouseClicked
    /**
     * Method untuk melakukan pencarian data Region di RegionView 
     * dengan menggunakan event Key released
     * @param evt merupakan suatu event
     */
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if(txtSearch.getText().equals("")){
            bindingRegions(regionController.getAll());
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if (cmbCategory.getSelectedItem().equals("REGION ID")){
            bindingRegions(regionController.search("regionId", new BigDecimal(txtSearch.getText())));
        }
        else {
            bindingRegions(regionController.search("regionName", txtSearch.getText()));
        }
        }
    }//GEN-LAST:event_txtSearchKeyReleased
    /**
     * Method untuk menampilkan data Region dari db ke tabel di RegionView
     * @param regions list dari region
     */
    private void bindingRegions(List<Object> regions){
        String[] header = {"No","RegionId", "RegionName"};
        String[][] data = new String[regions.size()][header.length];
         int i = 0;
        for (Object object : regions) {
            Region r = (Region) object;
            data[i][0] = (i + 1) + "";
            data[i][1] = r.getRegionId() + "";
            data[i][2] = r.getRegionName();
            i++;
        }
        tbRegion.setModel(new DefaultTableModel(data, header));
        reset();
    }
    /**
     * Method untuk mengaktifkan tombol delete dan mematikan textfield 
     */
    private void edit() {
        txtRegionId.setEnabled(false);
        btnDrop.setEnabled(true);
    }
    
    /**
     * Method untuk mengembalikan textfield ke keadaan semula dan mengembalikan seluruh combobox ke pilihan pertama
     */
    private void reset() {
        txtRegionId.setText(regionController.getAutoId()+"");
        txtRegionId.setEnabled(true);
        btnDrop.setEnabled(false);
        txtRegionId.setEditable(false);
        txtRegionName.setText("");       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRegion;
    private javax.swing.JTextField txtRegionId;
    private javax.swing.JTextField txtRegionName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
