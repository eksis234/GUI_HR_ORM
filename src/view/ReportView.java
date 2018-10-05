/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import tools.HibernateUtil;

/**
 *
 * @author USER
 */
public class ReportView extends javax.swing.JInternalFrame {

    private final SessionFactory sf;

    /**
     * Creates new form LocationReport
     */
    public ReportView(SessionFactory sessionFactory, String url) {
        initComponents();
        this.sf = HibernateUtil.getSessionFactory();
//        url = "src\\view\\report\\LocationReport.jrxml";
        Connection connection = null;
        try {
            connection = sf.getSessionFactoryOptions().getServiceRegistry().
                    getService(ConnectionProvider.class).getConnection();
            JasperDesign jd = JRXmlLoader.load(url);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jPrint = JasperFillManager.fillReport(jr, null, connection);
            JRViewer viewer = new JRViewer(jPrint);
            dpReportView.setLayout(new BorderLayout());
            dpReportView.add(viewer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpReportView = new javax.swing.JDesktopPane();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REPORT");

        javax.swing.GroupLayout dpReportViewLayout = new javax.swing.GroupLayout(dpReportView);
        dpReportView.setLayout(dpReportViewLayout);
        dpReportViewLayout.setHorizontalGroup(
            dpReportViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        dpReportViewLayout.setVerticalGroup(
            dpReportViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpReportView)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpReportView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpReportView;
    // End of variables declaration//GEN-END:variables
}
