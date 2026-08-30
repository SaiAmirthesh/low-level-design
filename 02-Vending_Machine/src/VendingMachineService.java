public class VendingMachineService {

    int productId;
    double amount;
    VendingMachine machine;

    VendingMachineService(Transaction payment,VendingMachine machine){
        this.productId = payment.Selected;
        this.amount = payment.amount;
        this.machine = machine;
    }

    public void checkStock(){
        Product need = machine.findProduct(productId);
        if(need.getQty()<=0){
            System.out.println("Stock not available");
            machine.setMachineState(States.IDLE);
            return;
        }
        machine.setMachineState(States.PRODUCT_SELECTED);
    }

    public void checkPay(){
        machine.setMachineState(States.PAYMENT_PENDING);
        Product need = machine.findProduct(productId);
        if(need.getRate()>this.amount){
            System.out.println("Insufficient amount to buy the product");
            machine.setMachineState(States.IDLE);
            return;
        }
        amount-=need.getRate();
        if(amount!=0){
            System.out.println("Returning change of " + amount +" rupees");
        }
        machine.setMachineState(States.DISPENSING);
    }

    public void dispense(){
        Product need = machine.findProduct(productId);
        System.out.println("Product " + need.productName + " is dispensed");
        need.setQty(need.getQty()-1);
        machine.setMachineState(States.IDLE);
    }

    public void cancel() {
        System.out.println("Transaction cancelled");
        System.out.println("Returning " + amount + " rupees");
        amount = 0;
        machine.setMachineState(States.IDLE);
    }

}
