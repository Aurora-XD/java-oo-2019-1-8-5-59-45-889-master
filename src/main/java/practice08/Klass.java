package practice08;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int klass){
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student lead){
        this.leader = lead;
    }

    public Student getLeader() {
        return leader;
    }
}
