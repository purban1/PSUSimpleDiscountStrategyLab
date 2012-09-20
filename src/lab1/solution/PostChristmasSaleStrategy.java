package lab1.solution;

/**
 *
 * @author purban1
 */
public class PostChristmasSaleStrategy implements DiscountStrategy{
    private double discount = .7;
    
    public double getDiscount(double price){
        return price * discount;
    }
}
