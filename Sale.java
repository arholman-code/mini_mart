/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Andrew
 */
public class Sale extends JFrame{
    
        private static final int WIDTH = 500;
        private static final int HEIGHT = 230;
        private static double salesTotal = 0;

        private JLabel totalL, totalIntL;
        private JButton candyB, sodaB, sandwichB, milkB, chickenB;
        private JButton juiceB, tissueB, lighterB, crackerB, chocB;
        private JList currSale;
        private DefaultListModel listModel;
        private JScrollPane saleScroller;
        private JCheckBox sale, returns;

        private CandyButtonHandler cbHandler;
        private SodaButtonHandler sbHandler;
        private SandwichButtonHandler swbHandler;
        private MilkButtonHandler mbHandler;
        private ChickenButtonHandler chicHandler;
        private JuiceButtonHandler jbHandler;
        private TissueButtonHandler tbHandler;
        private LighterButtonHandler lbHandler;
        private CrackerButtonHandler crbHandler;
        private ChocolateButtonHandler chocHandler;
    
        public Sale(){
            listModel = new DefaultListModel();

            totalL = new JLabel("Total: ", SwingConstants.LEFT);
            totalIntL = new JLabel("$" + salesTotal + "0", SwingConstants.RIGHT);

            currSale = new JList (listModel);
            currSale.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            currSale.setSelectedIndex(currSale.getLastVisibleIndex());
            saleScroller = new JScrollPane(currSale);
            
            sale = new JCheckBox("Sale");
            returns = new JCheckBox("Return");
            
            candyB = new JButton("Candy");
            candyB.setSize(20, 20);
            cbHandler = new CandyButtonHandler();
            candyB.addActionListener(cbHandler);

            sodaB = new JButton("Soda");
            sodaB.setSize(20, 20);
            sbHandler = new SodaButtonHandler();
            sodaB.addActionListener(sbHandler);

            sandwichB = new JButton("Sandwich");
            sandwichB.setSize(20, 20);
            swbHandler = new SandwichButtonHandler();
            sandwichB.addActionListener(swbHandler);

            milkB = new JButton("Milk");
            milkB.setSize(20, 20);
            mbHandler = new MilkButtonHandler();
            milkB.addActionListener(mbHandler);
            
            chickenB = new JButton("Chicken");
            chickenB.setSize(20, 20);
            chicHandler = new ChickenButtonHandler();
            chickenB.addActionListener(chicHandler);
            
            juiceB = new JButton("Juice");
            juiceB.setSize(20, 20);
            jbHandler = new JuiceButtonHandler();
            juiceB.addActionListener(jbHandler);
            
            tissueB = new JButton("Tissue");
            tissueB.setSize(20, 20);
            tbHandler = new TissueButtonHandler();
            tissueB.addActionListener(tbHandler);
            
            lighterB = new JButton("Lighter");
            lighterB.setSize(20, 20);
            lbHandler = new LighterButtonHandler();
            lighterB.addActionListener(lbHandler);
            
            crackerB = new JButton("Cracker");
            crackerB.setSize(20, 20);
            crbHandler = new CrackerButtonHandler();
            crackerB.addActionListener(crbHandler);
            
            chocB = new JButton("Chocolate");
            chocB.setSize(20, 20);
            chocHandler = new ChocolateButtonHandler();
            chocB.addActionListener(chocHandler);
            

            saleScroller.setPreferredSize(new Dimension(150,150));
            
            setTitle("Sale or Return Menu");
            SpringLayout nlayout = new SpringLayout();
            Container npane = getContentPane();
            npane.setLayout(nlayout);

            npane.add(saleScroller);
            nlayout.putConstraint(SpringLayout.WEST, saleScroller, 325, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, saleScroller, 5, SpringLayout.NORTH, npane);

            npane.add(totalL);
            nlayout.putConstraint(SpringLayout.WEST, totalL, 325, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, totalL, 160, SpringLayout.NORTH, npane);

            npane.add(totalIntL);
            nlayout.putConstraint(SpringLayout.WEST, totalIntL, 425, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, totalIntL, 160, SpringLayout.NORTH, npane);
            
            npane.add(sale);
            nlayout.putConstraint(SpringLayout.WEST, sale, 15, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sale, 150, SpringLayout.NORTH, npane);
            
            npane.add(returns);
            nlayout.putConstraint(SpringLayout.WEST, returns, 70, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, returns, 150, SpringLayout.NORTH, npane);

            npane.add(candyB);
            nlayout.putConstraint(SpringLayout.WEST, candyB, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, candyB, 5, SpringLayout.NORTH, npane);

            npane.add(sandwichB);
            nlayout.putConstraint(SpringLayout.WEST, sandwichB, 75, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sandwichB, 5, SpringLayout.NORTH, npane);

            npane.add(milkB);
            nlayout.putConstraint(SpringLayout.WEST, milkB, 167, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, milkB, 5, SpringLayout.NORTH, npane);

            npane.add(sodaB);
            nlayout.putConstraint(SpringLayout.WEST, sodaB, 225, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sodaB, 5, SpringLayout.NORTH, npane);
            
            npane.add(chickenB);
            nlayout.putConstraint(SpringLayout.WEST, chickenB, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, chickenB, 50, SpringLayout.NORTH, npane);
            
            npane.add(juiceB);
            nlayout.putConstraint(SpringLayout.WEST, juiceB, 85, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, juiceB, 50, SpringLayout.NORTH, npane);
            
            npane.add(tissueB);
            nlayout.putConstraint(SpringLayout.WEST, tissueB, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, tissueB, 50, SpringLayout.NORTH, npane);
            
            npane.add(lighterB);
            nlayout.putConstraint(SpringLayout.WEST, lighterB, 225, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, lighterB, 50, SpringLayout.NORTH, npane);
            
            npane.add(crackerB);
            nlayout.putConstraint(SpringLayout.WEST, crackerB, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, crackerB, 100, SpringLayout.NORTH, npane);
            
            npane.add(chocB);
            nlayout.putConstraint(SpringLayout.WEST, chocB, 75, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, chocB, 100, SpringLayout.NORTH, npane);

            sale.doClick();
            
            setSize(WIDTH, HEIGHT);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        
        public class CandyButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                    listModel.addElement("Candy    $0.80");
                    salesTotal+= .8;
		}
	}
        
        public class SodaButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                     listModel.addElement("Soda    $1.00");
                     salesTotal += 1.0;
		}
	}
        
        public class SandwichButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                     listModel.addElement("Sandwich  $2.00");
                     salesTotal += 2.0;
		}
	}
        
        public class MilkButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Milk    $3.00");
                        salesTotal += 3.0;
		}
	}
        
        public class ChickenButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                       listModel.addElement("Chicken    $5.00");
                       salesTotal += 5.0;
		}
	}
        
        public class JuiceButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Juice    $2.50");
                        salesTotal += 2.5;
		}
	}
        
        public class TissueButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Tissues    $1.00");
                        salesTotal += 1.0;
		}
	}
        
        public class LighterButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Lighter    $1.00");
                        salesTotal += 1.0;
		}
	}
        
        public class CrackerButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Cracker    $0.75");
                        salesTotal += 0.75;
		}
	}
        
        public class ChocolateButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                        listModel.addElement("Chocolate   $0.50");
                        salesTotal += 0.5;
		}
	}
}
