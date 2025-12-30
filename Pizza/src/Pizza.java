public abstract class Pizza extends BaseFuntionalities implements PizzaInterface{

    public void orderPizza(int size){
        int price=0;
        size = size * getPrice();
        System.out.println("Pizza Ordered");
        System.out.println("Price:"+size);

    }
    public void Cancel(){
        System.out.println("Pizza Canceled");
    }
}
