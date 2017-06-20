package view.vue;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DirectoryPanel directoryPanel = new DirectoryPanel();
	private WorkPanel workPanel = new WorkPanel();
	
	private static MainPanel mainPanel;
	
	public MainPanel() {
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(directoryPanel, BorderLayout.WEST);
		this.add(workPanel, BorderLayout.CENTER);
		
		mainPanel = this;
	}

	public DirectoryPanel getDirectoryPanel() {
		return mainPanel.directoryPanel;
	}

	public static void setDirectoryPanel(DirectoryPanel directoryPanel) {
		mainPanel.directoryPanel = directoryPanel;
	}

	public WorkPanel getWorkPanel() {
		return mainPanel.workPanel;
	}

	public static void setDetailPanel(WorkPanel workPanel) {
		mainPanel.remove(mainPanel.getWorkPanel());
		mainPanel.add(workPanel);
	}
	
	public static MainPanel getMainPanel(){
		return mainPanel;
	}
}