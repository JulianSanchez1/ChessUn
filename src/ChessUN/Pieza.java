package ChessUN;
import java.util.ArrayList;
/*
 * @author Julian Sanchez
 */
public class Pieza {
    public int x;
    public int y;
    final public boolean is_white;
    private final String color;
    public boolean enroque;
    public Pieza(int x, int y, boolean is_white)
    {
        this.is_white = is_white;
        this.x = x;
        this.y = y;
        this.color="";
    } 
    public boolean isWhite()
    {//Color de la ficha
        return is_white;
    }
    public String getColor()
    {//Obtener la dirrecion de la imagen de la ficha 
        return color;
    }
    public void setX(int x)
    {//Cambiar posiciones x de fichas
        this.x = x;
    }
    
    public void setY(int y)
    {//Cambiar posiciones y de fichas 
        this.y = y;
    }
    
    public int getX()
    {//Obtener la posiciones x de fichas
        return x;
    }
    
    public int getY()
    {//Obteter la posiciones y de la fichas
        return y;
    }
    public boolean Ficha_Presente(int destino_x, int destino_y,ArrayList<Pieza> fichaE)
    {
        for (int i = 0; i < fichaE.size(); i++)
            {//Detecta si hay alguna ficha presente en la ubicacion que digamos 
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
        public boolean getEnroque()
    {
        return enroque;
    }
}
