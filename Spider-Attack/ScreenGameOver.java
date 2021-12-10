import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScreenGameOver extends World
{
    Record record;
    public ScreenGameOver()
    {    
        super(600, 400, 1); 
        addObject(new BackButton(),31,370);
        
    }
    
}
