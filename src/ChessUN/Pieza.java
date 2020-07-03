package ChessUN;

import java.util.ArrayList;

public class Pieza {
    public int x;
    public int y;
    final public boolean is_white;
    private final String color;
    public Pieza(int x, int y, boolean is_white)
    {
        this.is_white = is_white;
        this.x = x;
        this.y = y;
        this.color="";
    } 
    public boolean isWhite()
    {
        return is_white;
    }
    public String getColor()
    {
        return color;
    }
    public boolean isBlack()
    {
        return !is_white;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    public boolean Ficha_Presente(int destino_x, int destino_y,ArrayList<Pieza> fichaE){
        for (int i = 0; i < fichaE.size(); i++)
            {
                int x1 = fichaE.get(i).getX();
                int y1 = fichaE.get(i).getY();
                if (destino_x==x1&&destino_y==y1){
                    return true;
                }
            }
        return false;
    }
    
    public boolean canMove(int destination_x, int destination_y,ArrayList<Pieza> fichaE , ArrayList<Pieza> fichaA)
    {
        return false;
    }
}
