/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author arholman
 */
public class MiniMart extends JFrame {

        private static final int WIDTH = 350;
	private static final int HEIGHT = 200;

	private JTextField usernameTF, passwordTF;
	private JButton loginB, exitB;
        private JLabel usernameL, passwordL;
	
	//Button handlers:
	private LoginButtonHandler lbHandler;
	private ExitButtonHandler ebHandler;
        
        public MiniMart(){
                usernameL = new JLabel("User Name: ", SwingConstants.LEFT);
		passwordL = new JLabel("Password: ", SwingConstants.LEFT);
                
                usernameTF = new JTextField(10);
		passwordTF = new JTextField(10);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		loginB = new JButton("Login");
                loginB.setSize(10, 10);
		lbHandler = new LoginButtonHandler();
		loginB.addActionListener(lbHandler);

		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		setTitle("Welcome to Jan's Mini-Mart Login!");
                SpringLayout layout = new SpringLayout();
		Container pane = getContentPane();
		pane.setLayout(layout);
		
		//Add things to the pane in the order you want them to appear (left to right, top to bottom)
		pane.add(usernameL);
		pane.add(usernameTF);
		pane.add(passwordL);
		pane.add(passwordTF);
		pane.add(loginB);
		pane.add(exitB);
		
                layout.putConstraint(SpringLayout.WEST, usernameL, 75, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, usernameL, 20, SpringLayout.NORTH, pane);
                layout.putConstraint(SpringLayout.WEST, passwordL, 75, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, passwordL, 40, SpringLayout.NORTH, pane);
                layout.putConstraint(SpringLayout.WEST, usernameTF, 150, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, usernameTF, 20, SpringLayout.NORTH, pane);
                layout.putConstraint(SpringLayout.WEST, passwordTF, 150, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, passwordTF, 40, SpringLayout.NORTH, pane);
                layout.putConstraint(SpringLayout.WEST, loginB, 100, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, loginB, 100, SpringLayout.NORTH, pane);
                layout.putConstraint(SpringLayout.WEST, exitB, 200, SpringLayout.WEST, pane);
                layout.putConstraint(SpringLayout.NORTH, exitB, 100, SpringLayout.NORTH, pane);
                
                
		setSize(WIDTH, HEIGHT);
                setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                saleItem candy = new saleItem(0.8, 15, "Candy");
                saleItem soda = new saleItem(1.0, 25, "Soda");
                saleItem sandwich = new saleItem(2.0, 10, "Sandwich");
                saleItem milk = new saleItem(3.0, 4, "Milk");
                saleItem chicken = new saleItem(5.0, 10, "Chicken");
                saleItem juice = new saleItem(2.5, 7, "Juice");
                saleItem tissue = new saleItem(1.0, 12, "Tissue");
                saleItem cracker = new saleItem(0.75, 11, "Cracker");
                saleItem chocolate = new saleItem(0.5, 2, "Chocolate");
                
                try{
                    // Open the file that is the first 
                    // command line parameter
                    FileInputStream fstream = new FileInputStream("textfile.txt");
                    // Get the object of DataInputStream
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    //Read File Line By Line
                    while ((strLine = br.readLine()) != null)   {
                        // Print the content on the console
                        System.out.println (strLine);
                    }
                    //Close the input stream
                    in.close();
                    }catch (Exception e){//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                }
                
                System.out.print(Inventory_List.invList.get(0).getName());
               
        }
            
        public class LoginButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
			setVisible(false);
                        MainMenu startOver = new MainMenu();
                        
		}
	}    
        
        public class ExitButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
        
        public static void main(String[] args) {
            MiniMart login = new MiniMart();
            
        }
}
