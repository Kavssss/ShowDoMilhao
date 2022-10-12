package Views;

import java.applet.AudioClip;
import java.util.Random;
import javax.swing.JOptionPane;

public class ViewCartas extends javax.swing.JDialog {
    
    private AudioClip cartas;
    private String primeiraCarta, segundaCarta, terceiraCarta, quartaCarta;
    private int remove;

    public ViewCartas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ViewCartas(java.awt.Frame parent, boolean modal, int remove) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.remove = remove;
        
        Random som = new Random();
        if(som.nextInt(2)==0) cartas = java.applet.Applet.newAudioClip(getClass().getResource("/sons/cartas1.wav"));
        else cartas = java.applet.Applet.newAudioClip(getClass().getResource("/sons/cartas2.wav"));
        cartas.play();
        
        Random carta = new Random();
        primeiraCarta = String.valueOf(carta.nextInt(4));
        segundaCarta = String.valueOf(carta.nextInt(4));
        while(segundaCarta.equals(primeiraCarta))
            segundaCarta = String.valueOf(carta.nextInt(4));
        terceiraCarta = String.valueOf(carta.nextInt(4));
        while((terceiraCarta.equals(segundaCarta)) || (terceiraCarta.equals(primeiraCarta)))
            terceiraCarta = String.valueOf(carta.nextInt(4));
        quartaCarta = String.valueOf(carta.nextInt(4));
        while((quartaCarta.equals(primeiraCarta)) || (quartaCarta.equals(segundaCarta)) || (quartaCarta.equals(terceiraCarta)))
            quartaCarta = String.valueOf(carta.nextInt(4));
    }
    
    private void cartasViradas(){
        btnCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carta" + primeiraCarta + ".png")));
        btnCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carta" + segundaCarta + ".png")));
        btnCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carta" + terceiraCarta + ".png")));
        btnCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carta" + quartaCarta + ".png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCarta4 = new javax.swing.JButton();
        btnCarta1 = new javax.swing.JButton();
        btnCarta2 = new javax.swing.JButton();
        btnCarta3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 380));
        getContentPane().setLayout(null);

        btnCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoCarta.png"))); // NOI18N
        btnCarta4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 3, true));
        btnCarta4.setBorderPainted(false);
        btnCarta4.setContentAreaFilled(false);
        btnCarta4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarta4.setFocusable(false);
        btnCarta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarta4);
        btnCarta4.setBounds(420, 60, 110, 160);

        btnCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoCarta.png"))); // NOI18N
        btnCarta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 3, true));
        btnCarta1.setBorderPainted(false);
        btnCarta1.setContentAreaFilled(false);
        btnCarta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarta1.setFocusable(false);
        btnCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarta1);
        btnCarta1.setBounds(60, 60, 110, 160);

        btnCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoCarta.png"))); // NOI18N
        btnCarta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 3, true));
        btnCarta2.setBorderPainted(false);
        btnCarta2.setContentAreaFilled(false);
        btnCarta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarta2.setFocusable(false);
        btnCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarta2);
        btnCarta2.setBounds(180, 60, 110, 160);

        btnCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoCarta.png"))); // NOI18N
        btnCarta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 3, true));
        btnCarta3.setBorderPainted(false);
        btnCarta3.setContentAreaFilled(false);
        btnCarta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarta3.setFocusable(false);
        btnCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarta3);
        btnCarta3.setBounds(300, 60, 110, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutCartas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta1ActionPerformed
        btnCarta1.setBorderPainted(true);        
        cartasViradas();
        JOptionPane.showMessageDialog(rootPane, "Remove " + primeiraCarta, "Cartas", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        setRemove(Integer.parseInt(primeiraCarta));
    }//GEN-LAST:event_btnCarta1ActionPerformed

    private void btnCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta2ActionPerformed
        btnCarta2.setBorderPainted(true);        
        cartasViradas();
        JOptionPane.showMessageDialog(rootPane, "Remove " + segundaCarta, "Cartas", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        setRemove(Integer.parseInt(segundaCarta));
    }//GEN-LAST:event_btnCarta2ActionPerformed

    private void btnCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta3ActionPerformed
        btnCarta3.setBorderPainted(true);        
        cartasViradas();
        JOptionPane.showMessageDialog(rootPane, "Remove " + terceiraCarta, "Cartas", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        setRemove(Integer.parseInt(terceiraCarta));
    }//GEN-LAST:event_btnCarta3ActionPerformed

    private void btnCarta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta4ActionPerformed
        btnCarta4.setBorderPainted(true);        
        cartasViradas();
        JOptionPane.showMessageDialog(rootPane, "Remove " + quartaCarta, "Cartas", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        setRemove(Integer.parseInt(quartaCarta));
    }//GEN-LAST:event_btnCarta4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ViewCartas dialog = new ViewCartas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCarta1;
    private javax.swing.JButton btnCarta2;
    private javax.swing.JButton btnCarta3;
    private javax.swing.JButton btnCarta4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public int getRemove() {
        return remove;
    }

    public void setRemove(int remove) {
        this.remove = remove;
    }
}
