public class Main {
    public static void main(String[] args) {
        char harf = 'V';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince sesli harf");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz");


        }
    }
}
