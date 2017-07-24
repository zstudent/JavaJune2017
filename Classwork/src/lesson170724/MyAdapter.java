package lesson170724;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyAdapter extends MouseAdapter {
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed!");
	}

}
