package lab1.solution;

import lab1.*;
import java.text.NumberFormat;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Product[] products = {
            new BaseballHat("Brewers Baseball Hat", "BH100",19.95),
            new LeatherBelt("Men's Leather Dress Belt", "LB201", 39.50),
            new Socks("Women's Cotton Socks (Large)", "WS45", 25.88)
        };
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Regular Price - Zero Discount       
        System.out.println("Nothing on Sale");
        for(Product p : products) {
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }
        
        // Give a 10% Discount to everything
        for(Product p : products){
            p.setDiscountStrategy(new TenPercentSaleStrategy());
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("10% OFF");
        // Output price with discount
        for(Product p : products) {
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }
        
        // Give a 25% Discount to everything
        for(Product p : products){
            p.setDiscountStrategy(new QuarterOffSaleStrategy());
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("25% OFF");
        // Output price with discount
        for(Product p : products) {
            System.out.println(p.getPartNumber() + ", "
                    + p.getPartName() + ", Price: "
                    + nf.format(p.getPrice()) + ", Discount: "
                    + nf.format(p.getDiscountInDollars()));
        }
    }
}
