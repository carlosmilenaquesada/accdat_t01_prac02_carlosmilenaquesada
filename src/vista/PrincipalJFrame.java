package vista;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class PrincipalJFrame extends javax.swing.JFrame {

    //Declaración de mis variables
    DefaultTableModel dtm;
    DefaultTreeModel dTreeModel;

    DefaultMutableTreeNode root;
    DefaultMutableTreeNode pais;
    DefaultMutableTreeNode comunidad;
    DefaultMutableTreeNode mostoles;
    DefaultMutableTreeNode alcobendas;

    public PrincipalJFrame() {
        initComponents();

        //Inicialización de tabla y tree 
        this.dtm = new DefaultTableModel();
        this.dtm.setColumnIdentifiers(new String[]{"Nombre", "Tamaño", "Directorio", "Última Modificación"});
        this.jTableContenido.setModel(dtm);

        this.dTreeModel = new DefaultTreeModel(new DefaultMutableTreeNode("vacio"));
        this.jTreeArbol.setModel(dTreeModel);

        /*this.root = new DefaultMutableTreeNode("Mundo");
        
        this.pais = new DefaultMutableTreeNode("España");
        this.comunidad = new DefaultMutableTreeNode("Madrid");
        this.mostoles = new DefaultMutableTreeNode("Mostoles");
        this.alcobendas = new DefaultMutableTreeNode("Alcobendas");*/
        //Asignación de componentes
        /*this.root.add(this.pais);
        this.pais.add(comunidad);
        this.comunidad.add(mostoles);
        this.comunidad.add(alcobendas);

        this.dTreeModel.setRoot(root);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneDivisor = new javax.swing.JSplitPane();
        jScrollPaneRamas = new javax.swing.JScrollPane();
        jTreeArbol = new javax.swing.JTree();
        jPanelDatos = new javax.swing.JPanel();
        jLabelCarpeta = new javax.swing.JLabel();
        jTextFieldRuta = new javax.swing.JTextField();
        jButtonSeleccionar = new javax.swing.JButton();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableContenido = new javax.swing.JTable();
        jButtonLimpRuta = new javax.swing.JButton();
        jButtonLimpTabla = new javax.swing.JButton();
        jLabelAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPaneDivisor.setDividerSize(10);

        jScrollPaneRamas.setViewportView(jTreeArbol);

        jSplitPaneDivisor.setLeftComponent(jScrollPaneRamas);

        jLabelCarpeta.setText("Carpeta");

        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });

        jTableContenido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneTabla.setViewportView(jTableContenido);

        jButtonLimpRuta.setText("Limpiar ruta");

        jButtonLimpTabla.setText("Limpiar tabla");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabelCarpeta)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldRuta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSeleccionar))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jButtonLimpRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpTabla)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarpeta)
                    .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jSplitPaneDivisor.setRightComponent(jPanelDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDivisor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDivisor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed

        File fichero = new File(jTextFieldRuta.getText());

        File[] ficheros = fichero.listFiles();

        if (ficheros == null) {
            jLabelAviso.setText("La ruta proporcionada no es correcta.");
        } else {
            jLabelAviso.setText("");
            DefaultMutableTreeNode dmtnRaiz;
            try {
                dmtnRaiz = new DefaultMutableTreeNode(fichero.getCanonicalFile());
            } catch (IOException ex) {
                dmtnRaiz = new DefaultMutableTreeNode(fichero);
            }
            dTreeModel.setRoot(dmtnRaiz);
            for (File f : ficheros) {
                DefaultMutableTreeNode dmtnHijo = new DefaultMutableTreeNode(f.getName());
                dmtnRaiz.add(dmtnHijo);
                if (f.isDirectory()) {
                    File[] ficherosHijo = f.listFiles();
                    if (ficherosHijo != null) {

                        DefaultMutableTreeNode dmtnRaizHijo;
                        try {
                            dmtnRaizHijo = new DefaultMutableTreeNode(f.getCanonicalFile());
                        } catch (IOException ex) {
                            dmtnRaizHijo = new DefaultMutableTreeNode(f);
                        }
                        dmtnHijo.add(dmtnRaizHijo);
                        for (File fhijo : ficherosHijo) {
                            dmtnHijo = new DefaultMutableTreeNode(fhijo.getName());
                            dmtnRaizHijo.add(dmtnHijo);
                            System.out.println("hola");
                        }
                    }

                }

            }
        }

    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpRuta;
    private javax.swing.JButton jButtonLimpTabla;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelCarpeta;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPaneRamas;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JSplitPane jSplitPaneDivisor;
    private javax.swing.JTable jTableContenido;
    private javax.swing.JTextField jTextFieldRuta;
    private javax.swing.JTree jTreeArbol;
    // End of variables declaration//GEN-END:variables
}
