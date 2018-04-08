package practice04;

import practice03.Person;

public class Student extends Person {
    int Klass;

    public int getKlass() {
        return Klass;
    }

    public Student(String name, int age, int Klass){
        super(name,age);
        this.Klass = Klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + Klass + ".";
    }
}
