package ChessUN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Partida extends javax.swing.JFrame {
    private Timer tiempo;
    public int segundo=0,minuto=0;
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
    }
    public Partida(int m,boolean b) {
        
        Fondo p = new Fondo(false);
        setContentPane(p);
        initComponents();
        tiempo = new Timer(1000,acciones);
        if (b == true){
            minuto=m;
            String texto = (minuto<=9?"0":"")+minuto+":"+(segundo<=9?"0":"")+segundo;
            tiempoN.setText(texto);
        }
        else{
            String texto = "";
            tiempoN.setText(texto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tiempoN = new javax.swing.JLabel();
        tiempoB = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChessUN");
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tiempoN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tiempoN.setForeground(new java.awt.Color(255, 255, 255));
        tiempoN.setText("00:00");

        tiempoB.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tiempoB.setForeground(new java.awt.Color(255, 255, 255));
        tiempoB.setText("00:00");

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniciar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tiempoB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tiempoN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(tiempoN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(tiempoB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       Menu p=new Menu();
       p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        tiempo.start();
        iniciar.setEnabled(false);
        //tiempo.stop();
    }//GEN-LAST:event_iniciarActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel tiempoB;
    private javax.swing.JLabel tiempoN;
    // End of variables declaration//GEN-END:variables
}
