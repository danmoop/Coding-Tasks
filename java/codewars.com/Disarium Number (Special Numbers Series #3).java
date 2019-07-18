/**
[7KYU]
KATA URL - https://www.codewars.com/kata/5a53a17bfd56cb9c14000003

Definition
Disarium number is the number that The sum of its digits powered with their respective positions is equal to the number itself.

Task
Given a number, Find if it is Disarium or not .

Notes
Number passed is always Positive .
Return the result as String

disariumNumber(89) ==> return "Disarium !!"

Explanation:
Since , 81 + 92 = 89 , thus output is "Disarium !!"

disariumNumber(564) ==> return "Not !!"

Explanation:
Since , 51 + 62 + 43 = 105 != 546 , thus output is "Not !!"
*/

import java.lang.Math;

public class Solution
{
    public static String disariumNumber(int number)
    {
      String s = String.valueOf(number);
      
      String nums[] = s.split("");
      
      int sum = 0;
      
      for(int i = 0; i < nums.length; i++)
      {
        int n = Integer.parseInt(nums[i]);
        
        sum += Math.pow(n, (i+1));
      }
      
      if(sum == number)
        return "Disarium !!";
      
      return "Not !!";
    }
}

// ALTERNATIVE SOLUTION WITH STREAMS I SAW AFTER I SUBMITTED MY CODE ABOVE

import java.util.stream.IntStream;

public class Main
{
    public static String disariumNumber(int number)
    {
        int[] nums = Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        return IntStream.range(0, nums.length)
                .map(i -> (int) Math.pow(nums[i], (i+1)))
                .sum() == number ? "Disarium !!" : "Not !!";
    }
}