public class Main {
    public static void main(String[] args) {
        double[] myList = {0.5, 2.5, 3.4, 4.1};
        double total=0;
        double max= myList[0];
        for (double number : myList) {
            if(max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("toplam= " +total);
        System.out.println("en büyük = " +max);
    }
}
