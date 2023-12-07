package Dialog;
import java.awt.*;
import javax.swing.*;


public class Exercises_2 extends JPanel
{
    public void paintComponent(Graphics app)
    {
        super.paintComponent(app);
        int width = getWidth();
        int height = getHeight();
        app.drawLine(0, 0, width, height);
        app.drawLine(width/2, 0, width/2, height); 
        app.drawLine(0, height/2, width, height/2); 
        app.drawLine(0, height, width, 0); 
    }
}
