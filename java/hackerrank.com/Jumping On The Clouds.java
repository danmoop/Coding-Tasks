// taken from [Interview Kit - Warmup]
// url - https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

static int jumpingOnClouds(int[] c) 
{
    int steps = 0;

    for(int i = 0; i < c.length - 1; i++)
    {
        if((i + 2) < c.length && c[i + 2] == 0)
        {
            i++;
            steps++;
        }
        else
        {
            steps++;
        }
    }    

    return steps;
}