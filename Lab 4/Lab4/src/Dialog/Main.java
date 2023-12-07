package Dialog;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args)
        {   
       
        JFrame application = new JFrame();
        // Exercises_1 test_1 = new Exercises_1(); application.add(test_1);

        // Exercises_2 test_2 = new Exercises_2(); application.add(test_2);

        // Exercises_3a test_3a = new Exercises_3a(15); application.add(test_3a);

        // Exercises_3b test_3b = new Exercises_3b(15); application.add(test_3b);
       
        // Exercises_4a test_4a = new Exercises_4a(15); application.add(test_4a);

        // Exercises_4b test_4b = new Exercises_4b(15); application.add(test_4b);
        
        // Exercises_5a test_5a = new Exercises_5a(20); application.add(test_5a);
        
         Exercises_5b test_5b = new Exercises_5b(15); application.add(test_5b);

        // Exercises_6 test_6 = new Exercises_6(); application.add(test_6);

        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.getMostRecentFocusOwner();
        application.setSize( 500, 500 ); 
        application.setVisible( true);
        }
    
}
