package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import consoleControler.DatabaseControler;
import logs.Log;
import vue.Launcher;

public class ConnectDataBaseListener implements MouseListener {

	String adress, login, password;

	public ConnectDataBaseListener(String connectionAdress, String connectionLogin, String connectionPassword) {
		adress = connectionAdress;
		login = connectionLogin;
		password = connectionPassword;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		try {
			Launcher.getDataBaseController().quit();
			Launcher.getMainPanel().getDirectoryPanel().setInfoLabelText("Disconnected from the database");

		} catch (NullPointerException e) {

		}
		try {
			Launcher.getMainPanel().getDirectoryPanel().setInfoLabelText("Connecting to database");
			Launcher.setDatabaseControler(new DatabaseControler(adress, login, password));
			Log.database("connection established");
			Log.database("statement created");
			Launcher.getMainPanel().getDirectoryPanel().setInfoLabelText("Connected to database");
		} catch (SQLException ex) {
			Launcher.getMainPanel().getDirectoryPanel().setInfoLabelText("Connection error");
			Log.database("connection error");
		}
	}

}
