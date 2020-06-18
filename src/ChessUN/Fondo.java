package ChessUN;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Fondo extends javax.swing.JPanel {
    boolean T;
    public Fondo(boolean t) {
        initComponents();
        T=t;
    }

    @Override
    public void paintComponent  (Graphics g){
    Dimension tamanio = getSize();
    
    if (T==true){
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Multimedia/Fondo.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
    }
    else{
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Multimedia/FondoTablero.png"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
    }
    super.paintComponent(g);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
