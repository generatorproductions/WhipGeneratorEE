package WhipGeneratorEE.src;


/**
 * Write a description of class WhipGenEducation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhipGenEducation
{
    
    
    public static void main (String [] arguments)
    {
        GeneratorMode g = new GeneratorMode();
        WhipGeneratorGUI gui = new WhipGeneratorGUI(g);
        g.setGUI(gui);
    }
    
}
