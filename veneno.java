import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class veneno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class veneno extends Actor
{
    int contador=0;
    /**
     * Act - do whatever the veneno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mover();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
    }
    protected void mover(){
        setLocation(getX(), getY()+4);
    }
}
