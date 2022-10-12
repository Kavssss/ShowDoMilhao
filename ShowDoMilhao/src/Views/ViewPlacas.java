package Views;

import java.applet.AudioClip;
import java.util.Random;

public class ViewPlacas extends javax.swing.JDialog {

    private AudioClip placas;
    private int nivel;
    
    public ViewPlacas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ViewPlacas(java.awt.Frame parent, boolean modal, int correta, int nivel) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.nivel = nivel;
        
        placas = java.applet.Applet.newAudioClip(getClass().getResource("/sons/placas.wav"));
        placas.play();
        
        Random placa = new Random();
        
        if(this.nivel==1){
            if(placa.nextInt(10)+1<8) txtPlaca1.setText(String.valueOf(correta));
            else txtPlaca1.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca2.setText(String.valueOf(correta));
            else txtPlaca2.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca3.setText(String.valueOf(correta));
            else txtPlaca3.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca4.setText(String.valueOf(correta));
            else txtPlaca4.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca5.setText(String.valueOf(correta));
            else txtPlaca5.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca6.setText(String.valueOf(correta));
            else txtPlaca6.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca7.setText(String.valueOf(correta));
            else txtPlaca7.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<8) txtPlaca8.setText(String.valueOf(correta));
            else txtPlaca8.setText(String.valueOf(placa.nextInt(4)+1));
        }else if(this.nivel==2){
            if(placa.nextInt(10)+1<7) txtPlaca1.setText(String.valueOf(correta));
            else txtPlaca1.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca2.setText(String.valueOf(correta));
            else txtPlaca2.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca3.setText(String.valueOf(correta));
            else txtPlaca3.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca4.setText(String.valueOf(correta));
            else txtPlaca4.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca5.setText(String.valueOf(correta));
            else txtPlaca5.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca6.setText(String.valueOf(correta));
            else txtPlaca6.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca7.setText(String.valueOf(correta));
            else txtPlaca7.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<7) txtPlaca8.setText(String.valueOf(correta));
            else txtPlaca8.setText(String.valueOf(placa.nextInt(4)+1));
        }else{
            if(placa.nextInt(10)+1<6) txtPlaca1.setText(String.valueOf(correta));
            else txtPlaca1.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca2.setText(String.valueOf(correta));
            else txtPlaca2.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca3.setText(String.valueOf(correta));
            else txtPlaca3.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca4.setText(String.valueOf(correta));
            else txtPlaca4.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca5.setText(String.valueOf(correta));
            else txtPlaca5.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca6.setText(String.valueOf(correta));
            else txtPlaca6.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca7.setText(String.valueOf(correta));
            else txtPlaca7.setText(String.valueOf(placa.nextInt(4)+1));
            if(placa.nextInt(10)+1<6) txtPlaca8.setText(String.valueOf(correta));
            else txtPlaca8.setText(String.valueOf(placa.nextInt(4)+1));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlaca1 = new javax.swing.JLabel();
        txtPlaca5 = new javax.swing.JLabel();
        txtPlaca2 = new javax.swing.JLabel();
        txtPlaca6 = new javax.swing.JLabel();
        txtPlaca7 = new javax.swing.JLabel();
        txtPlaca3 = new javax.swing.JLabel();
        txtPlaca4 = new javax.swing.JLabel();
        txtPlaca8 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 380));
        setPreferredSize(new java.awt.Dimension(600, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        txtPlaca1.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca1.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca1.setOpaque(true);
        getContentPane().add(txtPlaca1);
        txtPlaca1.setBounds(130, 20, 50, 50);

        txtPlaca5.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca5.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca5.setOpaque(true);
        getContentPane().add(txtPlaca5);
        txtPlaca5.setBounds(190, 90, 50, 50);

        txtPlaca2.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca2.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca2.setOpaque(true);
        getContentPane().add(txtPlaca2);
        txtPlaca2.setBounds(240, 20, 50, 50);

        txtPlaca6.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca6.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca6.setOpaque(true);
        getContentPane().add(txtPlaca6);
        txtPlaca6.setBounds(300, 90, 50, 50);

        txtPlaca7.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca7.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca7.setOpaque(true);
        getContentPane().add(txtPlaca7);
        txtPlaca7.setBounds(410, 90, 50, 50);

        txtPlaca3.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca3.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca3.setOpaque(true);
        getContentPane().add(txtPlaca3);
        txtPlaca3.setBounds(360, 20, 50, 50);

        txtPlaca4.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca4.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca4.setOpaque(true);
        getContentPane().add(txtPlaca4);
        txtPlaca4.setBounds(480, 20, 50, 50);

        txtPlaca8.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca8.setFont(new java.awt.Font("Trebuchet MS", 1, 42)); // NOI18N
        txtPlaca8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca8.setOpaque(true);
        getContentPane().add(txtPlaca8);
        txtPlaca8.setBounds(520, 90, 50, 50);

        btnOk.setBackground(new java.awt.Color(204, 204, 204));
        btnOk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnOk.setText("OK");
        btnOk.setFocusable(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(510, 303, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutPlacas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ViewPlacas dialog = new ViewPlacas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtPlaca1;
    private javax.swing.JLabel txtPlaca2;
    private javax.swing.JLabel txtPlaca3;
    private javax.swing.JLabel txtPlaca4;
    private javax.swing.JLabel txtPlaca5;
    private javax.swing.JLabel txtPlaca6;
    private javax.swing.JLabel txtPlaca7;
    private javax.swing.JLabel txtPlaca8;
    // End of variables declaration//GEN-END:variables
}
