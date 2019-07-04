/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

Example
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

Solution:*/

public boolean mixStart(String str) 
{
  
  if(str.length() > 2)
  {
    String required = str.substring(1, 3);
    
    if(required.equals("ix")) 
      return true;
    return false;
  }
  
  return false;
  
}