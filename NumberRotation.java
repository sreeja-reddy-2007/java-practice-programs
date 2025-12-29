public class NumberRotation {
    public static void main(String[] args) {
        int number = 12345;
        int k = 2;

        int temp = number;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        k = k % digits;

        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, digits - k);

        int rotatedNumber = (number % divisor) * multiplier + (number / divisor);

        System.out.println("Rotated Number: " + rotatedNumber);
    }
}
