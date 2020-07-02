/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessUN;

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
    public boolean canMove(int destination_x, int destination_y)
    {       
        return true;
    }
    public String getColor()
    {
        return color;
    }
}
