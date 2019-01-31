package demoexception2;

public class DemoException2 {

    public static void main(String[] args) {
        try {
            double digit = Double.parseDouble(args[0]);
            if (digit < 0) {
                throw new Exception("Negative number NOT allowed!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing command-line argument");
            System.out.println("e.getMessage is: " + e.getMessage());
            System.out.println("e is: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Command-line must be a number");
            System.out.println("e.getMessage is: " + e.getMessage());
            System.out.println("e is: " + e);
        } catch (Exception e) {
            System.out.println("e.getMessage is: " + e.getMessage());
            System.out.println("e is: " + e);
        } finally {
            System.out.println("Program segment has ended");
        }
        
        
//        System.out.println(digit);
    }
    
}
