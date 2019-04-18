package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentsInClass = new ArrayList<>();
    public List<Teacher> teachersInClass = new ArrayList<>();

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
        for (Teacher thClass : teachersInClass) {
            System.out.print("I am "+thClass.getName()+". I know "+std.getName()+" has joined Class "+number+".\n");
        }
    }

    public void assignLeader(Student lead){
        if(studentsInClass.contains(lead)){
            this.leader = lead;
            for (Teacher thClass : teachersInClass) {
                System.out.print("I am "+thClass.getName()+". I know "+lead.getName()+" become Leader of Class "+number+".\n");
            }
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public boolean isIn(Student std){
        if(studentsInClass.contains(std)){
            return true;
        }
        else {
            return false;
        }
    }
}
