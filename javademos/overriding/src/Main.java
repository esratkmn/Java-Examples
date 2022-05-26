public class Main {
    public static void main(String[] args) {
       /* OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.Hesapla(1000));*/

        BaseKrediManager[] baseKrediManagers=new BaseKrediManager[]{new TarimKrediManager(),new OgretmenKrediManager(),new UniversiteKredi()};
         for(BaseKrediManager baseKrediManager:baseKrediManagers){
             System.out.println(baseKrediManager.Hesapla(1000));;
         }
    }
}
