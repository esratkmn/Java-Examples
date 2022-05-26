public class Main {
    public static void main(String[] args) {
       Product product=new Product(1,"Asus ","Laptop",5000,5);
       product.setId(1);
       product.setName("Laptop");
       product.setDescription("Asus laptop");
       product.setStockAmount(5000);
       product.getId();
       product.setId(1);
       product.getKod();


       ProductManager productManager=new ProductManager();
       productManager.Add(product);

       //System.out.println(product.name);
       System.out.println(product.getKod());
    }
}
