
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
    {   
        Piezas_CJ.add(new Torre(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    

    } 
    public void CJCaballo()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);    
        Piezas_CJ.set(0,new Caballo(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJTorre()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);
        Piezas_CJ.set(0,new Torre(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJReina()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);
        Piezas_CJ.set(0,new Reina(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJRey()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);
        Piezas_CJ.set(0,new Rey(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJPeon()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);
        Piezas_CJ.set(0,new Peon(6,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void CJArfil()
    {   
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(null);
        Piezas_CJ.set(0,new Arfil(4,2,true));
        tableroB[Piezas_CJ.get(0).getX()][Piezas_CJ.get(0).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(0).getColor())));    
    }
    public void moverCJ(int x,int y){
        
        if(click==0){
            for (int i = 0; i < Piezas_CJ.size(); i++)
            {
                int x1 = Piezas_CJ.get(i).getX();
                int y1 = Piezas_CJ.get(i).getY();
                if (x==x1&&y==y1){
                    temp=Piezas_CJ.get(i);
                    num=i;
                    click=1;
                }
            }
        }
        else if(click==1&&Piezas_CJ.get(num).canMove(x,y,Piezas_Negras,Piezas_CJ)){
                tableroB[Piezas_CJ.get(num).getX()][Piezas_CJ.get(num).getY()].setIcon(null);
                Piezas_CJ.get(num).setX(x);
                Piezas_CJ.get(num).setY(y);
                tableroB[Piezas_CJ.get(num).getX()][Piezas_CJ.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_CJ.get(num).getColor())));
                click=0;
                turno=false;
        }
        else{
            click=0;
        }
    }
}

