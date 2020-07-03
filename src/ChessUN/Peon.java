/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessUN;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author julia
 */
public class Peon extends Pieza{
    public String color;
    public Peon(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Peon.png";
        }
        else{
            color="/Multimedia/Piezas/PeonN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y,ArrayList<Pieza> fichaE, ArrayList<Pieza> fichaA)
    {   
        
        if(is_white==true){
            if(x==6){
                if(destino_x==4 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
                }
            }
            if(destino_x==(x-1) && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE) ){
                    return true;
            }
            if(destino_x==(x-1) && (y + 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
            }
            if(destino_x==(x-1) && (y - 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
            }
            else{
                return false;
            }
            
        }
        else{
            if(x==1){
                if(destino_x==3 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE)){
                return true;
                }
            }
            if(destino_x==x+1 && y== destino_y && !Ficha_Presente(destino_x,destino_y,fichaE) ){
                return true;
            }
            if(destino_x==x+1 && (y + 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE)){
                return true;
            }
            if(destino_x==x+1 && (y - 1)== destino_y && Ficha_Presente(destino_x,destino_y,fichaE)){
                return true;
            }
            else{
                return false;
            }
        }

    }
    public String getColor()
    {
        return color;
    }
}
