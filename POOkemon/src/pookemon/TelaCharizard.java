package pookemon;

public class TelaCharizard extends javax.swing.JFrame {

    public TelaCharizard() {
        initComponents();
    }
    
    private void dadosPokemon(){
        caixaTextoAtaque.setText(String.valueOf(charizard.ataque));
        caixaTextoDefesa.setText(String.valueOf(charizard.defesa));
        caixaTextoLevel.setText(String.valueOf(charizard.level));
        caixaTextoNome.setText (charizard.nome);
      
    }
    
    ClassePokemon charizard = new ClassePokemon("Charizard", "Fogo", 100);
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaTextoCharizard1 = new javax.swing.JTextField();
        caixaTextoCharizard3 = new javax.swing.JTextField();
        caixaTextoCharizard5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        caixaTextoDefesa = new javax.swing.JTextField();
        caixaTextoNome = new javax.swing.JTextField();
        caixaTextoAtaque = new javax.swing.JTextField();
        caixaTextoLevel = new javax.swing.JTextField();

        caixaTextoCharizard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCharizard1ActionPerformed(evt);
            }
        });

        caixaTextoCharizard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCharizard3ActionPerformed(evt);
            }
        });

        caixaTextoCharizard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCharizard5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(240, 151, 48));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton1.setText("VER OS DADOS DO POKÉMON");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pookemon/charizard.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        caixaTextoDefesa.setBackground(new java.awt.Color(0, 102, 102));
        caixaTextoDefesa.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoDefesa.setForeground(new java.awt.Color(255, 255, 255));
        caixaTextoDefesa.setText("DEFESA:");
        caixaTextoDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoDefesaActionPerformed(evt);
            }
        });
        getContentPane().add(caixaTextoDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 280, 120));

        caixaTextoNome.setBackground(new java.awt.Color(255, 102, 0));
        caixaTextoNome.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoNome.setForeground(new java.awt.Color(255, 255, 255));
        caixaTextoNome.setText("NOME:");
        caixaTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(caixaTextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 280, 120));

        caixaTextoAtaque.setBackground(new java.awt.Color(255, 51, 0));
        caixaTextoAtaque.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoAtaque.setForeground(new java.awt.Color(255, 255, 255));
        caixaTextoAtaque.setText("ATAQUE: ");
        caixaTextoAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(caixaTextoAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 280, 120));

        caixaTextoLevel.setBackground(new java.awt.Color(255, 255, 0));
        caixaTextoLevel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        caixaTextoLevel.setForeground(new java.awt.Color(255, 255, 255));
        caixaTextoLevel.setText("LEVEL:");
        caixaTextoLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoLevelActionPerformed(evt);
            }
        });
        getContentPane().add(caixaTextoLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 280, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaTextoDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoDefesaActionPerformed
        
    }//GEN-LAST:event_caixaTextoDefesaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dadosPokemon();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caixaTextoCharizard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCharizard1ActionPerformed
    
    }//GEN-LAST:event_caixaTextoCharizard1ActionPerformed

    private void caixaTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoNomeActionPerformed
       
    }//GEN-LAST:event_caixaTextoNomeActionPerformed

    private void caixaTextoCharizard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCharizard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCharizard3ActionPerformed

    private void caixaTextoAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoAtaqueActionPerformed

    private void caixaTextoCharizard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCharizard5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCharizard5ActionPerformed

    private void caixaTextoLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoLevelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCharizard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caixaTextoAtaque;
    private javax.swing.JTextField caixaTextoCharizard1;
    private javax.swing.JTextField caixaTextoCharizard3;
    private javax.swing.JTextField caixaTextoCharizard5;
    private javax.swing.JTextField caixaTextoDefesa;
    private javax.swing.JTextField caixaTextoLevel;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
