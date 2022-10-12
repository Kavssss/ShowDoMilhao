package Views;

import Classes.Ranking;
import java.applet.AudioClip;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewMilionario extends javax.swing.JFrame {
    
    private AudioClip somMilionario;
    private String tempNome, tempValor;

    public ViewMilionario(){
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public ViewMilionario(ArrayList<String> valor, int posicao, String nome) throws FileNotFoundException, IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        somMilionario = java.applet.Applet.newAudioClip(getClass().getResource("/sons/ganhou1Milhao.wav"));
        somMilionario.play();
        
        java.io.File arquivo = new java.io.File("src\\Ranking\\Ranking");
        Scanner scan = new Scanner(arquivo);
        
        FileWriter fileWriter = new FileWriter(arquivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        tempNome = nome;
        tempValor = valor.get(posicao + 1);
        
        Ranking ranking = new Ranking(tempNome, tempValor);
        
        printWriter.println(ranking.getNome());
        printWriter.println(ranking.getValor());
        printWriter.flush();
        printWriter.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRanking = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        imgMilionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 528));
        setSize(new java.awt.Dimension(840, 528));
        getContentPane().setLayout(null);

        btnRanking.setBackground(new java.awt.Color(0, 0, 0));
        btnRanking.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnRanking.setForeground(new java.awt.Color(255, 255, 0));
        btnRanking.setText("Ranking");
        btnRanking.setBorder(null);
        btnRanking.setBorderPainted(false);
        btnRanking.setContentAreaFilled(false);
        btnRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRanking.setDefaultCapable(false);
        btnRanking.setFocusable(false);
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });
        getContentPane().add(btnRanking);
        btnRanking.setBounds(280, 320, 120, 40);

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 0));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setRequestFocusEnabled(false);
        btnSair.setRolloverEnabled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(480, 320, 90, 40);

        imgMilionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutMilionario.gif"))); // NOI18N
        getContentPane().add(imgMilionario);
        imgMilionario.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        try {
            new ViewRanking().setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if(op==0) exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMilionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMilionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMilionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMilionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMilionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgMilionario;
    // End of variables declaration//GEN-END:variables
}
