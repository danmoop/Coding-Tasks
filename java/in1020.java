/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

//My solution:

public boolean in1020(int a, int b) {
  return (10 <= a && a <= 20) || (10 <= b && b <= 20);
}

//Best solution:

public boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}