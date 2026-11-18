package tms;
public class Course{
    int id;
    int fees;
    String name;

    public Course(int id, int fees, String name){
        this.id=id;
        this.fees=fees;
        this.name=name;
    }
    // created object in sortapp class
    //used package hence it works well

     public String toString() {
        return "Course{" + " id=" + id + ", name='" + name + '\'' + ", fees=" + fees + '}';
    }


    
}