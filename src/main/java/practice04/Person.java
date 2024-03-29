package practice04;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String basicIntroduce(){
        return "My name is "+this.getName()+"."+" I am "+this.getAge()+" years old.";
    }

    public String introduce(){
        return this.basicIntroduce();
    }
}
