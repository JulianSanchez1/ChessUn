package ChessUN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

public final class Partida extends javax.swing.JFrame {
    private Timer tiempo,tiempob;
    public int segundo=0,minuto=0, segundoB=0,minutoB=0;
    private ActionListener acciones1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(segundoB==0){
                minutoB--;
                segundoB=60;
            }
            segundoB--;
            actualizarTiempo();
        }
    }; 
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(segundo==0){
                minuto--;
                segundo=60;
            }
            segundo--;
            actualizarTiempo();
        }
    }; 

    private Partida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizarTiempo(){
        String texto = (minuto<=9?"0":"")+minuto+":"+(segundo<=9?"0":"")+segundo;
        tiempoN.setText(texto);
        String texto1 = (minutoB<=9?"0":"")+minutoB+":"+(segundoB<=9?"0":"")+segundoB;
        tiempoB.setText(texto1);
    }
    public Partida(int m,boolean b) {
        
        Fondo p = new Fondo(false);
        setContentPane(p);
        initComponents();
        
        tiempo = new Timer(1000,acciones);
        tiempob = new Timer(1000,acciones1);
        if (b == true){
            minuto=m;
            minutoB=m;
            String texto = (minuto<=9?"0":"")+minuto+":"+(segundo<=9?"0":"")+segundo;
            tiempoN.setText(texto);
            tiempoB.setText(texto);
        }
        else{
            String texto = "";
            tiempoN.setText(texto);
            tiempoB.setText(texto);
        }
        Tablero tablero = new Tablero();
        addBotonesT(tablero);
        //tablero.OrdenarTablero();
        
    }
    public void addBotonesT(Tablero tablero){
        tablero.addBotones(0,0,a8);
        tablero.addBotones(0,1,b8);
        tablero.addBotones(0,2,c8);
        tablero.addBotones(0,3,d8);
        tablero.addBotones(0,4,e8);
        tablero.addBotones(0,5,f8);
        tablero.addBotones(0,6,g8);
        tablero.addBotones(0,7,h8);
        tablero.addBotones(1,0,a7);
        tablero.addBotones(1,1,b7);
        tablero.addBotones(1,2,c7);
        tablero.addBotones(1,3,d7);
        tablero.addBotones(1,4,e7);
        tablero.addBotones(1,5,f7);
        tablero.addBotones(1,6,g7);
        tablero.addBotones(1,7,h7);
        tablero.addBotones(2,0,a6);
        tablero.addBotones(2,1,b6);
        tablero.addBotones(2,2,c6);
        tablero.addBotones(2,3,d6);
        tablero.addBotones(2,4,e6);
        tablero.addBotones(2,5,f6);
        tablero.addBotones(2,6,g6);
        tablero.addBotones(2,7,h6);
        tablero.addBotones(3,0,a5);
        tablero.addBotones(3,1,b5);
        tablero.addBotones(3,2,c5);
        tablero.addBotones(3,3,d5);
        tablero.addBotones(3,4,e5);
        tablero.addBotones(3,5,f5);
        tablero.addBotones(3,6,g5);
        tablero.addBotones(3,7,h5);
        tablero.addBotones(4,0,a4);
        tablero.addBotones(4,1,b4);
        tablero.addBotones(4,2,c4);
        tablero.addBotones(4,3,d4);
        tablero.addBotones(4,4,e4);
        tablero.addBotones(4,5,f4);
        tablero.addBotones(4,6,g4);
        tablero.addBotones(4,7,h4);
        tablero.addBotones(5,0,a3);
        tablero.addBotones(5,1,b3);
        tablero.addBotones(5,2,c3);
        tablero.addBotones(5,3,d3);
        tablero.addBotones(5,4,e3);
        tablero.addBotones(5,5,f3);
        tablero.addBotones(5,6,g3);
        tablero.addBotones(5,7,h3);
        tablero.addBotones(6,0,a2);
        tablero.addBotones(6,1,b2);
        tablero.addBotones(6,2,c2);
        tablero.addBotones(6,3,d2);
        tablero.addBotones(6,4,e2);
        tablero.addBotones(6,5,f2);
        tablero.addBotones(6,6,g2);
        tablero.addBotones(6,7,h2);
        tablero.addBotones(7,0,a1);
        tablero.addBotones(7,1,b1);
        tablero.addBotones(7,2,c1);
        tablero.addBotones(7,3,d1);
        tablero.addBotones(7,4,e1);
        tablero.addBotones(7,5,f1);
        tablero.addBotones(7,6,g1);
        tablero.addBotones(7,7,h1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tiempoN = new javax.swing.JLabel();
        tiempoB = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        iniciarb = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        a8 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        d8 = new javax.swing.JButton();
        e8 = new javax.swing.JButton();
        f8 = new javax.swing.JButton();
        g8 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        e7 = new javax.swing.JButton();
        f7 = new javax.swing.JButton();
        g7 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        g1 = new javax.swing.JButton();
        h1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChessUN");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 423, -1, -1));

        tiempoN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tiempoN.setForeground(new java.awt.Color(255, 255, 255));
        tiempoN.setText("00:00");
        getContentPane().add(tiempoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 122, 116, 47));

        tiempoB.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tiempoB.setForeground(new java.awt.Color(255, 255, 255));
        tiempoB.setText("00:00");
        getContentPane().add(tiempoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 304, 103, 44));

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 144, -1, -1));

        iniciarb.setText("IniciarN");
        iniciarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarb, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 325, -1, -1));

        Titulo.setFont(new java.awt.Font("Mathematica6", 3, 64)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Negras");
        Titulo.setToolTipText("");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        Titulo1.setFont(new java.awt.Font("Mathematica6", 3, 64)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Blancas");
        Titulo1.setToolTipText("");
        getContentPane().add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(405, 405));
        jPanel1.setLayout(new java.awt.GridLayout(8, 8));

        a8.setBackground(new java.awt.Color(255, 255, 255));
        a8.setBorderPainted(false);
        a8.setFocusPainted(false);
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        jPanel1.add(a8);

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setBorderPainted(false);
        b8.setFocusPainted(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);

        c8.setBackground(new java.awt.Color(255, 255, 255));
        c8.setBorderPainted(false);
        c8.setFocusPainted(false);
        jPanel1.add(c8);

        d8.setBackground(new java.awt.Color(0, 0, 0));
        d8.setBorderPainted(false);
        d8.setFocusPainted(false);
        jPanel1.add(d8);

        e8.setBackground(new java.awt.Color(255, 255, 255));
        e8.setBorderPainted(false);
        e8.setFocusPainted(false);
        jPanel1.add(e8);

        f8.setBackground(new java.awt.Color(0, 0, 0));
        f8.setBorderPainted(false);
        f8.setFocusPainted(false);
        jPanel1.add(f8);

        g8.setBackground(new java.awt.Color(255, 255, 255));
        g8.setBorderPainted(false);
        g8.setFocusPainted(false);
        jPanel1.add(g8);

        h8.setBackground(new java.awt.Color(0, 0, 0));
        h8.setBorderPainted(false);
        h8.setFocusPainted(false);
        jPanel1.add(h8);

        a7.setBackground(new java.awt.Color(0, 0, 0));
        a7.setBorderPainted(false);
        a7.setFocusPainted(false);
        jPanel1.add(a7);

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setBorderPainted(false);
        b7.setFocusPainted(false);
        jPanel1.add(b7);

        c7.setBackground(new java.awt.Color(0, 0, 0));
        c7.setBorderPainted(false);
        c7.setFocusPainted(false);
        jPanel1.add(c7);

        d7.setBackground(new java.awt.Color(255, 255, 255));
        d7.setBorderPainted(false);
        d7.setFocusPainted(false);
        jPanel1.add(d7);

        e7.setBackground(new java.awt.Color(0, 0, 0));
        e7.setBorderPainted(false);
        e7.setFocusPainted(false);
        jPanel1.add(e7);

        f7.setBackground(new java.awt.Color(255, 255, 255));
        f7.setBorderPainted(false);
        f7.setFocusPainted(false);
        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });
        jPanel1.add(f7);

        g7.setBackground(new java.awt.Color(0, 0, 0));
        g7.setBorderPainted(false);
        g7.setFocusPainted(false);
        jPanel1.add(g7);

        h7.setBackground(new java.awt.Color(255, 255, 255));
        h7.setBorderPainted(false);
        h7.setFocusPainted(false);
        jPanel1.add(h7);

        a6.setBackground(new java.awt.Color(255, 255, 255));
        a6.setBorderPainted(false);
        a6.setFocusPainted(false);
        jPanel1.add(a6);

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        jPanel1.add(b6);

        c6.setBackground(new java.awt.Color(255, 255, 255));
        c6.setBorderPainted(false);
        c6.setFocusPainted(false);
        jPanel1.add(c6);

        d6.setBackground(new java.awt.Color(0, 0, 0));
        d6.setBorderPainted(false);
        d6.setFocusPainted(false);
        jPanel1.add(d6);

        f6.setBackground(new java.awt.Color(255, 255, 255));
        f6.setBorderPainted(false);
        f6.setFocusPainted(false);
        jPanel1.add(f6);

        g6.setBackground(new java.awt.Color(0, 0, 0));
        g6.setBorderPainted(false);
        g6.setFocusPainted(false);
        jPanel1.add(g6);

        h6.setBackground(new java.awt.Color(255, 255, 255));
        h6.setBorderPainted(false);
        h6.setFocusPainted(false);
        jPanel1.add(h6);

        a5.setBackground(new java.awt.Color(0, 0, 0));
        a5.setBorderPainted(false);
        a5.setFocusPainted(false);
        jPanel1.add(a5);

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        jPanel1.add(b5);

        c5.setBackground(new java.awt.Color(255, 255, 255));
        c5.setBorderPainted(false);
        c5.setFocusPainted(false);
        jPanel1.add(c5);

        d5.setBackground(new java.awt.Color(0, 0, 0));
        d5.setBorderPainted(false);
        d5.setFocusPainted(false);
        jPanel1.add(d5);

        e5.setBackground(new java.awt.Color(255, 255, 255));
        e5.setBorderPainted(false);
        e5.setFocusPainted(false);
        jPanel1.add(e5);

        e6.setBackground(new java.awt.Color(0, 0, 0));
        e6.setBorderPainted(false);
        e6.setFocusPainted(false);
        jPanel1.add(e6);

        f5.setBackground(new java.awt.Color(255, 255, 255));
        f5.setBorderPainted(false);
        f5.setFocusPainted(false);
        jPanel1.add(f5);

        g5.setBackground(new java.awt.Color(0, 0, 0));
        g5.setBorderPainted(false);
        g5.setFocusPainted(false);
        jPanel1.add(g5);

        h5.setBackground(new java.awt.Color(255, 255, 255));
        h5.setBorderPainted(false);
        h5.setFocusPainted(false);
        jPanel1.add(h5);

        a4.setBackground(new java.awt.Color(255, 255, 255));
        a4.setBorderPainted(false);
        a4.setFocusPainted(false);
        jPanel1.add(a4);

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        jPanel1.add(b4);

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setBorderPainted(false);
        c4.setFocusPainted(false);
        jPanel1.add(c4);

        d4.setBackground(new java.awt.Color(0, 0, 0));
        d4.setBorderPainted(false);
        d4.setFocusPainted(false);
        jPanel1.add(d4);

        e4.setBackground(new java.awt.Color(255, 255, 255));
        e4.setFocusPainted(false);
        jPanel1.add(e4);

        f4.setBackground(new java.awt.Color(0, 0, 0));
        f4.setBorderPainted(false);
        f4.setFocusPainted(false);
        jPanel1.add(f4);

        g4.setBackground(new java.awt.Color(255, 255, 255));
        g4.setBorderPainted(false);
        g4.setFocusPainted(false);
        jPanel1.add(g4);

        h4.setBackground(new java.awt.Color(0, 0, 0));
        h4.setBorderPainted(false);
        h4.setFocusPainted(false);
        jPanel1.add(h4);

        a3.setBackground(new java.awt.Color(0, 0, 0));
        a3.setBorderPainted(false);
        a3.setFocusPainted(false);
        jPanel1.add(a3);

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        jPanel1.add(b3);

        c3.setBackground(new java.awt.Color(0, 0, 0));
        c3.setBorderPainted(false);
        c3.setFocusPainted(false);
        jPanel1.add(c3);

        d3.setBackground(new java.awt.Color(255, 255, 255));
        d3.setBorderPainted(false);
        d3.setFocusPainted(false);
        jPanel1.add(d3);

        e3.setBackground(new java.awt.Color(0, 0, 0));
        e3.setBorderPainted(false);
        e3.setFocusPainted(false);
        jPanel1.add(e3);

        f3.setBackground(new java.awt.Color(255, 255, 255));
        f3.setBorderPainted(false);
        f3.setFocusPainted(false);
        jPanel1.add(f3);

        g3.setBackground(new java.awt.Color(0, 0, 0));
        g3.setBorderPainted(false);
        g3.setFocusPainted(false);
        jPanel1.add(g3);

        h3.setBackground(new java.awt.Color(255, 255, 255));
        h3.setBorderPainted(false);
        h3.setFocusPainted(false);
        jPanel1.add(h3);

        a2.setBackground(new java.awt.Color(255, 255, 255));
        a2.setBorderPainted(false);
        a2.setFocusPainted(false);
        jPanel1.add(a2);

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        jPanel1.add(b2);

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setBorderPainted(false);
        c2.setFocusPainted(false);
        jPanel1.add(c2);

        d2.setBackground(new java.awt.Color(0, 0, 0));
        d2.setBorderPainted(false);
        d2.setFocusPainted(false);
        jPanel1.add(d2);

        e2.setBackground(new java.awt.Color(255, 255, 255));
        e2.setBorderPainted(false);
        e2.setFocusPainted(false);
        jPanel1.add(e2);

        f2.setBackground(new java.awt.Color(0, 0, 0));
        f2.setBorderPainted(false);
        f2.setFocusPainted(false);
        jPanel1.add(f2);

        g2.setBackground(new java.awt.Color(255, 255, 255));
        g2.setBorderPainted(false);
        g2.setFocusPainted(false);
        jPanel1.add(g2);

        h2.setBackground(new java.awt.Color(0, 0, 0));
        h2.setBorderPainted(false);
        h2.setFocusPainted(false);
        jPanel1.add(h2);

        a1.setBackground(new java.awt.Color(0, 0, 0));
        a1.setBorder(null);
        a1.setBorderPainted(false);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        jPanel1.add(b1);

        c1.setBackground(new java.awt.Color(0, 0, 0));
        c1.setBorderPainted(false);
        c1.setFocusPainted(false);
        jPanel1.add(c1);

        d1.setBackground(new java.awt.Color(255, 255, 255));
        d1.setBorderPainted(false);
        jPanel1.add(d1);

        e1.setBackground(new java.awt.Color(0, 0, 0));
        e1.setBorderPainted(false);
        e1.setFocusPainted(false);
        jPanel1.add(e1);

        f1.setBackground(new java.awt.Color(255, 255, 255));
        f1.setBorderPainted(false);
        f1.setFocusPainted(false);
        jPanel1.add(f1);

        g1.setBackground(new java.awt.Color(0, 0, 0));
        g1.setBorderPainted(false);
        g1.setFocusPainted(false);
        jPanel1.add(g1);

        h1.setBackground(new java.awt.Color(255, 255, 255));
        h1.setBorderPainted(false);
        h1.setFocusPainted(false);
        jPanel1.add(h1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 35, -1, 410));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/FondoTablero.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       Menu p=new Menu();
       p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void dtorre(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Dama.png")));
    }
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        tiempob.stop();
        tiempo.start();
        iniciar.setEnabled(false);
        iniciarb.setEnabled(true);
    }//GEN-LAST:event_iniciarActionPerformed

    private void iniciarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbActionPerformed
        tiempo.stop();
        tiempob.start();
        iniciarb.setEnabled(false);
        iniciar.setEnabled(true);
        //tiempo.stop();
    }//GEN-LAST:event_iniciarbActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        int x=0,y=0;
    }//GEN-LAST:event_b8ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        int x=0,y=0;
    }//GEN-LAST:event_a8ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton d8;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton e8;
    private javax.swing.JButton f1;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton f7;
    private javax.swing.JButton f8;
    private javax.swing.JButton g1;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JButton g7;
    private javax.swing.JButton g8;
    private javax.swing.JButton h1;
    private javax.swing.JButton h2;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton iniciarb;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tiempoB;
    private javax.swing.JLabel tiempoN;
    // End of variables declaration//GEN-END:variables

}
