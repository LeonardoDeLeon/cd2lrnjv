import springCoreWoSpring.service.DeliverySevice;

public class FedEx implements DeliverySevice {
    public Boolean deliverProduct(Double amount) {
      System.out.println("Product delivered by FedEx: "+amount);
      return true;
    }
  }