package Dialog;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Exercises_4b extends JPanel{
    private double length;

    public Exercises_4b(double Length){
        
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
        int i=0;
        while(i < getLength()){
            int x1 = 0;
            int y1 = i* yDelta;
            int x2 = (i+1)* xDelta;
            int y2 = height;
            app.drawLine(x1, y1, x2, y2);
            app.drawLine(0, height-i*yDelta, (i+1)* xDelta, 0);
            app.drawLine(width,i*yDelta,width-(i+1)* xDelta, height);
            app.drawLine(width,height-i*yDelta,width-(i+1)* xDelta, 0);
            i++;
        }
        
    }
        
}
  
