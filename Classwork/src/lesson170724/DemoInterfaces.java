package lesson170724;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoInterfaces {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Demo");
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.addMouseListener(new MyMouseListener());

		panel.addMouseListener(new MyAdapter());
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("RELEASED!!!!");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXITED!");
			}
		});
		
		panel.setPreferredSize(new Dimension(400, 400));
		
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
	}
	
}