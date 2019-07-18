/*
8[kyu]
url - https://www.codewars.com/kata/55d24f55d7dd296eb9000030

Summation
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
*/

public class GrassHopper 
{
    public static int summation(int n) 
    {
      if(n == 1) return 1;
      
      return n + summation(n - 1);
    }
}