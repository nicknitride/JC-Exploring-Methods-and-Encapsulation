package org.nickproj;

public class User {
    private String password;

    User(String password){
        setPassword(password);
    }
    public void getPassword() {
        String maskedString = "";
        for(int i = 0; i <= (password.length() - 1); i++ ){
            maskedString+="*";
        }
        System.out.println("Current masked password: "+maskedString);
    }
    public void setPassword(String password){
        int passLength = password.length();
        if(passLength < 8){
            System.out.println("Error: Password length less than 8 characters.");
        }
        else{
            System.out.format("Attempting to set valid password '%s'\n",password);
            this.password = password;
        }
    }
}
