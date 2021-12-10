import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;


public class Nivel1 extends World
{

    public Vida objLife;
    Hud puntos;
    Hud vidas;
    public Nivel1()
    {    
        super(600, 400, 1); 
        setPaintOrder(Hud.class,Boy.class,Spider.class);
        Spider s1 = new Spider();
        addObject(s1,50,50);
        createBoy(6); 
        objLife = new Vida();
        puntos = new Hud(0,"Score:");
        vidas = new Hud(1,"Vida:");
        addObject(puntos, 150, 85);
        addObject(vidas, 300, 85);

    }

    public void createBoy(int numero){
        for(int i=0; i <numero;i++){
            Boy p = new Boy();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(p,x,y);
        }
    }

    
    public void act(){
        if(Greenfoot.isKeyDown("S"))
        {
            Greenfoot.setWorld(new Menu());
        }

    }
}