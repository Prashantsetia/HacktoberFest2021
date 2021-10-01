public class Main {

    public static void main(String[] args) {
        int decimal = 78;
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
       // array to store octal number
        int[] octalNum = new int[100];
 
        // counter for octal number array
        int i = 0;
        while (n != 0) {
            // storing remainder in octal array
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }
 
        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--){
            return octalNum[j];
        }            
    }
}
