package control.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logs.Log;
import view.vue.AppFrame;

/**
 * This listener is assigned to the close label in the AppFrame. It makes the application to shut down and close all it need to be closed.
 */
public class CloseListener implements MouseListener {

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

			AppFrame.getDataBaseController().quit();

		} catch (NullPointerException p) {

		} finally {
			
			Log.close();
			System.exit(0);

		}
	}

}
