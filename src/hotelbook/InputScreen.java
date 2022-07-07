package hotelbook;
import javax.swing.*;

public class InputScreen {
  public static void main(String args[]){
    JFrame myFrame = new JFrame("Hotel Booker");
    // Setting the size of the myFrame
    myFrame.setSize(400, 250);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel myLabel = new JLabel("Welcome to the hotel room booking service.");
    myLabel.setBounds(50, 20,400, 30 );
    myFrame.add(myLabel);


    // Adding two text fields to get guest name and any details
    JTextField tField1 = new JTextField("Enter Guest name");
    tField1.setBounds(50, 60, 200,30);
    myFrame.add(tField1);
    JTextField tField2 = new JTextField("Enter Guest stay details");
    tField2.setBounds(50,110, 200,30);
    myFrame.add(tField2);

    // Save button
    JButton button1 = new JButton("Post details");
    button1.setBounds(50, 160, 150, 25);
    myFrame.add(button1);

    myFrame.setLayout(null);
    myFrame.setVisible(true);

  }

}
