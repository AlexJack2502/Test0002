package Dialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Exercises_1 extends JOptionPane{
    public String inputName;
    private JFrame frame1;

    public Exercises_1()
        {
        frame1 = new JFrame();
        inputName = (String) showInputDialog(frame1, "What is your name?");
        showMessageDialog(frame1, "Welcome, " + inputName + ", to Java Programming!");
        }

        
}