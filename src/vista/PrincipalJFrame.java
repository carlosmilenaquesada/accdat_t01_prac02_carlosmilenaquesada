package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class PrincipalJFrame extends javax.swing.JFrame {

    DefaultTableModel dtm;
    DefaultTreeModel dTreeModel;
    DefaultMutableTreeNode raiz;

    Thread hiloBusqueda;

    public PrincipalJFrame() {
        initComponents();

        this.dtm = new DefaultTableModel();
        this.dtm.setColumnIdentifiers(new String[]{"Nombre", "Tamaño", "Directorio", "Última Modificación"});
        this.jTableContenido.setModel(dtm);

        this.raiz = new DefaultMutableTreeNode("vacio");
        this.dTreeModel = new DefaultTreeModel(raiz);
        this.jTreeArbol.setModel(dTreeModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneDivisor = new javax.swing.JSplitPane();
        jPanelDatos = new javax.swing.JPanel();
        jLabelCarpeta = new javax.swing.JLabel();
        jTextFieldRuta = new javax.swing.JTextField();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableContenido = new javax.swing.JTable();
        jButtonLimpRuta = new javax.swing.JButton();
        jButtonLimpTabla = new javax.swing.JButton();
        jLabelAviso = new javax.swing.JLabel();
        jToggleButtonBuscar = new javax.swing.JToggleButton();
        jPanelArbol = new javax.swing.JPanel();
        jButtonActualizarArbol = new javax.swing.JButton();
        jScrollPaneRamas = new javax.swing.JScrollPane();
        jTreeArbol = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 400));

        jSplitPaneDivisor.setDividerSize(10);
        jSplitPaneDivisor.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabelCarpeta.setText("Carpeta");

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
        jButtonLimpRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpRutaActionPerformed(evt);
            }
        });

        jButtonLimpTabla.setText("Limpiar tabla");
        jButtonLimpTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpTablaActionPerformed(evt);
            }
        });

        jToggleButtonBuscar.setText("Buscar");
        jToggleButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jButtonLimpRuta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLimpTabla))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelCarpeta)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarpeta)
                    .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPaneDivisor.setRightComponent(jPanelDatos);

        jPanelArbol.setPreferredSize(new java.awt.Dimension(400, 398));

        jButtonActualizarArbol.setText("Actualizar árbol");
        jButtonActualizarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarArbolActionPerformed(evt);
            }
        });

        jScrollPaneRamas.setPreferredSize(new java.awt.Dimension(400, 322));

        jTreeArbol.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeArbolValueChanged(evt);
            }
        });
        jScrollPaneRamas.setViewportView(jTreeArbol);

        javax.swing.GroupLayout jPanelArbolLayout = new javax.swing.GroupLayout(jPanelArbol);
        jPanelArbol.setLayout(jPanelArbolLayout);
        jPanelArbolLayout.setHorizontalGroup(
            jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActualizarArbol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneRamas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
        );
        jPanelArbolLayout.setVerticalGroup(
            jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActualizarArbol)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelArbolLayout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(jScrollPaneRamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSplitPaneDivisor.setLeftComponent(jPanelArbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //MÉTODOS AUXILIARES OBTENCIÓN DE DATOS
    //--------------------------------------------------------------------------
    private static String convertirTreePathAString(TreePath tp) {
        String path = "";
        if (tp != null && !tp.toString().isEmpty()) {
            path = tp.toString();
            path = path.replaceAll(", ", "\\\\");
            path = path.replace("[", "").replace("]", "");
        }
        return path;
    }

    private static String obtenerTamanio(File f) {
        String tamanio = "";
        try {
            tamanio = String.valueOf(Files.size(f.toPath()));
        } catch (IOException e) {
            tamanio = "no encontrado";
        }
        return tamanio;
    }

    private static String esDirectorioOArchivo(File f) {
        String directoryOrFile = "";
        try {
            if (f.isFile()) {
                directoryOrFile = "Es un archivo.";
            } else {
                if (f.isDirectory()) {
                    directoryOrFile = "Es un directorio.";
                } else {
                    directoryOrFile = "Tipo no conocido.";
                }
            }
        } catch (Exception e) {
            directoryOrFile = "no encontrado";
        }
        return directoryOrFile;
    }

    private static String obtenerFechaModificacion(File file) {
        String fechaFormateada = "";
        try {
            final DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            fechaFormateada = df.format(file.lastModified());

        } catch (Exception e) {
            fechaFormateada = "no encontrado";
        }
        return fechaFormateada;
    }

    private void limpiarTabla() {
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    //MÉTODO AUXILIAR RECURSIVO GENERADOR DE NODOS
    //--------------------------------------------------------------------------
    private void generarHijos(File file, DefaultMutableTreeNode nodo) {
        try {
            File[] files = file.listFiles();
            DefaultMutableTreeNode dmtn;
            if (files != null) {
                for (File f : files) {
                    dmtn = new DefaultMutableTreeNode(f.getName());
                    nodo.add(dmtn);                    
                    generarHijos(f, dmtn);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error en la obtención de datos: " + e);
        }
    }

    //FUNCIÓN QUE CREA UN HILO PARA LA BÚSQUEDA Y CREACIÓN DE ÁRBOL DE FORMA RECURSIVA
    //--------------------------------------------------------------------------
    private Thread crearHilo(File fichero, DefaultMutableTreeNode dmtn) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                generarHijos(fichero, dmtn);
                dTreeModel.reload();
                jLabelAviso.setText("Proceso finalizado.");
                jToggleButtonBuscar.setText("Buscar");
                jToggleButtonBuscar.getModel().setSelected(false);
            }
        });
    }


    private void jTreeArbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeArbolValueChanged

        if (evt.getNewLeadSelectionPath() != null) {

            TreePath tp = evt.getNewLeadSelectionPath();
            File ficheroPrincipal = new File(convertirTreePathAString(tp));

            try {
                if (tp != null && ficheroPrincipal.exists()) {
                    limpiarTabla();
                    File[] subficherosEncontrados = ficheroPrincipal.listFiles();

                    if (subficherosEncontrados == null || subficherosEncontrados.length == 0) {
                        subficherosEncontrados = new File[]{ficheroPrincipal};
                    }

                    for (File f : subficherosEncontrados) {

                        String nomFichero = f.getName();

                        String tamanio = obtenerTamanio(f);

                        String directoryOrFile = esDirectorioOArchivo(f);

                        String ultimaModificacion = obtenerFechaModificacion(f);

                        dtm.addRow(new String[]{nomFichero, tamanio, directoryOrFile, ultimaModificacion});
                    }
                } else {
                    jLabelAviso.setText("El fichero marcado es inalcanzable.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El objeto seleccionado provocó el error: " + e);
            }

        }
    }//GEN-LAST:event_jTreeArbolValueChanged

    private void jButtonLimpRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpRutaActionPerformed
        jTextFieldRuta.setText("");
    }//GEN-LAST:event_jButtonLimpRutaActionPerformed

    private void jButtonLimpTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpTablaActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_jButtonLimpTablaActionPerformed


    private void jToggleButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBuscarActionPerformed
        try {
            if (hiloBusqueda != null) {
                hiloBusqueda.interrupt();
                hiloBusqueda = null;
            }
            if (jToggleButtonBuscar.getModel().isSelected() == true) {
                if (jTextFieldRuta.getText().isEmpty()) {
                    jLabelAviso.setText("Debe introducir una ruta.");

                    jToggleButtonBuscar.setText("Buscar");
                    jToggleButtonBuscar.getModel().setSelected(false);

                } else {
                    File fichero = new File(jTextFieldRuta.getText());
                    if (fichero.exists()) {
                        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(fichero.getCanonicalFile());

                        dTreeModel.setRoot(dmtn);
                        jLabelAviso.setText("Cargando información...");
                        limpiarTabla();
                        jToggleButtonBuscar.setText("Cancelar");
                        hiloBusqueda = crearHilo(fichero, dmtn);
                        hiloBusqueda.start();
                    } else {
                        jLabelAviso.setText("La ruta introducida no es correcta.");

                        jToggleButtonBuscar.setText("Buscar");
                        jToggleButtonBuscar.getModel().setSelected(false);
                    }
                }
            } else {
                jToggleButtonBuscar.setText("Buscar");
                jLabelAviso.setText("Operación cancelada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El programa no pudo realizar la acción solicitada");
        }


    }//GEN-LAST:event_jToggleButtonBuscarActionPerformed

    private void jButtonActualizarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarArbolActionPerformed
        dTreeModel.reload();
    }//GEN-LAST:event_jButtonActualizarArbolActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarArbol;
    private javax.swing.JButton jButtonLimpRuta;
    private javax.swing.JButton jButtonLimpTabla;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelCarpeta;
    private javax.swing.JPanel jPanelArbol;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPaneRamas;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JSplitPane jSplitPaneDivisor;
    private javax.swing.JTable jTableContenido;
    private javax.swing.JTextField jTextFieldRuta;
    private javax.swing.JToggleButton jToggleButtonBuscar;
    private javax.swing.JTree jTreeArbol;
    // End of variables declaration//GEN-END:variables
}
