/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessUN;

import java.util.ArrayList;

/*
 * @author Julian Sanchez
 */
public class Rey extends Pieza{
    public String color;
    public boolean enroque = true;
    public Rey(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Rey.png";
        }
        else{
            color="/Multimedia/Piezas/ReyN.png";
        }
    }
    public boolean canMove(int destino_x, int destino_y, ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {    
        /*if(Peligros_Rey(destino_x,destino_y,fichaE,fichaA)){
            System.out.println("A");
            return false;
        }//Intento de detectar los peligros Fail*/
        if(destino_x==7 && (destino_y==2 || destino_y==6) && is_white==true && enroque==true){
            return enroque(destino_x,destino_y,fichaA);
        }
        if(destino_x==0 && (destino_y==2 || destino_y==6) && is_white==false && enroque==true){
            return enroque(destino_x,destino_y,fichaA);
        }
        if(destino_x==x+1 && ( (y - 1)== destino_y || (y + 1) == destino_y)){
           enroque = false;
           return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_x==x-1 && ( (y - 1)== destino_y || (y + 1) == destino_y)){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y+1 && ( (x - 1)== destino_x || (x + 1) == destino_x)){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y-1 && ( (x - 1)== destino_x || (x + 1) == destino_x)){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y && x+1== destino_x ){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y && x-1== destino_x ){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y+1 && x== destino_x){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        if(destino_y==y-1 && x== destino_x ){
            enroque = false;
            return Peligros_Rey(destino_x,destino_y,fichaE,fichaA);
        }
        return false;
    }
    public boolean enroque(int destino_x, int destino_y,ArrayList<Pieza> fichaE)
    {
        for (int i = 0; i < fichaE.size(); i++)
        {//Busca la Torres Y revisa si es posible hacer el jaque
            if (fichaE.get(i).getColor()=="/Multimedia/Piezas/Torre.png" || fichaE.get(i).getColor()=="/Multimedia/Piezas/TorreN.png")
            {
                return fichaE.get(i).getEnroque();
            }
        }
        return false;
    }
    public boolean Peligros_Rey(int destino_x, int destino_y,ArrayList<Pieza> fichaE,ArrayList<Pieza> fichaA)
    {//Intento de detectar jaques Funciona excepto peones
        for (int i = 0; i < fichaE.size(); i++)
        {//Busca si alguna ficha Enemiga puede estar en esa posicion
            if(fichaE.get(i).canMove(destino_x,destino_y,fichaA,fichaE)==true){
                return false;
            }  
        }
        return true;      
    }
    public String getColor()
    {
        return color;
    }
}
