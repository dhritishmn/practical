/*8. Write a program that show working of different functions of String and StringBufferclasss
like setCharAt(), setLength(), append(), insert(), concat()and equals().*/

public class clgQ8 {
    public static void main(String[] args) {
    
        String str = "Hello, World!";

        
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        
        String concatString = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatString);

    
        String anotherString = "Hello, World!";
        boolean isEqual = str.equals(anotherString);
        System.out.println("Are the strings equal? " + isEqual);

        
        StringBuffer buffer = new StringBuffer("Hello");

        
        buffer.append(" World");
        System.out.println("Appended string: " + buffer);

        
        buffer.insert(5, ", ");
        System.out.println("Inserted string: " + buffer);

        
        buffer.setCharAt(0, 'h');
        System.out.println("Modified string: " + buffer);

        
        buffer.setLength(5);
        System.out.println("Trimmed string: " + buffer);
    }
}

