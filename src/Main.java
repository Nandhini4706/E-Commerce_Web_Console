import java.util.*;
import Model.Login;
import Model.User;
import Model.Product;
import Services.Billing;
import Services.ProductService;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> mobile = new ArrayList<>();
        mobile.add( new Product(1, "Samsung", "Samsung A14 mobile 5G", 8500));
        mobile.add( new Product(2, "Vivo", "Vivo mobile 5G", 18000));
        mobile.add(new Product(3,"Redmi","Redmi A4 5G",10000));
        mobile.add(new Product(4,"Motorola","Motorola Edge 5G",19426));

        ArrayList<Product> furniture=new ArrayList<>();
        furniture.add(new Product(1,"Bed","King size",20000));

        ArrayList<Product>  Cosmetics=new ArrayList<>();
        Cosmetics.add(new Product(1,"Mamaearth","Vitamin C,Suitable for all skin types",700));
        ArrayList<Product> Dress=new ArrayList<>();
        Dress.add(new Product(1,"Kurthi Set","Cotton",500));

        Billing billing=new Billing();

        boolean boo = false;
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
        while (true) {

            if(boo){
                System.out.println("-----------------------------E-Commerce Menu--------------------------");
                System.out.println("1. Mobile Phones");
                System.out.println("2. Furniture");
                System.out.println("3. Cosmetic");
                System.out.println("4. Dress");
                System.out.println("5.Exit");
                System.out.println("----------------------------------------------------------------------");

              System.out.println("Enter choice: ");
                int num=sc.nextInt();
                switch(num) {
                    case 1:
                        int index = 0;
                        double totalbill = 0;
                        sc.nextLine();
                        while (index < mobile.size()) {
                            Product p = mobile.get(index);
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|Product S.No|   Product Name   |                   Description              |     Price     |");
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "   |           " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");
                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("                                                                                  ------------");
                            System.out.println("                                                                                  |   Buy(B)  |");
                            System.out.println("                                                                                  ------------");
                            System.out.println();
                            System.out.println("To move next page -> enter '+' symbol");
                            System.out.println("To move previous page -> enter '-' symbol");
                            String buy = sc.nextLine();
                            if (buy.equalsIgnoreCase("B")) {
                                System.out.println("How much quantity:");
                                int n = sc.nextInt();
                                sc.nextLine();
                                double bill = billing.calculatePrice(p, n);
                                totalbill = totalbill + bill;
                                System.out.println("---------------------------");
                                System.out.println("|Total Payment: " + totalbill + " |");
                                System.out.println("---------------------------");
                                System.out.println();
                                System.out.println("Payment Method: ");
                                System.out.println("1.Gpay");
                                System.out.println("2.Cash On Delivery");
                                int Pay = sc.nextInt();
                                sc.nextLine();
                                if (Pay == 1) {
                                    System.out.println("Payment SuccessFully✅");
                                    System.out.println("Order Will Delivery as Soon...");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini❤-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                                if (Pay == 2) {
                                    System.out.println("Your Order Is Placed!!!");
                                    System.out.println("Order Will Delivery as Soon\uD83D\uDD1C...");
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini❤-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                            }

                            //String sym=sc.next();
                            if (buy.contains("+")) {
                                index++;
                            } else if (buy.contains("-")) {
                                index--;
                            } else {
                                break;
                            }
                            if (index >= mobile.size()) {
                                System.out.println("End page \uD83D\uDE4C");
                            }
                        }

                        break;
                    case 2:
                        int index1 = 0;
                        double totalbill1 = 0;
                        sc.nextLine();
                        while (index1 < furniture.size()) {
                            Product p = furniture.get(index1);
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|Product S.No|   Product Name   |                   Description              |     Price     |");
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "|               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");
                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("                                                                                  ------------");
                            System.out.println("                                                                                  |   Buy(B)  |");
                            System.out.println("                                                                                  ------------");
                            System.out.println();
                            System.out.println("To move next page -> enter '+' symbol");
                            System.out.println("To move previous page -> enter '-' symbol");
                            String buy = sc.nextLine();
                            if (buy.equalsIgnoreCase("B")) {
                                System.out.println("How much quantity:");
                                int n = sc.nextInt();
                                sc.nextLine();
                                double bill = billing.calculatePrice(p, n);
                                totalbill1 = totalbill1 + bill;
                                System.out.println("---------------------------");
                                System.out.println("|Total Payment: " + totalbill1 + " |");
                                System.out.println("---------------------------");
                                System.out.println();
                                System.out.println("Payment Method: ");
                                System.out.println("1.Gpay");
                                System.out.println("2.Cash On Delivery");
                                int Pay = sc.nextInt();
                                sc.nextLine();
                                if (Pay == 1) {
                                    System.out.println("Payment SuccessFully✅");
                                    System.out.println("Order Will Delivery as Soon...");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                                if (Pay == 2) {
                                    System.out.println("Your Order Is Placed!!!");
                                    System.out.println("Order Will Delivery as Soon \uD83D\uDD1C...");
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                            }

                            //String sym=sc.next();
                            if (buy.contains("+")) {
                                index1++;
                            } else if (buy.contains("-")) {
                                index1--;
                            } else {
                                break;
                            }
                            if (index1 >= furniture.size()) {
                                System.out.println("End page \uD83D\uDE4C");
                            }
                        }
                        break;
                    case 3:
                        int index2 = 0;
                        double totalbill2 = 0;
                        while (index2 < Cosmetics.size()) {
                            Product p = Cosmetics.get(index2);
                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println("| Product S.No |   Product Name   |                   Description              |     Price     |");
                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");

                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("                                                                                  ------------");
                            System.out.println("                                                                                  |   Buy(B)  |");
                            System.out.println("                                                                                  ------------");
                            System.out.println();
                            System.out.println("To move next page -> enter '+' symbol");
                            System.out.println("To move previous page -> enter '-' symbol");
                            String buy = sc.nextLine();
                            if (buy.equalsIgnoreCase("B")) {
                                System.out.println("How much quantity:");
                                int n = sc.nextInt();
                                sc.nextLine();
                                double bill = billing.calculatePrice(p, n);
                                totalbill2 = totalbill2 + bill;
                                System.out.println("---------------------------");
                                System.out.println("|Total Payment: " + totalbill2 + " |");
                                System.out.println("---------------------------");
                                System.out.println();
                                System.out.println("Payment Method: ");
                                System.out.println("1.Gpay");
                                System.out.println("2.Cash On Delivery");
                                int Pay = sc.nextInt();
                                sc.nextLine();
                                if (Pay == 1) {
                                    System.out.println("Payment SuccessFully✅");
                                    System.out.println("Order Will Delivery as Soon...\uD83D\uDD1C");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");

                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                                if (Pay == 2) {
                                    System.out.println("Your Order Is Placed!!!");
                                    System.out.println("Order Will Delivery as Soon...");
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                            }

                            if (buy.contains("+")) {
                                index2++;
                            } else if (buy.contains("-")) {
                                index2--;
                            } else {
                                break;
                            }
                            if (index2 >= mobile.size()) {
                                System.out.println("End page \uD83D\uDE4C");
                            }
                            }

                    break;
                    case 4:
                        int index3=0;
                        double totalbill3=0;
                        sc.nextLine();
                        while(index3<Dress.size()) {
                            Product p = Dress.get(index3);
                            System.out.println("-----------------------------------------------------------------------------------------------");
                            System.out.println("| Product S.No |   Product Name   |                   Description              |     Price     |");
                            System.out.println("------------------------------------------------------------------------------------------------");
                            System.out.println("|      " + p.getProductId() + "     |       " + p.getProductName() + "    |               " + p.getProductDiscription() + "             |   " + p.getProductPrice() + "      |");

                            System.out.println("------------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("                                                                                  ------------");
                            System.out.println("                                                                                  |   Buy(B)  |");
                            System.out.println("                                                                                  ------------");
                            System.out.println();
                            System.out.println("To move next page -> enter '+' symbol");
                            System.out.println("To move previous page -> enter '-' symbol");
                            String buy = sc.nextLine();
                            if (buy.equalsIgnoreCase("B")) {
                                System.out.println("How much qty:");
                                int n = sc.nextInt();
                                sc.nextLine();
                                double bill = billing.calculatePrice(p, n);
                                 totalbill3 = totalbill3 + bill;
                                System.out.println("---------------------------");
                                System.out.println("|Total Payment: " + totalbill3 + " |");
                                System.out.println("---------------------------");
                                System.out.println();
                                System.out.println("Payment Method: ");
                                System.out.println("1.Gpay");
                                System.out.println("2.Cash On Delivery");
                                int Pay = sc.nextInt();
                                sc.nextLine();
                                if (Pay == 1) {
                                    System.out.println("Payment SuccessFully");
                                    System.out.println("Order Will Delivery as Soon...");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                                if (Pay == 2) {
                                    System.out.println("Your Order Is Placed!!!");
                                    System.out.println("Order Will Delivery as Soon...");
                                    System.out.println("Do you want to exit");
                                    String sug = sc.nextLine();
                                    if (sug.equalsIgnoreCase("yes")) {
                                        System.out.println("---------------------------------------------Developed By Nandhini\uFE0F-----------------------------------------");
                                        return;
                                    } else {
                                        continue;
                                    }
                                }
                            }

                            if (buy.contains("+")) {
                                index3++;
                            } else if (buy.contains("-")) {
                                index3--;
                            } else {
                                break;
                            }
                            if (index3 >= mobile.size()) {
                                System.out.println("End page \uD83D\uDE4C");
                            }
                        }

                    case 5:
                        System.out.println("Do you want to Exit!!!");
                        String s1=sc.next();
                        if(s1.contains("yes")){
                            System.out.println("------------------------Developed BY Nandhini❤\uFE0F---------------------------");
                            return;
                        }
                }
            }
        }
    }
}