package Design_pattern.Builder.exceptions;

public class InvalidArgumentException extends Exception{
    public InvalidArgumentException(){
    }

    public InvalidArgumentException Invalidphonenumer(){
        System.out.println("Invalid phone number it does not meet requirement");
        return null;
    }
}
