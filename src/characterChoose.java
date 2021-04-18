import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class characterChoose {
	Container con = null; 
	JPanel panel;
	private boolean firemageSelectP1 = false;
	private boolean firemageSelectP2 = false;
	private boolean knightSelectP1 = false;
	private boolean knightSelectP2 = false;
	
	public characterChoose() {
		JFrame f = new JFrame();
		
		con = f.getContentPane();
		f.setTitle("Smash Legends"); 
		con = f.getContentPane();
        
		con.setLayout(null); 
        ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\darkSky.png"); 
        f.setSize(img.getIconWidth(), img.getIconHeight()); 
         
        panel = new JPanel() 
        { 
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics g) 
			{                  
				super.paint(g);
		        Image img = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\darkSky.png").getImage();  
		        g.drawImage(img, 0, 0, null); 
		        
		        
		        Image firemage1 = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\CharAnimations\\Firemage\\p1\\firemage-idle.gif").getImage();
		        Image firemage2 = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\CharAnimations\\Firemage\\p2\\firemage-idle.gif").getImage();
		        Image knight1 = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\CharAnimations\\Knight\\p1\\sven-thole-knight-idle.gif").getImage();
		        Image knight2 = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\CharAnimations\\Knight\\p2\\sven-thole-knight-idle (1).gif").getImage();
		        if (firemageSelectP1) {
					
				}
		        g.drawImage(firemage1,0,0,null);
		    }
			
			
			
        };
        
        
        con.add(panel); 
        panel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
 
         
         
        panel.setLayout(null);
        
        JButton firemageBtn = new JButton();
        ImageIcon firemageBtnIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\FiremageBtn.png");
        ImageIcon firemageBtnRollIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\FiremageBtnRoll.png");
        firemageBtn.setIcon(firemageBtnIco);
        firemageBtn.setRolloverIcon(firemageBtnRollIco);
        firemageBtn.setBounds(350,550,350,200);
		
        
		
		
		f.add(firemageBtn);
		
		firemageBtn.setVisible(true);
		
		firemageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firemageSelectP1=true;
				
			}
		});
		
		
		JButton knightBtn = new JButton();
        ImageIcon knightBtnIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\KnightBtn.png");
        ImageIcon knightBtnRollIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\KnightBtnRoll.png");
        knightBtn.setIcon(knightBtnIco);
        knightBtn.setRolloverIcon(knightBtnRollIco);
        knightBtn.setBounds(700,550,350,200);
		
        
		
		
		f.add(knightBtn);
		
		knightBtn.setVisible(true);
		
		
		
		JButton selectBtn= new JButton();
        ImageIcon selectBtnIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\SelectBtn.png");
        ImageIcon selectBtnRollIco = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\SmashLegends\\src\\characterChooseIMG\\SelectBtnRoll.png");
        selectBtn.setIcon(selectBtnIco);
        selectBtn.setRolloverIcon(selectBtnRollIco);
        selectBtn.setBounds(525,300,350,200);
		
        
		
		
		f.add(selectBtn);
		
		selectBtn.setVisible(true);
		
		
		f.setSize(1400, 800);
        f.setResizable(false);
		f.add(panel);
		panel.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	
	
	


	

}
