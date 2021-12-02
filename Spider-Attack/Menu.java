import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Menu extends World
{
    public Menu()
    {    
        super(600, 400, 1); 
        prepararMundo();
    }

    private void prepararMundo(){
        addObject(new Jugar(),310,110);
        addObject(new ScoreButton(),310,210);
        addObject(new Controles(),310,310);
    }
}
