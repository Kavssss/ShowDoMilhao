package Views;

import java.applet.AudioClip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import Classes.Perguntas;
import java.io.IOException;

public class ViewPerguntas extends javax.swing.JFrame {

    private ViewCartas ViewCartas;
    private ViewPlacas ViewPlacas;
    private ViewUniversitarios ViewUniversitarios;
    private ArrayList<Perguntas> pergunta;
    private ArrayList<String> valor;
    private AudioClip qualResposta, somResposta, somAmbiente, errou, certaResposta;
    private int i=0, v=0, click1=0, click2=0, click3=0, click4=0, nivel, level, remove, correta, pular;
    private boolean cartas, placas, universitarios;
    private String nome;
    
    private void somRespostas(){
        Random som = new Random();
        if(som.nextInt(2)==0)
            somResposta = java.applet.Applet.newAudioClip(getClass().getResource("/sons/estaCertoDisso.wav"));
        else
            somResposta = java.applet.Applet.newAudioClip(getClass().getResource("/sons/possoPerguntar.wav"));
        
        somResposta.play();
    }
    
    private void txtBarras(){
        switch (nivel) {
            case 1:
                txtErrar.setText("ZERO");
                txtParar.setText("500");
                txtAcertar.setText("1 MIL");
                break;
            case 2:
                txtErrar.setText("500");
                txtParar.setText("1 MIL");
                txtAcertar.setText("2,5 MIL");
                break;
            case 3:
                txtErrar.setText("1 MIL");
                txtParar.setText("2,5 MIL");
                txtAcertar.setText("5 MIL");
                break;
            case 4:
                txtErrar.setText("2,5 MIL");
                txtParar.setText("5 MIL");
                txtAcertar.setText("10 MIL");
                break;
            case 5:
                txtErrar.setText("5 MIL");
                txtParar.setText("10 MIL");
                txtAcertar.setText("25 MIL");
                break;
            case 6:
                txtErrar.setText("12,5 MIL");
                txtParar.setText("25 MIL");
                txtAcertar.setText("50 MIL");
                break;
            case 7:
                txtErrar.setText("25 MIL");
                txtParar.setText("50 MIL");
                txtAcertar.setText("100 MIL");
                break;
            case 8:
                txtErrar.setText("50 MIL");
                txtParar.setText("100 MIL");
                txtAcertar.setText("250 MIL");
                break;
            case 9:
                txtErrar.setText("125 MIL");
                txtParar.setText("250 MIL");
                txtAcertar.setText("500 MIL");
                break;
            default:
                txtErrar.setText("ZERO");
                txtParar.setText("500 MIL");
                txtAcertar.setText("1 MILHÃO");
                break;
        }
    }
    
