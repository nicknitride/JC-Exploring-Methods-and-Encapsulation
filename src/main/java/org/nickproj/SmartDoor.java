package org.nickproj;

public class SmartDoor {
    private boolean isLocked;

    public void isLocked() {
        System.out.println("Is the door locked?, status: "+isLocked);
    }
    public void lockDoor(){
        this.isLocked = true;
        System.out.println("Locking door");
    }
    public void unlockDoor(){
        this.isLocked = false;
        System.out.println("Unlocking door");
    }
}
