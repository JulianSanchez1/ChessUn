package ChessUN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

public class Partida extends javax.swing.JFrame {
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        jPanel1.add(c8);
        jPanel1.add(d8);
        jPanel1.add(e8);
        jPanel1.add(f8);
        jPanel1.add(g8);
        jPanel1.add(h8);

        a7.setBackground(new java.awt.Color(0, 0, 0));
        a7.setBorderPainted(false);
        a7.setFocusPainted(false);
        jPanel1.add(a7);
        jPanel1.add(b7);
        jPanel1.add(c7);
        jPanel1.add(d7);
        jPanel1.add(e7);

        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });
        jPanel1.add(f7);
        jPanel1.add(g7);
        jPanel1.add(h7);

        a6.setBackground(new java.awt.Color(255, 255, 255));
        a6.setBorderPainted(false);
        a6.setFocusPainted(false);
        jPanel1.add(a6);
        jPanel1.add(b6);
        jPanel1.add(c6);
        jPanel1.add(d6);
        jPanel1.add(f6);
        jPanel1.add(g6);
        jPanel1.add(h6);
        jPanel1.add(a5);

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        jPanel1.add(b5);
        jPanel1.add(c5);
        jPanel1.add(d5);
        jPanel1.add(e5);
        jPanel1.add(e6);
        jPanel1.add(f5);
        jPanel1.add(g5);
        jPanel1.add(h5);

        a4.setBackground(new java.awt.Color(255, 255, 255));
        a4.setBorderPainted(false);
        a4.setFocusPainted(false);
        jPanel1.add(a4);
        jPanel1.add(b4);
        jPanel1.add(c4);
        jPanel1.add(d4);
        jPanel1.add(e4);
        jPanel1.add(f4);
        jPanel1.add(g4);
        jPanel1.add(h4);

        a3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(a3);
        jPanel1.add(b3);
        jPanel1.add(c3);
        jPanel1.add(d3);
        jPanel1.add(e3);
        jPanel1.add(f3);
        jPanel1.add(g3);
        jPanel1.add(h3);

        a2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(a2);

        b2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(b2);
        jPanel1.add(c2);
        jPanel1.add(d2);
        jPanel1.add(e2);
        jPanel1.add(f2);
        jPanel1.add(g2);
        jPanel1.add(h2);

        a1.setBackground(new java.awt.Color(0, 0, 0));
        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Torre.png"))); // NOI18N
        a1.setBorder(null);
        a1.setBorderPainted(false);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);
        jPanel1.add(b1);
        jPanel1.add(c1);
        jPanel1.add(d1);
        jPanel1.add(e1);
        jPanel1.add(f1);
        jPanel1.add(g1);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        dtorre(a8);
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
