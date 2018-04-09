package practice11;


import java.util.Observer;

public class Klass extends java.util.Observable {

    int number;
    Student leader;
    public Klass(int number){
        this.number = number;
    }
    public Klass(){}
    public int getNumber() {
        return number;
    }
    public String getDisplayName(){
        return "Class " + number;
    }

    public synchronized void addObserver(Teacher teacher) {
        super.addObserver(teacher);
    }

    public void assignLeader(Student student){
        if(isIn(student)){
            this.leader = student;
            setChanged();
            notifyObservers("leader");
        }
        else
            System.out.printf("It is not one of us.\n");
    }

    public void appendMember(Student student){
        student.klass = this;
        setChanged();
        notifyObservers(student.name);
    }

    public boolean isIn(Student student){
        return student.klass == this;
    }
    public Student getLeader(){
        return leader;
    }
}
