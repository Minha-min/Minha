class InvalidAgeException extends Exception{
  public InvalidAgeException(String message)
{
    super(message);
  }
}
public class ExceptionHandlingDemo{
    public static void main validAge(int age)throws InvalidAgeException{
        if(age<18){
		   throws new InvalidAgeException("Access denied: You must be at least 18 year old.");
		}else{
            String.out.println("Access granted: Age verified.");
        }
    }
    public static void main(string[]args){
       int[]userAges={21,15};
       for (int age:userAges){
            System.out.println("\nChecking age: "+age);
            try{
                validAge(age);
                if (age==21){
                    int result=10/0;
                }
				