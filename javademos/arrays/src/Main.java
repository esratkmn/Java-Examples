public class Main {
    public static void main(String[] args) {
        String student1 = "Esra";
        String student2 = "Songül";
        String student3= "Şükran";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("----------------");

        String[] students = new String[3];
        students[0]="Esra";
        students[1]="Songül";
        students[2]="Şükran";

        for(int i=0;i<students.length;i++) {

            System.out.println(students[i]);

        }
        System.out.println("---------------");
        for(String student:students) {
            System.out.println(student);
        }




    }
}
