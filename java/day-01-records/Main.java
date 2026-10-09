public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 21, "Java");
        System.out.println(student);
        System.out.println(student.name());
        System.out.println(student.age());
    }
}

record Student(String name, int age, String track) {}
