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
public class Reina extends Pieza{
    public String color;
    public Reina(int x, int y, boolean is_white) {
        super(x, y, is_white);
        if(is_white==true){
            color="/Multimedia/Piezas/Dama.png";
        }
        else{
            color="/Multimedia/Piezas/DamaN.png";
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
