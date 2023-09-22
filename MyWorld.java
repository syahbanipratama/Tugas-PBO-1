import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        batu batu = new batu();
        addObject(batu,184,122);
        batu batu2 = new batu();
        addObject(batu2,405,121);
        batu batu3 = new batu();
        addObject(batu3,179,298);
        batu batu4 = new batu();
        addObject(batu4,409,296);
        pesawat pesawat = new pesawat();
        addObject(pesawat,72,76);
        batu.setLocation(230,138);
        batu.setLocation(175,100);
        batu2.setLocation(401,103);
        batu3.setLocation(179,281);
        batu4.setLocation(408,276);
        batu2.setLocation(416,81);
        pesawat.setLocation(72,70);
        batu2.setLocation(417,98);
        batu4.setLocation(432,268);
        batu4.setLocation(428,268);
        batu4.setLocation(428,284);
    }
}
