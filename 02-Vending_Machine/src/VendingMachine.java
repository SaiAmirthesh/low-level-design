import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> Products;
    States MachineState;
    public VendingMachine(int capacity){
        Products = new ArrayList<>(capacity);
        setMachineState(States.IDLE);
    }

    public void addProducts(Product pro){
        Products.add(pro);
    }

    public Product findProduct(int productId){
        Product found = null;
        for(Product pro : Products){
            if(pro.productId == productId){
                found = pro;
                break;
            }
        }
        if(found==null){
            throw new NullPointerException("Product Not found");
        }
        return found;
    }


    public void setMachineState(States state){
        this.MachineState = state;
    }
}
