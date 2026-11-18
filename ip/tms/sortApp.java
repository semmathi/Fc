package tms;

import java.util.*;
public class sortApp {
    // sort the courses as per their fees in asc/desc order
    public static void main(String[] args){
        Course c1=new Course(1,1200,"java");
        Course c2=new Course(2,2200,"Python");
        Course c3=new Course(3, 3200,"python");
        Course c4=new Course(4,4200,"java");
        List<Course>list=new ArrayList<>(); // created a container-> list to store the courses
        list.add(c1);
         list.add(c2);
          list.add(c3);
           list.add(c4);
        System.out.println("total number of courses= " + list.size()+ "\n");//4
       // list.forEach(System.out :: println);
        

       System.out.println("List of all courses");
         for(Course c:list){
            System.out.println(c);
         }


        //sortCourseAsc(list);
        //sortCourseDesc(list);-> uses two methods for asc and desc
        System.out.println("\n List of courses in DESC");
        sortCourse(list,"desc");
        
        System.out.println("\n List of courses in ASC");
        sortCourse(list, "asc"); // used one method using parameter to define the order of sorting
    }

   /* private static sortCourseAsc(List<Courses> list){
       // Collections.sort(list);// mention on which object to sort
        Collections.sort(list, new CourseUtility()); 
        for(Course c:list){// give criteria not here but in class implementation itself-> lamba expressions
            System.out.println(c);
         }



    }
    private static sortCourseDesc(List<Courses> list){

    }*/

    private static void sortCourse(List<Course> list, String direction){
        Collections.sort(list, new CourseUtility(direction));
        for(Course n :list){
            System.out.println(n);
        }

    }
        


}