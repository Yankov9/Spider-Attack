import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;


public class Guy extends Actor
{
    int puntaje;
    String nombre;
    RecordManager recordManager = new RecordManager(puntaje,nombre);
    public void act() 
    {
        move(4);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }

        }

        Actor Spider =getOneObjectAtOffset(0,0,Spider.class);
        if(Spider!=null){
            Nivel2 nivel2 = (Nivel2)getWorld();
            getWorld().removeObject(Spider);
            nivel2.vidas.decrementar();
            getWorld().addObject(new Spider(),50,300);
            if(nivel2.vidas.obtenerValor()==0){
                String playerName = Greenfoot.ask("Escribe tu nombre"+",");
                puntaje=nivel2.puntos.obtenerValor()*20+60;
                recordManager.save(new Record(playerName, puntaje));
                
                Greenfoot.setWorld(new ScreenGameOver());    
            }  
        }
    }
}   