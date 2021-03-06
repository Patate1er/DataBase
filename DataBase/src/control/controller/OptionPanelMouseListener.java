package control.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logs.Log;
import view.vue.AppFrame;
import view.vue.LoginFrame;
import view.vue.MainPanel;
import view.vue.WorkPanel;

/**
* This listener is assigned to the presettingPanel and lead to a panel depending where the user clicked
*/
public class OptionPanelMouseListener implements MouseListener {

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

		if (e.getComponent()
				.equals(AppFrame.getAppFrame().getMainPanel().getWorkPanel().getOptionPanel().getSettingLabel())) {

			WorkPanel.setSettingPanel();
			MainPanel.getMainPanel().getWorkPanel().revalidate();
			MainPanel.getMainPanel().getWorkPanel().repaint();

		} else if (e.getComponent().equals(AppFrame.getAppFrame().getMainPanel().getWorkPanel().getOptionPanel().getLogoutLabel())) {
			
			try {

				AppFrame.getDataBaseController().quit();

			} catch (NullPointerException p) {

			} finally {
				
				Log.close();
				LoginFrame.getLoginFrame().setVisible(true);
				AppFrame.getAppFrame().dispose();

			}
			
		}

	}

}
