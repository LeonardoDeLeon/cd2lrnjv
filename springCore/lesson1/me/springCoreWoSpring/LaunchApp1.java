class LaunchApp1 {
    public static void main(String[] args){
        System.out.println("LaunchApp1 started");
        System.out.println("Welcome to  loosely coupled Application");
        Amazon amz=new Amazon();
        amz.setService(new DHL());
        Boolean status=amz.deliverTheProduct(4554.4);
        if (status) {
          System.out.println("Product delivered Successfully");
        } else {
          System.out.println("Failed to deliver product");
        }       
    }
}