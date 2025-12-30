
public class Main {

    public static void main(String[] args){
        Customer customer1=new Customer();
        Customer customer2=new Customer();

        RegularPizza regularPizza1=new RegularPizza(customer1);
        PremiumPizza premiumPizza1=new PremiumPizza(customer1);

        RegularPizza regularPizza2=new RegularPizza(customer2);
        PremiumPizza premiumPizza2=new PremiumPizza(customer2);

        customer1.setOrderType("Regular Pizza");


        customer2.setOrderType("Premium Pizza");
        customer2.setSize(15);


        if(customer1.getOrderType().equals("Regular Pizza")){
            System.out.println("===========CUSTOMER1: REGULAR============");
            regularPizza1.getPrice();
            regularPizza1.orderPizza(3);
            regularPizza1.addExtraToppings();
        }
        else{
            System.out.println("============CUSTOMER1:PREMIUM=============");
            premiumPizza1.orderPizza(customer1.getSize());
            premiumPizza1.addGourmetCrust();
        }
        if(customer2.getOrderType().equals("Regular Pizza")){
            System.out.println("===========CUSTOMER2: REGULAR============");
            regularPizza2.orderPizza(4);
            regularPizza2.addExtraToppings();
        }
        else{
            System.out.println("============CUSTOMER2:PREMIUM=============");
            premiumPizza2.orderPizza(customer2.getSize());
            premiumPizza2.addGourmetCrust();
        }
    }
    }
