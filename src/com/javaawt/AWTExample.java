package com.javaawt;

import java.awt.*;

public class AWTExample extends Frame{

	AWTExample(){
		Button button = new Button("Click here !!");
		button.setBounds(30,100,80,30);
		add(button);
		setSize(300,300);
		setTitle("AWT example");
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTExample awt = new AWTExample();

	}

}
