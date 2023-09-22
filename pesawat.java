import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if (Greenfoot.getRandomNumber(10) < 1)
    {
        int randomAngle = Greenfoot.getRandomNumber(91) - 45;
        setRotation(getRotation() + randomAngle);
    }
    
    //memeriksa apakah pesawat mencapai batas-batas yang diinginkan
    checkBounds();
    
    //memeriksa apakah ada batu di depan pesawat
    checkForCactus();
}

//memeriksa batasan dan menghindarinya
private void checkBounds()
{
    int x = getX();
        int y = getY();
        
        // Batas-batas yang diinginkan
        int minX = 25; // Batas kiri (600 - 550)
        int maxX = getWorld().getWidth() - 25; // Batas kanan (600 - 25)
        int minY = 25; // Batas atas (400 - 350)
        int maxY = getWorld().getHeight() - 25; // Batas bawah (400 - 25)
        
        if (x <= minX || x >= maxX || y <= minY || y >= maxY)
        {
            // Jika pesawat mencapai batasan, maka balik arah dengan tambahan random
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
}

// Memeriksa apakah ada batu di depan pesawat
    private void checkForCactus()
    {
        Actor batu = getOneObjectAtOffset(0, 0, batu.class); // Mengecek apakah ada batu di lokasi yang sama dengan pesawat
        if (batu != null)
        {
            // Jika ada batu di depan pesawat, maka putar arahnya
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
