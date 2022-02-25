
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Frame1 extends javax.swing.JFrame {

    Frame2 f2 = new Frame2();

    public Frame1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo_login = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        Usuario = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        pass_tf = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(500, 600));
        setName("login"); // NOI18N
        setResizable(false);

        background.setToolTipText("");
        background.setMaximumSize(new java.awt.Dimension(450, 420));
        background.setPreferredSize(new java.awt.Dimension(500, 600));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_login.setText("Iniciar Sesion");
        background.add(titulo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        background.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 375, -1));

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Usuario.setText("Usuario");
        background.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password.setText("Contraseña");
        background.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        user_tf.setForeground(new java.awt.Color(255, 255, 255));
        user_tf.setText("Nombre de usuario");
        user_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        user_tf.setFocusTraversalPolicyProvider(true);
        user_tf.setNextFocusableComponent(pass_tf);
        user_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_tfMousePressed(evt);
            }
        });
        background.add(user_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 390, 40));

        pass_tf.setForeground(new java.awt.Color(255, 255, 255));
        pass_tf.setText("***************");
        pass_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        pass_tf.setFocusTraversalPolicyProvider(true);
        pass_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pass_tfMousePressed(evt);
            }
        });
        background.add(pass_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 390, 40));

        login_btn.setText("Iniciar Sesion");
        login_btn.setFocusCycleRoot(true);
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        background.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_tfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tfMousePressed
        if (user_tf.getText().equals("Nombre de usuario")) {
            user_tf.setText("");
            user_tf.setForeground(Color.gray);
        }
        if (String.valueOf(pass_tf.getPassword()).isEmpty()) {
            pass_tf.setText("***************");
            pass_tf.setForeground(Color.white);
        }
    }//GEN-LAST:event_user_tfMousePressed

    private void pass_tfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_tfMousePressed
        if (String.valueOf(pass_tf.getPassword()).equals("***************")) {
            pass_tf.setText("");
            pass_tf.setForeground(Color.WHITE);
        }
        if (user_tf.getText().isEmpty()) {
            user_tf.setText("Nombre de usuario");
            user_tf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pass_tfMousePressed

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        if (user_tf.getText().equals(f2.db_info[0]) && String.valueOf(pass_tf.getPassword()).equals(f2.db_pass)) {
            this.setVisible(false);
            f2.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos", "Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_login_btnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (Exception ex) {
                    System.err.println("Failed to initialize LaF");
                }
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel background;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField pass_tf;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel titulo_login;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables
}
