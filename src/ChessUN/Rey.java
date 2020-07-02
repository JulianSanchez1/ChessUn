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
public class Rey extends Pieza{
    public Rey(int x, int y, boolean is_white) {
        super(x, y, is_white);
    }
    public boolean canMove(int destination_x, int destination_y)
    {       
        return true;
    }
}
