
package ChessUN;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tablero{
    public JButton tableroB[][] = new JButton[8][8];
    public ArrayList<Pieza> Piezas_Blancas;
    public ArrayList<Pieza> Piezas_Negras;

    public void addBotones(int x,int y,JButton boton)
    {
        tableroB[x][y]=boton;
    } 
    public Tablero(){
        Piezas_Blancas.add(new Rey(3,0,true));
    }
    public void OrdenarTablero()
    {       
        //System.out.println(Piezas_Blancas.get(0).getX());
    }
}
