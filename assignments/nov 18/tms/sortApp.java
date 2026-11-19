package tms;

import java.util.*;
public class sortApp {
    // sort the courses as per their fees in asc/desc order
    public static void main(String[] args){
        Course c1 = new Course(101, 15000, "Java");
        Course c2 = new Course(102, 12000, "Python");
        Course c3 = new Course(103, 15000, "React");
        Course c4 = new Course(104, 8000, "SQL");
        Course c5 = new Course(105, 12000, "Angular");
        List<Course>list=new ArrayList<>(); // created a container-> list to store the courses
        list.add(c1);
         list.add(c2);
          list.add(c3);
           list.add(c4);
           list.add(c5);
        System.out.println("total number of courses= " + list.size()+ "\n");//4
       // list.forEach(System.out :: println);
        

       System.out.println("List of all courses");
         for(Course c:list){
            System.out.println(c);
         }


        //sortCourseAsc(list);
        //sortCourseDesc(list);-> uses two methods for asc and desc
        System.out.println("\n List of courses in DESC");
        sortCourse(list,"desc","fees");
        
        System.out.println("\n List of courses in ASC");
        sortCourse(list, "asc","fees"); // used one method using parameter to define the order of sorting

        System.out.println("\n List of names in alphabetic order");
        sortCourse(list,"asc","name");
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

    private static void sortCourse(List<Course> list, String direction, String sortCriteria){
        Collections.sort(list, new CourseUtility(direction, sortCriteria));
        for(Course n :list){
            System.out.println(n);
        }

    }
        


}