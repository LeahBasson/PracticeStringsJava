package practicestrings;

public class PracticeStrings {

    public static void main(String[] args) {
        // Useful string methods
        String name = "Leah";
        System.out.println("name: " + name);

        // amount of letters in name.
        System.out.println("Amount of letters in name: " + name.length());
        
        // converting name to uppercase.
        System.out.println("Uppercase name: " + name.toUpperCase());
        
        // converting name to lowercase.
        System.out.println("Lowercase name: " + name.toLowerCase());
        
        // finding a character at position/index.
        System.out.println("Character at index 2: " + name.charAt(2));
        
        // comparing if name exists.
        System.out.println("Name exists: " + name.equals("leah"));
        
        // comparing if name exists, can either be uppercase or lowercase.
        System.out.println("Name exists: " + name.equalsIgnoreCase("leah"));
        
        // taking a certain portion of name based on position. Shows letters at position 1 and 2. Remember the last index is 3.
        System.out.println("Portion of name: " + name.substring(1,3));
        
        // checking if name contains letters.
        System.out.println("Name contains: " + name.contains("fl"));
    }

}
