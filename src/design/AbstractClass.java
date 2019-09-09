
package design;

public abstract class AbstractClass implements Employee {


    static String resignDate = " 05/15/2016";

    final int age = 44 ;
     static String empStatus = "Fulltime";



    public void employeeStatus () {
        System.out.println("Employee Status: " + empStatus );
    }

    public void farewell(){
        System.out.println("Farewell date is "+resignDate);

    }




}