    private void mensagem(int resposta){
        if(resposta==1)
            JOptionPane.showMessageDialog(rootPane, "Certa Resposta!\nVocê ganhou R$" + txtAcertar.getText() + "!", "Resposta certa", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(rootPane, "Você errou.", "Resposta errada", JOptionPane.ERROR_MESSAGE);
    }
    
    private void pular(){
        int op = JOptionPane.showConfirmDialog(rootPane, "Pular pergunta?", "", JOptionPane.YES_NO_OPTION);
        if(op==0){
            pular++;
            JOptionPane.showMessageDialog(rootPane, "Pergunta pulada.", "", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
            somAmbiente.stop();
            new ViewPerguntas(valor, pergunta, nivel, cartas, placas, universitarios, pular, nome).setVisible(true);
        }
    }
    
    public ViewPerguntas(){
        initComponents();
    }
    
    public ViewPerguntas(ArrayList<String> valor, ArrayList<Perguntas> pergunta, int nivel, boolean cartas, boolean placas, boolean universitarios, int pular, String nome) {
        initComponents();
        this.setLocationRelativeTo(null);                
        certaResposta = java.applet.Applet.newAudioClip(getClass().getResource("/sons/certaResposta.wav"));

        this.pergunta = pergunta;
        this.valor = valor;
        this.nivel = nivel;
        this.cartas = cartas;
        this.placas = placas;
        this.universitarios = universitarios;
        this.pular = pular;
        this.nome = nome;
        
        errou = java.applet.Applet.newAudioClip(getClass().getResource("/sons/errou.wav"));
        txtBarras();
        
        Collections.shuffle(pergunta);
        
        if(nivel<4)
            level=1;
        else if(nivel<7)
            level=2;
        else if(nivel<10)
            level=3;
        else
            level=4;
        
        if(level==4) {
            somAmbiente = java.applet.Applet.newAudioClip(getClass().getResource("/sons/pergunta1Milhao.wav"));
            somAmbiente.loop();
            qualResposta = java.applet.Applet.newAudioClip(getClass().getResource("/sons/silvio1Milhao.wav"));
            qualResposta.play();
        } else {
            somAmbiente = java.applet.Applet.newAudioClip(getClass().getResource("/sons/tensao1.wav"));
            somAmbiente.loop();
            qualResposta = java.applet.Applet.newAudioClip(getClass().getResource("/sons/qualResposta.wav"));
            qualResposta.play();
        }
        
        for(i=0; i<pergunta.size(); i++){
            if(pergunta.get(i).getNivel()==level){
                txtPergunta.setText(pergunta.get(i).getPergunta());
                txtOpcao1.setText(pergunta.get(i).getOp1());
                txtOpcao2.setText(pergunta.get(i).getOp2());
                txtOpcao3.setText(pergunta.get(i).getOp3());
                txtOpcao4.setText(pergunta.get(i).getOp4());
                
                if(level==4){
                    this.cartas=true;
                    this.placas=true;
                    this.universitarios=true;
                    this.pular=3;
                }
                
                pergunta.get(i).setNivel(-1);
                break;
            }
        }
        
        if(this.cartas==true){
            btnCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartasX.png")));
            btnCartas.setEnabled(false);
        }
        if(this.placas==true){
            btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/placasX.png")));
            btnPlacas.setEnabled(false);
        }
        if(this.universitarios==true){
            btnUniversitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/universitariosX.png")));
            btnUniversitarios.setEnabled(false);
        }
        
        if(this.pular==1){
            btnPular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular1.setEnabled(false);
        }else if(this.pular==2){
            btnPular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular1.setEnabled(false);
            btnPular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular2.setEnabled(false);
        }else if(this.pular==3){
            btnPular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular1.setEnabled(false);
            btnPular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular2.setEnabled(false);
            btnPular3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pularX.png")));
            btnPular3.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        txtOpcao1 = new javax.swing.JLabel();
        txtOpcao2 = new javax.swing.JLabel();
        txtOpcao3 = new javax.swing.JLabel();
        txtPergunta = new javax.swing.JLabel();
        txtOpcao4 = new javax.swing.JLabel();
        btnPular3 = new javax.swing.JButton();
        btnCartas = new javax.swing.JButton();
        btnPlacas = new javax.swing.JButton();
        btnResposta1 = new javax.swing.JButton();
        btnUniversitarios = new javax.swing.JButton();
        btnPular1 = new javax.swing.JButton();
        btnPular2 = new javax.swing.JButton();
        btnResposta2 = new javax.swing.JButton();
        btnResposta3 = new javax.swing.JButton();
        btnResposta4 = new javax.swing.JButton();
        txtErrar = new javax.swing.JLabel();
        btnParar = new javax.swing.JButton();
        txtParar = new javax.swing.JLabel();
        txtAcertar = new javax.swing.JLabel();
        barraOuro3 = new javax.swing.JLabel();
        barraOuro = new javax.swing.JLabel();
        barraOuro2 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 528));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 528));
        getContentPane().setLayout(null);

