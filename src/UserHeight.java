import javax.swing.JOptionPane;

public class UserHeight {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int height2 = Integer.parseInt(height);
		if (height2 > 60) {
			JOptionPane.showInputDialog("You can ride roller coasters!!");

		} else {
			JOptionPane.showInputDialog("You're too short to ride roller coasters.");
		}

	}
}
