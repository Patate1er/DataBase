package view.consoleView;

import static model.utils.Scan.sc;

import java.sql.SQLException;

import control.consoleControler.DatabaseControler;
import logs.Log;

/**
 * This class allows a user to connect to a database
 *
 */
public class Connect {

	private DatabaseControler dc;

	/**
	 * Constructor of the class Connect
	 * 
	 * @param address
	 *            database address
	 * @param login
	 *            user's login for the database
	 * @param password
	 *            user's password for the database
	 */
	public Connect(String address, String login, String password) {
		try {
			dc = new DatabaseControler(address, login, password);
			Log.database("connection established");
			Log.database("statement created");
		} catch (SQLException e) {
			System.out.println("Connection error");
			Log.database("conection error");
		}

	}

	/**
	 * This method start to ask the user what he wants to do
	 */
	public void start() {
		String want = "";

		while ((!want.toLowerCase().contains("quit")) && (!want.toLowerCase().contains("8"))) {
			System.out.println("\nWhat do you want to do ?");
			System.out.println("1 - CREATE : create a new table on your dataBase");
			System.out.println("2 - DROP   : drop a table");
			System.out.println("3 - INSERT : insert values on a table");
			System.out.println("4 - SELECT : select all the values of a table");
			System.out.println("5 - DELETE : delete all or some values of your dataBase");
			System.out.println("6 - PLAY   : play a game to learn the basis of SQL");
			System.out.println("7 - EXPERT MODE : write the full query");
			System.out.println("8 - QUIT   : exit the app");
			System.out.print("> ");
			want = sc.next();
			if ((want.equalsIgnoreCase("create")) || (want.equals("1")) || (want.equalsIgnoreCase("drop"))
					|| (want.equals("2")) || (want.equalsIgnoreCase("insert")) || (want.equals("3"))
					|| (want.equalsIgnoreCase("select")) || (want.equals("4")) || (want.equalsIgnoreCase("delete"))
					|| (want.equals("5")) || want.equalsIgnoreCase("game") || want.equals("6")
					|| want.equalsIgnoreCase("expert") || want.equals("7")) {
				dc.getQuery(want);

			} else if ((want.toLowerCase().contains("quit")) || (want.equals("8"))) {
				quit();

			} else {
				System.out.println("Sorry but I don't understand what you wanna do");
			}
		}
	}

	/**
	 * This method ask user to write the query entirely
	 * 
	 * @return the query written by the user
	 */
	public static String getExpertQuery() {
		System.out.println("\nWrite here your query");
		System.out.print("> ");
		String ret = "";
		while ((ret = sc.nextLine()).length() == 0)
			;
		return ret;

	}

	/**
	 * this method disconnect the user form the database
	 */
	public void quit() {
		dc.quit();
		Log.database("disconnected from data base");
	}

}
