package pookemon;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLoading extends javax.swing.JFrame {

    public TelaLoading() {
        initComponents();
        Thread t = new Thread (new Runnable() {
            @Override
            public void run() {
                
                for (int i = 0; i < 101; i++) {
                    
                    try {
                        BarraDeProgresso.setValue(i);
                        Thread.sleep(60);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JProgress.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if (i == 100) {
                            TelaInicial tela1 = new TelaInicial();
                             tela1.setVisible(true);
                             dispose();
                    }
                }
            }
            
            
        });
        
        t.start();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraDeProgresso = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraDeProgresso.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(BarraDeProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 250, 430, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/Pokemon-Logo (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/imagemdeloading.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraDeProgresso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private static class JProgress {

        public JProgress() {
        }
    }

}
