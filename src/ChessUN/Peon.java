package ChessUN;

import java.util.ArrayList;
import javax.swing.JButton;

/*
 * @author Julian Sanchez
 */

public class Peon extends Pieza
{
    public String color;
    public Peon(int x, int y, boolean is_white) 
    {
        super(x, y, is_white);
        if(is_white==true)
        {//Revisa cual es el color de la pieza
            color="/Multimedia/Piezas/Peon.png";
        }
        else
        {
            color="/Multimedia/Piezas/PeonN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y,ArrayList<Pieza> fichaE, ArrayList<Pieza> fichaA)
    {   
        if(is_white==true)
        {//Revisa el corolor de la ficha
            if(x==6)
            {//Si es el primer movimiento permite el movimiento de dos casillas
                if(destino_x==4 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE))
                {
                return true;
                }
            }
            if(destino_x==(x-1) && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE))
            {//Movimiento hacia delante 
                return true;
            }
            if(destino_x==(x-1) && (y + 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
            {//Permite el movimiento hacia el lado derecho si hay alguna ficha enemiga
                return true;
            }
            if(destino_x==(x-1) && (y - 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
            {//Permite el movimiento hacia el lado izquierdo si hay alguna ficha enemiga
                return true;
            }
            else
            {
                return false;
            }
            
        }
        else
        {//Si la ficha es negra
            if(x==1)
            {//Revisa si es el primer movimiento y permite el movimiento de dos casillas
                if(destino_x==3 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE))
                {
                    return true;
                }
            }
            if(destino_x==x+1 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE))
            {//Movimiento hacia delante 
                return true;
            }
            if(destino_x==x+1 && (y + 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
            {//Permite el movimiento hacia los lados si hay alguna ficha enemiga a los lados
                return true;
            }
            if(destino_x==x+1 && (y - 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
            {//Permite el movimiento hacia los lados si hay alguna ficha enemiga a los lados
                return true;
            }
            else
            {
                return false;
            }
        }

    }
    public String getColor()
    {
        return color;
    }
}