        txtOpcao1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtOpcao1.setForeground(new java.awt.Color(255, 255, 255));
        txtOpcao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtOpcao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txtOpcao1);
        txtOpcao1.setBounds(60, 220, 340, 40);

        txtOpcao2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtOpcao2.setForeground(new java.awt.Color(255, 255, 255));
        txtOpcao2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtOpcao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txtOpcao2);
        txtOpcao2.setBounds(60, 270, 340, 40);

        txtOpcao3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtOpcao3.setForeground(new java.awt.Color(255, 255, 255));
        txtOpcao3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtOpcao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txtOpcao3);
        txtOpcao3.setBounds(60, 320, 340, 40);

        txtPergunta.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        txtPergunta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPergunta);
        txtPergunta.setBounds(10, 90, 410, 110);

        txtOpcao4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtOpcao4.setForeground(new java.awt.Color(255, 255, 255));
        txtOpcao4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtOpcao4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txtOpcao4);
        txtOpcao4.setBounds(60, 370, 340, 40);

        btnPular3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pular.png"))); // NOI18N
        btnPular3.setBorderPainted(false);
        btnPular3.setContentAreaFilled(false);
        btnPular3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPular3.setFocusable(false);
        btnPular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPular3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPular3);
        btnPular3.setBounds(720, 410, 70, 70);

        btnCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartas.png"))); // NOI18N
        btnCartas.setBorderPainted(false);
        btnCartas.setContentAreaFilled(false);
        btnCartas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCartas.setFocusable(false);
        btnCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartas);
        btnCartas.setBounds(440, 330, 90, 80);

        btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/placas.png"))); // NOI18N
        btnPlacas.setBorderPainted(false);
        btnPlacas.setContentAreaFilled(false);
        btnPlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlacas.setFocusable(false);
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlacas);
        btnPlacas.setBounds(580, 330, 80, 80);

        btnResposta1.setBackground(new java.awt.Color(255, 255, 255));
        btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoResposta1.png"))); // NOI18N
        btnResposta1.setToolTipText("");
        btnResposta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        btnResposta1.setBorderPainted(false);
        btnResposta1.setContentAreaFilled(false);
        btnResposta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResposta1.setDefaultCapable(false);
        btnResposta1.setFocusPainted(false);
        btnResposta1.setFocusable(false);
        btnResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResposta1);
        btnResposta1.setBounds(20, 220, 380, 40);

        btnUniversitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/universitarios.png"))); // NOI18N
        btnUniversitarios.setBorderPainted(false);
        btnUniversitarios.setContentAreaFilled(false);
        btnUniversitarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUniversitarios.setFocusable(false);
        btnUniversitarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversitariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUniversitarios);
        btnUniversitarios.setBounds(710, 330, 90, 80);

        btnPular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pular.png"))); // NOI18N
        btnPular1.setBorderPainted(false);
        btnPular1.setContentAreaFilled(false);
        btnPular1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPular1.setFocusable(false);
        btnPular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPular1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPular1);
        btnPular1.setBounds(450, 410, 70, 70);

        btnPular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pular.png"))); // NOI18N
        btnPular2.setBorderPainted(false);
        btnPular2.setContentAreaFilled(false);
        btnPular2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPular2.setFocusable(false);
        btnPular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPular2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPular2);
        btnPular2.setBounds(580, 410, 70, 70);

        btnResposta2.setBackground(new java.awt.Color(255, 255, 255));
        btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoResposta2.png"))); // NOI18N
        btnResposta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        btnResposta2.setBorderPainted(false);
        btnResposta2.setContentAreaFilled(false);
        btnResposta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResposta2.setDefaultCapable(false);
        btnResposta2.setFocusPainted(false);
        btnResposta2.setFocusable(false);
        btnResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResposta2);
        btnResposta2.setBounds(20, 270, 380, 40);

        btnResposta3.setBackground(new java.awt.Color(255, 255, 255));
        btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoResposta3.png"))); // NOI18N
        btnResposta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        btnResposta3.setBorderPainted(false);
        btnResposta3.setContentAreaFilled(false);
        btnResposta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResposta3.setDefaultCapable(false);
        btnResposta3.setFocusPainted(false);
        btnResposta3.setFocusable(false);
        btnResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResposta3);
        btnResposta3.setBounds(20, 320, 380, 40);

        btnResposta4.setBackground(new java.awt.Color(255, 255, 255));
        btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoResposta4.png"))); // NOI18N
        btnResposta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        btnResposta4.setBorderPainted(false);
        btnResposta4.setContentAreaFilled(false);
        btnResposta4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResposta4.setDefaultCapable(false);
        btnResposta4.setFocusPainted(false);
        btnResposta4.setFocusable(false);
        btnResposta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResposta4);
        btnResposta4.setBounds(20, 370, 380, 40);

        txtErrar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtErrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtErrar);
        txtErrar.setBounds(40, 430, 90, 40);

        btnParar.setBorderPainted(false);
        btnParar.setContentAreaFilled(false);
        btnParar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParar.setFocusable(false);
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        getContentPane().add(btnParar);
        btnParar.setBounds(160, 430, 90, 60);

        txtParar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtParar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtParar.setFocusable(false);
        getContentPane().add(txtParar);
        txtParar.setBounds(160, 430, 90, 40);

        txtAcertar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        txtAcertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAcertar);
        txtAcertar.setBounds(280, 430, 90, 40);

        barraOuro3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        barraOuro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraOuro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/barraDeOuro.png"))); // NOI18N
        getContentPane().add(barraOuro3);
        barraOuro3.setBounds(280, 430, 90, 40);

        barraOuro.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        barraOuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraOuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/barraDeOuro.png"))); // NOI18N
        getContentPane().add(barraOuro);
        barraOuro.setBounds(40, 430, 90, 40);

        barraOuro2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        barraOuro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraOuro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/barraDeOuro.png"))); // NOI18N
        getContentPane().add(barraOuro2);
        barraOuro2.setBounds(160, 430, 90, 38);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layoutPerguntas.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta1ActionPerformed
        click1++;
        if(click1==1){
            btnResposta1.setBorderPainted(true);
            btnResposta2.setBorderPainted(false);
            btnResposta3.setBorderPainted(false);
            btnResposta4.setBorderPainted(false);

            somRespostas();            
        }else if(click1==2){
            if(pergunta.get(i).getCorreta()==1){
                certaResposta.play();
                btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto1.gif")));
                //valor.remove(1);
                v++;
                pergunta.remove(i);
                
                mensagem(1);
                
                if(nivel==10){
                    this.dispose();
                    somAmbiente.stop();
                    try {
                        new ViewMilionario(valor, nivel, nome).setVisible(true);
                    }
                    catch (IOException ex) {
                        System.out.println(ex);
                    }
                }else{
                    this.dispose();
                    somAmbiente.stop();
                    new ViewValores(valor, pergunta, nivel, cartas, placas, universitarios, pular, nome).setVisible(true);
                }
            }else{
                btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoRespostaErrado1.png")));

                errou.play();
                
                if(pergunta.get(i).getCorreta()==2)
                    btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto2.gif")));
                else if(pergunta.get(i).getCorreta()==3)
                    btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto3.gif")));
                else
                    btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto4.gif")));
                
                mensagem(0);
                
                this.dispose();
                somAmbiente.stop();
                try {
                    new ViewFimDeJogo(valor, nivel, nome, txtErrar.getText()).setVisible(true);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        click2=click3=click4=0;
    }//GEN-LAST:event_btnResposta1ActionPerformed

    private void btnResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta2ActionPerformed
        click2++;
        if(click2==1){
            btnResposta1.setBorderPainted(false);
            btnResposta2.setBorderPainted(true);
            btnResposta3.setBorderPainted(false);
            btnResposta4.setBorderPainted(false);

            somRespostas();
        }else if(click2==2){
            if(pergunta.get(i).getCorreta()==2){
                btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto2.gif")));
                certaResposta.play();
                //valor.remove(1);
                v++;
                pergunta.remove(i);

                mensagem(1);
                
                if(nivel==10){
                    this.dispose();
                    somAmbiente.stop();
                    try {
                        new ViewMilionario(valor, nivel, nome).setVisible(true);
                    }
                    catch (IOException ex) {
                        System.out.println(ex);
                    }
                }else{
                    this.dispose();
                    somAmbiente.stop();
                    new ViewValores(valor, pergunta, nivel, cartas, placas, universitarios, pular, nome).setVisible(true);
                }
            }else{
                btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoRespostaErrado2.png")));

                errou.play();
                
                if(pergunta.get(i).getCorreta()==1)
                    btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto1.gif")));
                else if(pergunta.get(i).getCorreta()==3)
                    btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto3.gif")));
                else
                    btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto4.gif")));
                
                mensagem(0);
                
                this.dispose();
                somAmbiente.stop();
                try {
                    new ViewFimDeJogo(valor, nivel, nome, txtErrar.getText()).setVisible(true);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        click1=click3=click4=0;
    }//GEN-LAST:event_btnResposta2ActionPerformed

    private void btnResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta3ActionPerformed
        click3++;
        if(click3==1){
            btnResposta1.setBorderPainted(false);
            btnResposta2.setBorderPainted(false);
            btnResposta3.setBorderPainted(true);
            btnResposta4.setBorderPainted(false);

            somRespostas();
        }else if(click3==2){
            if(pergunta.get(i).getCorreta()==3){
                btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto3.gif")));
                certaResposta.play();
                //valor.remove(1);
                v++;
                pergunta.remove(i);
                
                mensagem(1);
                
                if(nivel==10){
                    this.dispose();
                    somAmbiente.stop();
                    try {
                        new ViewMilionario(valor, nivel, nome).setVisible(true);
                    }
                    catch (IOException ex) {
                        System.out.println(ex);
                    }
                }else{
                    this.dispose();
                    somAmbiente.stop();
                    new ViewValores(valor, pergunta, nivel, cartas, placas, universitarios, pular, nome).setVisible(true);
                }
            }else{
                btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoRespostaErrado3.png")));
                
                errou.play();
                
                if(pergunta.get(i).getCorreta()==1)
                    btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto1.gif")));
                else if(pergunta.get(i).getCorreta()==2)
                    btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto2.gif")));
                else
                    btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto4.gif")));
                
                mensagem(0);
                
                this.dispose();
                somAmbiente.stop();
                try {
                    new ViewFimDeJogo(valor, nivel, nome, txtErrar.getText()).setVisible(true);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        click1=click2=click4=0;
    }//GEN-LAST:event_btnResposta3ActionPerformed

    private void btnResposta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta4ActionPerformed
        click4++;
        if(click4==1){
            btnResposta1.setBorderPainted(false);
            btnResposta2.setBorderPainted(false);
            btnResposta3.setBorderPainted(false);
            btnResposta4.setBorderPainted(true);

            somRespostas();
        }else if(click4==2){
            if(pergunta.get(i).getCorreta()==4){
                btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto4.gif")));
                certaResposta.play();
                //valor.remove(1);
                v++;
                pergunta.remove(i);
                
                mensagem(1);
                
                if(nivel==10){
                    this.dispose();
                    somAmbiente.stop();
                    try {
                        new ViewMilionario(valor, nivel, nome).setVisible(true);
                    }
                    catch (IOException ex) {
                        System.out.println(ex);
                    }
                }else{
                    this.dispose();
                    somAmbiente.stop();
                    new ViewValores(valor, pergunta, nivel, cartas, placas, universitarios, pular, nome).setVisible(true);
                }
            }else{
                btnResposta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoRespostaErrado4.png")));
                
                errou.play();
                
                if(pergunta.get(i).getCorreta()==1)
                    btnResposta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto1.gif")));
                else if(pergunta.get(i).getCorreta()==2)
                    btnResposta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto2.gif")));
                else
                    btnResposta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCorreto3.gif")));
                
                mensagem(0);
                
                this.dispose();
                somAmbiente.stop();
                try {
                    new ViewFimDeJogo(valor, nivel, nome, txtErrar.getText()).setVisible(true);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        click1=click2=click3=0;
    }//GEN-LAST:event_btnResposta4ActionPerformed

    private void btnCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartasActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Usar ajuda das cartas?", "", JOptionPane.YES_NO_OPTION);
        
        if(op==0){
            this.ViewCartas = new ViewCartas(this, true, remove);
            this.ViewCartas.setVisible(true);
            cartas=true;
            btnCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cartasX.png")));
            btnCartas.setEnabled(false);
            this.remove = this.ViewCartas.getRemove();
            
            Random carta = new Random();
            
            if(remove==1){
                int removida = carta.nextInt(3);
                if(pergunta.get(i).getCorreta()==1){
                    if(removida==0){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                    else{
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==2){
                    if(removida==0){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                    else{
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==3){
                    if(removida==0){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                    }
                    else{
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==4){
                    if(removida==0){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                    }
                    else{
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                }
            } else if (remove==2) {
                int removida = carta.nextInt(3);
                if(pergunta.get(i).getCorreta()==1){
                    if(removida==0){
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                    else{
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==2){
                    if(removida==0){
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                    else{
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==3){
                    if(removida==0){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao4.setText("");
                        btnResposta4.setEnabled(false);
                    }
                    else{
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                    }
                }else if(pergunta.get(i).getCorreta()==4){
                    if(removida==0){
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }else if(removida==1){
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao3.setText("");
                        btnResposta3.setEnabled(false);
                    }
                    else{
                        txtOpcao1.setText("");
                        btnResposta1.setEnabled(false);
                        txtOpcao2.setText("");
                        btnResposta2.setEnabled(false);
                    }
                }
            } else if(remove==3){
                if(pergunta.get(i).getCorreta()==1){
                    txtOpcao2.setText("");
                    btnResposta2.setEnabled(false);
                    txtOpcao3.setText("");
                    btnResposta3.setEnabled(false);
                    txtOpcao4.setText("");
                    btnResposta4.setEnabled(false);
                }else if(pergunta.get(i).getCorreta()==2){
                    txtOpcao1.setText("");
                    btnResposta1.setEnabled(false);
                    txtOpcao3.setText("");
                    btnResposta3.setEnabled(false);
                    txtOpcao4.setText("");
                    btnResposta4.setEnabled(false);
                }else if(pergunta.get(i).getCorreta()==3){
                    txtOpcao1.setText("");
                    btnResposta1.setEnabled(false);
                    txtOpcao2.setText("");
                    btnResposta2.setEnabled(false);
                    txtOpcao4.setText("");
                    btnResposta4.setEnabled(false);
                }else if(pergunta.get(i).getCorreta()==4){
                    txtOpcao1.setText("");
                    btnResposta1.setEnabled(false);
                    txtOpcao2.setText("");
                    btnResposta2.setEnabled(false);
                    txtOpcao3.setText("");
                    btnResposta3.setEnabled(false);
                }
            }
            
        }
        
    }//GEN-LAST:event_btnCartasActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Usar ajuda das placas?", "", JOptionPane.YES_NO_OPTION);
        
        correta = pergunta.get(i).getCorreta();
        
        if(op==0){
            this.ViewPlacas = new ViewPlacas(this, true, correta, nivel);
            this.ViewPlacas.setVisible(true);
            placas=true;
            btnPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/placasX.png")));
            btnPlacas.setEnabled(false);
        }
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnUniversitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversitariosActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Usar ajuda dos universitários?", "", JOptionPane.YES_NO_OPTION);
        
        correta = pergunta.get(i).getCorreta();
        
        if(op==0){
            this.ViewUniversitarios = new ViewUniversitarios(this, true, correta, nivel);
            this.ViewUniversitarios.setVisible(true);
            universitarios=true;
            btnUniversitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/universitariosX.png")));
            btnUniversitarios.setEnabled(false);
        }
    }//GEN-LAST:event_btnUniversitariosActionPerformed

    private void btnPular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPular1ActionPerformed
        pular();
    }//GEN-LAST:event_btnPular1ActionPerformed

    private void btnPular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPular2ActionPerformed
        pular();
    }//GEN-LAST:event_btnPular2ActionPerformed

    private void btnPular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPular3ActionPerformed
        pular();
    }//GEN-LAST:event_btnPular3ActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja parar?", "", JOptionPane.YES_NO_OPTION);
        if(op==0){
            this.dispose();
            somAmbiente.stop();
            try {
                new ViewFimDeJogo(valor, nivel, nome).setVisible(true);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnPararActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewPerguntas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barraOuro;
    private javax.swing.JLabel barraOuro2;
    private javax.swing.JLabel barraOuro3;
    private javax.swing.JButton btnCartas;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnPlacas;
    private javax.swing.JButton btnPular1;
    private javax.swing.JButton btnPular2;
    private javax.swing.JButton btnPular3;
    private javax.swing.JButton btnResposta1;
    private javax.swing.JButton btnResposta2;
    private javax.swing.JButton btnResposta3;
    private javax.swing.JButton btnResposta4;
    private javax.swing.JButton btnUniversitarios;
    private javax.swing.JLabel fundo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel txtAcertar;
    private javax.swing.JLabel txtErrar;
    private javax.swing.JLabel txtOpcao1;
    private javax.swing.JLabel txtOpcao2;
    private javax.swing.JLabel txtOpcao3;
    private javax.swing.JLabel txtOpcao4;
    private javax.swing.JLabel txtParar;
    private javax.swing.JLabel txtPergunta;
    // End of variables declaration//GEN-END:variables
}
