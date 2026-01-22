package Model;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;

    public Product(int productId,String productName,String productDescription, int productPrice) {
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productId = productId;
    }


    public int getProductPrice() {
        return productPrice;

    }

    public String getProductDiscription() {
        return productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

}
