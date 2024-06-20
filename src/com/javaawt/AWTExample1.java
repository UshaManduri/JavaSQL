package com.javaawt;

import java.awt.*;

public class AWTExample1 {

	AWTExample1(){
		Frame frame = new Frame();
		Label label = new Label("Emp id: ");
		Button button = new Button("Submit");
		TextField textField = new TextField();
		label.setBounds(20, 70, 80, 30);
		textField.setBounds(20,100,80,30); // increased width of the text field  --  (100,100,300,30); 
		button.setBounds(100,100,80,30); // adjusted button position  --  (320,100,80,30)
		frame.add(button);
		frame.add(label);
		frame.add(textField);
		frame.setSize(500, 350); // Adjusted frame size
		frame.setTitle("Employee info");
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		AWTExample1 awtex1 = new AWTExample1();

	}

}
