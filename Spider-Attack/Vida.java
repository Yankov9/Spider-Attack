import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Vida extends Actor
{
    int counter=1;
    public Vida(){
    }

    public void Disminuir()
    {
        counter--;
        if(counter==0)
        {
            Greenfoot.setWorld(new ScreenGameOver());
        }

    }    
}
