/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

Example:
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

Solution:*/

public int close10(int a, int b)
{
  int diff1 = Math.abs(10 - a);
  int diff2 = Math.abs(10 - b);
  
  if(diff1 == diff2) return 0;
  
  if(diff1 < diff2) 
    return 10 - diff1;
  else
    return 10 - diff2;
}