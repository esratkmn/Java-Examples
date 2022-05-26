public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal=new MySqlCustomerDal();//Inheritance yapılar newlenmez tıpkı abstract classlar gibi
        customerDal.Add();

        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
       // customerManager.customerDal=new MySqlCustomerDal();
        customerManager.add();
    }
}
