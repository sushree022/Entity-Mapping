package com.assignment.entitymapping.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Employee")
@NoArgsConstructor
public class Employee {
    //Declaration of variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    //Constructors
    public Employee(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //toString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", age=" + age +
//                ", department=" + department +
                '}';
    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "department_department_id")
//    private Department department;
}
