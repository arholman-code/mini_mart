/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

/**
 *
 * @author Andrew
 */
public class saleItem implements Inventory_List{
    private double price;
    private int quantity;
    private String name;
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice (double pr){
        price = pr;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int q){
        quantity = q;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public saleItem (double d, int i, String s){
        price = d;
        quantity = i;
        name = s;
        invList.add(this);
    }

}
