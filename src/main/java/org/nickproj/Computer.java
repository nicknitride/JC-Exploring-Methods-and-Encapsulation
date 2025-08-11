package org.nickproj;

public class Computer {
    String brand;
    int ramInGB;

    Computer(String brand, int ram){
        this.brand = brand;
        ramInGB = ram;
    }

    Computer(String brand){
        this(brand,8);
    }

    Computer(){
        this("Generic",8);
    }

    String getComputerDetails(){
        return ("Brand: "+brand+", RAM: "+ramInGB+"GB");
    }



}
