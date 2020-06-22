package ChessUN;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class Menu extends javax.swing.JFrame {

    public Menu() {        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_Jugar = new javax.swing.JButton();
        jB_ComoJugar = new javax.swing.JButton();
        jL_Jugar = new javax.swing.JLabel();
        jL_ComoJugar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChessUN");
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_Jugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Jugar.png"))); // NOI18N
        jB_Jugar.setAutoscrolls(true);
        jB_Jugar.setBorder(null);
        jB_Jugar.setBorderPainted(false);
        jB_Jugar.setContentAreaFilled(false);
        jB_Jugar.setInheritsPopupMenu(true);
        jB_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_JugarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 228, 254, -1));

        jB_ComoJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugar.png"))); // NOI18N
        jB_ComoJugar.setBorder(null);
        jB_ComoJugar.setBorderPainted(false);
        jB_ComoJugar.setContentAreaFilled(false);
        jB_ComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ComoJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_ComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 228, 233, -1));

        jL_Jugar.setFont(new java.awt.Font("Mathematica6", 3, 36)); // NOI18N
        jL_Jugar.setForeground(new java.awt.Color(255, 255, 255));
        jL_Jugar.setText("Jugar");
        getContentPane().add(jL_Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 155, 139, -1));

        jL_ComoJugar.setFont(new java.awt.Font("Mathematica6", 3, 36)); // NOI18N
        jL_ComoJugar.setForeground(new java.awt.Color(255, 255, 255));
        jL_ComoJugar.setText("Como Jugar");
        getContentPane().add(jL_ComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 155, 222, -1));

        Titulo.setFont(new java.awt.Font("Mathematica6", 3, 64)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("ChessUN");
        Titulo.setToolTipText("");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 41, 381, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_JugarActionPerformed
        this.setVisible(true);
        Jugar p = new Jugar(this);
        p.setVisible(true);
    }//GEN-LAST:event_jB_JugarActionPerformed

    private void jB_ComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ComoJugarActionPerformed
        this.setVisible(false);
        ComoJugar g=new ComoJugar();
        g.setVisible(true);
        
    }//GEN-LAST:event_jB_ComoJugarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        try {
            new Menu().setVisible(true);
                } catch (Exception e) {
                e.printStackTrace();
                            }
                    }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jB_ComoJugar;
    private javax.swing.JButton jB_Jugar;
    private javax.swing.JLabel jL_ComoJugar;
    private javax.swing.JLabel jL_Jugar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
