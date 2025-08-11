package org.nickproj;

import static org.nickproj.ParameterPassing.modifyValue;
import static org.nickproj.VarArgsExample.printMessages;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.startEngine();
//        String status = myCar.drive(60);
//        System.out.println(status);
//        //Mini-Challenge(turn off engine)
//        myCar.turnOffEngine();

//
//        int originalValue = 50;
//        System.out.println("Before method call: " + originalValue);
//        modifyValue(originalValue);
//        System.out.println("After method call: " + originalValue);
//        // Mini-challenge
//        Student firstStudent = new Student("James");
//        System.out.println("Name before change: "+firstStudent.name);
//        changeStudentName(firstStudent,"Michael");
//        System.out.println("Name after name change: "+firstStudent.name);


//        printMessages("Hello", "World");
//        printMessages("Testing", "Varargs", "Here");
//        printMessages();
//        Mini-Challenge
//        System.out.println("Largest in (10, 5, 25, 15) is: "+findLargest(10,5,25,15));
//        System.out.println("Largest in (-5, -1, -10) is: "+findLargest(-5,-1,-10));
//        System.out.println("Largest with no numbers is: "+findLargest());


//        Account myAccount = new Account();
//        myAccount.displayAccountDetails();
        // The following line would cause a compile-time error if uncommented
        // System.out.println(myAccount.balance);
        //Mini-Challenge
//        SmartDoor smartDoor = new SmartDoor();
//        smartDoor.isLocked();
//        smartDoor.lockDoor();
//        smartDoor.isLocked();
//        smartDoor.unlockDoor();
//        smartDoor.isLocked();


//        System.out.println("App Name: " + Utility.getAppName());
//        // The following line would cause a compile-time error
//        // System.out.println("Instance ID: " + Utility.getInstanceId());
//        Utility utilInstance = new Utility();
//        System.out.println("Instance ID: " + utilInstance.getInstanceId());

//        double result = org.nickproj.Converter.celsiusToFahrenheit(25);
//        or import static to be able to use the function without the classpath directly.
//        System.out.println(result);


//        Display d = new Display();
//        d.show(42);
//        d.show("Hello");
//        d.show("Goodbye", 3);

//        Mini-Challenge Converter with overload
//double resultOne = org.nickproj.Converter.celsiusToFahrenheit(25);
//double resultTwo = org.nickproj.Converter.celsiusToFahrenheit(77,"Useless string");
//        System.out.println(resultOne);
//        System.out.println(resultTwo);

//        Pizza pizza1 = new Pizza();
//        pizza1.display();//
//        Pizza pizza2 = new Pizza("Pepperoni");
//        pizza2.display();
//        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//        pizza3.display();
        //Mini-Challenge (Computer)
//        Computer comp1 = new Computer();
//        Computer comp2 = new Computer("ASUS TUF - Budget Build");
//        Computer comp3 = new Computer("M4 Mac Mini Base",16);
//        System.out.println("Computer 1"+comp1.getComputerDetails());
//        System.out.println("Computer 2"+comp2.getComputerDetails());
//        System.out.println("Computer 3"+comp3.getComputerDetails());

        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());
        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());
        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());

    }

    static void changeStudentName(Student student, String newName) {
        student.name = newName;
    }

    static int findLargest(int... intArr) {
        int max = Integer.MIN_VALUE;
        if(intArr.length == 0){
            return max;
        }
        else{
            for (int item : intArr) {
                if (item >= max) {
                    max = item;
                }
            }
            return max;
        }
    }
}