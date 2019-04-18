package practice04;

public class Student extends Person{
    private int Klass;

    public Student(String name,int age,int Klass){
        super(name,age);
        this.Klass = Klass;
    }

    public int getKlass() {
        return Klass;
    }

    public String introduce(){
        return super.basicIntroduce()+" I am a Student. I am at Class "+this.Klass+".";
    }
}
