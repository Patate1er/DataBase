package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vue.Launcher;

public class LabelCloseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		try {
			Launcher.getDataBaseController().quit();
		} catch (NullPointerException h){
			
		}
		System.exit(0);
	}

}
