package practice07;

public class Klass {
    private int number;

    public Klass(int klass){
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }
}
