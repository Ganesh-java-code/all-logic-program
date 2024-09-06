package in.ganesh.model;

import java.util.Objects;

public class Student {

    private Integer adharId;
    private String name;

    public Student(Integer adharId, String name) {
        this.adharId = adharId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if( this==obj ){
            return true;
        }
//        Student student = (Student)obj;
//        if( this.adharId!=student.adharId )
//        {
//            return false;
//        }
        return true;
    }
}

