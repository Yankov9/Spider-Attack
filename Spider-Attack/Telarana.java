import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Telarana extends Actor
{

    private int arregloImagen=1;
    private int velocidadDisparo=6;
    private int position;
    private int vidaMega = 0;

    public Telarana(int direction) 
    {
        position = direction; 
    }  

    public void act(){
        setImage("telarana"+arregloImagen+".png");
        switch(position){
            case 0:
            setLocation(getX(),getY()-velocidadDisparo);
            break;

            case 1:
            setLocation(getX(),getY()+velocidadDisparo);
            break;

            case 2:
            setLocation(getX()+velocidadDisparo, getY());
            break;

            case 3:
            setLocation(getX()-velocidadDisparo, getY());
            break;
        }

        Actor Boy=getOneObjectAtOffset(0,0,Boy.class);
        Spider spider=(Spider)getOneIntersectingObject(Spider.class);
        if(Boy!=null){
            Nivel1 nivel1=(Nivel1)getWorld();
            nivel1.puntos.incrementar();
            getWorld().removeObject(Boy);
        }

        if((getX()>=getWorld().getWidth()-5) || (getX()<=5)){
            getWorld().removeObject(this);
        }
        else{
            if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
                getWorld().removeObject(this);
            }
            else
            if(arregloImagen<16)
                arregloImagen++;
        }

    }
}
