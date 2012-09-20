package lab1.solution;

/**
 *
 * @author purban1
 */
public class QuarterOffSaleStrategy implements DiscountStrategy{
    private double discount = .75;
    
    public double getDiscount(double price){
        return price * discount;
    }
}
