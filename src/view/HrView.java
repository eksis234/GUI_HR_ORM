
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class HrView extends javax.swing.JFrame {
    private final SessionFactory sf;
    /**
     * Creates new form HRView
     */
    public HrView() {
        initComponents();
        this.sf = HibernateUtil.getSessionFactory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpUtamaHr = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmRegion = new javax.swing.JMenu();
        jmRegions = new javax.swing.JMenuItem();
        jmCountries = new javax.swing.JMenuItem();
        jmLocations = new javax.swing.JMenuItem();
        jmJobs = new javax.swing.JMenuItem();
        jmDepartments = new javax.swing.JMenuItem();
        jmEmployees = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniRegionReport = new javax.swing.JMenuItem();
        mniCountryReport = new javax.swing.JMenuItem();
        mniLocationReport = new javax.swing.JMenuItem();
        mniJobReport = new javax.swing.JMenuItem();
        mniDepartmentReport = new javax.swing.JMenuItem();
        mniEmployeeReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR VIEW .ORM");

        javax.swing.GroupLayout dpUtamaHrLayout = new javax.swing.GroupLayout(dpUtamaHr);
        dpUtamaHr.setLayout(dpUtamaHrLayout);
        dpUtamaHrLayout.setHorizontalGroup(
            dpUtamaHrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        dpUtamaHrLayout.setVerticalGroup(
            dpUtamaHrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jmRegion.setText("File");

        jmRegions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmRegions.setText("Regions");
        jmRegions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegionsActionPerformed(evt);
            }
        });
        jmRegion.add(jmRegions);

        jmCountries.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmCountries.setText("Countries");
        jmCountries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCountriesActionPerformed(evt);
            }
        });
        jmRegion.add(jmCountries);

        jmLocations.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmLocations.setText("Locations");
        jmLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLocationsActionPerformed(evt);
            }
        });
        jmRegion.add(jmLocations);

        jmJobs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmJobs.setText("Jobs");
        jmJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmJobsActionPerformed(evt);
            }
        });
        jmRegion.add(jmJobs);

        jmDepartments.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmDepartments.setText("Departments");
        jmDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDepartmentsActionPerformed(evt);
            }
        });
        jmRegion.add(jmDepartments);

        jmEmployees.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmEmployees.setText("Employees");
        jmEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmployeesActionPerformed(evt);
            }
        });
        jmRegion.add(jmEmployees);

        jMenuBar1.add(jmRegion);

        jMenu2.setText("Report");

        mniRegionReport.setText("Region Report");
        mniRegionReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegionReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniRegionReport);

        mniCountryReport.setText("Country Report");
        mniCountryReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCountryReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniCountryReport);

        mniLocationReport.setText("Location Report");
        mniLocationReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLocationReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniLocationReport);

        mniJobReport.setText("Job Report");
        mniJobReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniJobReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniJobReport);

        mniDepartmentReport.setText("Department Report");
        mniDepartmentReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDepartmentReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniDepartmentReport);

        mniEmployeeReport.setText("Employee Report");
        mniEmployeeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmployeeReportActionPerformed(evt);
            }
        });
        jMenu2.add(mniEmployeeReport);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpUtamaHr)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpUtamaHr, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRegionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegionsActionPerformed
        // TODO add your handling code here:
         RegionView regionView = new RegionView(sf);
         regionView.show();
         dpUtamaHr.add(regionView);
    }//GEN-LAST:event_jmRegionsActionPerformed

    private void jmCountriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCountriesActionPerformed
        // TODO add your handling code here:
        CountryView countryView = new CountryView(sf);
        countryView.show();
        dpUtamaHr.add(countryView);
    }//GEN-LAST:event_jmCountriesActionPerformed

    private void jmLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLocationsActionPerformed
        // TODO add your handling code here:
        LocationView locationView = new LocationView(sf);
        locationView.show();
        dpUtamaHr.add(locationView);
    }//GEN-LAST:event_jmLocationsActionPerformed

    private void jmJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmJobsActionPerformed
        // TODO add your handling code here:
        JobView jobView = new JobView(sf);
        jobView.show();
        dpUtamaHr.add(jobView);
    }//GEN-LAST:event_jmJobsActionPerformed

    private void jmDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDepartmentsActionPerformed
        // TODO add your handling code here:
        DepartmentView departmentView = new DepartmentView(sf);
        departmentView.show();
        dpUtamaHr.add(departmentView);
    }//GEN-LAST:event_jmDepartmentsActionPerformed

    private void jmEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmployeesActionPerformed
        // TODO add your handling code here:
        EmployeeView employeeView = new EmployeeView(sf);
        employeeView.show();
        dpUtamaHr.add(employeeView);
    }//GEN-LAST:event_jmEmployeesActionPerformed

    private void mniRegionReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegionReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniRegionReportActionPerformed

    private void mniCountryReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCountryReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniCountryReportActionPerformed

    private void mniLocationReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLocationReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniLocationReportActionPerformed

    private void mniJobReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniJobReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniJobReportActionPerformed

    private void mniDepartmentReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDepartmentReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDepartmentReportActionPerformed

    private void mniEmployeeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmployeeReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniEmployeeReportActionPerformed

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
            java.util.logging.Logger.getLogger(HrView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new HrView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpUtamaHr;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmCountries;
    private javax.swing.JMenuItem jmDepartments;
    private javax.swing.JMenuItem jmEmployees;
    private javax.swing.JMenuItem jmJobs;
    private javax.swing.JMenuItem jmLocations;
    private javax.swing.JMenu jmRegion;
    private javax.swing.JMenuItem jmRegions;
    private javax.swing.JMenuItem mniCountryReport;
    private javax.swing.JMenuItem mniDepartmentReport;
    private javax.swing.JMenuItem mniEmployeeReport;
    private javax.swing.JMenuItem mniJobReport;
    private javax.swing.JMenuItem mniLocationReport;
    private javax.swing.JMenuItem mniRegionReport;
    // End of variables declaration//GEN-END:variables
}
