import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hud extends Actor
{
    GreenfootImage imagen;
    private int cont;
    String mensaje;

    public Hud(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        dibuja();
    }

    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);   
    }

    public void incrementar()
    {
        cont++;
        dibuja();
    }

    public void decrementar()
    {
        cont--;
        dibuja();
    } 

    public int obtenerValor()
    {
        return cont;
    }         
}