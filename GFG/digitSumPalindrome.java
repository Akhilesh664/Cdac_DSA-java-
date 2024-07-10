package GFG;

class digitSumPalindrome {
    int isDigitSumPalindrome(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        // for return ing statement
        if (isPalin(sum)) {
            return 1;
        } else {
            return 0;
        }
    }

    boolean isPalin(int sum) {
        int rev = 0;
        int org = sum;
        while (sum > 0) {
            int temp = sum % 10;
            rev = rev * 10 + temp;
            sum /= 10;
        }
        return rev == org;
    }

    public static void main(String[] args) {
        digitSumPalindrome solution = new digitSumPalindrome();

        int number1 = 12321;
        int result1 = solution.isDigitSumPalindrome(number1);
        System.out.println("Is digit sum of " + number1 + " a palindrome? " + (result1 == 1)); // Output: true

        int number2 = 45678;
        int result2 = solution.isDigitSumPalindrome(number2);
        System.out.println("Is digit sum of " + number2 + " a palindrome? " + (result2 == 1)); // Output: false

        int number3 = 54321;
        int result3 = solution.isDigitSumPalindrome(number3);
        System.out.println("Is digit sum of " + number3 + " a palindrome? " + (result3 == 1)); // Output: true or false depending on the digit sum

        int number4 = 11111;
        int result4 = solution.isDigitSumPalindrome(number4);
        System.out.println("Is digit sum of " + number4 + " a palindrome? " + (result4 == 1)); // Output: true or false depending on the digit sum
    }
}
