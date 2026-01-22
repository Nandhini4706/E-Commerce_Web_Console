package Services;
import Model.Product;
import java.util.*;
public class ProductService {
    private ArrayList<Product>products=new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);

    }
    public ArrayList<Product> getAllproducts(){
        return products;
    }
}
