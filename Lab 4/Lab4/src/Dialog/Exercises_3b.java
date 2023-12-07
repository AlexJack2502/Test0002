package Dialog;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Exercises_3b extends JPanel{
    private double length;

    public Exercises_3b(double Length){
        
        this.setLength(Length);
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)))
            this.length = length;
        else
            System.out.println("Error Value");
    }


    public void paintComponent(Graphics app)
    {
        super.paintComponent(app);
        int width = getWidth();
        int height = getHeight();
        int xDelta = (int) (width / getLength());
        int yDelta = (int) (height / getLength());

        for (int i = 0; i < getLength(); i++) {
            int x1 = 0;
            int y1 = 0;
            int x2 = xDelta * i;
            int y2 = height - yDelta * i;
            app.drawLine(x1, y1, x2, y2);
        }

        for (int i = 0; i < getLength(); i++) {
            int x1 = width;
            int y1 = height;
            int x2 = xDelta * i;
            int y2 = height - yDelta * i;
            app.drawLine(x1, y1, x2, y2);
        }

        for (int i = 0; i < getLength(); i++) {
            int x1 = width;
            int y1 = 0;
            int x2 = width-xDelta * i;
            int y2 = height-yDelta * i;
            app.drawLine(x1, y1, x2, y2);
        }

        for (int i = 0; i < getLength(); i++) {
            int x1 = 0;
            int y1 = height;
            int x2 = width - xDelta * i;
            int y2 = height-yDelta * i;
            app.drawLine(x1, y1, x2, y2);
        }
    }
        
}
  
