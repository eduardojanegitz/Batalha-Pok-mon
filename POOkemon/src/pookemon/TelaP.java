
package pookemon;

public class TelaP extends javax.swing.JFrame {

    public TelaP() {
        initComponents();
    }
    
     
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBatalhar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBatalhar.setBackground(new java.awt.Color(51, 0, 0));
        btnBatalhar.setForeground(new java.awt.Color(255, 255, 255));
        btnBatalhar.setText("BATALHAR");
        btnBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalharActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatalhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/Charizard-vs-Blastoise-batalha-completa (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalharActionPerformed
        BatalhaPokemon batalha = new BatalhaPokemon();
        batalha.iniciarBatalha();
        dispose();
    }//GEN-LAST:event_btnBatalharActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalhar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
