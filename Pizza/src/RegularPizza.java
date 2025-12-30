public class RegularPizza extends Pizza implements RegularPizzaInterface {

    private Customer customer;

    public RegularPizza(Customer customer1) {
        this.customer = customer1;
        this.setOrderId(134);
        this.setPrice(customer1.getPrice());
    }

        public void addExtraToppings () {
            System.out.println("Extra Toppings Added");
        }


    }
