package ucu.edu.ua.task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder @ToString
public class User {
    public String name;
    private int age;
    private double weight;
    public double height;
    private String gender;

}
