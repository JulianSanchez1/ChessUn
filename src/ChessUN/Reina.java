/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessUN;

import java.util.ArrayList;

/**
 *
 * @author Julian Sanchez
 */
public class Reina extends Pieza{
    public String color;
    public Reina(int x, int y, boolean is_white){
        super(x, y, is_white);
        if(is_white==true)
        {
            color="/Multimedia/Piezas/Dama.png";
        }
        else
        {
            color="/Multimedia/Piezas/DamaN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y, ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {   
        if(destino_x==x &&  destino_y!=y)
        {
            if(destino_y>y)
            {//Momiento hacia la derecha Linea Recta
                for(int i = y+1 ; i < 8 ; i++)
                {
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {//Detecta Si hay una ficha de su equipo en la posicion de llegada
                        return false; 
                    }
                    if( i==destino_y)
                    {//Si llega al destino y no encuentra a nadie el movimiento es validos
                        return true;
                    }
                    if(Ficha_Presente(destino_x,i,fichaE)||Ficha_Presente(destino_x,i,fichaA))
                    {//Detecta si hay alguna ficha en el camino hasta el punto de destino
                        return false;
                    }
                    if(i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                    {//Si en el punto de destino hay alguna ficha enemiga la mata
                        return true;
                    }
                }
            }
            else
            {//Movimiento Hacia la Izquierda En Linea Recta
                for(int i =y-1 ; i > -1 ; i--)
                {               
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {
                        return false; 
                    }
                    if( i==destino_y)
                    {
                        return true;
                    }
                    if( i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                    {
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
            {//Movimiento Hacia Abajo en Linea Recta
                for(int i = x+1 ; i < 8 ; i++)
                {                 
                    if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaE))
                    {
                        return true;
                    }
                    if(Ficha_Presente(destino_x,destino_y,fichaA))
                    {
                        return false; 
                    }
                    if( i==destino_x)
                    {
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaA)||Ficha_Presente(i,destino_y,fichaE))
                    {
                        return false;
                    }
                }
            }
            else
            {//Movimiento Hacia Arriba en Linea Recta
                for(int i =x-1 ; i > -1 ; i--)
                {
                    if( i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA))
                    {                        
                        return false; 
                    }
                    if( i==destino_x)
                    {
                        return true;
                    }
                    if( i==destino_x && Ficha_Presente(destino_x,destino_y,fichaE))
                    {
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaA)||Ficha_Presente(i,destino_y,fichaE))
                    {
                        return false;
                    }  
                } 
            }
        }
        if(destino_x>x && destino_y>y)
        {//Movimiento hacia la esquina inferior derecha
            for(int i = x+1, p = y+1; i < 8 && p < 8; i++, p++) 
            {
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaA))
                {//Detecta Si en la posicion de llegada hay alguna ficha de su equipo
                    return false; 
                }
                if(i==destino_x && i==destino_y&&Ficha_Presente(destino_x,destino_y,fichaE))
                {//Detecta si en el destino hay alguna ficha enemiga 
                    return true;
                }
                if( i==destino_x && p==destino_y)
                {//Si no hay ninguna ficha en el camino el movimiento es valido
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA))
                {//Detecta si hay alguna ficha en el camino y si lo hay niega el movimiento
                    return false;
                }
            }
        }
        if(destino_x>x && destino_y<y)
        {//Movimiento hacia la esquina inferior izquierda
            for(int i = x+1, p = y-1; i < 8 && p>-1; i++, p--) 
            {
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA))
                {
                    return false; 
                }
                if(i==destino_x && i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                {
                    return true;
                }
                if(i==destino_x && p==destino_y)
                {
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA))
                {
                    return false;
                }
            }
        }
        if(destino_x<x && destino_y>y)
        { //Movimiento hacia la esquina superior derecha
            for(int i = x-1, p = y+1; i>-1 && p<8; i--, p++) 
            {
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaA))
                {
                    return false; 
                }
                if(i==destino_x  && p==destino_y &&Ficha_Presente(destino_x,destino_y,fichaE))
                {
                    return true;
                }
                if( i==destino_x && p==destino_y)
                {
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA))
                {
                    return false;
                }
            }
        }
        
        if(destino_x<x && destino_y<y)
        {//Movimiento hacia la esquina Superior Izquierda
            for(int i = x-1, p = y-1; i>-1 && p>-1; i--, p--) 
            {
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA))
                {                   
                    return false; 
                }
                if(i==destino_x && i==destino_y && Ficha_Presente(destino_x,destino_y,fichaE))
                {
                    return true;
                }
                if( i==destino_x && p==destino_y)
                {
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA))
                {
                    return false;
                }
            }
        }      
        return false;
    }
    public String getColor()
    {
        return color;
    }
}
