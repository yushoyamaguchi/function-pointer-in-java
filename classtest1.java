
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class classtest1
{
public static twoint plusone(twoint t){
  t.a++;
  t.b++;
  return t;
}
 
	public static void main (String[] args) throws java.lang.Exception
	{
		int i1=0;
        int i2=2; 
        twoint t=new twoint(i1,i2);
        t.set(plusone(t));
 
        System.out.println(t.a+","+t.b);
 
	}
}
 
