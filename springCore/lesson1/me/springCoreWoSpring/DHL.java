import springCoreWoSpring.service.DeliverySevice;

public class DHL implements DeliverySevice {
    public Boolean deliverProduct(Double amount) {
      System.out.println("Product delivered by DHL: "+amount);
      return true;
    }
  }
