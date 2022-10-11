
package javaapplication1;




import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class JavaApplication1 {

    public static void main(String[] args) {
        //----------------- Simple JFrame window
        /*
        JFrame myWindow;

        myWindow = new JFrame();

        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);
        myWindow.getContentPane().setBackground(Color.darkGray);
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */ 
        
        
        
        
        //-----------------  Displaying string from the JOptionPanel
        /*
        String  name, first, middle, last,
                space, monogram;
        
        space = " ";

        //Input the full name
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter(System.getProperty("line.separator"));
        
        //System.out.print("Enter your full name (first, middle, last):");
        
        //name = scanner.next( );
        name = JOptionPane.showInputDialog(null, "Enter your full name (first, middle, last):");


        //Extract first, middle, and last names
        first  = name.substring(0, name.indexOf(space));
        name   = name.substring(name.indexOf(space)+1, name.length());

        middle = name.substring(0, name.indexOf(space));
        last   = name.substring(name.indexOf(space)+1, name.length());

        //Verify the substring operations
//        System.out.println("First:"  + first);
//        System.out.println("Middle:" + middle);
//        System.out.println("Last:"   + last);

        //Compute the monogram
        monogram = first.substring(0, 1)
                    + middle.substring(0, 1)
                        + last.substring(0, 1);
        JOptionPane.showMessageDialog(null, monogram);
        //Output the result
        System.out.println("Your monogram is " + monogram);
        */
        
       
        
        
        //---------------Same thing but with arranging the the JOptionPanel(text color, background color) using the UIManager class 
        /*
        UIManager um = new UIManager();
        um.put("OptionPane.messageForeground", Color.red);  //For the text color
        um.put("Panel.background", Color.green);   //For the background color
       
        String name = JOptionPane.showInputDialog(null, "Enter your full name (first, middle, last):");
       
        JOptionPane.showMessageDialog(null, "Your name is " + name);
        */
    }
}









//notes:
/*
    - You should know which class is from which package

*/
