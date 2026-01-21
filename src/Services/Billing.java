package Services;

import Model.Product;

public class Billing {
    private int billingId;
    private int totalPrice;

    public int calculatePrice(Product product, int quantity){
        totalPrice= product.getProductPrice() * quantity;
        return totalPrice;
    }
}
