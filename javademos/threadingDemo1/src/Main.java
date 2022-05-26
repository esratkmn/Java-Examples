public class Main {
    public static void main(String[] args) {
        KronometreThreat thread1=new KronometreThreat("thread1");
        KronometreThreat thread2=new KronometreThreat("thread2");
        KronometreThreat thread3=new KronometreThreat("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
