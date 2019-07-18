/*
[7 KYU]
kata url - https://www.codewars.com/kata/5259b20d6021e9e14c0010d4

Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"

*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata
{
  public static String reverseWords(final String original)
  {
    String[] array = original.split(" ");
    
    if(array.length == 0)
      return original;
  
    return Arrays.stream(array)
      .map(s -> new StringBuilder(s).reverse().toString())
      .collect(Collectors.joining(" "));
  }
}