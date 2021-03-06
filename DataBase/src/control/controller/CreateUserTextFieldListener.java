package control.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.vue.LoginFrame;

/**
 * This listener is assigned to the createUser button on the loginFrame. It allows to create a new user.
 */
public class CreateUserTextFieldListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		if (!(new String(LoginFrame.getLoginFrame().getConfirmPasswordField().getPassword()).equalsIgnoreCase(new String(LoginFrame.getLoginFrame().getCreateUserPasswordField().getPassword())))){
			LoginFrame.getLoginFrame().getWrongPasswordLabel().setVisible(true);
		} else {
			LoginFrame.getLoginFrame().getWrongPasswordLabel().setVisible(false);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}
