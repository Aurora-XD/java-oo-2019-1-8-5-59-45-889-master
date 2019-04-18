package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentsInClass = new ArrayList<>();

    public Klass(int klass){
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void appendMember(Student std){
        studentsInClass.add(std);
    }

    public void assignLeader(Student lead){
        if(studentsInClass.contains(lead)){
            this.leader = lead;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

}
