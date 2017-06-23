package view.vue;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import model.exception.ExceptionHandler;

public class VisualPanel extends JPanel {

	/*
	 *  public TablePanel( TableModel model )
  		{
    	table = new JTable( model );
	 * 
	 * 
	 * 
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private ResultSet rs;

	/**
	 * Create the panel.
	 */
	public VisualPanel(TableModel model) {
		
		setLayout(new BorderLayout(0, 0));
//		Object objects[][] = null;
//		
//		try {
//			
//			rs = AppFrame.getDataBaseController().executeQuery("SELECT * FROM agent");
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int columnCount = rsmd.getColumnCount();
//			
//			objects = new Object[AppFrame.getDataBaseController().getColumnName("agent").length][columnCount];
//			
//			int i = 0;
//			while (rs.next()) {
//				for (int j = 1; j < columnCount; j++) {
//					objects[i++][j-1] = rs.getString(j);
//				}
////				System.out.print(rs.getString(columnCount));
////				System.out.print("\n");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NullPointerException e1) {
//			e1.printStackTrace();
//		}
		
	//	table = new JTable(objects, AppFrame.getDataBaseController().getColumnName("agent"));
		
		table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);
		

		add(scrollPane);

	}

}

/*
try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

			// Display the select query
			String displayQuery = "";
			for (int i = 1; i < columnCount; i++) {
				displayQuery += rsmd.getColumnName(i) + " \t|\t ";
			}
			displayQuery += rsmd.getColumnName(columnCount);
			System.out.println(displayQuery);

			// For each line of the table
			while (rs.next()) {
				for (int j = 1; j < columnCount; j++) {
					System.out.print(rs.getString(j) + " \t\t\t ");
				}
				System.out.print(rs.getString(columnCount));
				System.out.print("\n");
			}
		} catch (SQLException e) {
			System.out.println("Query error !");
			System.out.println(ExceptionHandler.analyse(e.getMessage()));
		} catch (NullPointerException ex) {

		}
	}
 */
