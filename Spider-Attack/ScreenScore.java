import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScreenScore extends World
{
    RecordManager recordManager;
    public ScreenScore()
    {    
        super(600, 400, 1); 
        recordManager.getRecords();
    }
}
