/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author arholman
 */
public class MainMenu extends JFrame{
    
        private static final int WIDTH = 500;
	private static final int HEIGHT = 250;
        
	private JButton saleB, orderB, inventoryB, logoffB;
        private JLabel saleL, orderL, inventoryL, logoffL;
	
        private SaleButtonHandler sbHandler;
        private OrderButtonHandler obHandler;
        private InventoryButtonHandler ibHandler;
	private LogOffButtonHandler lbHandler;
        
        
        public MainMenu(){
            
                saleL = new JLabel("Make a Sale or Return", SwingConstants.LEFT);
		orderL = new JLabel("Order From Shipper", SwingConstants.LEFT);
                inventoryL = new JLabel("Inventory", SwingConstants.LEFT);
                logoffL = new JLabel("Logoff", SwingConstants.LEFT);
                
                
		
		//Specify handlers for each button and add (register) ActionListeners to each button.
		saleB = new JButton("SALES");
                saleB.setSize(20, 20);
		sbHandler = new MainMenu.SaleButtonHandler();
		saleB.addActionListener(sbHandler);
                
                orderB = new JButton("ORDER");
                orderB.setSize(20, 20);
		obHandler = new MainMenu.OrderButtonHandler();
		orderB.addActionListener(obHandler);
                
                inventoryB = new JButton("INVENTORY");
                inventoryB.setSize(20, 20);
		ibHandler = new MainMenu.InventoryButtonHandler();
		inventoryB.addActionListener(ibHandler);
                
                logoffB = new JButton("LOGOFF");
                logoffB.setSize(20, 20);
		lbHandler = new MainMenu.LogOffButtonHandler();
		logoffB.addActionListener(lbHandler);
		
                            
                setTitle("Jan's Mini-Mart: Main Menu");
                SpringLayout nlayout = new SpringLayout();
		Container npane = getContentPane();
		npane.setLayout(nlayout);
		
                
		npane.add(saleL);
                npane.add(orderL);
                npane.add(inventoryL);
                npane.add(logoffL);
                npane.add(saleB);
                npane.add(orderB);
                npane.add(inventoryB);
                npane.add(logoffB);
		
                nlayout.putConstraint(SpringLayout.WEST, saleL, 75, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, saleL, 50, SpringLayout.NORTH, npane);
                nlayout.putConstraint(SpringLayout.WEST, saleB, 75, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, saleB, 20, SpringLayout.NORTH, npane);
                
                nlayout.putConstraint(SpringLayout.WEST, orderL, 300, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, orderL, 50, SpringLayout.NORTH, npane);
                nlayout.putConstraint(SpringLayout.WEST, orderB, 300, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, orderB, 20, SpringLayout.NORTH, npane);
                
                nlayout.putConstraint(SpringLayout.WEST, inventoryL, 75, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, inventoryL, 130, SpringLayout.NORTH, npane);
                nlayout.putConstraint(SpringLayout.WEST, inventoryB, 75, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, inventoryB, 100, SpringLayout.NORTH, npane);
                
                nlayout.putConstraint(SpringLayout.WEST, logoffL, 300, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, logoffL, 130, SpringLayout.NORTH, npane);
                nlayout.putConstraint(SpringLayout.WEST, logoffB, 300, SpringLayout.WEST, npane);
                nlayout.putConstraint(SpringLayout.NORTH, logoffB, 100, SpringLayout.NORTH, npane);
            
                
                setSize(WIDTH, HEIGHT);
                setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
        public class SaleButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        Sale sales = new Sale();
                        
		}
	}
        
        public class OrderButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        Order order = new Order();
                        
		}
	}
        
        public class InventoryButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        Inventory inv = new Inventory();
                        
		}
	}
        
        public class LogOffButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        MainMenu.this.dispose();
                        MiniMart restart = new MiniMart();
                        
		}
	}
    
}
