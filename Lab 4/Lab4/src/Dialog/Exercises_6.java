package Dialog;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Exercises_6 extends JPanel{
    public int[] length = new int[10000];
    public JFrame Frame;
    public JFrame Counter;
    public int count;


    public Exercises_6()
    {
            Counter = new JFrame();
            String num = JOptionPane.showInputDialog(Counter, "Input the length for bar");
            this.count = Integer.parseInt(num);

        for (int i = 0; i < count; i++)
        {
            Frame = new JFrame();
            String Temp = JOptionPane.showInputDialog(Frame, "Input the length for bar "+(i+1));
            this.length[i] = Integer.parseInt(Temp);
        }
    }
    public void paintComponent(Graphics app)
    {
        super.paintComponent(app);
        int height = getHeight();
        int sep = height/(count*2);
        int sourceX = 0;
        int sourceY = sep;
        for (int i = 0; i < count; i++)
        {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            app.setColor(Color.getHSBColor(r,g,b));
            app.fillRect(sourceX, sourceY + 2*i*sep, this.length[i], sep);
        }
    }
}
        

  
