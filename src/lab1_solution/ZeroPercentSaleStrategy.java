package lab1_solution;

/**
 *
 * @author purban1
 * No discount from this module. Price is 100%
 */
public class ZeroPercentSaleStrategy implements DiscountStrategy{
    private double discount = 1.0;
    
    public double getDiscount(double price){
        return price * discount;
    }
}
