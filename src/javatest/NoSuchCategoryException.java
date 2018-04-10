package javatest;

/**
 *
 * @author Dylan
 * 200368636
 */

public class NoSuchCategoryException extends RuntimeException
{
    //no argument constructor
    public NoSuchCategoryException(){
        super("Invalid category");
    }
    
    //constructor that accepts a message
    public NoSuchCategoryException(String message){
        super(message);
    }
    
    //constructor accepts a "throwable" (or other exception) as input
    public NoSuchCategoryException(Throwable throwable){
        super(throwable);
    }
    
    //constructor that accepts string message and a throwable
    public NoSuchCategoryException(String message, Throwable throwable){
        super(message, throwable);
    }
}
