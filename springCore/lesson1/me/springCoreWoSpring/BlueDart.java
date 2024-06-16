import springCoreWoSpring.service.DeliverySevice;

public class BlueDart implements DeliverySevice {
    public Boolean deliverProduct(Double amount) {
      System.out.println("Product delivered by BlueDart: "+amount);
      return true;
    }
  }