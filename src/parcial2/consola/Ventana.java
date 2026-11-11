package parcial2.consola;

import parcial2.mundo.*;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener{
	public Ventana(){
		setLayout(new GridLayout());
		
		JTextField a = new JTextField("a");
		JTextField b = new JTextField("b");
		JTextField c = new JTextField("c");
		
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		
		setTitle("Examen Hector Florez");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 350);
		setVisible(true); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		return ;
	}
	
	public static void main (String [] args) {
		new Ventana();
	}
}
