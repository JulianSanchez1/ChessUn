
package ChessUN;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TableroCJ extends Tablero{
    public TableroCJ(){
        Piezas_CJ = new ArrayList();
        Piezas_Negras = new ArrayList();
    }
    public void CJ_Ordenar()
    {   //Coloca solo la torre como ficha inicial
        Piezas_CJ.add(new Torre(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    

    } 
    public void CJCaballo()
    {   //Coloca solo el caballo
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);  //Borra la imagen en el tablero de la ficha anterior  
        Piezas_CJ.set(0,new Caballo(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJTorre()
    {   //Coloca solo la torre
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null); //Borra la imagen en el tablero de la ficha anterior
        Piezas_CJ.set(0,new Torre(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJReina()
    {   //Coloca solo la reina
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null); //Borra la imagen en el tablero de la ficha anterior
        Piezas_CJ.set(0,new Reina(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJRey()
    {   //Coloca solo el rey
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null); //Borra la imagen en el tablero de la ficha anterior
        Piezas_CJ.set(0,new Rey(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJPeon()
    {   //Coloca solo el peon
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null); //Borra la imagen en el tablero de la ficha anterior
        Piezas_CJ.set(0,new Peon(6,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJArfil()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null); //Borra la imagen en el tablero de la ficha anterior
        Piezas_CJ.set(0,new Arfil(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void moverCJ(int x,int y){
        //Mueve las fichas sin turnos 
        if(click==0)
        {
            for (int i = 0; i < Piezas_CJ.size(); i++)
            {//Busca si la posicion en donde se oprimio hay alguna ficha 
                int x1 = Piezas_CJ.get(i).getX();
                int y1 = Piezas_CJ.get(i).getY();
                if (x==x1&&y==y1)
                {//Obtiene la posicion de la ficha
                    temp=Piezas_CJ.get(i);
                    num=i;
                    click=1;
                }
            }
        }
        else if(click==1&&Piezas_CJ.get(num).canMove(x,y,Piezas_Negras,Piezas_CJ))
        {//Mira las reglas y permite o niega movimientos
                tableroB[Piezas_CJ.get(num).getX()][Piezas_CJ.get(num).getY()].setIcon(null);//Borra la imagen de la posicion anterior
                Piezas_CJ.get(num).setX(x);
                Piezas_CJ.get(num).setY(y);
                tableroB[Piezas_CJ.get(num).getX()][Piezas_CJ.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(num).getColor())));//Añade la imagen a la nueva posicion
                click=0;
        }
        else{
            click=0;
        }
    }
}

