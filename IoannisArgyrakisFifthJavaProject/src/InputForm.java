import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputForm extends JFrame {
	
	private ArrayList<School> schools;
	private JTextField schoolField = new JTextField("Please the school for which you are intersted.");
	private JPanel panel;
	private JButton print;
	
	public InputForm(ArrayList<School> schools) {
		
		this.schools = schools;
		
		panel = new JPanel();
		print = new JButton("Print");
		
		panel.add(schoolField);
		panel.add(print);
		
		class PrintButtonListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = schoolField.getText();
				for (School school : schools) {
					if (school.getName().equals(name)) {
						for (Teacher teacher : school.getTeachers()){
							System.out.println(teacher.getLastName() + " works here and their monthly salary is "+teacher.netMonthlySalary() + " €");
						}
					}
				}
				
			}
		}
		
		PrintButtonListener listener = new PrintButtonListener();
		print.addActionListener(listener);
		
		this.setContentPane(panel);
		this.setSize(300, 100);
		this.setVisible(true);
		this.setTitle("Input Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
