import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String ,String> sozluk = new HashMap<String, String>();
        sozluk.put("Table","Masa");
        sozluk.put("Sun","Güneş");
        sozluk.put("Paper","kağıt");

        for(String item:sozluk.keySet()){
            System.out.println("Eleman - " + item + " değeri - " + sozluk.get(item));

            sozluk.clear();
            System.out.println(sozluk.get("Table"));
        }
    }
}
