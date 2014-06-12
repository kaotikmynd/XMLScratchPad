/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xmlscratchpad.gui;

import javax.swing.*;

/**
 *
 * @author Lucas
 */
public class MainWindow extends JFrame {
	
	public MainWindow() {
		super("XML ScratchPad");
	}
	
	public void createAndShowGui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel editorPanel = new ScratchPadEditor();
		
		this.setContentPane(editorPanel);
		this.pack();
		this.setVisible(true);
	}
}
