package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import controller.LabelCloseListener;

public class DetailPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel menuPanel;
	private JSeparator separator;
	private JPanel controlPanel;
	private JPanel minimizePanel;
	private JLabel minimizeLabel;
	private JPanel maximizePanel;
	private JLabel maximizeLabel;
	private JPanel closePanel;
	private JLabel closeLabel;
	private JPanel centerPanel;
	
	private WorkPanel workPanel = new WorkPanel();
	private SettingPanel settingPanel = new SettingPanel();
	private PreSettingPanel preSettingPanel = new PreSettingPanel();
	private JComponent actualPanel;
	
	private static DetailPanel detailPanel;

	protected DetailPanel() {

		this.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.setPreferredSize(new Dimension(468, 452));
		this.setLayout(new BorderLayout(0, 0));

		detailPanel = this;
		
		this.add(createMenuPanel(), BorderLayout.NORTH);
		this.add(workPanel, BorderLayout.CENTER);
		this.actualPanel = this.getWorkPanel();
		
		detailPanel = this;
	}

	public DetailPanel(JPanel panel) {
		this.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.setPreferredSize(new Dimension(468, 452));
		this.setLayout(new BorderLayout(0, 0));

		this.add(createMenuPanel(), BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	public JPanel createMenuPanel() {

		this.menuPanel = new JPanel();
		this.menuPanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.menuPanel.setPreferredSize(new Dimension(225, 60));
		this.menuPanel.setLayout(new BorderLayout(0, 0));

		this.menuPanel.add(createSeparator(), BorderLayout.SOUTH);
		this.menuPanel.add(createControlPanel(), BorderLayout.EAST);
		this.menuPanel.add(createCenterPanel(), BorderLayout.CENTER);

		return this.menuPanel;
	}

	private JSeparator createSeparator() {

		this.separator = new JSeparator();
		this.separator.setForeground(new Color(Launcher.color - 14, Launcher.color - 11, Launcher.color - 6));
		this.separator.setBackground(new Color(Launcher.color - 14, Launcher.color - 11, Launcher.color - 6));

		return this.separator;
	}

	private JPanel createControlPanel() {

		this.controlPanel = new JPanel();
		this.controlPanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.controlPanel.setLayout(new GridLayout(0, 3, 0, 0));
		this.controlPanel.add(createMinimizePanel());
		this.controlPanel.add(createMaximizePanel());
		this.controlPanel.add(createClosePanel());

		return this.controlPanel;
	}

	private JPanel createMinimizePanel() {

		this.minimizePanel = new JPanel();
		this.minimizePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.minimizePanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.minimizePanel.setLayout(new BorderLayout(0, 0));

		this.minimizeLabel = new JLabel();
		this.minimizeLabel.addMouseListener(new MouseAdapter() {
			 @Override
			 public void mousePressed(MouseEvent e) {
				 Launcher.getFrame().setState(Frame.ICONIFIED);
			 }
		 });
		this.minimizeLabel.setIcon(new ImageIcon("rsc\\minimize.PNG"));
		this.minimizePanel.add(this.minimizeLabel);

		return this.minimizePanel;
	}

	private JPanel createMaximizePanel() {

		this.maximizePanel = new JPanel();
		this.maximizePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.maximizePanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.maximizePanel.setLayout(new BorderLayout(0, 0));

		this.maximizeLabel = new JLabel();
		this.maximizeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Launcher.getFrame().setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		this.maximizeLabel.setIcon(new ImageIcon("rsc\\maximize.PNG"));
		this.maximizePanel.add(this.maximizeLabel, BorderLayout.CENTER);

		return this.maximizePanel;
	}

	private JPanel createClosePanel() {

		this.closePanel = new JPanel();
		this.closePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.closePanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));
		this.closePanel.setLayout(new BorderLayout(0, 0));

		this.closeLabel = new JLabel("");
		this.closeLabel.addMouseListener(new LabelCloseListener());
		this.closeLabel.setBackground(new Color(Launcher.color - 14, Launcher.color - 11, Launcher.color - 6));
		this.closeLabel.setIcon(new ImageIcon("rsc\\close.PNG"));
		this.closePanel.add(this.closeLabel);

		return this.closePanel;
	}

	private JPanel createCenterPanel() {

		this.centerPanel = new JPanel();
		this.centerPanel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent evt) {
				frameMouseDragged(evt);
			}
		});
		this.centerPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				frameMousePressed(evt);
			}
		});
		this.centerPanel.setBackground(new Color(Launcher.color, Launcher.color + 3, Launcher.color + 8));

		return this.centerPanel;
	}
	
	int xy, xx;

	private void frameMouseDragged(MouseEvent evt) {
		int depX = evt.getX() - xx;
		int depY = evt.getY() - xy;
		Launcher.getFrame().setLocation(Launcher.getFrame().getX() + depX, Launcher.getFrame().getY() + depY);
	}

	private void frameMousePressed(MouseEvent evt) {
		xx = evt.getX();
		xy = evt.getY();
	}
	
	public WorkPanel getWorkPanel() {
		return detailPanel.workPanel;
	}

	public SettingPanel getSettingPanel() {
		return detailPanel.settingPanel;
	}
	
	public PreSettingPanel getPreSettingPanel() {
		return detailPanel.preSettingPanel;
	}
	
	public static void setWorkPanel() {
		detailPanel.remove(detailPanel.getActualPanel());
		detailPanel.actualPanel = detailPanel.getWorkPanel();
		detailPanel.add(detailPanel.getWorkPanel());
	}
	
	public static void setSettingPanel() {
		detailPanel.remove(detailPanel.getActualPanel());
		detailPanel.actualPanel = detailPanel.getSettingPanel();
		detailPanel.add(detailPanel.getSettingPanel());
	}
	
	public static void setPreSettingPanel() {
		detailPanel.remove(detailPanel.getActualPanel());
		detailPanel.actualPanel = detailPanel.getPreSettingPanel();
		detailPanel.add(detailPanel.getPreSettingPanel());
	}
	
	public JComponent getActualPanel() {
		return detailPanel.actualPanel;
	}
}