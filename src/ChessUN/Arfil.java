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
public class Arfil extends Pieza{
    public String color;
    public Arfil(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Arfil.png";
        }
        else{
            color="/Multimedia/Piezas/ArfilN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y, ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {   
        for(int i = 0 ; i < (8-x) ; i++){
            if(destino_x==x+i && y+i == destino_y && Ficha_Presente(destino_x,destino_y,fichaE)){
                return true;
            }
        }
        return false;
    }
    public String getColor()
    {
        return color;
    }
}
