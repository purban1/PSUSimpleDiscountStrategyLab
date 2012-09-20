package lab1.solution;

/**
 *
 * @author purban1
 */
public class HalfOffSaleStrategy implements DiscountStrategy{
    private double discount = .5;
    
    public double getDiscount(double price){
        return price * discount;
    }
}
