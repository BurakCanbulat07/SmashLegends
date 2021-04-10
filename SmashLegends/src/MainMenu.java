
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container con = null; 
    JPanel panel;
    
    
    public MainMenu()   
    { 
    	JFrame f = new JFrame();
    	
        f.setTitle("Smash Legends"); 
        con = f.getContentPane(); 
         
        con.setLayout(null); 
        ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\MainMenu.png"); 
        f.setSize(img.getIconWidth(), img.getIconHeight()); 
         
        panel = new JPanel() 
        { 
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) 
			{                                                         
                Image img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\MainMenu.png").getImage(); 
                Dimension size = new Dimension(img.getWidth(null), img.getHeight(null)); 
                setPreferredSize(size); 
                setMinimumSize(size); 
                setMaximumSize(size); 
                setSize(size); 
                setLayout(null); 
                g.drawImage(img, 0, 0, null); 
            } 
			
			
			
        }; 
         
        con.add(panel); 
        panel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
 
         
         
        panel.setLayout(null); 
         
        f.setResizable(false); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JButton play = new JButton();
        play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
        JButton exit = new JButton();
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
		JButton helpImage = new JButton();
		ImageIcon helpIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\HelpScreen.png");
		helpImage.setIcon(helpIco);
		helpImage.setBounds(0,0,1400,800);
		helpImage.setRolloverEnabled(false);
		
		JButton back=new JButton();
		ImageIcon backIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\BackButton.png");
		ImageIcon backIcoPre = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\BackButtonPresseed.png");
		back.setIcon(backIco);
		back.setRolloverIcon(backIcoPre);
		back.setBounds(10,10,21,23);
		
		JButton help = new JButton();
		help.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit.setVisible(false);
				play.setVisible(false);
				help.setVisible(false);
				back.setVisible(true);
				
				helpImage.setVisible(true);
				
			}
		});
		
		
		ImageIcon helpButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\MainMenuHelpButton.png");
		ImageIcon helpButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\BasiliMainMenuHelpButton.png");
		help.setIcon(helpButton);
		help.setRolloverIcon(helpButtonBasili);
		help.setBounds(300,500,270,110);
		
		ImageIcon playButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\MainMenuStartButton.png");
		ImageIcon playButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\BasiliMainMenuStartButton.png");
		play.setIcon(playButton);
		play.setRolloverIcon(playButtonBasili);
		play.setBounds(600,500,270,110);
		
		ImageIcon exitButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\MainMenuExitButton.png");
		ImageIcon exitButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\images\\BasiliMainMenuExitButton.png");
		exit.setIcon(exitButton);
		exit.setRolloverIcon(exitButtonBasili);
		exit.setBounds(900,500,270,110);
		
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				helpImage.setVisible(false);
				back.setVisible(false);
				help.setVisible(true);
				play.setVisible(true);
				exit.setVisible(true); 
				
			}
		});
		
		f.add(back);
		f.add(helpImage);
		f.add(play);
		f.add(exit);
		f.add(help);
		
		back.setVisible(false);
		helpImage.setVisible(false);
		help.setVisible(true);
		play.setVisible(true);
		exit.setVisible(true);
		
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1400,800);
		f.setVisible(true);
		
    }

	public static void main(String[] args) {
		
		 new MainMenu().setVisible(true);
		 
		
		
	}


}
