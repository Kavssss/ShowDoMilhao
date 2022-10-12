package Views;

import Classes.Perguntas;
import java.util.ArrayList;

public class ViewParticipante extends javax.swing.JDialog {
    
    private ArrayList<String> valor;
    private ArrayList<Perguntas> pergunta;
    private String nome;

    public ViewParticipante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ViewParticipante(java.awt.Frame parent, boolean modal, ArrayList<String> valor, ArrayList<Perguntas> pergunta, String nome) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);       
        this.valor = valor;
        this.pergunta = pergunta;
        this.nome = nome;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnProsseguir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(402, 177));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 24, 40, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(60, 30, 320, 20);

        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });
        getContentPane().add(btnProsseguir);
        btnProsseguir.setBounds(150, 63, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutNome.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed
        this.nome = txtNome.getText();
        
        new ViewValores(valor, pergunta, 0, false, false, false, 0, nome).setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnProsseguirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ViewParticipante dialog = new ViewParticipante(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
