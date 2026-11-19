package tms;

import java.util.Comparator;
public class CourseUtility implements Comparator<Course>{
    String sortCriteria;

    String direction;
    public CourseUtility(String direction,String sortCriteria){
        this.direction=direction;
        this.sortCriteria=sortCriteria;
    }
    //comparator from util* package
    
    public int compare(Course c1, Course c2){

        /* using builtin func-integer.compare
        if(direction.equalsIgnoreCase("asc")){
        if(c1.fees>c2.fees)
            //swap
            return 1;
    
        if(c1.fees<c2.fees)// for single line of code in if sta, no {} is required
             // do nothing
             return -1;
        
        [[if(c1.fees == c2.fees){
            // do nothing       -> by default already have a return 0 then not used 
            return 0
    }]]
        
        
        }
        else{
            if(c1.fees<c2.fees)
            //swap
            return 1;
    
        if(c1.fees>c2.fees)// for single line of code in if sta, no {} is required
             // do nothing
             return -1;

        }
        return 0;*/

        if(sortCriteria.equalsIgnoreCase("fees")){
            if(direction.equalsIgnoreCase("asc")){
                return Integer.compare(c1.fees,c2.fees);

            }
            else{
                return Integer.compare(c2.fees,c1.fees);

            }
        }
        else if(sortCriteria.equalsIgnoreCase("name")){
            return c1.name.compareToIgnoreCase(c2.name);
            // string_1.compareToIgnoreCase(string_2)
        }
        return 0;
        



    }

}