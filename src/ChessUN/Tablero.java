
package ChessUN;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tablero{
    public JButton tableroB[][] = new JButton[8][8];
    public ArrayList<Pieza> Piezas_Blancas;
    public ArrayList<Pieza> Piezas_Negras;
    public Pieza temp = new Pieza(0,0,true);
    public int click =0,num=0;
    public boolean turno = true;
    public void addBotones(int x,int y,JButton boton)
    {
        tableroB[x][y]=boton;
    } 
    public Tablero(){
        Piezas_Blancas = new ArrayList();
        Piezas_Negras = new ArrayList();
    }
    public void OrdenarTablero()
    {   
        Piezas_Blancas.add(new Torre(7,0,true));
        Piezas_Blancas.add(new Caballo(7,1,true));
        Piezas_Blancas.add(new Arfil(7,2,true));
        Piezas_Blancas.add(new Reina(7,3,true));
        Piezas_Blancas.add(new Rey(7,4,true));
        Piezas_Blancas.add(new Arfil(7,5,true));
        Piezas_Blancas.add(new Caballo(7,6,true));
        Piezas_Blancas.add(new Torre(7,7,true));
        Piezas_Blancas.add(new Peon(6,0,true));
        Piezas_Blancas.add(new Peon(6,1,true));
        Piezas_Blancas.add(new Peon(6,2,true));
        Piezas_Blancas.add(new Peon(6,3,true));
        Piezas_Blancas.add(new Peon(6,4,true));
        Piezas_Blancas.add(new Peon(6,5,true));
        Piezas_Blancas.add(new Peon(6,6,true));
        Piezas_Blancas.add(new Peon(6,7,true));

        Piezas_Negras.add(new Torre(0,0,false));
        Piezas_Negras.add(new Caballo(0,1,false));
        Piezas_Negras.add(new Arfil(0,2,false));
        Piezas_Negras.add(new Reina(0,3,false));
        Piezas_Negras.add(new Rey(0,4,false));
        Piezas_Negras.add(new Arfil(0,5,false));
        Piezas_Negras.add(new Caballo(0,6,false));
        Piezas_Negras.add(new Torre(0,7,false));
        Piezas_Negras.add(new Peon(1,0,false));
        Piezas_Negras.add(new Peon(1,1,false));
        Piezas_Negras.add(new Peon(1,2,false));
        Piezas_Negras.add(new Peon(1,3,false));
        Piezas_Negras.add(new Peon(1,4,false));
        Piezas_Negras.add(new Peon(1,5,false));
        Piezas_Negras.add(new Peon(1,6,false));
        Piezas_Negras.add(new Peon(1,7,false));
       
        for (int i = 0; i < Piezas_Blancas.size(); i++)
        {
            tableroB[Piezas_Blancas.get(i).getX()][Piezas_Blancas.get(i).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(i).getColor())));
        }
        
        for (int i = 0; i < Piezas_Negras.size(); i++)
        {
            tableroB[Piezas_Negras.get(i).getX()][Piezas_Negras.get(i).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(i).getColor())));
        }
        
    }
    public void mover(int x,int y){
        if(click==0 && turno==true){
            for (int i = 0; i < Piezas_Blancas.size(); i++)
            {
                int x1 = Piezas_Blancas.get(i).getX();
                int y1 = Piezas_Blancas.get(i).getY();
                if (x==x1&&y==y1){
                    temp=Piezas_Blancas.get(i);
                    num=i;
                    click=1;
                }
            }
        }
        else if(click==1&&turno==true&&Piezas_Blancas.get(num).canMove(x,y,Piezas_Negras,Piezas_Blancas)){
            boolean temp = true;
            for (int i = 0; i < Piezas_Blancas.size(); i++)
            {
                int x1 = Piezas_Blancas.get(i).getX();
                int y1 = Piezas_Blancas.get(i).getY();
                if (x==x1&&y==y1&&num!=i){
                    temp=false;
                    click=0;
                }
            }
            if(temp==true){
                for (int i = 0; i < Piezas_Negras.size(); i++)
                    {
                        int x1 = Piezas_Negras.get(i).getX();
                        int y1 = Piezas_Negras.get(i).getY();
                        if (x==x1&&y==y1){
                            Piezas_Negras.remove(i);
                        }
                    }
                if(Piezas_Blancas.get(num).getColor()=="/Multimedia/Piezas/Rey.png" && (y==2 || y==6))
                {
                    int ubicacion=100;
                    if(y==2)
                    {
                        ubicacion=enroque(7,0,Piezas_Blancas);
                        if(ubicacion!=100)
                        {
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(null);
                            Piezas_Blancas.get(ubicacion).setY(3);
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(ubicacion).getColor())));
                        }
                    }
                    else
                    {
                        ubicacion=enroque(7,7,Piezas_Blancas);
                        if(ubicacion!=100)
                        {
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(null);
                            Piezas_Blancas.get(ubicacion).setY(5);
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(ubicacion).getColor())));
                        }
                    }        
                }
                tableroB[Piezas_Blancas.get(num).getX()][Piezas_Blancas.get(num).getY()].setIcon(null);
                Piezas_Blancas.get(num).setX(x);
                Piezas_Blancas.get(num).setY(y);
                tableroB[Piezas_Blancas.get(num).getX()][Piezas_Blancas.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(num).getColor())));
                click=0;
                turno=false;
            }   
        }
        else if(click==0 && turno==false){
            for (int i = 0; i < Piezas_Negras.size(); i++)
            {
                int x1 = Piezas_Negras.get(i).getX();
                int y1 = Piezas_Negras.get(i).getY();
                if (x==x1&&y==y1){
                    temp=Piezas_Negras.get(i);
                    num=i;
                    click=1;
                }
            }
        }
        else if(click==1&&turno==false&&Piezas_Negras.get(num).canMove(x,y,Piezas_Blancas,Piezas_Negras)){
            boolean temp = true;
            for (int i = 0; i < Piezas_Negras.size(); i++)
            {
                int x1 = Piezas_Negras.get(i).getX();
                int y1 = Piezas_Negras.get(i).getY();
                if (x==x1&&y==y1&&num!=i){
                    temp=false;
                    click=0;
                }
            }
            if(temp==true){
                for (int i = 0; i < Piezas_Blancas.size(); i++)
                    {
                        int x1 = Piezas_Blancas.get(i).getX();
                        int y1 = Piezas_Blancas.get(i).getY();
                        if (x==x1&&y==y1){
                            Piezas_Blancas.remove(i);
                        }
                    }
                if(Piezas_Negras.get(num).getColor()=="/Multimedia/Piezas/ReyN.png" && (y==2 || y==6))
                {
                    int ubicacion=100;
                    if(y==2)
                    {
                        ubicacion=enroque(0,0,Piezas_Negras);
                        if(ubicacion!=100)
                        {
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(null);
                            Piezas_Negras.get(ubicacion).setY(3);
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(ubicacion).getColor())));
                        }
                    }
                    else
                    {
                        ubicacion=enroque(0,7,Piezas_Negras);
                        if(ubicacion!=100)
                        {
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(null);
                            Piezas_Negras.get(ubicacion).setY(5);
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(ubicacion).getColor())));
                        }
                    }              
                }
                tableroB[Piezas_Negras.get(num).getX()][Piezas_Negras.get(num).getY()].setIcon(null);
                Piezas_Negras.get(num).setX(x);
                Piezas_Negras.get(num).setY(y);
                tableroB[Piezas_Negras.get(num).getX()][Piezas_Negras.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(num).getColor())));
                click=0;
                turno=true;
            }   
        }
        else{
            click=0;
        }
    }
    
    public int enroque(int destino_x, int destino_y , ArrayList<Pieza> fichaE){
        for (int i = 0; i < fichaE.size(); i++)
            {
                int x1 = fichaE.get(i).getX();
                int y1 = fichaE.get(i).getY();
                if (fichaE.get(i).getColor()=="/Multimedia/Piezas/Torre.png" || fichaE.get(i).getColor()=="/Multimedia/Piezas/TorreN.png"){
                    if(destino_y==fichaE.get(i).getY())
                    return i;
                }
            }
        return 100;
    }
}
