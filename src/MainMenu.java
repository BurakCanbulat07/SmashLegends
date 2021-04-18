
import java.awt.Container;
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
        ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\MainMenu.png"); 
        f.setSize(img.getIconWidth(), img.getIconHeight()); 
         
        panel = new JPanel() 
        { 
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) 
			{                                                         
                Image img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\MainMenu.png").getImage();  
                g.drawImage(img, 0, 0, null); 
            } 
			
			
			
        }; 
         
        con.add(panel); 
        panel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
 
         
         
        panel.setLayout(null); 
         
        f.setResizable(false); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JButton start = new JButton();
        start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new characterChoose();
			f.setVisible(false);
				
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
		ImageIcon helpIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\HelpScreen.png");
		helpImage.setIcon(helpIco);
		helpImage.setBounds(0,0,1400,800);
		helpImage.setRolloverEnabled(false);
		
		JButton back=new JButton();
		ImageIcon backIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\BackButton.png");
		ImageIcon backIcoPre = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\BackButtonPresseed.png");
		back.setIcon(backIco);
		back.setRolloverIcon(backIcoPre);
		back.setBounds(10,10,21,23);
		
		JButton help = new JButton();
		help.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit.setVisible(false);
				start.setVisible(false);
				help.setVisible(false);
				back.setVisible(true);
				
				helpImage.setVisible(true);
				
			}
		});
		
		
		ImageIcon helpButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\MainMenuHelpButton.png");
		ImageIcon helpButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\BasiliMainMenuHelpButton.png");
		help.setIcon(helpButton);
		help.setRolloverIcon(helpButtonBasili);
		help.setBounds(300,500,270,110);
		
		ImageIcon startButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\MainMenuStartButton.png");
		ImageIcon startButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\BasiliMainMenuStartButton.png");
		start.setIcon(startButton);
		start.setRolloverIcon(startButtonBasili);
		start.setBounds(600,500,270,110);
		
		ImageIcon exitButton = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\MainMenuExitButton.png");
		ImageIcon exitButtonBasili = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\mainMenuIMG\\BasiliMainMenuExitButton.png");
		exit.setIcon(exitButton);
		exit.setRolloverIcon(exitButtonBasili);
		exit.setBounds(900,500,270,110);
		
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				helpImage.setVisible(false);
				back.setVisible(false);
				help.setVisible(true);
				start.setVisible(true);
				exit.setVisible(true);
				
			}
		});
		
		f.add(back);
		f.add(helpImage);
		f.add(start);
		f.add(exit);
		f.add(help);
		
		back.setVisible(false);
		helpImage.setVisible(false);
		help.setVisible(true);
		start.setVisible(true);
		exit.setVisible(true);
		
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1400,800);
		f.setVisible(true);
		 
    }

	


}
