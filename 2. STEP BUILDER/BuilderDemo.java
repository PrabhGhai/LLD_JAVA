public class BuilderDemo {
    public static void main(String[] args) {

        Student s1 = new Student.Builder()
                .setId(1)
                .setName("Prabh")
                .setCity("Noida")
                .build();

        Student s2 = Student.Builder.builder()
                .setId(2)
                .setName("Prabh Ghai")
                .setCity("Gurgaon")
                .build();
        System.out.println(s1);
        System.out.println(s2);
    }
}
