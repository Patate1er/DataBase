package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.AttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import controller.MenuButtonListener;
import utils.WordBasedStyledDocument;

public class WorkPanel extends JSplitPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel upPanel;
	private static JScrollPane upScrollPane;
	private JPanel downPanel;
	private JPanel menuBarPanel;
	private static JTextPane textPane;
	private JScrollPane downScrollPane;
	
	private static JLabel executeLabel;
	private static JLabel clearLabel;
	private static JLabel saveLabel;
	private static JLabel exportLabel;
	private static JLabel executeAllLabel;
	private static JLabel importLabel;
	
	public WorkPanel() {
		
		this.setDoubleBuffered(true);
		this.setOneTouchExpandable(true);
		this.setBorder(null);
		this.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		this.setLeftComponent(createUpScrollPane(createUpPanel()));
		this.setRightComponent(createDownScrollPane(createDownPanel()));
		
		this.setDividerLocation(0);
		this.setDividerLocation(0.8);
	}

	private JPanel createUpPanel() {
		
		WorkPanel.upPanel = new JPanel();
		WorkPanel.upPanel.setBorder(null);
		WorkPanel.upPanel.setBackground(new Color(54,57,62));
		WorkPanel.upPanel.setForeground(new Color(255, 255, 255));
		WorkPanel.upPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		return WorkPanel.upPanel;
	}
	
	private JScrollPane createUpScrollPane(JPanel panel) {
		
		UIManager.put("ScrollBar.trackHighlightForeground", (new Color(57, 57, 62)));
		UIManager.put("scrollbar", (new Color(57, 57, 62)));
		UIManager.put("ScrollBar.thumb", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.thumbHeight", 2);
		UIManager.put("ScrollBar.background", (new Color(57, 57, 62)));
		UIManager.put("ScrollBar.thumbDarkShadow", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.thumbShadow", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.thumbHighlight", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.trackForeground", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.trackHighlight", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.foreground", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.shadow", new ColorUIResource(new Color(57, 57, 62)));
		UIManager.put("ScrollBar.highlight", new ColorUIResource(new Color(57, 57, 62)));
		
		WorkPanel.upScrollPane = new JScrollPane(panel);
		WorkPanel.upScrollPane.setPreferredSize(new Dimension(20,250));
		WorkPanel.upScrollPane.setBorder(null);
		
		return WorkPanel.upScrollPane;
	}
	
	private JPanel createDownPanel() {
		
		this.downPanel = new JPanel();
		this.downPanel.setLayout(new BorderLayout());
		this.downPanel.add(createMenuBarPanel(), BorderLayout.NORTH);
		this.downPanel.add(createTextPane(), BorderLayout.CENTER);
		
		return this.downPanel;
	}
	
	private JPanel createMenuBarPanel() {
		
		this.menuBarPanel = new JPanel();
		this.menuBarPanel.setBackground(new Color(54, 57, 62));
		this.menuBarPanel.setForeground(new Color(255, 255, 255));
		this.menuBarPanel.setLayout(new GridLayout(0, 6, 0, 0));
		
		executeLabel = new JLabel("Execute");
		executeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		executeLabel.addMouseListener(new MenuButtonListener());
		executeLabel.setForeground(new Color(255, 255, 255));

		clearLabel = new JLabel("Clear");
		clearLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clearLabel.addMouseListener(new MenuButtonListener());
		clearLabel.setForeground(new Color(255, 255, 255));

		saveLabel = new JLabel("Save");
		saveLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		saveLabel.addMouseListener(new MenuButtonListener());
		saveLabel.setForeground(new Color(255, 255, 255));

		exportLabel = new JLabel("Export");
		exportLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exportLabel.addMouseListener(new MenuButtonListener());
		exportLabel.setForeground(new Color(255, 255, 255));
		
		executeAllLabel = new JLabel("Execute All");
		executeAllLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		executeAllLabel.addMouseListener(new MenuButtonListener());
		executeAllLabel.setForeground(new Color(255, 255, 255));
		
		importLabel = new JLabel("Import");
		importLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		importLabel.addMouseListener(new MenuButtonListener());
		importLabel.setForeground(new Color(255, 255, 255));
		
		this.menuBarPanel.add(executeLabel);
		this.menuBarPanel.add(executeAllLabel);
		this.menuBarPanel.add(clearLabel);
		this.menuBarPanel.add(saveLabel);
		this.menuBarPanel.add(exportLabel);
		this.menuBarPanel.add(importLabel);
		
		return this.menuBarPanel;
	}
	
	private JTextPane createTextPane() {
		
		WorkPanel.textPane = new JTextPane();
		WorkPanel.textPane.setBorder(null);
		WorkPanel.textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		WorkPanel.textPane.setBackground(new Color(54, 57, 62));
		WorkPanel.textPane.setForeground(new Color(255, 255, 255));
		
		StyleContext cont = StyleContext.getDefaultStyleContext();
		AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
		attr = cont.addAttribute(attr.copyAttributes(), StyleConstants.Bold, true);
		Style c = cont.getStyle("default");
		c.addAttributes(attr);
		
		WorkPanel.textPane.setStyledDocument(new WordBasedStyledDocument(WorkPanel.textPane.getLogicalStyle(), c));
		
		return WorkPanel.textPane;
	}
	
	private JScrollPane createDownScrollPane(JPanel panel) {
		
		this.downScrollPane = new JScrollPane(panel);
		this.downScrollPane.setBorder(null);
		
		return this.downScrollPane;
	}

	public static JLabel getExecuteLabel() {
		return executeLabel;
	}

	public static JLabel getClearLabel() {
		return clearLabel;
	}

	public static JLabel getSaveLabel() {
		return saveLabel;
	}

	public static JLabel getExportLabel() {
		return exportLabel;
	}

	public static JLabel getExecuteAllLabel() {
		return executeAllLabel;
	}

	public static JLabel getImportLabel() {
		return importLabel;
	}

	public static JPanel getUpPanel() {
		return upPanel;
	}

	public static void setUpPanel(JPanel upPanel) {
		WorkPanel.upPanel = upPanel;
	}

	public static JScrollPane getUpScrollPane() {
		return upScrollPane;
	}

	public static void setUpScrollPane(JScrollPane upScrollPane) {
		WorkPanel.upScrollPane = upScrollPane;
	}

	public static JTextPane getTextPane() {
		return textPane;
	}
	
	public static void setLeftComponent(Object object) {
		WorkPanel.setLeftComponent(object);
	}
}
