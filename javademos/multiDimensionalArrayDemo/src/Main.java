public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Balıkesir";
        sehirler[1][0]="Diyarbakır";
        sehirler[1][1]="Gaziantep";
        sehirler[1][2]="Şanlıurfa";
        sehirler[2][0]="Muş";
        sehirler[2][1]="Elazığ";
        sehirler[2][2]="Erzurum";

        String[] bolgeler =new String[3];
        bolgeler[0]="Marmara";
        bolgeler[1]="Güneydoğu";
        bolgeler[2]="Doğu anadolu";

        for(int i=0;i<=2 ;i++){
            System.out.println("------------");
            System.out.println(bolgeler[i]);
            System.out.println();
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);

            }
        }



    }
}
