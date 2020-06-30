package ChessUN;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;

public class ComoJugar extends javax.swing.JFrame {

    public ComoJugar() {
        Fondo p = new Fondo(false);
        
        setContentPane(p);
        initComponents();

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        list1 = new java.awt.List();
        jB_atras = new javax.swing.JButton();
        jB_Torre = new javax.swing.JButton();
        jB_Caballo = new javax.swing.JButton();
        jB_Arfil = new javax.swing.JButton();
        jB_Peon = new javax.swing.JButton();
        jB_Dama = new javax.swing.JButton();
        jB_Rey = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jL_Tficha = new javax.swing.JLabel();
        jL_Instrucciones = new javax.swing.JLabel();
        jL_Instrucciones1 = new javax.swing.JLabel();
        jL_Instrucciones2 = new javax.swing.JLabel();
        jL_Instrucciones3 = new javax.swing.JLabel();
        jL_Instrucciones4 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComoJugar");
        setResizable(false);

        jB_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/atras.png"))); // NOI18N
        jB_atras.setBorder(null);
        jB_atras.setBorderPainted(false);
        jB_atras.setContentAreaFilled(false);
        jB_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_atrasActionPerformed(evt);
            }
        });

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

        jB_Peon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Peon.png"))); // NOI18N
        jB_Peon.setAutoscrolls(true);
        jB_Peon.setBorder(null);
        jB_Peon.setBorderPainted(false);
        jB_Peon.setContentAreaFilled(false);
        jB_Peon.setInheritsPopupMenu(true);
        jB_Peon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PeonActionPerformed(evt);
            }
        });

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

        jB_Rey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ComoJugarB/Rey.png"))); // NOI18N
        jB_Rey.setAutoscrolls(true);
        jB_Rey.setBorder(null);
        jB_Rey.setBorderPainted(false);
        jB_Rey.setContentAreaFilled(false);
        jB_Rey.setInheritsPopupMenu(true);
        jB_Rey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ReyActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Mathematica6", 3, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Como Jugar");
        Titulo.setToolTipText("");

        jL_Tficha.setFont(new java.awt.Font("Mathematica6", 3, 36)); // NOI18N
        jL_Tficha.setForeground(new java.awt.Color(255, 255, 255));
        jL_Tficha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Tficha.setText("Torre");
        jL_Tficha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jL_Instrucciones.setFont(new java.awt.Font("Mathematica6", 3, 18)); // NOI18N
        jL_Instrucciones.setForeground(new java.awt.Color(255, 255, 255));
        jL_Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Instrucciones.setText("La torre se desplaza en línea recta");
        jL_Instrucciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jL_Instrucciones1.setFont(new java.awt.Font("Mathematica6", 3, 18)); // NOI18N
        jL_Instrucciones1.setForeground(new java.awt.Color(255, 255, 255));
        jL_Instrucciones1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Instrucciones1.setText("por las filas y columnas, tantas ");
        jL_Instrucciones1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jL_Instrucciones2.setFont(new java.awt.Font("Mathematica6", 3, 18)); // NOI18N
        jL_Instrucciones2.setForeground(new java.awt.Color(255, 255, 255));
        jL_Instrucciones2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Instrucciones2.setText("retroceder o moverse en dirección");
        jL_Instrucciones2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jL_Instrucciones3.setFont(new java.awt.Font("Mathematica6", 3, 18)); // NOI18N
        jL_Instrucciones3.setForeground(new java.awt.Color(255, 255, 255));
        jL_Instrucciones3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Instrucciones3.setText("casillas como quiera. puede avanzar ");
        jL_Instrucciones3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jL_Instrucciones4.setFont(new java.awt.Font("Mathematica6", 3, 18)); // NOI18N
        jL_Instrucciones4.setForeground(new java.awt.Color(255, 255, 255));
        jL_Instrucciones4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL_Instrucciones4.setText("horizontal.");
        jL_Instrucciones4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Instrucciones4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Instrucciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Tficha, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_Torre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Arfil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Peon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Dama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jB_Rey, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_atras))
                    .addComponent(jL_Instrucciones3)
                    .addComponent(jL_Instrucciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Tficha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_Instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Instrucciones1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Instrucciones3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Instrucciones2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Instrucciones4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB_Rey, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Dama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Peon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Arfil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Caballo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Torre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jB_atras, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atrasActionPerformed
        this.setVisible(false);
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jB_atrasActionPerformed

    private void jB_TorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_TorreActionPerformed
        jL_Tficha.setText("Torre");
    }//GEN-LAST:event_jB_TorreActionPerformed

    private void jB_CaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CaballoActionPerformed
        jL_Tficha.setText("Caballo");
    }//GEN-LAST:event_jB_CaballoActionPerformed

    private void jB_ArfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ArfilActionPerformed
        jL_Tficha.setText("Arfil");
    }//GEN-LAST:event_jB_ArfilActionPerformed

    private void jB_PeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PeonActionPerformed
        jL_Tficha.setText("Peon");
    }//GEN-LAST:event_jB_PeonActionPerformed

    private void jB_DamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DamaActionPerformed
        jL_Tficha.setText("Dama");
    }//GEN-LAST:event_jB_DamaActionPerformed

    private void jB_ReyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ReyActionPerformed
        jL_Tficha.setText("Rey");
    }//GEN-LAST:event_jB_ReyActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComoJugar().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jB_Arfil;
    private javax.swing.JButton jB_Caballo;
    private javax.swing.JButton jB_Dama;
    private javax.swing.JButton jB_Peon;
    private javax.swing.JButton jB_Rey;
    private javax.swing.JButton jB_Torre;
    private javax.swing.JButton jB_atras;
    private javax.swing.JLabel jL_Instrucciones;
    private javax.swing.JLabel jL_Instrucciones1;
    private javax.swing.JLabel jL_Instrucciones2;
    private javax.swing.JLabel jL_Instrucciones3;
    private javax.swing.JLabel jL_Instrucciones4;
    private javax.swing.JLabel jL_Tficha;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables

}
