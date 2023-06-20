public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        
        
        if (numbers.contains("-")) {
        	throw new IllegalArgumentException("Error: Negatives are not allowed");
        }
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty() && !(Integer.parseInt(number.trim()) >= 1000)) {
                    returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception       
                }
            }
        }
        return returnValue;

    }
}
