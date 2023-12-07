package Dialog;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Exercises_5a extends JPanel{
    private double length;

    public Exercises_5a(double Length){
        
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
        app.setColor(Color.RED);
        int width = getWidth();
        int height = getHeight();
        int x0= width/2;
        int y0=height/2;
        int xDelta = (int) (width / getLength());
        int yDelta = (int) (height / getLength());
        
        for (int i = 0; i < getLength(); i++){
            
            app.drawLine(x0+i*xDelta,y0-i*yDelta,x0+i*xDelta,y0+(i+1)*yDelta);
            app.drawLine(x0+i*xDelta,y0+(i+1)*yDelta,x0-(i+1)*xDelta,y0+(i+1)*yDelta);
            app.drawLine(x0-(i+1)*xDelta,y0+(i+1)*yDelta,x0-(i+1)*xDelta,y0-(i+1)*yDelta);
            app.drawLine(x0-(i+1)*xDelta,y0-(i+1)*yDelta,x0+(i+1)*xDelta,y0-(i+1)*yDelta);
        }
    }
        
}
  
