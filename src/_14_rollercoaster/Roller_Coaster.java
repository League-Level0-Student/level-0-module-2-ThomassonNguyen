package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Roller_Coaster {
public static void main(String[] args) {





String Hight = JOptionPane.showInputDialog("What is your hight?");
int hight=Integer.parseInt(Hight);
if(hight>48) {
	JOptionPane.showMessageDialog(null,"Your good to go,go ahead");}

	else{
	JOptionPane.showMessageDialog(null,"Grow up more!!");
	}
}

}

