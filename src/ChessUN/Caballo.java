/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessUN;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Caballo extends Pieza{
    public String color;
    public Caballo(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Caballo.png";
        }
        else{
            color="/Multimedia/Piezas/CaballoN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y,ArrayList<Pieza> fichaE, ArrayList<Pieza> fichaA)
    {       
        if(destino_x==x+2 && ( (y - 1)== destino_y || (y + 1) == destino_y)){
           return true;
        }
        if(destino_x==x-2 && ( (y - 1)== destino_y || (y + 1) == destino_y)){
            return true;
        }
        if(destino_y==y+2 && ( (x - 1)== destino_x || (x + 1) == destino_x)){
            return true;
        }
        if(destino_y==y-2 && ( (x - 1)== destino_x || (x + 1) == destino_x)){
            return true;
        }
        return false;
        
    }
    public String getColor()
    {
        return color;
    }
}
