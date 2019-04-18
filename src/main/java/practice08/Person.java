package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String introduce(){
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old.";
    }

    @Override
    public boolean equals(Object person) {
        if(person instanceof Person){
            if(((Person) person).getId() == this.id){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
