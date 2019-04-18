package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id,String name,int age){
        super(id, name, age);
    }

    public Teacher(int id,String name,int age,LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
        for (Klass aClass : classes) {
            aClass.teachersInClass.add(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        if(classes.size() == 0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            String displayClasses = "";
            int count = 0;
            for (Klass aClass : classes) {
                if (count<classes.size()-1){
                    displayClasses += " "+aClass.getNumber()+",";
                }
                else{
                    displayClasses += " "+aClass.getNumber();
                }
                count += 1;
            }
            return super.introduce()+" I am a Teacher. I teach Class"+displayClasses+".";
        }
    }

    public String introduceWith(Student std){
        if(this.isTeaching(std)){
            return super.introduce()+" I am a Teacher. I teach "+std.getName()+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+std.getName()+".";
        }
    }

    public boolean isTeaching(Student std){
        for (Klass aClass : classes) {
            if(aClass.isIn(std)){
                return true;
            }
        }
        return false;
    }
}
