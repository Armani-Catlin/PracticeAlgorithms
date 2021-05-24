public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        int count = 0;
        for (Boolean b : arr) if (b) count++;
        return count;
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int diff=0;

        for(int i=0; i < nums.length; i++)
        {
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        diff = max-min;
        return diff;
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        String strOne = str;
        if(str.length() >= 2)
            return str.substring(0, 2) + "... " + str.substring(0, 2) + "... " + strOne + "?";
        return str;
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        if (num % 3 == 0){
            if (num % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (num % 5 == 0){
            return "Buzz";
        }
        String s=String.valueOf(num);
        return s;
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     * @return
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        for (int i = countFrom;i < countTo;++i){
            String s=String.valueOf(i);
            return s + "..";
        }
        return "";
        /*int i = countFrom;
        String s=String.valueOf(i);
        if (countFrom < countTo){
            return "Try again with better numbers!";
        } else
            return s + "..";*/
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        String reverse = new StringBuffer(reverseMe).reverse().toString();
        char[] in = reverse.toCharArray();
        for (int i = 0; i < in.length; i++)
        {
            char c = in[i];
            if (Character.isUpperCase(c))
            {
                in[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                in[i] = Character.toUpperCase(c);
            }
        }
        return new String(in);
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe) {
        if (checkMe.contains("bomb")) {
            return "Duck!";
        } else {
            return "Relax, there's no bomb.";
        }
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str) {
        for(int s=0;s<str.length-1;s++)
        {
            for(int m=s + 1;m<str.length;m++)
            {
                if(str[s] != null && str[s].equals(str[m]))
                {
                    str[m] = null;
                }
            }
        }
        return str;
    }
}