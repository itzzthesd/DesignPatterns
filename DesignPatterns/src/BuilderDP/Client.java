package BuilderDP;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {

      /*  Student s = Student.getBuilder()
                .setAge(20)
                .setName("abc")
                .build();*/

        Student st = Student.getBuilder()
                .setName("subhadip")
                .setAge(30)
                .build();

        System.out.println(st.name);

        
    }
}
