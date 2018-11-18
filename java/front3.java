/*Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"*/

//My solution:

public String front3(String str) {
  String result = "";
  
  for(int i = 0; i < 3; i++)
  {
    if(str.length() >= 3) result += str.substring(0, 3);
    else result += str.substring(0, str.length());
  }
  
  return result;
}


//Best solution
public String front3(String str) {
  String front;
  
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }

  return front + front + front;
}