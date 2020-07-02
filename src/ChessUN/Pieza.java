package ChessUN;

public class Pieza {
    private int x;
    private int y;
    final private boolean is_white;
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
    
    public boolean canMove(int destination_x, int destination_y)
    {
        return false;
    }
}
