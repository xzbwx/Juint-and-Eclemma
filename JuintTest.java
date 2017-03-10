package juinttest;

public class JuintTest {
    public String triangle(int a,int b,int c){
    	if((a+b)>c && (a+c)>b && (b+c)>a)
    	{
    		if(a==b & b==c)//µÈ±ß
    		{
    			return "equilateral";
    		}
    		else if(a==b || b==c || c==a)
    		{
    			return "isosceles";
    		}
    		else
    		{
    			return "scalene";
    		}
    	}
    	return "Not triangle";
    }
    	
}
