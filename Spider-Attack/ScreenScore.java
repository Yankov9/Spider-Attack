import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;
public class ScreenScore extends World
{
    int puntaje;
    String nombre;
    RecordManager recordManager = new RecordManager(puntaje,nombre);
    public ScreenScore()
    {    
        super(600, 400, 1); 
        addObject(new BackButton(),31,370);
        List<Record> records = recordManager.getRecords();
        int i = 1;
        for(Record record:records){
            String recordName = "Player:        " + record.getPlayer() + "         Score: " + Integer.toString(record.getScore());
            this.showText(recordName,200,110 + i * 25);
            i++;
        }
    }
  
}
