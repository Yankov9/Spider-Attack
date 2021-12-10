import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;
public class ScreenScore extends World
{
    int puntaje;
    int flag = 0;
    String nombre;
    RecordManager recordManager = new RecordManager(puntaje,nombre);
    public ScreenScore()
    {    
        super(600, 400, 1); 
        addObject(new BackButton(),31,370);
        System.out.println(recordManager.getRecords());
        this.showText(" Puntaje mas alto: " ,130, 130);
    }
  
}
