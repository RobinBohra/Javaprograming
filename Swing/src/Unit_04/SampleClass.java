package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SampleClass {

	public static void main(String[] args) {
		SampleWorkSwing obj = new SampleWorkSwing();
	}

}

class SampleWorkSwing extends JFrame {
	JTextField t1;
	JTextField t2;

	JButton b1;
	JButton b2;

	JLabel l1;

	SampleWorkSwing() {
		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("SUM");
		b2 = new JButton("SUB");

		l1 = new JLabel("RESULT");

		add(t1);
		add(t2);

		add(b1);
		add(b2);

		add(l1);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());

				if (e.getSource() == b1) {
					Integer Sum = a1 + a2;
					l1.setText(Sum.toString());
				}
				if (e.getSource() == b2) {
					Integer SUB = a1 - a2;
					l1.setText(SUB.toString());

				}

			}
		};
		b1.addActionListener(al);
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}