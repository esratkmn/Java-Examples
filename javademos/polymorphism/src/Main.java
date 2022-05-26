public class Main {
    public static void main(String[] args) {
        // BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new Console()};
         //for(BaseLogger logger:loggers){
           //  logger.log("Log message");
        // }
         CustomerManager customerManager=new CustomerManager(new Console());
         customerManager.add();


    }
}
