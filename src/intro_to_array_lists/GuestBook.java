package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame("GUEST BOOK");
	JPanel panel = new JPanel();
	JButton buttonAdd = new JButton("Add Name");
	JButton buttonView = new JButton("View Names"); 
	ArrayList<String> names = new ArrayList<String>();
	String nameList = "";
	int guestNumber = 1;
	public static void main(String[] args) {
		new GuestBook().go();
	}
	public void go() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(buttonAdd);
		panel.add(buttonView);
		buttonAdd.addActionListener(this);
		buttonView.addActionListener(this);
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==buttonAdd) {
			String name = JOptionPane.showInputDialog("Lemme getjo name");
			names.add(name);
			nameList = nameList + "\nGuest #" + guestNumber + ": " + name;
			guestNumber = guestNumber+1;
		}
		else if (e.getSource()==buttonView) {
			JOptionPane.showMessageDialog(null, nameList);
		}
	}
}
