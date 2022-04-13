package pookemon;

public class TelaInicial extends javax.swing.JFrame {

    
    public TelaInicial() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStartGame = new javax.swing.JButton();
        btnInstrucoes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartGame.setBackground(new java.awt.Color(0, 51, 51));
        btnStartGame.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btnStartGame.setForeground(new java.awt.Color(255, 255, 255));
        btnStartGame.setText("START GAME");
        btnStartGame.setBorder(new javax.swing.border.MatteBorder(null));
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        btnInstrucoes.setBackground(new java.awt.Color(0, 51, 51));
        btnInstrucoes.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btnInstrucoes.setForeground(new java.awt.Color(255, 255, 255));
        btnInstrucoes.setText("INSTRUÇÕES");
        btnInstrucoes.setBorder(new javax.swing.border.MatteBorder(null));
        btnInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrucoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        btnSair.setBackground(new java.awt.Color(0, 51, 51));
        btnSair.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.MatteBorder(null));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/tela-inicial.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrucoesActionPerformed
        TelaInstrucoes telainstrucoes = new TelaInstrucoes();
        telainstrucoes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInstrucoesActionPerformed

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        TelaP telaprincipal = new TelaP();
        telaprincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStartGameActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstrucoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
