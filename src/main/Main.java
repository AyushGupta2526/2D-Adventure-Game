package main;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	
	public static JFrame window;
	
	public static void main(String args[]) {

		window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Blue Boy Adventure");
		new Main().getIcon();
		

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		

		gamePanel.config.loadConfig();
		if(gamePanel.fullScreenOn == true) {
			window.setUndecorated(true);
		}
		
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
		gamePanel.setUpGame();
		gamePanel.startGameThread();
	}

	public void getIcon(){

		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("Player/boy_down_1.png"));
		window.setIconImage(icon.getImage());
	}
}
