package practice06;

public class Teacher extends Person{
    int Klass;

    public int getKlass() {
        return Klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }
    public Teacher(String name, int age, int Klass){
        super(name,age);
        this.Klass = Klass;
    }

    @Override
    public String introduce() {
        if(Klass != 0)
        return super.introduce() + " I am a Teacher. I teach Class " + Klass + ".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";

    }
}
