import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList sayilar= new ArrayList();
       sayilar.add(1);
       sayilar.add(10);
       sayilar.add("Ankara");
        System.out.println(sayilar.size());
        //System.out.println(sayilar.contains(10));
        //sayilar.remove(0);
        System.out.println(sayilar.size());
        for(Object i:sayilar){
            System.out.println(i);
        }
    }
}