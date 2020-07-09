
package ChessUN;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/*
 * @author Julian Sanchez
 */
public class Tablero{
    public JButton tableroB[][] = new JButton[8][8];
    public ArrayList<Pieza> Piezas_Blancas;
    public ArrayList<Pieza> Piezas_Negras;
    public ArrayList<Pieza> Piezas_CJ;
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
        Piezas_CJ = new ArrayList();
    }
    public void OrdenarTablero()
    {   //Añade las piezas al tablero y coloca las imagenes en los botones
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
        {//Coloca las piezas blancas en el tablero
            tableroB[Piezas_Blancas.get(i).getX()][Piezas_Blancas.get(i).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(i).getColor())));
        }
        for (int i = 0; i < Piezas_Negras.size(); i++)
        {//Coloca las piezas negras en el tablero
            tableroB[Piezas_Negras.get(i).getX()][Piezas_Negras.get(i).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(i).getColor())));
        }
    }
    public void mover(int x,int y){
        if(click==0 && turno==true)
        {//Revisa si es el´1 clic y si el turno es de las blancas
            for (int i = 0; i < Piezas_Blancas.size(); i++)
            {//Busca si pulzamos alguna ficha blanca
                int x1 = Piezas_Blancas.get(i).getX();
                int y1 = Piezas_Blancas.get(i).getY();
                if (x==x1&&y==y1)
                {//Obtiene la posicion de una ficha blanca si la pulsamos
                    temp=Piezas_Blancas.get(i);
                    num=i;
                    click=1;//cambiamos click a uno para hacer el movimiento
                }
            }
        }
        else if(click==1&&turno==true&&Piezas_Blancas.get(num).canMove(x,y,Piezas_Negras,Piezas_Blancas))
        {//Revisa si click es uno, si el turno es de las blancas y si el movimiento es permitido
            boolean temp = true;
            for (int i = 0; i < Piezas_Blancas.size(); i++)
            {//Revisa si a donde queremos llevar la ficha hay algun compañero
                int x1 = Piezas_Blancas.get(i).getX();
                int y1 = Piezas_Blancas.get(i).getY();
                if (x==x1&&y==y1&&num!=i)
                {
                    temp=false;
                    click=0;
                }
            }
            if(temp==true)
            {//Si no hay ninguna ficha ejecuta
                for (int i = 0; i < Piezas_Negras.size(); i++)
                    {//Revisa si en la posicion hay alguna ficha enemiga y la elimina
                        int x1 = Piezas_Negras.get(i).getX();
                        int y1 = Piezas_Negras.get(i).getY();
                        if (x==x1&&y==y1)
                        {//Elimina la ficha enemiga
                            Piezas_Negras.remove(i);
                        }
                    }
                if(Piezas_Blancas.get(num).getColor()=="/Multimedia/Piezas/Rey.png" && (y==2 || y==6))
                {//Revisa si el movimiento es un enroque 
                    int ubicacion=100;
                    if(y==2)
                    {//ejecuta si el enroque es largo
                        ubicacion=enroque(7,0,Piezas_Blancas);//Busca la ubicacion de la torre en piezas_blancas
                        if(ubicacion!=100)
                        {//quita la imagen de la torre y la ubica en su nueva posicion
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(null);
                            Piezas_Blancas.get(ubicacion).setY(3);
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(ubicacion).getColor())));
                        }
                    }
                    else
                    {//Ejecuta si el enroque es corto
                        ubicacion=enroque(7,7,Piezas_Blancas);//Busca la ubicacion de la torre en piezas_blancas
                        if(ubicacion!=100)
                        {//quita la imagen de la torre y la ubica en su nueva posicion
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(null);
                            Piezas_Blancas.get(ubicacion).setY(5);
                            tableroB[Piezas_Blancas.get(ubicacion).getX()][Piezas_Blancas.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(ubicacion).getColor())));
                        }
                    }        
                }
                tableroB[Piezas_Blancas.get(num).getX()][Piezas_Blancas.get(num).getY()].setIcon(null);//quita la imagen de la posicion inical
                Piezas_Blancas.get(num).setX(x);
                Piezas_Blancas.get(num).setY(y);
                tableroB[Piezas_Blancas.get(num).getX()][Piezas_Blancas.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Blancas.get(num).getColor())));
                //Coloca la imagen en la nueva posicion
                click=0;
                turno=false;//cambia de turno
            }   
        }
        else if(click==0 && turno==false)
        {//Si es el primer click y es turno de las negras ejecuta 
            for (int i = 0; i < Piezas_Negras.size(); i++)
            {//Busca Si se pulso alguna pieza negra
                int x1 = Piezas_Negras.get(i).getX();
                int y1 = Piezas_Negras.get(i).getY();
                if (x==x1&&y==y1)
                {//Obtiene la informacion de la pieza
                    temp=Piezas_Negras.get(i);
                    num=i;
                    click=1;
                }
            }
        }
        else if(click==1&&turno==false&&Piezas_Negras.get(num).canMove(x,y,Piezas_Blancas,Piezas_Negras))
        {//Revisa si click es uno, si el turno es de las negras y si el movimiento es permitido
            boolean temp = true;
            for (int i = 0; i < Piezas_Negras.size(); i++)
            {//Busca si hay alguna pieza de su equipo en la posicion 
                int x1 = Piezas_Negras.get(i).getX();
                int y1 = Piezas_Negras.get(i).getY();
                if (x==x1&&y==y1&&num!=i)
                {
                    temp=false;
                    click=0;
                }
            }
            if(temp==true){
                for (int i = 0; i < Piezas_Blancas.size(); i++)
                    {//Revisa si en el destino hay alguna pieza enemiga en la elimina 
                        int x1 = Piezas_Blancas.get(i).getX();
                        int y1 = Piezas_Blancas.get(i).getY();
                        if (x==x1&&y==y1)
                        {//Elimina la pieza enemiga
                            Piezas_Blancas.remove(i);
                        }
                    }
                if(Piezas_Negras.get(num).getColor()=="/Multimedia/Piezas/PeonN.png" && x==7)
                {//Intento de coronar Fail
                    Coronar coro=new Coronar();
                    coro.setVisible(true);
                    System.out.println(coro.getDecision());
                    
                }
                if(Piezas_Negras.get(num).getColor()=="/Multimedia/Piezas/ReyN.png" && (y==2 || y==6))
                {//Revisa si el movimiento es un enroque
                    int ubicacion=100;
                    if(y==2)
                    {//Revisa si es un enroque largo
                        ubicacion=enroque(7,0,Piezas_Negras);//Busca la posicion en piezas negras de la torre
                        if(ubicacion!=100)
                        {//Borra la imagen de la torre en la posicion inicial y la mueve a la posicion final
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(null);
                            Piezas_Negras.get(ubicacion).setY(3);
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(ubicacion).getColor())));
                        }
                    }
                    else
                    {//revisa si es un enroque corto
                        ubicacion=enroque(0,7,Piezas_Negras);//Busca la posicion en piezas negras de la torre
                        if(ubicacion!=100)
                        {//Borra la imagen de la torre en la posicion inicial y la mueve a la posicion final
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(null);
                            Piezas_Negras.get(ubicacion).setY(5);
                            tableroB[Piezas_Negras.get(ubicacion).getX()][Piezas_Negras.get(ubicacion).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(ubicacion).getColor())));
                        }
                    }           
                }
                tableroB[Piezas_Negras.get(num).getX()][Piezas_Negras.get(num).getY()].setIcon(null);//quita la imagen de la posicion inicial
                Piezas_Negras.get(num).setX(x);
                Piezas_Negras.get(num).setY(y);//Coloca las nuevas posiciones 
                tableroB[Piezas_Negras.get(num).getX()][Piezas_Negras.get(num).getY()].setIcon(new ImageIcon(getClass().getResource(Piezas_Negras.get(num).getColor())));//Coloca la imagen en la nueva posicion
                click=0;
                turno=true;//cambia de turno
            }   
        }
        else{
            click=0;
        }
    }
    
    public int enroque(int destino_x, int destino_y , ArrayList<Pieza> fichaE){
        for (int i = 0; i < fichaE.size(); i++)
            {//busca si hay una torre en la posicion que colocamos
                int x1 = fichaE.get(i).getX();
                int y1 = fichaE.get(i).getY();
                if (fichaE.get(i).getColor()=="/Multimedia/Piezas/Torre.png" || fichaE.get(i).getColor()=="/Multimedia/Piezas/TorreN.png"){
                    if(destino_y==fichaE.get(i).getY())
                    return i;
                }
            }
        return 100;
    }
    public boolean getTurno(){
        return turno;
    }
}
