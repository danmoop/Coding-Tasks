// taken from [Interview Kit - Warmup]
// url - https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

static long repeatedString(String s, long n)
{
    long result = 0;

    for(int i = 0; i < s.length(); i++)
    {
        if(s.charAt(i) == 'a')
           result++;
    }
    
    result *= (n / s.length());
        
    for(int i = 0; i < n % s.length(); i++)
    {
        if(s.charAt(i) == 'a')
            result++;
    }

    return result;
}