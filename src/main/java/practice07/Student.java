package practice07;

public class Student extends Person{
    Klass klass = new Klass();
    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age, Klass Klass){
        super(name,age);
        this.klass = Klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at "+ klass.getDisplayName() + ".";
    }
}
