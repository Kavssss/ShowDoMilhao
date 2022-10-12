package Views;

import java.applet.AudioClip;
import java.util.ArrayList;
import Classes.Perguntas;

public class ViewValores extends javax.swing.JFrame {

    private ArrayList<Perguntas> pergunta;
    private ArrayList<String> valor;
    private AudioClip somValor;
    private int nivel, pular;
    private boolean cartas, placas, univ;
    private String nome;
    
    public ViewValores() {
        initComponents();
    }
    
    public ViewValores(ArrayList<String> valor, ArrayList<Perguntas> pergunta, int nivel, boolean cartas, boolean placas, boolean univ, int pular, String nome) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pergunta = pergunta;
        this.valor = valor;
        this.cartas = cartas;
        this.placas = placas;
        this.univ = univ;
        this.pular = pular;
        this.nome = nome;
        
        try {
            somValor = java.applet.Applet.newAudioClip(getClass().getResource("/sons/valorPergunta.wav"));
            somValor.play();
        } catch (Exception ex) {
            System.out.println(ex);
        }
            
        nivel++;
        txtViewPremios.setText(valor.get(nivel+1));
        this.nivel = nivel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        txtViewPremios = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        fundoPremios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 528));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 528));
        getContentPane().setLayout(null);

        txtViewPremios.setBackground(new java.awt.Color(255, 255, 255));
        txtViewPremios.setFont(new java.awt.Font("Arial Nova Cond", 1, 52)); // NOI18N
        txtViewPremios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtViewPremios.setDoubleBuffered(true);
        txtViewPremios.setFocusCycleRoot(true);
        txtViewPremios.setFocusTraversalPolicyProvider(true);
        getContentPane().add(txtViewPremios);
        txtViewPremios.setBounds(200, 170, 440, 90);

        btnContinuar.setBorder(null);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.setFocusable(false);
        btnContinuar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnContinuarMouseMoved(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(0, 0, 840, 500);

        fundoPremios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layoutPremios.png"))); // NOI18N
        getContentPane().add(fundoPremios);
        fundoPremios.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseMoved
        System.out.println(nivel);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        new ViewPerguntas(valor, pergunta, nivel, cartas, placas, univ, pular, nome).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarMouseMoved

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewValores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel fundoPremios;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel txtViewPremios;
    // End of variables declaration//GEN-END:variables
}
