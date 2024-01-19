//must import for JFrame config 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Jframe{
public static void main(String[] args){

int[] counter = {0};
//Font headlineFont= new Font( "Arial", Font.BOLD ,36);
//This can change the look of the program comment out to see
//JFrame.setDefaultLookAndFeelDecorated(true);


// How to create the Jframe
JFrame aFrame= new JFrame("First Frame");
aFrame.setSize(250,100);
aFrame.setVisible(true);

//Specify what you want to do once the jframe is exited 
aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Adding in a word or greeting

JLabel greeting =new JLabel("good Day");
// how to change the font of the label
//greeting.setFont(headlineFont);
aFrame.add(greeting);
// Text field that limits the amount of characters that can be entered. response.setText("");
JTextField response = new JTextField(10);
aFrame.add(response);
// to get text entered in field String userRep= response.getText();
// to set the field to non editable or editable response.setEditable(false);
JButton readybutton = new JButton(" PRess the button");

 readybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Increment the counter and update the label text
                counter[0]++;
                greeting.setText("Good Day - Pressed: " + counter + " times");
            }
        });
aFrame.add(readybutton);



}

}