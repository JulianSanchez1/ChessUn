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
        Fondo p = new Fondo(true);
        setContentPane(p);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChessUN");
        setAutoRequestFocus(false);
        setResizable(false);

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

        jB_ComoJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugar.png"))); // NOI18N
        jB_ComoJugar.setBorder(null);
        jB_ComoJugar.setBorderPainted(false);
        jB_ComoJugar.setContentAreaFilled(false);
        jB_ComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ComoJugarActionPerformed(evt);
            }
        });

        jL_Jugar.setFont(new java.awt.Font("Mathematica6", 3, 36)); // NOI18N
        jL_Jugar.setForeground(new java.awt.Color(255, 255, 255));
        jL_Jugar.setText("Jugar");

        jL_ComoJugar.setFont(new java.awt.Font("Mathematica6", 3, 36)); // NOI18N
        jL_ComoJugar.setForeground(new java.awt.Color(255, 255, 255));
        jL_ComoJugar.setText("Como Jugar");

        Titulo.setFont(new java.awt.Font("Mathematica6", 3, 64)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("ChessUN");
        Titulo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jL_Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jB_Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_ComoJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_ComoJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Jugar)
                    .addComponent(jL_ComoJugar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jB_Jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_ComoJugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

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
                Fondo frame = new Fondo(true);
                frame.setVisible(true);
                } catch (Exception e) {
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
    // End of variables declaration//GEN-END:variables
}
