package ucu.edu.ua.task1;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder @ToString(callSuper = true)
public class Student extends User {
    @Singular
    private List<Integer> grades;
}
