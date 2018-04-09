package practice09;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    int id;
    public Person(int id, String name,int age){
        this.id =id;
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.";
    }
    @Override
    public int hashCode() {
               final int prime = 31;
               int result = 1;
               result = prime * result + id;
               return result;
    }
    @Override
    public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Person other = (Person) obj;
                if (id != other.id)
            return false;
              return true;
           }

}