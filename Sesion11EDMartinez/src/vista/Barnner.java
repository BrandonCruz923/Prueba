
package vista;

/**
 *
 * @author capri
 */
import javax.swing.*;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Barnner extends javax.swing.JFrame {

    
    public Barnner() {
        initComponents();
        setLocationRelativeTo(null);//Centra la ventana
        ProgressBarIniciado();//Llamada al cargar la barra de progresos
        
    }
        private void ProgressBarIniciado(){
            Timer mTimer = new Timer(45, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pbCarga.setValue(pbCarga.getValue() + 1);
            pbCarga.setStringPainted(true);
           
            pbCarga.setString("Loading..." + pbCarga.getValue() + "%");

            // Detiene el temporizador cuando se llega al 100%
            if (pbCarga.getValue() >= 100) {
                pbCarga.setBackground(Color.GRAY);
                ((Timer)e.getSource()).stop();
               
                // Cierra la ventana de carga y abre la segunda ventana
                cerrarVentanaCarga();
                abrirNuevaVentana();
            }
        }
    });

            mTimer.start();
            
            
        }//Termina Metodo
        // Método para cerrar la ventana de carga
        private void cerrarVentanaCarga(){
              this.dispose(); // Cierra la ventana actual
            
        }
        
// Método para abrir una nueva ventana
        private void abrirNuevaVentana() {
        // Aquí debes colocar el código para abrir la nueva ventana
         // Por ejemplo:
        Login ventana = new Login();
    ventana.setVisible(true);
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblimgLogo = new javax.swing.JLabel();
        pbCarga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SistemaInterativo_Martinez_ED ");

        paneFondo.setBackground(new java.awt.Color(0, 102, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 255, 0));
        lblTitulo.setText("Bienvenido A Sistemas ED Martinez");

        lblimgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout paneFondoLayout = new javax.swing.GroupLayout(paneFondo);
        paneFondo.setLayout(paneFondoLayout);
        paneFondoLayout.setHorizontalGroup(
            paneFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneFondoLayout.createSequentialGroup()
                .addGroup(paneFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneFondoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblimgLogo))
                    .addGroup(paneFondoLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneFondoLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblTitulo)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        paneFondoLayout.setVerticalGroup(
            paneFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneFondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addComponent(lblimgLogo)
                .addGap(56, 56, 56)
                .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Barnner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barnner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barnner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barnner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barnner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblimgLogo;
    private javax.swing.JPanel paneFondo;
    private javax.swing.JProgressBar pbCarga;
    // End of variables declaration//GEN-END:variables
}
