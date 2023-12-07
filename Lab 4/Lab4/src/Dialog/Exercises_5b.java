package Dialog;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Exercises_5b extends JPanel{
     private double length;

    public Exercises_5b(double Length){
        
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
        app.setColor(Color.GREEN);
        int width = getWidth();
        int height = getHeight();
        int x0= width/2;
        int y0= height/2;
        
        int xDelta = (int) (width / getLength());
        int yDelta = (int) (height / getLength());
        
        for (int i = 0; i < getLength(); i++){
            
            app.drawArc(x0-i*xDelta, y0-i*yDelta, (1+i)*xDelta, (1+i)*yDelta, 0, 180);
            
            app.drawArc(x0-i*xDelta-10, y0-i*yDelta, (1+i)*xDelta, (1+i)*yDelta, 0, -180);
            
        }
        /*int radius = 20;
        int diameter = 0;
        int arc = 180;

        for (int i = 0; i < 20; i++){
            if (i % 2 == 1){
                x -= 2 * radius;
            }
            y -= radius;
            diameter += 2 * radius;
            app.drawArc(x, y, diameter, diameter, 0, arc);
            arc = -arc;
        }*/
    }
    
}
  
