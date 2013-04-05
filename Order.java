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
 * @author Andrew
 */
public class Order extends JFrame{
        private static final int WIDTH = 800;
        private static final int HEIGHT = 530;
        
        private JTextField s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
        private JLabel candyL, sodaL, sandwichL, milkL, chickenL;
        private JLabel juiceL, tissueL, lighterL, crackerL, chocL;
        private JLabel selectL;
        private JButton sendOrder, resetOrder, cancelOrder;
        private SendButtonHandler sbHandler;
        private ResetButtonHandler rbHandler;
        private CancelButtonHandler cbHandler;
        private JCheckBox seller1, seller2, seller3;
        
        public Order(){
            s1 = new JTextField("", 2);
            candyL = new JLabel("Box of Candy X 1");
            s2 = new JTextField("", 2);
            sodaL = new JLabel("Box of Soda X 1");
            s3 = new JTextField("", 2);
            sandwichL = new JLabel("Sandwiches X 1");
            s4 = new JTextField("", 2);
            milkL = new JLabel("Milk X 1");
            s5 = new JTextField("", 2);
            chickenL = new JLabel("Box of Chicken X 1");
            s6 = new JTextField("", 2);
            juiceL = new JLabel("Juice X 1");
            s7 = new JTextField("", 2);
            tissueL = new JLabel("Tissues X 1");
            s8 = new JTextField("", 2);
            lighterL = new JLabel("Lighters X 1");
            s9 = new JTextField("", 2);
            crackerL = new JLabel("Box of Crackers X 1");
            s10 = new JTextField("", 2);
            chocL = new JLabel("Box of Chocolate X 1");
            
            sendOrder = new JButton("Send Order");
            sendOrder.setSize(20, 20);
            sbHandler = new SendButtonHandler();
            sendOrder.addActionListener(sbHandler);
            
            resetOrder = new JButton("Reset Order");
            resetOrder.setSize(20, 20);
            rbHandler = new ResetButtonHandler();
            resetOrder.addActionListener(rbHandler);
            
            cancelOrder = new JButton("Cancel Order");
            cancelOrder.setSize(20, 20);
            cbHandler = new CancelButtonHandler();
            cancelOrder.addActionListener(cbHandler);
            
            seller1 = new JCheckBox ("Seller 1");
            seller2 = new JCheckBox ("Seller 2");
            seller3 = new JCheckBox ("Seller 3");
            
            selectL = new JLabel("Select the shipper:", SwingConstants.LEFT);
            
            setTitle("Place an Order");
            SpringLayout nlayout = new SpringLayout();
            Container npane = getContentPane();
            npane.setLayout(nlayout);
            
            npane.add(selectL);
            nlayout.putConstraint(SpringLayout.WEST, selectL, 350, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, selectL, 290, SpringLayout.NORTH, npane);
            
            npane.add(seller1);
            nlayout.putConstraint(SpringLayout.WEST, seller1, 170, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, seller1, 320, SpringLayout.NORTH, npane);
            
            npane.add(seller2);
            nlayout.putConstraint(SpringLayout.WEST, seller2, 370, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, seller2, 320, SpringLayout.NORTH, npane);
            
            npane.add(seller3);
            nlayout.putConstraint(SpringLayout.WEST, seller3, 570, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, seller3, 320, SpringLayout.NORTH, npane);
            
            npane.add(candyL);
            nlayout.putConstraint(SpringLayout.WEST, candyL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, candyL, 5, SpringLayout.NORTH, npane);
            npane.add(s1);
            nlayout.putConstraint(SpringLayout.WEST, s1, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s1, 5, SpringLayout.NORTH, npane);
            
            npane.add(sodaL);
            nlayout.putConstraint(SpringLayout.WEST, sodaL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sodaL, 30, SpringLayout.NORTH, npane);
            npane.add(s2);
            nlayout.putConstraint(SpringLayout.WEST, s2, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s2, 30, SpringLayout.NORTH, npane);
            
            npane.add(sandwichL);
            nlayout.putConstraint(SpringLayout.WEST, sandwichL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sandwichL, 55, SpringLayout.NORTH, npane);
            npane.add(s3);
            nlayout.putConstraint(SpringLayout.WEST, s3, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s3, 55, SpringLayout.NORTH, npane);
            
            npane.add(milkL);
            nlayout.putConstraint(SpringLayout.WEST, milkL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, milkL, 80, SpringLayout.NORTH, npane);
            npane.add(s4);
            nlayout.putConstraint(SpringLayout.WEST, s4, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s4, 80, SpringLayout.NORTH, npane);
            
            npane.add(chickenL);
            nlayout.putConstraint(SpringLayout.WEST, chickenL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, chickenL, 105, SpringLayout.NORTH, npane);
            npane.add(s5);
            nlayout.putConstraint(SpringLayout.WEST, s5, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s5, 105, SpringLayout.NORTH, npane);
            
            npane.add(juiceL);
            nlayout.putConstraint(SpringLayout.WEST, juiceL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, juiceL, 130, SpringLayout.NORTH, npane);
            npane.add(s6);
            nlayout.putConstraint(SpringLayout.WEST, s6, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s6, 130, SpringLayout.NORTH, npane);
            
            npane.add(tissueL);
            nlayout.putConstraint(SpringLayout.WEST, tissueL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, tissueL, 155, SpringLayout.NORTH, npane);
            npane.add(s7);
            nlayout.putConstraint(SpringLayout.WEST, s7, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s7, 155, SpringLayout.NORTH, npane);
            
            npane.add(lighterL);
            nlayout.putConstraint(SpringLayout.WEST, lighterL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, lighterL, 180, SpringLayout.NORTH, npane);
            npane.add(s8);
            nlayout.putConstraint(SpringLayout.WEST, s8, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s8, 180, SpringLayout.NORTH, npane);
            
            npane.add(crackerL);
            nlayout.putConstraint(SpringLayout.WEST, crackerL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, crackerL, 205, SpringLayout.NORTH, npane);
            npane.add(s9);
            nlayout.putConstraint(SpringLayout.WEST, s9, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s9, 205, SpringLayout.NORTH, npane);
            
            npane.add(chocL);
            nlayout.putConstraint(SpringLayout.WEST, chocL, 5, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, chocL, 230, SpringLayout.NORTH, npane);
            npane.add(s10);
            nlayout.putConstraint(SpringLayout.WEST, s10, 150, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, s10, 230, SpringLayout.NORTH, npane);
            
            npane.add(sendOrder);
            nlayout.putConstraint(SpringLayout.WEST, sendOrder, 220, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, sendOrder, 400, SpringLayout.NORTH, npane);
            
            npane.add(resetOrder);
            nlayout.putConstraint(SpringLayout.WEST, resetOrder, 340, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, resetOrder, 400, SpringLayout.NORTH, npane);
            
            npane.add(cancelOrder);
            nlayout.putConstraint(SpringLayout.WEST, cancelOrder, 460, SpringLayout.WEST, npane);
            nlayout.putConstraint(SpringLayout.NORTH, cancelOrder, 400, SpringLayout.NORTH, npane);
    
            setSize(WIDTH, HEIGHT);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        
        public class SendButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                    JFrame frame = new JFrame("Success");
                    JOptionPane.showMessageDialog(frame, "Your order has been sent!");
		}
	}
        
        public class ResetButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                    Order.this.dispose();
                    Order o = new Order();
		}
	}
        
        public class CancelButtonHandler implements ActionListener
	{
            @Override
		public void actionPerformed(ActionEvent e)
		{
                    Order.this.dispose();
		}
	}
}
