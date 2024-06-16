import springCoreWoSpring.service.DeliverySevice;

class Amazon {
    private DeliverySevice service;
    public void setService(DeliverySevice service) {
      this.service=service;
    }
    public Boolean deliverTheProduct(Double amount) {
      return service.deliverProduct(amount);
    }
  }
