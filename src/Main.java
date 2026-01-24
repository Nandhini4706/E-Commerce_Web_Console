import java.lang.reflect.Array;
import java.util.*;
import Model.Login;
import Model.User;
import Model.Product;
import Services.ProductService;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Product> map = new HashMap<>();
        ProductService ps = new ProductService();
        map.put(1, new Product(1, "Samsung", "Samsung mobile 5G", 120000));
        map.put(2, new Product(2, "Vivo", "Vivo mobile 5G", 150000));

        boolean boo = false;
        while (true) {
            System.out.println("------------------------Welcome To Our WebSite------------------------");

            System.out.println("Enter user Email: ");
            String email = sc.nextLine();

            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            if (email.matches(regex)) {
                System.out.println("Login Successfully✅"); // bscbujs093@gmail.com
                System.out.println("Enter Password");

                String password = sc.nextLine();

                String pass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

                if (password.matches(pass)) {
                    System.out.println("Password Created Successfully");  // dbAS34@ASsd34!
                   int count=1;
                   int count1=1;
                    Login login=new Login(email,password,count++);
                    System.out.println("Enter User Name: ");
                    String name=sc.nextLine();
                    User user=new User(login, count1++,name);

                    boo = true;

                } else {
                    System.out.println("Password is weak");
                }
            } else {
                System.out.println("Invalid Email");
            }
            if(boo){
                System.out.println("Welcome To E-commerce ");
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("|Product S.No|   Product Name   |                   Description              |     Price     |");
                System.out.println("-----------------------------------------------------------------------------------------------");

                for(Product p :map.values()){

                    System.out.println("|      " +p.getProductId() +"     |       " +p.getProductName() +"    |               " +p.getProductDiscription() +"             |   " +p.getProductPrice()+"      |");

                }
                System.out.println("-----------------------------------------------------------------------------------------------");


                break;

            }
        }
    }
}