public class Main {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("mükemmel  : geçtiniz");
                break;
            case 'B':
                System.out.println("harika : geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : geçtiniz");
                break;
            case 'D':
                System.out.println("Şartlı geçtiniz");
                break;
            case 'F':
                System.out.println("maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
