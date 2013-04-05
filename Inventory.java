package minimart;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class Inventory extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;

    public Inventory() {
        String[] columnNames = {"Item", "Quantity", "Price", "Cost"};
        Object[][] data = {
            {"Candy", new Integer(1), new Double(1.11), new Double(1.11)},
            {"Soda", new Integer(1), new Double(2.22), new Double(2.22)},
            {"Sandwich", new Integer(1), new Double(3.33), new Double(3.33)},
            {"Milk", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Chicken", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Juice", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Tissue", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Lighter", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Crackers", new Integer(1), new Double(4.44), new Double(4.44)},
            {"Chocolate", new Integer(1), new Double(4.44), new Double(4.44)},
        };
      
      
       setTitle("Inventory");
            SpringLayout nlayout = new SpringLayout();
            Container npane = getContentPane();
            npane.setLayout(nlayout);
            
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {

            private static final long serialVersionUID = 1L;

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                int modelColumn = table.convertColumnIndexToModel(column);
                return (modelColumn == 3) ? false : true;
            }
        }; 
        
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(table);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(scrollPane);
        pack();
        setVisible(true);
        setSize(new Dimension(300, 200));
        setLocationRelativeTo(null);
        
    }

    public void tableChanged(TableModelEvent e) {
        System.out.println(e.getSource());
        if (e.getType() == TableModelEvent.UPDATE) {
            int row = e.getFirstRow();
            int column = e.getColumn();
            if (column == 1 || column == 2) {
                TableModel model = table.getModel();
                int quantity = ((Integer) model.getValueAt(row, 1)).intValue();
                double price = ((Double) model.getValueAt(row, 2)).doubleValue();
                Double value = new Double(quantity * price);
                model.setValueAt(value, row, 3);
            }
        }
    }

      
}

