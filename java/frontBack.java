/*Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

Solution:*/

public String frontBack(String str) 
{
  String str2 = str;
  
  if(str2.length() <= 1) return str2;
  
  String mid = str2.substring(1, str2.length() - 1);
  
  String result = str2.charAt(str2.length() - 1) + mid + str2.charAt(0); 
  
  return result;
}
