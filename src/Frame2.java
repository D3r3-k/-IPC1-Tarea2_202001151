/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author D3r3k
 */
public class Frame2 extends javax.swing.JFrame {

    static String[] db_info = {"Derek", "Orellana", "202001151"};
    static String db_pass = "202001151";
    
    
    public Frame2() {
        initComponents();
        setLocationRelativeTo(null);
        inicioComponentes();
    }

    private void inicioComponentes(){
        nombreTxt.setText(db_info[0]);
        apellidoTxt.setText(db_info[1]);
        carnetTxt.setText(db_info[2]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        carnet = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        carnetTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 600));
        setSize(new java.awt.Dimension(500, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apellido.setText("Apellido:");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        carnet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carnet.setText("Carnet:");
        jPanel1.add(carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutBtn.setText("Cerrar Sesion");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, -1, -1));

        nombreTxt.setEditable(false);
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setBorder(null);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 340, 40));

        apellidoTxt.setEditable(false);
        apellidoTxt.setForeground(new java.awt.Color(255, 255, 255));
        apellidoTxt.setBorder(null);
        jPanel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 340, 40));

        carnetTxt.setEditable(false);
        carnetTxt.setForeground(new java.awt.Color(255, 255, 255));
        carnetTxt.setBorder(null);
        jPanel1.add(carnetTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 340, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Frame1 f1 = new Frame1();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        
    }//GEN-LAST:event_nombreTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel carnet;
    private javax.swing.JTextField carnetTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables
}
