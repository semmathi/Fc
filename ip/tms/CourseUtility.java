package tms;

import java.util.Comparator;
public class CourseUtility implements Comparator<Course>{

    String direction;
    public CourseUtility(String direction){
        this.direction=direction;
    }
    //comparator from util* package
    
    public int compare(Course c1, Course c2){
        if(direction.equalsIgnoreCase("asc")){
        if(c1.fees>c2.fees)
            //swap
            return 1;
    
        if(c1.fees<c2.fees)// for single line of code in if sta, no {} is required
             // do nothing
             return -1;
        
        /*if(c1.fees == c2.fees){
            // do nothing       -> by default already have a return 0 then not used 
            return 0
        }*/
        
        
        }
        else{
            if(c1.fees<c2.fees)
            //swap
            return 1;
    
        if(c1.fees>c2.fees)// for single line of code in if sta, no {} is required
             // do nothing
             return -1;

        }
        return 0;


    }

}