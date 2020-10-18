
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Del1
{
public static int plusone(int i){
return i+1;
}
	
public static int plustwo(int i){
return i+2;
}

	public void doall(){
        BasicDel1[] delarray=new BasicDel1[2];
		delarray[0]=new onedo(this);
		delarray[1]=new twodo(this);	
		
		System.out.println(delarray[0].doit(3));
        System.out.println(delarray[1].doit(3));
		System.out.println(delarray[0].doit(9));
        System.out.println(delarray[1].doit(9));
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		new Del1().doall();		
	}
}
 
