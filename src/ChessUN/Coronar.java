package ChessUN;

import javax.swing.JFrame;

public class Coronar extends javax.swing.JFrame {
    public int decision=0;
    public JFrame padre;

    public Coronar(JFrame padre){
        this.padre = padre;
        super.setIconImage(padre.getIconImage());
        initComponents();
    }
    public Coronar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jB_atras = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        jB_Caballo = new javax.swing.JButton();
        jB_Arfil = new javax.swing.JButton();
        jB_Dama = new javax.swing.JButton();
        jB_Torre = new javax.swing.JButton();
        Titulo2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coronar");
        setMaximumSize(new java.awt.Dimension(463, 200));
        setMinimumSize(new java.awt.Dimension(463, 200));
        setPreferredSize(new java.awt.Dimension(463, 220));
        setResizable(false);
        setSize(new java.awt.Dimension(463, 198));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(464, 198));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras2.png"))); // NOI18N
        jB_atras.setBorder(null);
        jB_atras.setBorderPainted(false);
        jB_atras.setContentAreaFilled(false);
        jB_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(jB_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        Titulo1.setFont(new java.awt.Font("Mathematica6", 3, 44)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Coronaste! ");
        Titulo1.setToolTipText("");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, -1));

        jB_Caballo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Caballo.png"))); // NOI18N
        jB_Caballo.setAutoscrolls(true);
        jB_Caballo.setBorder(null);
        jB_Caballo.setBorderPainted(false);
        jB_Caballo.setContentAreaFilled(false);
        jB_Caballo.setInheritsPopupMenu(true);
        jB_Caballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CaballoActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Caballo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 38, 38));

        jB_Arfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Arfil.png"))); // NOI18N
        jB_Arfil.setAutoscrolls(true);
        jB_Arfil.setBorder(null);
        jB_Arfil.setBorderPainted(false);
        jB_Arfil.setContentAreaFilled(false);
        jB_Arfil.setInheritsPopupMenu(true);
        jB_Arfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ArfilActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Arfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 38, 38));

        jB_Dama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Dama.png"))); // NOI18N
        jB_Dama.setAutoscrolls(true);
        jB_Dama.setBorder(null);
        jB_Dama.setBorderPainted(false);
        jB_Dama.setContentAreaFilled(false);
        jB_Dama.setInheritsPopupMenu(true);
        jB_Dama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DamaActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Dama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 38, 38));

        jB_Torre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Torre.png"))); // NOI18N
        jB_Torre.setAutoscrolls(true);
        jB_Torre.setBorder(null);
        jB_Torre.setBorderPainted(false);
        jB_Torre.setContentAreaFilled(false);
        jB_Torre.setInheritsPopupMenu(true);
        jB_Torre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_TorreActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Torre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 38, 38));

        Titulo2.setFont(new java.awt.Font("Mathematica6", 3, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Escoge una pieza para continuar");
        Titulo2.setToolTipText("");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 70));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Fondop.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 464, 198));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Ganador");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atrasActionPerformed
        this.setVisible(false);
        Menu p=new Menu();
        p.setVisible(true);
    }//GEN-LAST:event_jB_atrasActionPerformed

    private void jB_CaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CaballoActionPerformed
        decision=1;
    }//GEN-LAST:event_jB_CaballoActionPerformed

    private void jB_ArfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ArfilActionPerformed
        decision=2;
    }//GEN-LAST:event_jB_ArfilActionPerformed

    private void jB_DamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DamaActionPerformed
        decision=3;
    }//GEN-LAST:event_jB_DamaActionPerformed

    private void jB_TorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_TorreActionPerformed
        decision=4;
    }//GEN-LAST:event_jB_TorreActionPerformed
    public int getDecision(){
        return decision;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coronar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton jB_Arfil;
    private javax.swing.JButton jB_Caballo;
    private javax.swing.JButton jB_Dama;
    private javax.swing.JButton jB_Torre;
    private javax.swing.JButton jB_atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
