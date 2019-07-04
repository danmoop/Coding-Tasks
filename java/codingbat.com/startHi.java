/*Given a string, return true if the string starts with "hi" and false otherwise.

Example:
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

Solution:*/

public boolean startHi(String str) 
{
  if(str.length() > 1)
  {
    if(str.charAt(0) == 'h' && str.charAt(1) == 'i')
      return true;
    return false;
  }
  else
    return false;

}