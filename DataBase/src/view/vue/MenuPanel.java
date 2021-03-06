package view.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import control.controller.MenuPanelMouseListener;

/**
 * The panel where the user can click to navigate in the apllication
 */
public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel upPanel;
	private JLabel avatarLabel;
	private JLabel userNameLabel;
	private JSeparator separator;

	private JPanel homePanel = new JPanel(new BorderLayout());;
	private JPanel editorPanel;
	private JPanel searchPanel;
	private JPanel visualPanel;
	private JPanel statsPanel;
	private JPanel gamePanel;
	private JPanel exportPanel;
	private JPanel adminPanel;
	
	private JPanel downPanel;
	private JLabel home;
	private JLabel editor;
	private JLabel search;
	private JLabel visual;
	private JLabel stats;
	private JLabel game;
	private JLabel export;
	private JLabel admin;
	
	private JComponent actualComponent;
	
	public static int height = LoginFrame.height;
	public static int width = LoginFrame.width / 100 * 6;

	private static MenuPanel menuPanel;

	/**
	 * Construct a new menuPanel
	 */
	public MenuPanel() {

		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		this.setLayout(new BorderLayout());

		this.add(createUpPanel(), BorderLayout.NORTH);
		this.add(createDownPanel(), BorderLayout.CENTER);

		actualComponent = this.homePanel;
		this.homePanel.setBackground(new Color(AppFrame.color - 8, AppFrame.color - 5, AppFrame.color));
		
		menuPanel = this;
	}

	/**
	 * Create the downPanel and return it
	 * @return the initialized downPanel
	 */
	private JPanel createDownPanel() {

		downPanel = new JPanel(new GridLayout(8, 0));
		downPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));

		homePanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		home = new JLabel();
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home.setToolTipText("Home");
		home.setHorizontalAlignment(downPanel.getWidth() / 2);
		home.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			home.setIcon(new ImageIcon("rsc\\stateBar\\homeWhite.PNG"));
		else
			home.setIcon(new ImageIcon("rsc\\stateBar\\homeBlack.PNG"));
		
		homePanel.add(home);

		editorPanel = new JPanel(new BorderLayout());
		editorPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		editor = new JLabel();
		editor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		editor.setToolTipText("editor");
		editor.setHorizontalAlignment(downPanel.getWidth() / 2);
		editor.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			editor.setIcon(new ImageIcon("rsc\\stateBar\\editorWhite.PNG"));
		else
			editor.setIcon(new ImageIcon("rsc\\stateBar\\editorBlack.PNG"));

		editorPanel.add(editor);
		
		searchPanel = new JPanel(new BorderLayout());
		searchPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		search = new JLabel();
		search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search.setToolTipText("search");
		search.setHorizontalAlignment(downPanel.getWidth() / 2);
		search.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			search.setIcon(new ImageIcon("rsc\\stateBar\\searchWhite.PNG"));
		else
			search.setIcon(new ImageIcon("rsc\\stateBar\\searchBlack.PNG"));

		searchPanel.add(search);
		
		visualPanel = new JPanel(new BorderLayout());
		visualPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		visual = new JLabel();
		visual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		visual.setToolTipText("visual");
		visual.setHorizontalAlignment(downPanel.getWidth() / 2);
		visual.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			visual.setIcon(new ImageIcon("rsc\\stateBar\\visualWhite.PNG"));
		else
			visual.setIcon(new ImageIcon("rsc\\stateBar\\visualBlack.PNG"));

		visualPanel.add(visual);
		
		statsPanel = new JPanel(new BorderLayout());
		statsPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		stats = new JLabel();
		stats.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		stats.setToolTipText("Stats");
		stats.setHorizontalAlignment(downPanel.getWidth() / 2);
		stats.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			stats.setIcon(new ImageIcon("rsc\\stateBar\\statsWhite.PNG"));
		else
			stats.setIcon(new ImageIcon("rsc\\stateBar\\statsBlack.PNG"));

		statsPanel.add(stats);
		
		gamePanel = new JPanel(new BorderLayout());
		gamePanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		game = new JLabel();
		game.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		game.setToolTipText("game");
		game.setHorizontalAlignment(downPanel.getWidth() / 2);
		game.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			game.setIcon(new ImageIcon("rsc\\stateBar\\gameWhite.PNG"));
		else
			game.setIcon(new ImageIcon("rsc\\stateBar\\gameBlack.PNG"));

		gamePanel.add(game);
		
		exportPanel = new JPanel(new BorderLayout());
		exportPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		export = new JLabel();
		export.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		export.setToolTipText("export");
		export.setHorizontalAlignment(downPanel.getWidth() / 2);
		export.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			export.setIcon(new ImageIcon("rsc\\stateBar\\exportWhite.PNG"));
		else
			export.setIcon(new ImageIcon("rsc\\stateBar\\exportBlack.PNG"));

		exportPanel.add(export);
		
		adminPanel = new JPanel(new BorderLayout());
		adminPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		
		admin = new JLabel();
		admin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		admin.setToolTipText("admin");
		admin.setHorizontalAlignment(downPanel.getWidth() / 2);
		admin.addMouseListener(new MenuPanelMouseListener());
		if (AppFrame.color == 54)
			admin.setIcon(new ImageIcon("rsc\\stateBar\\adminWhite.PNG"));
		else
			admin.setIcon(new ImageIcon("rsc\\stateBar\\adminBlack.PNG"));

		adminPanel.add(admin);
		
		downPanel.add(homePanel);
		downPanel.add(editorPanel);
		downPanel.add(searchPanel);
		downPanel.add(visualPanel);
		downPanel.add(statsPanel);
		downPanel.add(gamePanel);
		downPanel.add(exportPanel);

		if (AppFrame.getAppFrame().getLauncherControler().getCurrentUserName().equals("admin"))
			downPanel.add(adminPanel);

		return downPanel;
	}

	/**
	 * Create the upPanel and return it
	 * @return the initialized upPanel
	 */
	private JPanel createUpPanel() {

		upPanel = new JPanel(new BorderLayout());
		upPanel.setBackground(new Color(AppFrame.color - 24, AppFrame.color - 21, AppFrame.color - 18));
		upPanel.add(createAvatarLanel(), BorderLayout.NORTH);
		upPanel.add(createUserNameLabel(), BorderLayout.CENTER);
		upPanel.add(createSeparator(), BorderLayout.SOUTH);

		return upPanel;
	}

	/**
	 * Create the avatarLabel and return it
	 * @return the initialized avatarLabel
	 */
	private JLabel createAvatarLanel() {

		this.avatarLabel = new JLabel();
		this.avatarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.avatarLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		this.avatarLabel.setIcon(new ImageIcon("rsc\\user-16.png"));
		this.avatarLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.avatarLabel.addMouseListener(new MenuPanelMouseListener());

		return this.avatarLabel;
	}

	/**
	 * Create the userNameLabel and return it
	 * @return the initialized userNameLabel
	 */
	private JLabel createUserNameLabel() {

		this.userNameLabel = new JLabel(AppFrame.getAppFrame().getLauncherControler().getCurrentUserName());
		if (AppFrame.color == 54)
			this.userNameLabel.setForeground(Color.WHITE);
		else
			this.userNameLabel.setForeground(Color.BLACK);
		this.userNameLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		this.userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);

		return this.userNameLabel;
	}

	/**
	 * Create the separator and return it
	 * @return the separator userNameLabel
	 */
	public JSeparator createSeparator() {

		this.separator = new JSeparator();

		return this.separator;
	}

	/**
	 * Getter for this menuPanel
	 * @return this menuPanel
	 */
	public static MenuPanel getMenuPanel() {
		return menuPanel;
	}

	/**
	 * Getter for avatarLabel
	 * @return the avatarLabel
	 */
	public JComponent getAvatarLabel() {
		return menuPanel.avatarLabel;
	}

	/**
	 * Getter for userNameLabel
	 * @return the userNameLabel
	 */
	public JComponent getUserNameLabel() {
		return menuPanel.userNameLabel;
	}

	/**
	 * Getter for homeLabel
	 * @return the homeLabel
	 */
	public JLabel getHome() {
		return menuPanel.home;
	}

	/**
	 * Getter for editorLabel
	 * @return the editorLabel
	 */
	public JLabel getEditor() {
		return menuPanel.editor;
	}

	/**
	 * Getter for searchLabel
	 * @return the searchLabel
	 */
	public JLabel getSearch() {
		return menuPanel.search;
	}

	/**
	 * Getter for visualLabel
	 * @return the visualLabel
	 */
	public JLabel getVisual() {
		return menuPanel.visual;
	}

	/**
	 * Getter for statLabel
	 * @return the statLabel
	 */
	public JLabel getStats() {
		return menuPanel.stats;
	}
	
	/**
	 * Getter for gameLabel
	 * @return the gameLabel
	 */
	public JLabel getGame() {
		return menuPanel.game;
	}
	
	/**
	 * Getter for exportLabel
	 * @return the exportLabel
	 */
	public JLabel getExport() {
		return menuPanel.export;
	}

	/**
	 * Getter for adminLabel
	 * @return the adminLabel
	 */
	public JLabel getAdmin() {
		return menuPanel.admin;
	}

	/**
	 * Getter for homePanel
	 * @return the homePanel
	 */
	public JPanel getHomePanel() {
		return menuPanel.homePanel;
	}

	/**
	 * Getter for editorPanel
	 * @return the editorPanel
	 */
	public JPanel getEditorPanel() {
		return menuPanel.editorPanel;
	}

	/**
	 * Getter for searchPanel
	 * @return the searchPanel
	 */
	public JPanel getSearchPanel() {
		return menuPanel.searchPanel;
	}

	/**
	 * Getter for visualPanel
	 * @return the visualPanel
	 */
	public JPanel getVisualPanel() {
		return menuPanel.visualPanel;
	}

	/**
	 * Getter for statsPanel
	 * @return the statsPanel
	 */
	public JPanel getStatsPanel() {
		return menuPanel.statsPanel;
	}
	
	/**
	 * Getter for gamePanel
	 * @return the gamePanel
	 */
	public JPanel getGamePanel() {
		return menuPanel.gamePanel;
	}

	/**
	 * Getter for exportPanel
	 * @return the exportPanel
	 */
	public JPanel getExportPanel() {
		return menuPanel.exportPanel;
	}

	/**
	 * Getter for adminPanel
	 * @return the adminPanel
	 */
	public JPanel getAdminPanel() {
		return menuPanel.adminPanel;
	}
	
	/**
	 * Getter for actualComponent
	 * @return the actualComponent
	 */
	public JComponent getActualPanel() {
		return menuPanel.actualComponent;
	}
	
	/**
	 * Setter for the actualPanel
	 * @param panel the new actualPanel
	 */
	public void setActualPanel(JComponent panel) {
		menuPanel.actualComponent = panel;
	}
	
}
