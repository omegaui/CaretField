package test;
import java.awt.Color;

import omegaui.component.CaretField;

import javax.swing.JFrame;
import javax.swing.JPanel;

import static omega.io.UIManager.*;
import static omegaui.component.animation.Animations.*;

public class CaretFieldTest {
	public static void main(String[] args){
		JFrame f = new JFrame();
		f.setSize(600, 500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(null);
		panel.setBackground(c2);
		f.setContentPane(panel);

		CaretField field = new CaretField("", "Hello World ...", TOOLMENU_GRADIENT, c2, TOOLMENU_COLOR1, TOOLMENU_COLOR3, Color.DARK_GRAY, TOOLMENU_COLOR5);
		field.setBounds(100, 100, 200, 30);
		field.setFont(PX14);
		f.add(field);

		CaretField field1 = new CaretField("", "Click this field", TOOLMENU_GRADIENT, c2, TOOLMENU_COLOR1, TOOLMENU_COLOR3, Color.DARK_GRAY, TOOLMENU_COLOR5);
		field1.setBounds(100, 150, 200, 30);
		field1.setFont(PX14);
		f.add(field1);

		CaretField field2 = new CaretField("", "Type something ...", TOOLMENU_GRADIENT, c2, TOOLMENU_COLOR1, TOOLMENU_COLOR3, Color.DARK_GRAY, TOOLMENU_COLOR5);
		field2.setBounds(100, 200, 200, 30);
		field2.setFont(PX14);
		f.add(field2);

		CaretField field3 = new CaretField("", "What's in your mind?", TOOLMENU_GRADIENT, c2, TOOLMENU_COLOR1, TOOLMENU_COLOR3, Color.DARK_GRAY, TOOLMENU_COLOR5);
		field3.setBounds(100, 250, 200, 30);
		field3.setFont(PX14);
		f.add(field3);
		
		f.setVisible(true);
	}
}
