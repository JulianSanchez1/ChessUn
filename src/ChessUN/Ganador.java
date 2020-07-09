package ChessUN;

import javax.swing.JFrame;

public class Ganador extends javax.swing.JFrame {
    
    public JFrame padre;

    public Ganador(JFrame padre){
        this.padre = padre;
        super.setIconImage(padre.getIconImage());
        initComponents();
    }
    public Ganador(boolean ganador) {
        initComponents();
        if(ganador==true){
            Titulo1.setText("Ganan Blancas");
        }
        else{
            Titulo1.setText("Ganan Negras");
        }     
    }

    private Ganador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jB_atras = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ganador");
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
        Titulo1.setText(" ");
        Titulo1.setToolTipText("");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton jB_atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
