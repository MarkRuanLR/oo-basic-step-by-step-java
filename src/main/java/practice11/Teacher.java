package practice11;


import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person implements Observer{
    Set<Klass> classes;
    public Set<Klass> getClasses(){
        return classes;
    }

    public Teacher(int id, String name, int age, Set<Klass> classes){
        super(id,name,age);
        this.classes = classes;
        for(Klass klass : classes)
            klass.addObserver(this);
    }
    public Teacher(int id, String name, int age){
        super(id,name,age);
    }
    public String introduceWith(Student student){
        if(this.classes.contains(student.klass))
            return super.introduce() + " I am a Teacher. I teach " + student.name + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach "+ student.name + ".";
    }
    public boolean isTeaching(Student student){
        return classes.contains(student.klass);
    }
    @Override
    public String introduce() {
        String str = "";
        List<Klass> temp;
        if (classes != null) {
            temp = classes.stream()
                    .collect(Collectors.toList());
            for (int i = 0; i < temp.size(); i++) {
                if (i != temp.size() - 1)
                    str = str + " " + temp.get(i).number + ",";
                else
                    str = str + " " + temp.get(i).number + ".";
            }
            return super.introduce() + " I am a Teacher. I teach Class" + str;

        }
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    @Override
    public void update(Observable o, Object arg) {
        Klass k = (Klass) o;
        if(arg == "leader")
            System.out.printf("I am "+ this.name +". I know "+ k.leader.name +" become Leader of Class "+ k.number +".\n");
        else
            System.out.printf("I am "+ this.name +". I know "+ arg +" has joined Class "+ k.number +".\n");
    }



}
