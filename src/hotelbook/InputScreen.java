package hotelbook;
import javax.swing.*;

public class InputScreen {
  public static void main(String args[]){
    JFrame myFrame = new JFrame("Hotel Booker");
    // Setting the size of the myFrame
    myFrame.setSize(1000, 500);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel myLabel = new JLabel("TEST");
    myFrame.add(myLabel);
    myFrame.setVisible(true);
  }

}
