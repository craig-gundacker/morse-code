
import java.io.File;
import javafx.scene.paint.Color;
/*
Represents a dot in the Morse code system
*/
public class Dot extends MorseSymbol
{
    /*No arg constructor that passes width, height, color and a reference to a 
    file with sound corresponding to symbol to super constructor*/
    public Dot(File fileAudio)
    {
        super(5, 10, Color.BLACK, fileAudio);
    }
}
