package ucu.edu.ua.task1;

public class Main
{
    public static void main( String[] args )
    {

        Student user = Student.builder()
                        .name("Oles")
                        .age(32)
                        .grade(61)
                        .grade(100)
                        .gender("m")
                        .build();

        System.out.println(user);
    }
}
