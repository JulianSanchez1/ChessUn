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
        if(destino_x>x && destino_y>y){
            for(int i = x+1, p = y+1; i < 8 && p < 8; i++, p++) 
            {
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaA)){
                    return false; 
                }
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
                }
                if( i==destino_x){
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA)){
                    return false;
                }
            }
        }
        if(destino_x>x && destino_y<y){
            for(int i = x+1, p = y-1; i < 8 && p>-1; i++, p--) 
            {
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA)){
                    return false; 
                }
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
                }
                if( i==destino_x){
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA)){
                    return false;
                }
            }
        }
        if(destino_x<x && destino_y>y){ 
            for(int i = x-1, p = y+1; i>-1 && p<8; i--, p++) {
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaA)){
                    return false; 
                }
                if(i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
                }
                if( i==destino_x){
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA)){
                    return false;
                }
            }
        }
        
        if(destino_x<x && destino_y<y){
            for(int i = x-1, p = y-1; i>-1 && p>-1; i--, p--) 
            {
                
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaA)){                   
                    return false; 
                }
                if(i==destino_x && Ficha_Presente(destino_x,destino_y,fichaE)){
                    return true;
                }
                if( i==destino_x){
                    return true;
                }
                if(Ficha_Presente(i,p,fichaE)||Ficha_Presente(i,p,fichaA)){
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
