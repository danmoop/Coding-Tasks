/*Return true if the given string contains between 1 and 3 'e' chars.

Example:
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

Solution:*/

public boolean stringE(String str)
{
  
  if(str.length() < 1) return false;
  
  int counter = 0;
  
  for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) == 'e') counter++;
  }
  
  if(counter >= 1 && counter <= 3) 
    return true;
  
  else 
    return false;

}