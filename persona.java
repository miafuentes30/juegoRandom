import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class persona extends Actor
{
    int vidas;
    int anvorguesa;
    public void persona()
    {
        anvorguesa = 0;
        vidas = 2;
    }
    /**
     * Act - do whatever the persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        comer();
        hit();
    }
    protected void comer()
    {
        if(isTouching(comida.class)){
            removeTouching(comida.class);
            puntuacion();
    }
    }
    private void hit(){
        if(isTouching(veneno.class)){
            vidas--;
            removeTouching(veneno.class);
            if(vidas<0){
                finjuego();
            }
        }
    }
    private void puntuacion(){
        anvorguesa++;
        getWorld().showText("Score: " + anvorguesa, 60, 390);
        
    }
    private void finjuego(){
        Greenfoot.stop();
    }
}
