import javax.swing.JOptionPane;

public class IntroToInputOutput {
 JOptionPane.showMessageDialog(null, "TACOS");
 System.out.print("There is a bug here");
 System.out.println("There is a bug here too");
 String numTacos=JOptionPane.showInputDialog("Enter how many tacos you can eat.");
 JOptionPane.showMessageDialog(null, "WOW!"+numTacos+"is a lot!");
 System.out.println(numTacos);
 
 
 
 
 
}
}
