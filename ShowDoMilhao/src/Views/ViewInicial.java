package Views;

import java.applet.AudioClip;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Classes.Perguntas;
import java.applet.Applet;
import java.io.IOException;

public class ViewInicial extends javax.swing.JFrame {
    
    private ArrayList<String> valor;
    private ArrayList<Perguntas> pergunta;
    private String nome;
    private AudioClip vaiComecar, abertura;

    public ViewInicial() {
        initComponents();       
    }
    
    public ViewInicial(ArrayList<String> valor, ArrayList<Perguntas> pergunta, String nome) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            vaiComecar = Applet.newAudioClip(getClass().getResource("/Sons/vaiComecar.wav"));
            abertura = Applet.newAudioClip(getClass().getResource("/Sons/abertura2.wav"));
            vaiComecar.play();
            abertura.loop();
        } catch (Exception ex) {
            System.out.println(ex);
            btnJogar.setText("Catch");
        }
                
        this.pergunta = pergunta;
        this.valor = valor;
        this.nome = nome;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        imgInicial = new javax.swing.JLabel();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 51));
        jButton3.setText("Sair");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Do Milhão");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(840, 528));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 528));
        getContentPane().setLayout(null);

        btnJogar.setBackground(new java.awt.Color(0, 0, 0));
        btnJogar.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(255, 255, 0));
        btnJogar.setText("Jogar");
        btnJogar.setBorder(null);
        btnJogar.setBorderPainted(false);
        btnJogar.setContentAreaFilled(false);
        btnJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJogar.setDefaultCapable(false);
        btnJogar.setFocusable(false);
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar);
        btnJogar.setBounds(380, 330, 90, 40);

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
        btnSair.setBounds(380, 430, 90, 40);

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
        btnRanking.setBounds(360, 380, 130, 40);

        imgInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutInicio.png"))); // NOI18N
        imgInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgInicial.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        imgInicial.setPreferredSize(new java.awt.Dimension(840, 510));
        getContentPane().add(imgInicial);
        imgInicial.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        new ViewParticipante(this, true, valor, pergunta, nome).setVisible(true);
        
        this.dispose();
        abertura.stop();
        vaiComecar.stop();
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION);       
        if(op==0) exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        try {
            new ViewRanking().setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnRankingActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgInicial;
    private javax.swing.JButton jButton3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
