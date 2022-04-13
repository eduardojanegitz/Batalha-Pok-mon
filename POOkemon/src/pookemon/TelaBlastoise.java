package pookemon;

public class TelaBlastoise extends javax.swing.JFrame {

    public TelaBlastoise() {
        initComponents();
    }
    ClassePokemon blastoise = new ClassePokemon("Blastoise", "Água", 130);
    private void dadosPokemon(){
        caixaTextoAtaque.setText(String.valueOf(blastoise.ataque));
        caixaTextoDefesa.setText(String.valueOf(blastoise.defesa));
        caixaTextoLevel.setText(String.valueOf(blastoise.level));
        caixaTextoNome.setText (blastoise.nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        caixaTextoNome = new javax.swing.JTextField();
        caixaTextoAtaque = new javax.swing.JTextField();
        caixaTextoDefesa = new javax.swing.JTextField();
        caixaTextoLevel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton1.setText("VER OS DADOS DO POKÉMON");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 180, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/blastoise (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        caixaTextoNome.setBackground(new java.awt.Color(0, 255, 255));
        caixaTextoNome.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoNome.setText("NOME:");
        caixaTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(caixaTextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 440, 180));

        caixaTextoAtaque.setBackground(new java.awt.Color(102, 102, 255));
        caixaTextoAtaque.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoAtaque.setText("ATAQUE:");
        getContentPane().add(caixaTextoAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 440, 210));

        caixaTextoDefesa.setBackground(new java.awt.Color(204, 204, 255));
        caixaTextoDefesa.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoDefesa.setText("DEFESA:");
        getContentPane().add(caixaTextoDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 440, 230));

        caixaTextoLevel.setBackground(new java.awt.Color(255, 230, 149));
        caixaTextoLevel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoLevel.setText("LEVEL:");
        getContentPane().add(caixaTextoLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 440, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dadosPokemon();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBlastoise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caixaTextoAtaque;
    private javax.swing.JTextField caixaTextoDefesa;
    private javax.swing.JTextField caixaTextoLevel;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
