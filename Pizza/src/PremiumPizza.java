public class PremiumPizza extends Pizza implements PreminumPizzaInterface {
     private Customer customer;

     public PremiumPizza(Customer customer){
         this.customer=customer;
         this.setOrderId(392);
         this.setPrice(20);

     }
    public void addGourmetCrust(){
        System.out.println("Gourmet Crust Added");
    }



}
