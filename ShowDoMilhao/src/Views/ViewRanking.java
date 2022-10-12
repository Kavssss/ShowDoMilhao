package Views;

import Classes.Ranking;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ViewRanking extends javax.swing.JFrame {
    
    private final ArrayList<Ranking> lista;
    private String tempNome, tempValor; 
    
    public ViewRanking() throws FileNotFoundException, IOException {
        int i=0;
        initComponents();
        this.setLocationRelativeTo(null);
        lista = new ArrayList();
        
        File arquivo = new File("src\\Ranking\\Ranking");
        Scanner scan = new Scanner(arquivo);
        
        for(int j=0; j<11; j++) {
            lista.add(new Ranking("", ""));
        }

        while(scan.hasNextLine()) {
            if(i%2==0) {
                tempNome = scan.nextLine();
            } else {
                tempValor = scan.nextLine();
                lista.get((i-1)/2).setNome(tempNome);
                lista.get((i-1)/2).setValor(tempValor);
            }
            i++;
        }
        
        Collections.sort(lista);
        
        FileWriter fileWriter = new FileWriter(arquivo, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        for(int j=0; j<10; j++){
            printWriter.println(lista.get(j).getNome());
            printWriter.println(lista.get(j).getValor());
        }
        
        printWriter.flush();
        printWriter.close();

        txtNome1.setText(lista.get(0).getNome());
        txtPremio1.setText(lista.get(0).getValor());
        txtNome2.setText(lista.get(1).getNome());
        txtPremio2.setText(lista.get(1).getValor());
        txtNome3.setText(lista.get(2).getNome());
        txtPremio3.setText(lista.get(2).getValor());
        txtNome4.setText(lista.get(3).getNome());
        txtPremio4.setText(lista.get(3).getValor());
        txtNome5.setText(lista.get(4).getNome());
        txtPremio5.setText(lista.get(4).getValor());
        txtNome6.setText(lista.get(5).getNome());
        txtPremio6.setText(lista.get(5).getValor());
        txtNome7.setText(lista.get(6).getNome());
        txtPremio7.setText(lista.get(6).getValor());
        txtNome8.setText(lista.get(7).getNome());
        txtPremio8.setText(lista.get(7).getValor());
        txtNome9.setText(lista.get(8).getNome());
        txtPremio9.setText(lista.get(8).getValor());
        txtNome10.setText(lista.get(9).getNome());
        txtPremio10.setText(lista.get(9).getValor());
    }

    public ViewRanking(String nome, String milionario) throws FileNotFoundException, IOException {
        int i=0;
        initComponents();
        this.setLocationRelativeTo(null);
        lista = new ArrayList();
        
        File arquivo = new File("src\\Ranking\\Ranking");
        Scanner scan = new Scanner(arquivo);
        
        for(int j=0; j<11; j++){
            lista.add(new Ranking("", ""));
        }

        while(scan.hasNextLine()){
            if(i%2==0){
                tempNome = scan.nextLine();
            }else{
                tempValor = scan.nextLine();
                lista.get(i-1).setNome(tempNome);
                lista.get(i).setValor(tempValor);
            }
            i++;
        }
        
        Collections.sort(lista);
        
        FileWriter fileWriter = new FileWriter(arquivo, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        for(int j=0; j<10; j++){
            printWriter.println(lista.get(j).getNome());
            printWriter.println(lista.get(j).getValor());
        }
        
        printWriter.flush();
        printWriter.close();

        txtNome1.setText(lista.get(0).getNome());
        txtPremio1.setText(lista.get(0).getValor());
        txtNome2.setText(lista.get(1).getNome());
        txtPremio2.setText(lista.get(1).getValor());
        txtNome3.setText(lista.get(2).getNome());
        txtPremio3.setText(lista.get(2).getValor());
        txtNome4.setText(lista.get(3).getNome());
        txtPremio4.setText(lista.get(3).getValor());
        txtNome5.setText(lista.get(4).getNome());
        txtPremio5.setText(lista.get(4).getValor());
        txtNome6.setText(lista.get(5).getNome());
        txtPremio6.setText(lista.get(5).getValor());
        txtNome7.setText(lista.get(6).getNome());
        txtPremio7.setText(lista.get(6).getValor());
        txtNome8.setText(lista.get(7).getNome());
        txtPremio8.setText(lista.get(7).getValor());
        txtNome9.setText(lista.get(8).getNome());
        txtPremio9.setText(lista.get(8).getValor());
        txtNome10.setText(lista.get(9).getNome());
        txtPremio10.setText(lista.get(9).getValor());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtNome1 = new javax.swing.JTextField();
        txtPremio1 = new javax.swing.JTextField();
        txtNome2 = new javax.swing.JTextField();
        txtPremio2 = new javax.swing.JTextField();
        txtPremio3 = new javax.swing.JTextField();
        txtNome3 = new javax.swing.JTextField();
        txtPremio4 = new javax.swing.JTextField();
        txtNome4 = new javax.swing.JTextField();
        txtPremio5 = new javax.swing.JTextField();
        txtNome5 = new javax.swing.JTextField();
        txtNome6 = new javax.swing.JTextField();
        txtPremio6 = new javax.swing.JTextField();
        txtNome7 = new javax.swing.JTextField();
        txtPremio7 = new javax.swing.JTextField();
        txtNome8 = new javax.swing.JTextField();
        txtPremio8 = new javax.swing.JTextField();
        txtPremio9 = new javax.swing.JTextField();
        txtNome9 = new javax.swing.JTextField();
        txtNome10 = new javax.swing.JTextField();
        txtPremio10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(602, 385));
        setPreferredSize(new java.awt.Dimension(602, 385));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ranking de Pontuação");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 20, 600, 40);

        btnVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(493, 310, 80, 30);

        txtNome1.setEditable(false);
        txtNome1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(255, 255, 255));
        txtNome1.setBorder(null);
        txtNome1.setOpaque(false);
        getContentPane().add(txtNome1);
        txtNome1.setBounds(130, 80, 250, 20);

        txtPremio1.setEditable(false);
        txtPremio1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio1.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio1.setBorder(null);
        txtPremio1.setOpaque(false);
        getContentPane().add(txtPremio1);
        txtPremio1.setBounds(400, 80, 100, 20);

        txtNome2.setEditable(false);
        txtNome2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome2.setForeground(new java.awt.Color(255, 255, 255));
        txtNome2.setBorder(null);
        txtNome2.setOpaque(false);
        getContentPane().add(txtNome2);
        txtNome2.setBounds(130, 100, 250, 20);

        txtPremio2.setEditable(false);
        txtPremio2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio2.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio2.setBorder(null);
        txtPremio2.setOpaque(false);
        getContentPane().add(txtPremio2);
        txtPremio2.setBounds(400, 100, 100, 20);

        txtPremio3.setEditable(false);
        txtPremio3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio3.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio3.setBorder(null);
        txtPremio3.setOpaque(false);
        getContentPane().add(txtPremio3);
        txtPremio3.setBounds(400, 120, 100, 20);

        txtNome3.setEditable(false);
        txtNome3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome3.setForeground(new java.awt.Color(255, 255, 255));
        txtNome3.setBorder(null);
        txtNome3.setOpaque(false);
        getContentPane().add(txtNome3);
        txtNome3.setBounds(130, 120, 250, 20);

        txtPremio4.setEditable(false);
        txtPremio4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio4.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio4.setBorder(null);
        txtPremio4.setOpaque(false);
        getContentPane().add(txtPremio4);
        txtPremio4.setBounds(400, 140, 100, 20);

        txtNome4.setEditable(false);
        txtNome4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome4.setForeground(new java.awt.Color(255, 255, 255));
        txtNome4.setBorder(null);
        txtNome4.setOpaque(false);
        getContentPane().add(txtNome4);
        txtNome4.setBounds(130, 140, 250, 20);

        txtPremio5.setEditable(false);
        txtPremio5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio5.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio5.setBorder(null);
        txtPremio5.setOpaque(false);
        getContentPane().add(txtPremio5);
        txtPremio5.setBounds(400, 160, 100, 20);

        txtNome5.setEditable(false);
        txtNome5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome5.setForeground(new java.awt.Color(255, 255, 255));
        txtNome5.setBorder(null);
        txtNome5.setOpaque(false);
        getContentPane().add(txtNome5);
        txtNome5.setBounds(130, 160, 250, 20);

        txtNome6.setEditable(false);
        txtNome6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome6.setForeground(new java.awt.Color(255, 255, 255));
        txtNome6.setBorder(null);
        txtNome6.setOpaque(false);
        getContentPane().add(txtNome6);
        txtNome6.setBounds(130, 180, 250, 20);

        txtPremio6.setEditable(false);
        txtPremio6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio6.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio6.setBorder(null);
        txtPremio6.setOpaque(false);
        getContentPane().add(txtPremio6);
        txtPremio6.setBounds(400, 180, 100, 20);

        txtNome7.setEditable(false);
        txtNome7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome7.setForeground(new java.awt.Color(255, 255, 255));
        txtNome7.setBorder(null);
        txtNome7.setOpaque(false);
        getContentPane().add(txtNome7);
        txtNome7.setBounds(130, 200, 250, 20);

        txtPremio7.setEditable(false);
        txtPremio7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio7.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio7.setBorder(null);
        txtPremio7.setOpaque(false);
        getContentPane().add(txtPremio7);
        txtPremio7.setBounds(400, 200, 100, 20);

        txtNome8.setEditable(false);
        txtNome8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome8.setForeground(new java.awt.Color(255, 255, 255));
        txtNome8.setBorder(null);
        txtNome8.setOpaque(false);
        getContentPane().add(txtNome8);
        txtNome8.setBounds(130, 220, 250, 20);

        txtPremio8.setEditable(false);
        txtPremio8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio8.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio8.setBorder(null);
        txtPremio8.setOpaque(false);
        getContentPane().add(txtPremio8);
        txtPremio8.setBounds(400, 220, 100, 20);

        txtPremio9.setEditable(false);
        txtPremio9.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio9.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio9.setBorder(null);
        txtPremio9.setOpaque(false);
        getContentPane().add(txtPremio9);
        txtPremio9.setBounds(400, 240, 100, 20);

        txtNome9.setEditable(false);
        txtNome9.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome9.setForeground(new java.awt.Color(255, 255, 255));
        txtNome9.setBorder(null);
        txtNome9.setOpaque(false);
        getContentPane().add(txtNome9);
        txtNome9.setBounds(130, 240, 250, 20);

        txtNome10.setEditable(false);
        txtNome10.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtNome10.setForeground(new java.awt.Color(255, 255, 255));
        txtNome10.setBorder(null);
        txtNome10.setOpaque(false);
        getContentPane().add(txtNome10);
        txtNome10.setBounds(130, 260, 250, 20);

        txtPremio10.setEditable(false);
        txtPremio10.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtPremio10.setForeground(new java.awt.Color(255, 255, 255));
        txtPremio10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPremio10.setBorder(null);
        txtPremio10.setOpaque(false);
        getContentPane().add(txtPremio10);
        txtPremio10.setBounds(400, 260, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutRanking.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ViewRanking().setVisible(true);
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome10;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNome5;
    private javax.swing.JTextField txtNome6;
    private javax.swing.JTextField txtNome7;
    private javax.swing.JTextField txtNome8;
    private javax.swing.JTextField txtNome9;
    private javax.swing.JTextField txtPremio1;
    private javax.swing.JTextField txtPremio10;
    private javax.swing.JTextField txtPremio2;
    private javax.swing.JTextField txtPremio3;
    private javax.swing.JTextField txtPremio4;
    private javax.swing.JTextField txtPremio5;
    private javax.swing.JTextField txtPremio6;
    private javax.swing.JTextField txtPremio7;
    private javax.swing.JTextField txtPremio8;
    private javax.swing.JTextField txtPremio9;
    // End of variables declaration//GEN-END:variables

}
