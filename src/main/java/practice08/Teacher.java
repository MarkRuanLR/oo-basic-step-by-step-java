package practice08;

public class Teacher extends Person {
    Klass klass = new Klass();
    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age, Klass Klass){
        super(id,name,age);
        this.klass = Klass;
    }
    public Teacher(int id, String name, int age){
        super(id,name,age);
    }
    public String introduceWith(Student student){
        if(this.klass.number == student.klass.number)
            return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach "+ student.name + ".";
    }
    @Override
    public String introduce() {
        if(klass.number != 0)
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";

    }
}

