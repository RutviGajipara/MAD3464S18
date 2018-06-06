/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Product {
 int id;
 String name;
 double price;
 String description;
 int quantity;

public Product (int ProductID, String ProductName, double ProductPrice, String ProductDescription, int productquantity)
{
    id = ProductID;
    name = ProductName;
    price = ProductPrice;
    description = ProductDescription;
    quantity = productquantity;
    
}

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int getID(){
    return id;
}

public String getName(){
    return name;
}

public double getPrice(){
    return price;
}

public String getDescription(){
    return description;
}
}