import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenControles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenControles extends World
{

    /**
     * Constructor for objects of class ScreenControles.
     * 
     */
    public ScreenControles()
    {    
        super(600, 400, 1); 
        addObject(new BackButton(),31,370);
    }
}
