
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class classtest2
{
	
	static public twoint _ti=new twoint();

	static public twoint makenew(int x,int y){
		twoint t23=new twoint(x,y);
		return t23;
	}
	
public static twoint setchild(twoint ti,int x,int y){
	ti.tiList.add(make_makenew(x,y));
	return ti;
}
	
		static public twoint make_makenew(int x,int y){
			return makenew(x,y);
	}
	
	static public twoint plus(twoint t){
	    t.a=t.a+100;	
	    t.b=t.b+100;
		return t;
	}

 
	public static void main (String[] args) throws java.lang.Exception
	{
        twoint _ti=new twoint(10,20);
		plus(_ti);
		System.out.println(_ti.a);
		_ti=setchild(_ti,4,5);
		System.out.println(_ti.tiList.get(0).a);
		_ti.tiList.add(_ti);
	}
}
 
