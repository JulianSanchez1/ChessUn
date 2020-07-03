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
public class Torre extends Pieza{
    public String color;
    public Torre(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Torre.png";
        }
        else{
            color="/Multimedia/Piezas/TorreN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y, ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {   
        boolean temp=true;
        if(destino_x==x &&  destino_y!=y){
            if(destino_y>y){
                System.out.println(1);
                for(int i = y+1 ; i < 8 ; i++){
                    System.out.println("destino_x: "+destino_x+" i: "+i);
                    if(Ficha_Presente(destino_x,destino_y,fichaE)){
                        return true;
                    }
                    if(Ficha_Presente(destino_x,destino_y,fichaA)){
                        System.out.println("Here");
                        return false; 
                    }
                    if( i==destino_y){
                        return true;
                    }
                    if(Ficha_Presente(destino_x,i,fichaE)||Ficha_Presente(destino_x,i,fichaA)){
                        System.out.println("Here2");
                        return false;
                    }
                }
            }
            else{
                System.out.println(2);
                
                for(int i =y-1 ; i > -1 ; i--){
                    System.out.println("destino_x: "+destino_x+" i: "+i);
                    if(Ficha_Presente(destino_x,destino_y,fichaE)){
                        return true;
                    }
                    if(Ficha_Presente(destino_x,destino_y,fichaA)){
                        System.out.println("Here");
                        return false; 
                    }
                    if( i==destino_y){
                        return true;
                    }
                    if(Ficha_Presente(destino_x,i,fichaE)||Ficha_Presente(destino_x,i,fichaA)){
                        System.out.println("Here2");
                        return false;
                    }
                }               
            }
        }
        if(destino_y==y &&  destino_x!=x){
            if(destino_x>x){
                System.out.println(3);
                for(int i = x ; i < 8 ; i++){
                    
                    if(Ficha_Presente(destino_x,destino_y,fichaE)){
                        return true;
                    }
                    if(Ficha_Presente(destino_x,destino_y,fichaA)){
                        System.out.println("Here");
                        
                        return false; 
                    }
                    if( i==destino_x){
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaE)||Ficha_Presente(i,destino_y,fichaE)){
                        System.out.println("Here2");
                        return false;
                    }
                }
            }
            else{
                System.out.println(4);
                for(int i =x ; i > -1 ; i--){
                    System.out.println("destino_x: "+destino_x+" i: "+i);
                    if( i==destino_x && Ficha_Presente(destino_x,destino_y,fichaE)){
                        return true;
                    }
                    if( i==destino_x &&Ficha_Presente(destino_x,destino_y,fichaA)){
                        System.out.println("Here");
                        
                        return false; 
                    }
                    if( i==destino_x){
                        return true;
                    }
                    if(Ficha_Presente(i,destino_y,fichaE)||Ficha_Presente(i,destino_y,fichaE)){
                        System.out.println("Here2");
                        return false;
                    }
                } 
                return temp;
            }
        }
        System.out.println("Fondo");
        return false;
    }
    public String getColor()
    {
        return color;
    }
}
