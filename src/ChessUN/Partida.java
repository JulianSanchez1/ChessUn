package ChessUN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(tiempoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 116, 47));

        tiempoB.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tiempoB.setForeground(new java.awt.Color(255, 255, 255));
        tiempoB.setText("00:00");
        getContentPane().add(tiempoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 103, 44));

        iniciar.setText("IniciarNegras");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        iniciarb.setText("IniciarBlancas");
        iniciarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        Titulo.setFont(new java.awt.Font("Mathematica6", 3, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("BLANCAS");
        Titulo.setToolTipText("");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 250, 70));

        Titulo1.setFont(new java.awt.Font("Mathematica6", 3, 48)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("NEGRAS");
        Titulo1.setToolTipText("");
        getContentPane().add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/FondoTablero.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       Menu p=new Menu();
       p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton iniciarb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tiempoB;
    private javax.swing.JLabel tiempoN;
    // End of variables declaration//GEN-END:variables
}
