public class Customer extends BaseFuntionalities implements CustomerInterface{

    private String orderType;
    private int size;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}

