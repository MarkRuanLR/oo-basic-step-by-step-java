package practice10;


public class Student extends Person{
    Klass klass = new Klass();
    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass Klass){
        super(id,name,age);
        this.klass = Klass;
    }

    @Override
    public String introduce() {
        if(this == this.klass.leader)
            return super.introduce() + " I am a Student. I am Leader of "+ klass.getDisplayName() + ".";
        return super.introduce() + " I am a Student. I am at "+ klass.getDisplayName() + ".";
    }
}
