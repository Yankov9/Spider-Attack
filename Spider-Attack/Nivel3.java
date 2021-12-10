import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Nivel3 extends World
{

    public Vida objLife;
    Hud puntos;
    Hud vidas;
    Hud vidaAirplane;

    public Nivel3()
    {    
        super(600, 400, 1); 
        setPaintOrder(Hud.class,Guy.class,Spider.class);
        Spider spider = new Spider();
        addObject(spider,50,50);
        crearAirplane(1); 
        objLife = new Vida();
        puntos = new Hud(15,"Score:");
        vidas = new Hud(3,"Vidas:");
        vidaAirplane = new Hud(985, "Vida Airplane: ");
        addObject(puntos, 150, 85);
        addObject(vidas, 150, 550);
        addObject(vidaAirplane,550, 550);

    }

    public void crearAirplane(int numero){
        for(int i=0; i <numero;i++){
            Airplane airplane = new Airplane();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(airplane,x,y);
        }
    }

    public void act(){
        if(Greenfoot.isKeyDown("S"))
        {
            String playerName = Greenfoot.ask("Escribe tu nombre");
            Greenfoot.setWorld(new ScreenScore());
        }

    }
}