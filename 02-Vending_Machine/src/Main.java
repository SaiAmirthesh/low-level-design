public class Main {
    public static  void main(String [] args){
        VendingMachine vendingMachine = new VendingMachine(10);

        vendingMachine.addProducts(new Product(1,"Cricket Ball",5,30.0));
        vendingMachine.addProducts(new Product(2,"Tennis Ball",2,20.0));
        vendingMachine.addProducts(new Product(3,"FootBall",1,10.0));
        Transaction payment = new Transaction(3,30.0);
        VendingMachineService service = new VendingMachineService(payment,vendingMachine);
        service.checkStock();
        service.cancel();
    }
}
