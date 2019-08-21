import java.util.*;
import java.lang.*;
import java.io.*;

class Hello 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str4=sc.nextLine();
		while(n>0)
		{
		    n--;
		    String str=sc.nextLine();
		    Stack<Character> s=new Stack<Character>();
		    int flag=0;
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
		        {
		            s.push(str.charAt(i));
		        }
		        else if(str.charAt(i)==')' && !s.isEmpty() && s.peek()=='(' )
		        {
		            s.pop();
		        }
		        else if(str.charAt(i)=='}' && !s.isEmpty() && s.peek()=='{')
		        {
		            s.pop();
		        }
		        else if(str.charAt(i)==']' && !s.isEmpty() && s.peek()=='[')
		        {
		            s.pop();
		        }
		        else
		        {
		            flag=1;
		        }
		    }
		    
		    if(!s.isEmpty() || flag==1)
		    {
		        System.out.println("not balanced");
		    }
		    else
		    {
		    System.out.println("balanced");
		    }
		}
	}
}
