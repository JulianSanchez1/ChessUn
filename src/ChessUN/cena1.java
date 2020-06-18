package ChessUN;

public class cena1 extends javax.swing.JFrame {
public cena1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jR_pizza = new javax.swing.JRadioButton();
        jR_pollo = new javax.swing.JRadioButton();
        jR_fruta = new javax.swing.JRadioButton();
        jR_arroz = new javax.swing.JRadioButton();
        jR_pan = new javax.swing.JRadioButton();
        jR_cafe = new javax.swing.JRadioButton();
        jR_coca = new javax.swing.JRadioButton();
        jR_capuchino = new javax.swing.JRadioButton();
        jT_siono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cenas para ganar peso");
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

        jLabel7.setText("necesarias para cumplir su meta.");

        jLabel5.setText("desea consumir, tenga en cuenta que existe un límite de calorías ");

        jLabel3.setText("para Lograr aumentar su peso corporal, seleccione los alimentos que ");

        jLabel1.setText("Estos son algunos de los alimentos que usted deberá comer en estos días");

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jR_pizza.setText("Pizza");

        jR_pollo.setText("Pollo");

        jR_fruta.setText("Fruta");

        jR_arroz.setText("Arroz");

        jR_pan.setText("Pan");

        jR_cafe.setText("Cafe");

        jR_coca.setText("Coca-cola");

        jR_capuchino.setText("Capuchino");

        jT_siono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jT_siono.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jR_pizza)
                    .addComponent(jR_pollo)
                    .addComponent(jR_fruta)
                    .addComponent(jR_arroz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jR_pan)
                    .addComponent(jR_cafe)
                    .addComponent(jR_coca)
                    .addComponent(jR_capuchino))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jT_siono)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_pizza)
                    .addComponent(jR_pan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_pollo)
                    .addComponent(jR_cafe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_fruta)
                    .addComponent(jR_coca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_arroz)
                    .addComponent(jR_capuchino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jT_siono, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       ComoJugar g=new ComoJugar();
       g.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            int cal=0;
            if(jR_pizza.isSelected()){
                cal=cal+171;
            }
            if(jR_pollo.isSelected()){
                cal=cal+180;
            }
            if(jR_fruta.isSelected()){
                cal=cal+90;
            }
            if(jR_arroz.isSelected()){
                cal=cal+192;
            }
            if(jR_pan.isSelected()){
                cal=cal+60;
            }
            if(jR_cafe.isSelected()){
                cal=cal+70;
            }
            if(jR_coca.isSelected()){
                cal=cal+100;
            }
            if(jR_capuchino.isSelected()){
                cal=cal+110;
            }
            if(160<=cal&&cal<=400)
            {
                jT_siono.setText("Esta selección de comida es óptima para su dieta   Calorias consumidas:"+ cal);
            }
            else
            {jT_siono.setText("Esta selección de comida NO es óptima para su dieta");}
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cena1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jR_arroz;
    private javax.swing.JRadioButton jR_cafe;
    private javax.swing.JRadioButton jR_capuchino;
    private javax.swing.JRadioButton jR_coca;
    private javax.swing.JRadioButton jR_fruta;
    private javax.swing.JRadioButton jR_pan;
    private javax.swing.JRadioButton jR_pizza;
    private javax.swing.JRadioButton jR_pollo;
    private javax.swing.JTextField jT_siono;
    // End of variables declaration//GEN-END:variables
}
