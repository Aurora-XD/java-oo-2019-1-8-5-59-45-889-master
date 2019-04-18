package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
//        if leader return: My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
//        else  return:     My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
        if(this == klass.getLeader()){
            return super.introduce()+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }
        else{
            return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
        }
    }
}
