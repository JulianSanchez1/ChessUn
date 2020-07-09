
package ChessUN;

import java.util.ArrayList;

/*
 * @author Julian Sanchez
 */
public class Caballo extends Pieza{
    public String color;
    public Caballo(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true)
        {//Revisa el color de la ficha
            color="/Multimedia/Piezas/Caballo.png";
        }
        else
        {
            color="/Multimedia/Piezas/CaballoN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y,ArrayList<Pieza> fichaE, ArrayList<Pieza> fichaA)
    {       
        if(destino_x==x+2 && ( (y - 1)== destino_y || (y + 1) == destino_y))
        {//Permite el movimiento en L hacia abajo
           return true;
        }
        if(destino_x==x-2 && ( (y - 1)== destino_y || (y + 1) == destino_y))
        {//Permite en movimiento en L hacia arriba
            return true;
        }
        if(destino_y==y+2 && ( (x - 1)== destino_x || (x + 1) == destino_x))
        {//Permite el movimiento en L hacia la derecha
            return true;
        }
        if(destino_y==y-2 && ( (x - 1)== destino_x || (x + 1) == destino_x))
        {//Permite el movimiento en L hacia la izquierda
            return true;
        }
        return false;
        
    }
    public String getColor()
    {
        return color;
    }
}
