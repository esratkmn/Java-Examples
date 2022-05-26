public class Main {
    public static void main(String[] args) {
        int number=-8;
        boolean ısPrime=true;
        if(number==1){
            System.out.println("sayı asal değil");
            return;
        }
        if(number<1){
            System.out.println("geçersiz sayı girdiniz");
            return;
        }
      for(int i=2;i<number;i++) {
          if (number % i == 0) {
              ısPrime = false;
          }
      }
              if (ısPrime) {
                  System.out.println("number is prime");
              }
              else {
                  System.out.println("number is not prime");
              }

            }
          }




