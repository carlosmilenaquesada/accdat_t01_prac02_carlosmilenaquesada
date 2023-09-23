package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributes.*;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PrincipalJFrame extends javax.swing.JFrame {

    //Declaración de mis variables
    DefaultTableModel dtm;
    DefaultTreeModel dTreeModel;

    DefaultMutableTreeNode raiz;

    DefaultMutableTreeNode root;
    DefaultMutableTreeNode pais;
    DefaultMutableTreeNode comunidad;
    DefaultMutableTreeNode mostoles;
    DefaultMutableTreeNode alcobendas;

    public PrincipalJFrame() {
        initComponents();

        //Inicialización del Model de la tabla y asignación.
        this.dtm = new DefaultTableModel();
        this.dtm.setColumnIdentifiers(new String[]{"Nombre", "Tamaño", "Directorio", "Última Modificación"});
        this.jTableContenido.setModel(dtm);

        //Inicialización del Model del tree y asignación       
        raiz = new DefaultMutableTreeNode("vacio");
        dTreeModel = new DefaultTreeModel(raiz);
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
        setPreferredSize(new java.awt.Dimension(900, 400));

        jSplitPaneDivisor.setDividerSize(10);
        jSplitPaneDivisor.setPreferredSize(new java.awt.Dimension(500, 400));

        jScrollPaneRamas.setPreferredSize(new java.awt.Dimension(400, 322));

        jTreeArbol.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeArbolValueChanged(evt);
            }
        });
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
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
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
                        .addComponent(jLabelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jSplitPaneDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo auxiliar generador de nodos hijos
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
            jLabelAviso.setText("El fichero " + file + " provocó un error.");
        }
    }

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        //Ya que las búsquedas pueden ser procesos costosos, voy a ejecutarlas
        //en un hilo independiente, para no dejar al programa inservible mientras
        //busca

        Thread hiloBusqueda = new Thread(new Runnable() {
            @Override
            public void run() {

                jLabelAviso.setText("");

                if (jTextFieldRuta.getText().isEmpty()) {
                    jLabelAviso.setText("Debe introducir una ruta");
                } else {
                    File fichero = new File(jTextFieldRuta.getText());
                    if (fichero.exists()) {
                        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode(fichero);
                        dTreeModel.setRoot(dmtn);

                        generarHijos(fichero, dmtn);
                        jLabelAviso.setText("Proceso finalizado");

                    } else {
                        jLabelAviso.setText("La ruta introducida no es correcta");
                    }

                }
                jTreeArbol.repaint();
            }
        });

        hiloBusqueda.start();


    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jTreeArbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeArbolValueChanged
        String path = jTreeArbol.getSelectionPath().toString();
        if (path != null) {
            path = path.replaceAll(", ", "\\\\");

            File ficheroPrincipal = new File(path);

            File[] subficherosEncontrados = ficheroPrincipal.listFiles();

            System.out.println(subficherosEncontrados);

            if (subficherosEncontrados != null) {
                for (File f : subficherosEncontrados) {
                    //Obtener el nombre del fichero actual
                    String nomFichero = f.getName();

                    //Obtener el tamaño del fichero actual
                    long tamanio = 0;
                    try {
                        tamanio = Files.size(f.toPath());
                        //Files.size() es de obligatorio checkeo
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                    //Obtener si el fichero actual es un directorio o un archivo
                    String directoryOrFile = "";

                    if (f.isFile()) {
                        directoryOrFile = "Es un archivo";
                    } else {
                        directoryOrFile = "Es un directorio";
                    }

                    //Obtener la extensión del fichero actual
                    String ultimaModificacion = "";
                    try {
                        FileTime times = Files.getLastModifiedTime(f.toPath());
                        ultimaModificacion = times.toString();
                    } catch (IOException ex) {
                        Logger.getLogger(PrincipalJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //Agregamos la información del fichero actual de esta fila al
                    //Modal perteneciente a la tabla
                    dtm.addRow(new String[]{nomFichero, String.valueOf(tamanio), directoryOrFile, ultimaModificacion});
                }
            }

        }


    }//GEN-LAST:event_jTreeArbolValueChanged

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
