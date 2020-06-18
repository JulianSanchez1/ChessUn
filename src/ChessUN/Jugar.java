package ChessUN;

import javax.swing.JFrame;

public class Jugar extends javax.swing.JFrame {
    
    public JFrame padre;
    
    public Jugar(JFrame padre){
        this.padre = padre;
        super.setIconImage(padre.getIconImage());
        initComponents();
    }
    public Jugar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jB_atras = new javax.swing.JButton();
        sintiempo = new javax.swing.JRadioButton();
        quincem = new javax.swing.JRadioButton();
        diezm = new javax.swing.JRadioButton();
        cincom = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras.png"))); // NOI18N
        jB_atras.setBorder(null);
        jB_atras.setBorderPainted(false);
        jB_atras.setContentAreaFilled(false);
        jB_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(jB_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        sintiempo.setText("Sin Tiempo");
        sintiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintiempoActionPerformed(evt);
            }
        });
        jPanel1.add(sintiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        quincem.setText("15 Minutos");
        quincem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quincemActionPerformed(evt);
            }
        });
        jPanel1.add(quincem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
        quincem.getAccessibleContext().setAccessibleName(" 15 Minutos");

        diezm.setText("10 Minutos");
        diezm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezmActionPerformed(evt);
            }
        });
        jPanel1.add(diezm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        cincom.setText("5 Minutos");
        cincom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincomActionPerformed(evt);
            }
        });
        jPanel1.add(cincom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Cronometro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 464, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atrasActionPerformed

        this.setVisible(false);
        padre.setVisible(true);
    }//GEN-LAST:event_jB_atrasActionPerformed

    private void diezmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezmActionPerformed
        try
        {if(diezm.isSelected())
        {
           padre.setVisible(false);
           Partida d=new Partida(10,true);
           d.setVisible(true);
           this.setVisible(false);
        }}catch(Exception e){}
    }//GEN-LAST:event_diezmActionPerformed

    private void quincemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quincemActionPerformed
        try
        {if(quincem.isSelected())
        {
           padre.setVisible(false);
           Partida d=new Partida(15,true);
           d.setVisible(true);
           this.setVisible(false);
        }}catch(Exception e){}
    }//GEN-LAST:event_quincemActionPerformed

    private void sintiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintiempoActionPerformed
        try
        {if(sintiempo.isSelected())
        {
           padre.setVisible(false);
           Partida d=new Partida(120,false);
           d.setVisible(true);
           this.setVisible(false);
        }}catch(Exception e){}
    }//GEN-LAST:event_sintiempoActionPerformed

    private void cincomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincomActionPerformed
        try
        {if(cincom.isSelected()){
           padre.setVisible(false);
           Partida d=new Partida(5,true);
           d.setVisible(true);
           this.setVisible(false);
        }
        }catch(Exception e){}
    }//GEN-LAST:event_cincomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JRadioButton cincom;
    private javax.swing.JRadioButton diezm;
    private javax.swing.JButton jB_atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton quincem;
    private javax.swing.JRadioButton sintiempo;
    // End of variables declaration//GEN-END:variables
}
