package lab1_solution;

/**
 *
 * @author purban1
 */
public class TenPercentSaleStrategy implements DiscountStrategy{
    private double discount = .9;
    
    public double getDiscount(double price){
        return price * discount;
    }
}
