import java.awt.event.*;
import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int count;
	private Timer t;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		count = 0;
		myLabel = new GLabel("# of times called? " + count, 0, 100);
		add(myLabel);
		
		t = new Timer(1000, this);
		t.start();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		myLabel.move(0, 5);
		count++;
		
		myLabel.setLabel("# of times called? " + count);
		
		if(count >= 10) {
			t.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}