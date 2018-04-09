package practice09;


public class Klass {
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
    public void assignLeader(Student student){
        if(student.klass == this)
        this.leader = student;
        else
            System.out.printf("It is not one of us.\n");
    }
    public Student getLeader(){
        return leader;
    }
    public void appendMember(Student student){
        student.klass = this;
    }
}
