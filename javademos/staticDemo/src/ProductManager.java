public class ProductManager {
    public void Add(Product product) {
        ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("eklendi");
        } else {
            System.out.println("ürün bilgisi geçersiz");
        }
    }
}