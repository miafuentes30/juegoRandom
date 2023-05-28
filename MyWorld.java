import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int contar=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    public void act()
    {
        contar++;
        if(contar>59){
            enemigo();
            contar=0;
        }
        anvorguesa();
    }
    public void enemigo()
    {
        addObject(new veneno(), Greenfoot.getRandomNumber(600), 0);
    }
    public void anvorguesa(){
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addObject(new comida(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    private void prepare()
    {
       persona persona = new persona();
       addObject(persona, 48, 355);
    }
}

