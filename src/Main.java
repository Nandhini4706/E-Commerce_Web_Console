import java.lang.reflect.Array;
import java.util.*;
import Model.Login;
import Model.User;
import Model.Product;
import Services.ProductService;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> mobile = new ArrayList<>();
        mobile.add( new Product(1, "Samsung", "Samsung mobile 5G", 120000));
        mobile.add( new Product(2, "Vivo", "Vivo mobile 5G", 150000));

        ArrayList<Product> furniture=new ArrayList<>();
        furniture.add(new Product(1,"Bed","King size",20000));

        ArrayList<Product>  Cosmetics=new ArrayList<>();
        Cosmetics.add(new Product(1,"Mamaearth","Vitamin C,Suitable for all skin types",700));
        ArrayList<Product> Dress=new ArrayList<>();
        Dress.add(new Product(1,"Kurthi Set","Cotton",500));



        boolean boo = false;
        while (true) {
            System.out.println("-------------------------Welcome To Our WebSite-------------------------");

            System.out.println("Enter user Email: ");
            String email = sc.nextLine();

            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            if (email.matches(regex)) {
                System.out.println("Login Successfully✅"); // bscbujs093@gmail.com
                System.out.println("Enter Password");

                String password = sc.nextLine();

                String pass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";

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
                System.out.println("1. Mobile Phones");
                System.out.println("2. Furniture");
                System.out.println("3. Cosmetic");
                System.out.println("4. Dress");
                System.out.println("5.Exit");
              System.out.println("Enter choice: ");
                int num=sc.nextInt();
                switch(num) {
                    case 1:
                        int index=0;

                        while(index <mobile.size()) {
                        Product p=mobile.get(index);
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|Product S.No|   Product Name   |                   Description              |     Price     |");
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");
                            System.out.println("-----------------------------------------------------------------------------------------------");

                            System.out.println("To move next page -> enter '+' symbol");
                        System.out.println("To move previous page -> enter '-' symbol");

                        String sym=sc.next();
                        if(sym.contains("+")) {
                            index++;
                        }else if(sym.contains("-")){
                            index--;
                        }else{
                            break;
                        }
                        if(index>=mobile.size()){
                            System.out.println("End page \uD83D\uDE4C");
                        }
                   }

                        break;
                    case 2:

                        System.out.println("-----------------------------------------------------------------------------------------------");
                        System.out.printf("| %-12s | %-16s | %-40s | %-12s |\n",
                                "Product S.No", "Product Name", "Description", "Price");
                        //System.out.println("| Product S.No |   Product Name   |                   Description              |     Price     |");
                        System.out.println("-----------------------------------------------------------------------------------------------");
                        for(Product p:furniture){

                         /*   System.out.printf("| %-12d | %-16s | %-40s | %-12.2f |\n",
                                    p.getProductId(),
                                    p.getProductName(),
                                    p.getProductDiscription(),
                                    p.getProductPrice());

                          */
                                System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");

                        }System.out.println("-----------------------------------------------------------------------------------------------");

                    case 3:

                        System.out.println("-----------------------------------------------------------------------------------------------");
                        System.out.println("| Product S.No |   Product Name   |                   Description              |     Price     |");
                        System.out.println("-----------------------------------------------------------------------------------------------");
                        for(Product p:Cosmetics){

                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");

                        }System.out.println("-----------------------------------------------------------------------------------------------");

                    case 4:

                        System.out.println("-----------------------------------------------------------------------------------------------");
                        System.out.println("| Product S.No |   Product Name   |                   Description              |     Price     |");
                        System.out.println("------------------------------------------------------------------------------------------------");
                        for(Product p:Dress){

                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");

                        }System.out.println("------------------------------------------------------------------------------------------------");


                    case 5:
                        System.out.println("Do you want to Exit!!!");
                        String s1=sc.next();
                        if(s1.contains("yes")){
                            System.out.println("----------------------Developed BY Nandhini---------------------------");
                            return;
                        }
                }



            }
        }
    }
}