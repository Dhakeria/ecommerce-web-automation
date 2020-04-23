package com.testvagrant.ecom.pricing;
import com.testvagrant.ecom.base.TestBase;
import com.testvagrant.ecom.website.*;

public class ValidatePrice extends TestBase {
    AddQuantityPage addQuantityPage=new AddQuantityPage();

    public double calculatePrice(){

        double priceOfSelectedProduct=Double.parseDouble(addQuantityPage.priceOfProduct());
        System.out.println("Price of the product---> "+priceOfSelectedProduct);

        int quantity=Integer.parseInt(addQuantityPage.getAddQuantity());
        System.out.println("Quantity of the product---> "+quantity);

        double calculatedPrice=priceOfSelectedProduct*quantity;
        System.out.println("Total Price ---> "+calculatedPrice);
        return calculatedPrice;

    }
}
