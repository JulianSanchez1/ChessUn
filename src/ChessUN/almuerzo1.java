package ChessUN;
public class almuerzo1 extends javax.swing.JFrame {

    public almuerzo1() {
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
        jB_calcular = new javax.swing.JButton();
        jR_Bistecerdo = new javax.swing.JRadioButton();
        jR_Chuletacerdo = new javax.swing.JRadioButton();
        jR_Tocino = new javax.swing.JRadioButton();
        jR_Ternerasada = new javax.swing.JRadioButton();
        jR_Spaguettis = new javax.swing.JRadioButton();
        jR_Salmon = new javax.swing.JRadioButton();
        jR_esparragos = new javax.swing.JRadioButton();
        jR_champiñones = new javax.swing.JRadioButton();
        jR_tomate = new javax.swing.JRadioButton();
        jR_vegetales = new javax.swing.JRadioButton();
        jR_Arroz = new javax.swing.JRadioButton();
        jR_Lentejas = new javax.swing.JRadioButton();
        jR_cerveza = new javax.swing.JRadioButton();
        jR_Vino = new javax.swing.JRadioButton();
        jR_Coca = new javax.swing.JRadioButton();
        jR_Fanta = new javax.swing.JRadioButton();
        jR_Sprite = new javax.swing.JRadioButton();
        jR_jugo = new javax.swing.JRadioButton();
        jT_siono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almuerzos para ganar peso");
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

        jB_calcular.setText("Calcular");
        jB_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_calcularActionPerformed(evt);
            }
        });

        jR_Bistecerdo.setText("Bistec de cerdo");

        jR_Chuletacerdo.setText("Chuleta de cerdo");

        jR_Tocino.setText("Tocino ahumado");

        jR_Ternerasada.setText("Ternera asada");

        jR_Spaguettis.setText("Spaguettis");

        jR_Salmon.setText("Salmón ahumado");

        jR_esparragos.setText("Crema de Espárragos");

        jR_champiñones.setText("Crema de Champiñones");

        jR_tomate.setText("Sopa de Tomate");

        jR_vegetales.setText("Sopa de Vegetales");

        jR_Arroz.setText("Arroz blanco");

        jR_Lentejas.setText("Lentejas");

        jR_cerveza.setText("Cerveza");

        jR_Vino.setText("Vino tinto");

        jR_Coca.setText("Coca-Cola");

        jR_Fanta.setText("Fanta");

        jR_Sprite.setText("Sprite");

        jR_jugo.setText("Jugo");

        jT_siono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jT_siono.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 412, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jR_Chuletacerdo)
                            .addComponent(jR_Bistecerdo)
                            .addComponent(jR_Tocino)
                            .addComponent(jR_Ternerasada)
                            .addComponent(jR_Spaguettis)
                            .addComponent(jR_Salmon))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jR_champiñones)
                                .addComponent(jR_Arroz)
                                .addComponent(jB_calcular)
                                .addComponent(jR_esparragos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jR_Lentejas)
                                    .addComponent(jR_tomate)
                                    .addComponent(jR_vegetales))
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jR_cerveza)
                            .addComponent(jR_Vino)
                            .addComponent(jR_Coca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jR_Sprite)
                            .addComponent(jR_Fanta)
                            .addComponent(jR_jugo))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jT_siono)
                .addGap(32, 32, 32))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_calcular)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Bistecerdo)
                    .addComponent(jR_esparragos)
                    .addComponent(jR_cerveza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Chuletacerdo)
                    .addComponent(jR_champiñones)
                    .addComponent(jR_Vino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Tocino)
                    .addComponent(jR_tomate)
                    .addComponent(jR_Coca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Ternerasada)
                    .addComponent(jR_vegetales)
                    .addComponent(jR_Fanta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Spaguettis)
                    .addComponent(jR_Arroz)
                    .addComponent(jR_Sprite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Salmon)
                    .addComponent(jR_Lentejas)
                    .addComponent(jR_jugo))
                .addGap(18, 18, 18)
                .addComponent(jT_siono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jB_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_calcularActionPerformed
        try{
            int cal=0;
            if(jR_Bistecerdo.isSelected()){
                cal=cal+460;
            }
            if(jR_Chuletacerdo.isSelected()){
                cal=cal+436;
            }
            if(jR_Tocino.isSelected()){
                cal=cal+364;
            }
            if(jR_Ternerasada.isSelected()){
                cal=cal+331;
            }
            if(jR_Spaguettis.isSelected()){
                cal=cal+333;
            }
            if(jR_Salmon.isSelected()){
                cal=cal+304;
            }
            if(jR_esparragos.isSelected()){
                cal=cal+259;
            }
            if(jR_champiñones.isSelected()){
                cal=cal+316;
            }
            if(jR_tomate.isSelected()){
                cal=cal+108;
            }
            if(jR_vegetales.isSelected()){
                cal=cal+102;
            }
            if(jR_Arroz.isSelected()){
                cal=cal+260;
            }
            if(jR_Lentejas.isSelected()){
                cal=cal+390;
            }
            if(jR_cerveza.isSelected()){
                cal=cal+101;
            }
            if(jR_Vino.isSelected()){
                cal=cal+72;
            }
            if(jR_Coca.isSelected()){
                cal=cal+137;
            }
            if(jR_Fanta.isSelected()){
                cal=cal+188;
            }
            if(jR_Sprite.isSelected()){
                cal=cal+116;
            }
            if(jR_jugo.isSelected()){
                cal=cal+74;
            }
            if(1060<=cal&&cal<=1560)
            {
                jT_siono.setText("Esta selección de comida es óptima para su dieta   Calorias consumidas:"+ cal);
            }
            else
            {jT_siono.setText("Esta selección de comida NO es óptima para su dieta");}
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jB_calcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new almuerzo1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jR_Arroz;
    private javax.swing.JRadioButton jR_Bistecerdo;
    private javax.swing.JRadioButton jR_Chuletacerdo;
    private javax.swing.JRadioButton jR_Coca;
    private javax.swing.JRadioButton jR_Fanta;
    private javax.swing.JRadioButton jR_Lentejas;
    private javax.swing.JRadioButton jR_Salmon;
    private javax.swing.JRadioButton jR_Spaguettis;
    private javax.swing.JRadioButton jR_Sprite;
    private javax.swing.JRadioButton jR_Ternerasada;
    private javax.swing.JRadioButton jR_Tocino;
    private javax.swing.JRadioButton jR_Vino;
    private javax.swing.JRadioButton jR_cerveza;
    private javax.swing.JRadioButton jR_champiñones;
    private javax.swing.JRadioButton jR_esparragos;
    private javax.swing.JRadioButton jR_jugo;
    private javax.swing.JRadioButton jR_tomate;
    private javax.swing.JRadioButton jR_vegetales;
    private javax.swing.JTextField jT_siono;
    // End of variables declaration//GEN-END:variables
}
