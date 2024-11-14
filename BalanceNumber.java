public class BalanceNumber {
    public static void main(String[] args){
        int number = 123;

        boolean balanced = checkBalance(number);

        if(balanced)
            System.out.println("It is balanced.");
        else
        System.out.println("Not balanced.");
    }

    public static boolean checkBalance(int num){

        int sum = 0;
        int big = 0;
        int digit;

        while(num > 0){

            digit = num % 10;
            sum += digit;

            if(digit > big)
                big = digit;

            num /= 10;
        }

        if(sum/2 == big)
            return true;
        else
            return false;
    }
}
