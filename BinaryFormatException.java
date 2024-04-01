package Module2;

import java.util.Scanner; // Import Scanner class

//Custom exception class for binary format exception
class BinaryFormatException extends Exception {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public BinaryFormatException(String message) {
     super(message);
 }

//Define BinaryConverter class
 // Method to convert binary string to decimal
 public static int bin2Dec(String binaryString) throws BinaryFormatException {
     // Check if the input string is a valid binary string
     for (int i = 0; i < binaryString.length(); i++) {
         char ch = binaryString.charAt(i);
         if (ch != '0' && ch != '1') {
             throw new BinaryFormatException("Not a binary number");
         }
     }

     // Convert binary string to decimal
     int decimal = Integer.parseInt(binaryString, 2);
     return decimal;
 }

 // Test program
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a binary number: ");
     String binaryString = scanner.nextLine();

     try {
         int decimal = bin2Dec(binaryString);
         System.out.println("Decimal equivalent: " + decimal);
     } catch (BinaryFormatException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}