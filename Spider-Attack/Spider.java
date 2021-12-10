import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spider extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    private int direccionDisparo=2;
    private boolean telarana=false;

    public void Spider(){
    }

    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setDireccion(UP);
            direccionDisparo=0;
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setDireccion(DOWN);
            direccionDisparo=1;
        }

        if(Greenfoot.isKeyDown("left"))
        {
            setDireccion(LEFT);
            direccionDisparo=3;
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setDireccion(RIGHT);
            direccionDisparo=2;
        }
        setShot(direccionDisparo);
    }   

    public void setShot(int direction){
        if(telarana && Greenfoot.isKeyDown("X"))
        {
            Telarana s1 = new Telarana(direction);
            getWorld().addObject(s1,getX(),getY());
            telarana=false;
        }
        if(!telarana && !Greenfoot.isKeyDown("X"))
        {
            telarana = true;   
        }
    }

    public void setDireccion(int direccion)
    {
        int i= 5;
        switch(direccion){
            case UP:
            setRotation(0);
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(),getY()-i);
            }
            else{
                setLocation(getX(),getY()-i);
            }
            break;
            case DOWN:
            setRotation(180);
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX(),getY()+i);
            }else{
                setLocation(getX(), getY()+i);
            }
            break;
            case LEFT:
            setRotation(270);
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX()+i,getY());
            }else{
                setLocation(getX()-i,getY());
            }
            break;
            case RIGHT:
            setRotation(90);
            if(Greenfoot.isKeyDown("space")){
                setLocation(getX()+i, getY());
            }
            else
            {
                setLocation(getX()+i,getY());
            }
            break;
        }

    }
}
