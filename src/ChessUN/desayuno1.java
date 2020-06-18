package ChessUN;
public class desayuno1 extends javax.swing.JFrame {
public desayuno1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jB_atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jB_Calcular = new javax.swing.JButton();
        jR_huevos = new javax.swing.JRadioButton();
        jR_Sándwich = new javax.swing.JRadioButton();
        jR_queso = new javax.swing.JRadioButton();
        jR_pan = new javax.swing.JRadioButton();
        jR_Salchicha = new javax.swing.JRadioButton();
        jR_arepa = new javax.swing.JRadioButton();
        jR_cafe = new javax.swing.JRadioButton();
        jR_jugo = new javax.swing.JRadioButton();
        jR_chocolate = new javax.swing.JRadioButton();
        jR_leche = new javax.swing.JRadioButton();
        jR_aromatica = new javax.swing.JRadioButton();
        jR_yogurt = new javax.swing.JRadioButton();
        jT_siono = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desayunos para ganar peso");
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

        jLabel1.setText("Estos son algunos de los alimentos que usted deberá comer en estos días");

        jLabel3.setText("para Lograr aumentar su peso corporal, seleccione los alimentos que ");

        jLabel5.setText("desea consumir, tenga en cuenta que existe un límite de calorías ");

        jLabel7.setText("necesarias para cumplir su meta.");

        jB_Calcular.setText("Calcular");
        jB_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CalcularActionPerformed(evt);
            }
        });

        jR_huevos.setText("Huevos fritos");

        jR_Sándwich.setText("Sándwich");

        jR_queso.setText("Queso");
        jR_queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_quesoActionPerformed(evt);
            }
        });

        jR_pan.setText("Pan");

        jR_Salchicha.setText("Salchicha");

        jR_arepa.setText("Arepa");
        jR_arepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_arepaActionPerformed(evt);
            }
        });

        jR_cafe.setText("Cafe");

        jR_jugo.setText("Jugo");

        jR_chocolate.setText("Chocolate");

        jR_leche.setText("Leche");

        jR_aromatica.setText("Aromatica");

        jR_yogurt.setText("Yogurt");

        jT_siono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jT_siono.setEnabled(false);
        jT_siono.setSelectionColor(new java.awt.Color(0, 0, 0));
        jT_siono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_sionoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jB_atras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jR_Salchicha)
                                    .addComponent(jR_arepa)
                                    .addComponent(jR_queso)
                                    .addComponent(jR_Sándwich)
                                    .addComponent(jR_huevos)
                                    .addComponent(jR_pan))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jR_leche)
                                    .addComponent(jR_cafe)
                                    .addComponent(jR_jugo)
                                    .addComponent(jR_chocolate)
                                    .addComponent(jR_aromatica)
                                    .addComponent(jR_yogurt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jB_Calcular)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jT_siono, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jB_Calcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_huevos)
                    .addComponent(jR_cafe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Sándwich)
                    .addComponent(jR_jugo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_queso)
                    .addComponent(jR_chocolate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_pan)
                    .addComponent(jR_leche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Salchicha)
                    .addComponent(jR_aromatica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_arepa)
                    .addComponent(jR_yogurt))
                .addGap(18, 18, 18)
                .addComponent(jT_siono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_atras))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atrasActionPerformed
       this.setVisible(false);
       ComoJugar g=new ComoJugar();
       g.setVisible(true);
    }//GEN-LAST:event_jB_atrasActionPerformed

    private void jB_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CalcularActionPerformed
        try{
            int cal=0;
            if(jR_huevos.isSelected()){
                cal=cal+108;
            }
            if(jR_Sándwich.isSelected()){
                cal=cal+350;
            }
            if(jR_queso.isSelected()){
                cal=cal+152;
            }
            if(jR_pan.isSelected()){
                cal=cal+90;
            }
            if(jR_Salchicha.isSelected()){
                cal=cal+250;
            }
            if(jR_arepa.isSelected()){
                cal=cal+350;
            }
            if(jR_cafe.isSelected()){
                cal=cal+30;
            }if(jR_jugo.isSelected()){
                cal=cal+74;
            }
            if(jR_chocolate.isSelected()){
                cal=cal+185;
            }
            if(jR_leche.isSelected()){
                cal=cal+124;
            }
            if(jR_aromatica.isSelected()){
                cal=cal+250;
            }
            if(jR_yogurt.isSelected()){
                cal=cal+80;
            }
            if(700<=cal&&cal<=960)
            {
                jT_siono.setText("Esta selección de comida es óptima para su dieta   Calorias consumidas:"+ cal);
            }
            else
            {jT_siono.setText("Esta selección de comida NO es óptima para su dieta");}
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jB_CalcularActionPerformed

    private void jR_quesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_quesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_quesoActionPerformed

    private void jR_arepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_arepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_arepaActionPerformed

    private void jT_sionoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_sionoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_sionoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desayuno1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jB_Calcular;
    private javax.swing.JButton jB_atras;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jR_Salchicha;
    private javax.swing.JRadioButton jR_Sándwich;
    private javax.swing.JRadioButton jR_arepa;
    private javax.swing.JRadioButton jR_aromatica;
    private javax.swing.JRadioButton jR_cafe;
    private javax.swing.JRadioButton jR_chocolate;
    private javax.swing.JRadioButton jR_huevos;
    private javax.swing.JRadioButton jR_jugo;
    private javax.swing.JRadioButton jR_leche;
    private javax.swing.JRadioButton jR_pan;
    private javax.swing.JRadioButton jR_queso;
    private javax.swing.JRadioButton jR_yogurt;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField jT_siono;
    // End of variables declaration//GEN-END:variables
}
