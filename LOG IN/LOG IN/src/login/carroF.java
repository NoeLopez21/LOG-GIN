/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import com.mycompany.java_crud_mysqlfinal.CConexion;
import com.mycompany.java_crud_mysqlfinal.CDetalleVenta;
import com.mycompany.java_crud_mysqlfinal.CProductos;
import com.mycompany.java_crud_mysqlfinal.CVentaEncabezado;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author enriq
 */
public class carroF extends javax.swing.JFrame {
    double subtotal;
    int acces;
    CProductos productos;
    CDetalleVenta detalles;
    CVentaEncabezado venta;
    ArrayList<Integer> cantidades;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(carroF.class.getName());
    
   
    
    public carroF(int acces) {
        initComponents();
        this.acces=acces;
        subtotal=0.0;
        cantidades= new ArrayList<>();
        productos = new CProductos();
        btnHacerCompra.setVisible(true);
        
    }
    
    public void recibirCant(int c){
        cantidades.add(c);
    }
    
    public void recibirP(CProductos p){
        productos=p;
    }
    
    
    public boolean Tavacia(){
        return tbCarro.getValueAt(0, 0)==null;    
    }
    
    
    public void CalcularT() {
        try {
            subtotal = 0.0;
            int filas = tbCarro.getRowCount(); // Número de filas en la tabla
            for (int i = 0; i < filas; i++) {
                subtotal+=Double.parseDouble((String)tbCarro.getValueAt(i, 3));
            }

            lblsubT.setText("Subtotal:                           $" + subtotal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al calcular el subtotal: " + e.getMessage());
        }
    }
    
    
    
    public void Insertar(DefaultTableModel mode){
        tbCarro.setModel(mode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCarro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblsubT = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnHacerCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tbCarro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel1.setText("CARRITO");

        lblsubT.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblsubT.setText("Subtotal:                                            $");

        jButton1.setText("Eliminar producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnHacerCompra.setText("Hacer compra");
        btnHacerCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsubT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(btnHacerCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsubT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnHacerCompra))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = tbCarro.getSelectedRow();

    if (filaSeleccionada != -1) {
        DefaultTableModel model = (DefaultTableModel) tbCarro.getModel();

        try {
            int idProducto = Integer.parseInt(tbCarro.getValueAt(filaSeleccionada, 0).toString());
            int cantidadRestituida = Integer.parseInt(tbCarro.getValueAt(filaSeleccionada, 2).toString()); // columna "Cantidad"

            // Actualizar stock en BD
            productos.ModificarCant(idProducto, cantidadRestituida); // Este método debe sumar al stock

            // Eliminar del carrito visual
            model.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(null, "Producto eliminado y stock restablecido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
        }

    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHacerCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerCompraActionPerformed
        // 1. Obtener la fecha y total desde los campos y variables
        venta = new CVentaEncabezado();
        String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        JTextField fecha = new JTextField();
        fecha.setText(fechaActual);

        double subtotal = 0.0;
        DefaultTableModel modeloCarrito = (DefaultTableModel) tbCarro.getModel();

        for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
            subtotal += Double.parseDouble(modeloCarrito.getValueAt(i, 3).toString()); // columna Subtotal
        }

        JTextField total = new JTextField();
        total.setText(String.valueOf(subtotal));

        JTextField idUsuario = new JTextField();
        idUsuario.setText(String.valueOf(acces)); // ID del usuario

        // 2. Insertar la venta
        venta.insertarVenta(fecha, total, idUsuario);

        // 3. Obtener el último ID de venta insertado
        int idVentaGenerado = -1;

        try {
            CConexion objetoConexion = new CConexion();
            Connection conn = objetoConexion.estableceConexion();

            String sqlUltimaVenta = "SELECT MAX(id_venta) AS id_venta FROM ventas WHERE id_usuario = ?";
            PreparedStatement pst = conn.prepareStatement(sqlUltimaVenta);
            pst.setInt(1, Integer.parseInt(idUsuario.getText()));
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idVentaGenerado = rs.getInt("id_venta");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID de la venta.");
                return;
            }

            rs.close();
            pst.close();

            // 4. Insertar cada fila del carrito en detalle_venta
            for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
                int idProducto = Integer.parseInt(modeloCarrito.getValueAt(i, 0).toString());
                int cantidad = Integer.parseInt(modeloCarrito.getValueAt(i, 2).toString());
                double subtotalDetalle = Double.parseDouble(modeloCarrito.getValueAt(i, 3).toString());

                // Obtener el precio actual del producto
                String sqlPrecio = "SELECT precio FROM productos WHERE id_producto = ?";
                PreparedStatement psPrecio = conn.prepareStatement(sqlPrecio);
                psPrecio.setInt(1, idProducto);
                ResultSet rsPrecio = psPrecio.executeQuery();

                double precioUnitario = 0.0;
                if (rsPrecio.next()) {
                    precioUnitario = rsPrecio.getDouble("precio");
                }
                rsPrecio.close();
                psPrecio.close();

                // Insertar el detalle de venta
                String sqlDetalle = "INSERT INTO detalle_venta (id_venta, id_producto, cantidad, precio_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement psDetalle = conn.prepareStatement(sqlDetalle);
                psDetalle.setInt(1, idVentaGenerado);
                psDetalle.setInt(2, idProducto);
                psDetalle.setInt(3, cantidad);
                psDetalle.setDouble(4, precioUnitario);
                psDetalle.setDouble(5, subtotalDetalle);
                psDetalle.executeUpdate();
                psDetalle.close();
            }

            JOptionPane.showMessageDialog(null, "Venta y detalles registrados con éxito. ID Venta: " + idVentaGenerado);
            modeloCarrito.setRowCount(0); // limpiar tabla carrito
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar detalles: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHacerCompraActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int acces=0;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new carroF(acces).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblsubT;
    private javax.swing.JTable tbCarro;
    // End of variables declaration//GEN-END:variables
}
