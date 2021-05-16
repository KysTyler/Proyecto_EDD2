/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_estructuras_ii;

/**
 *
 * @author enuil
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPrincipal = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        closeFile = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Campos = new javax.swing.JMenu();
        newCampo = new javax.swing.JMenuItem();
        listCampos = new javax.swing.JMenuItem();
        modCampos = new javax.swing.JMenuItem();
        delCampos = new javax.swing.JMenuItem();
        Registros = new javax.swing.JMenu();
        introRegistros = new javax.swing.JMenuItem();
        modRegistros = new javax.swing.JMenuItem();
        searchRegistros = new javax.swing.JMenuItem();
        deleteRegistros = new javax.swing.JMenuItem();
        listRegistros = new javax.swing.JMenuItem();
        Indices = new javax.swing.JMenu();
        newIndex = new javax.swing.JMenuItem();
        reindexFile = new javax.swing.JMenuItem();
        Estandarizacion = new javax.swing.JMenu();
        exportExcel = new javax.swing.JMenuItem();
        exportXML = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Archivo.setText("Archivo");

        newFile.setText("Nuevo Archivo");
        Archivo.add(newFile);

        openFile.setText("Abrir Archivo");
        Archivo.add(openFile);

        saveFile.setText("Guardar Archivo");
        Archivo.add(saveFile);

        closeFile.setText("Cerrar Archivo");
        Archivo.add(closeFile);

        Exit.setText("Salir");
        Archivo.add(Exit);

        MenuPrincipal.add(Archivo);

        Campos.setText("Campos");

        newCampo.setText("Nuevo Campo");
        Campos.add(newCampo);

        listCampos.setText("Listar Campos");
        Campos.add(listCampos);

        modCampos.setText("Modificar Campos");
        Campos.add(modCampos);

        delCampos.setText("Eliminar Campos");
        Campos.add(delCampos);

        MenuPrincipal.add(Campos);

        Registros.setText("Registros");

        introRegistros.setText("Introducir Registros");
        Registros.add(introRegistros);

        modRegistros.setText("Modificar Registros");
        Registros.add(modRegistros);

        searchRegistros.setText("Buscar Registros");
        Registros.add(searchRegistros);

        deleteRegistros.setText("Borrar Registros");
        Registros.add(deleteRegistros);

        listRegistros.setText("Listar Registros");
        Registros.add(listRegistros);

        MenuPrincipal.add(Registros);

        Indices.setText("Indices");

        newIndex.setText("Crear Indices");
        Indices.add(newIndex);

        reindexFile.setText("Re-indexar Archivos");
        Indices.add(reindexFile);

        MenuPrincipal.add(Indices);

        Estandarizacion.setText("Estandarizacion");

        exportExcel.setText("Exportar en archivo Excel");
        Estandarizacion.add(exportExcel);

        exportXML.setText("Exportar en XML con Schema");
        Estandarizacion.add(exportXML);

        MenuPrincipal.add(Estandarizacion);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Campos;
    private javax.swing.JMenu Estandarizacion;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu Indices;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu Registros;
    private javax.swing.JMenuItem closeFile;
    private javax.swing.JMenuItem delCampos;
    private javax.swing.JMenuItem deleteRegistros;
    private javax.swing.JMenuItem exportExcel;
    private javax.swing.JMenuItem exportXML;
    private javax.swing.JMenuItem introRegistros;
    private javax.swing.JMenuItem listCampos;
    private javax.swing.JMenuItem listRegistros;
    private javax.swing.JMenuItem modCampos;
    private javax.swing.JMenuItem modRegistros;
    private javax.swing.JMenuItem newCampo;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem newIndex;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem reindexFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem searchRegistros;
    // End of variables declaration//GEN-END:variables
}
