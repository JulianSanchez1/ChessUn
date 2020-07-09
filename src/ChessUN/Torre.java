package ChessUN;

import java.util.ArrayList;

/*
 * @author Julian Sanchez
 */
public class Torre extends Pieza{
    public String color;
    public boolean enroque = true;
    public Torre(int x, int y, boolean is_white){
        super(x, y, is_white);
        if(is_white==true)
        {//Revisa cual es el color de la pieza
            color="/Multimedia/Piezas/Torre.png";
        }
        else
        {
            color="/Multimedia/Piezas/TorreN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y, ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {   
        if(destino_x==x &&  destino_y!=y)
        {
            if(destino_y>y)
            {//Movimiento hacia la derecha
                for(int i = y+1 ; i < 8 ; i++)
                {
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {//Detecta si una ficha de su equipo esta en el lugar de llegada
                        return false; 
                    }
                    if( i==destino_y)
                    {//Si llega al destino y no hay fichas en el camino acepta el movimiento
                        enroque = false;//Si la torre se mueve a cualquier posicion ya no se puede hacer enroque 
                        return true;
                    }
                    if(Ficha_Presente(destino_x,i,fichaE)||Ficha_Presente(destino_x,i,fichaA))
                    {//Detecta si hay fichas en el camino al destino
                        return false;
                    }
                    if(i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                    {//si hay una ficha en el destino y es enemiga puede matarla
                        enroque = false;
                        return true;
                    }
                }
            }
            else{//movimiento hacia la izquierda
                for(int i =y-1 ; i > -1 ; i--)
                {
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {
                        return false; 
                    }
                    if( i==destino_y)
                    {
                        enroque = false;
                        return true;
                    }
                    if( i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                    {
                        enroque = false;
                        return true;
                    }
                    if(Ficha_Presente(destino_x,i,fichaE)||Ficha_Presente(destino_x,i,fichaA))
                    {
                        return false;
                    }
                }               
            }
        }
        if(destino_y==y &&  destino_x!=x)
        {
            if(destino_x>x)
            {//Movimiento hacia abajo
                for(int i = x+1 ; i < 8 ; i++)
                {                 
                    if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaE))
                    {
                        enroque = false;
                        return true;
                    }
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {
                        return false; 
                    }
                    if( i==destino_x)
                    {
                        enroque = false;
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaA)||Ficha_Presente(i,destino_y,fichaE))
                    {
                        return false;
                    }
                }
            }
            else
            {//movimiento hacia arriba
                for(int i =x-1 ; i > -1 ; i--)
                {
                    if( i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA))
                    {                        
                        return false; 
                    }
                    if( i==destino_x)
                    {
                        enroque = false;
                        return true;
                    }
                    if( i==destino_x && Ficha_Presente(destino_x,destino_y,fichaE))
                    {
                        enroque = false;
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaA)||Ficha_Presente(i,destino_y,fichaE))
                    {
                        return false;
                    }   
                } 
            }
        }
        return false;
    }
    public String getColor()
    {
        return color;
    }
    public boolean getEnroque()
    {
        return enroque;
    }
}
