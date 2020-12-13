
import java.util.+ACoAOw-
import java.lang.+ACoAOw-
import java.io.+ACoAOw-
 
public class classtest2
+AHs-
	
	static public twoint +AF8-ti+AD0-new twoint()+ADs-

	static public twoint makenew(int x,int y)+AHs-
		twoint t23+AD0-new twoint(x,y)+ADs-
		return t23+ADs-
	+AH0-
	
public static twoint setchild(twoint ti,int x,int y)+AHs-
	ti.tiList.add(make+AF8-makenew(x,y))+ADs-
	return ti+ADs-
+AH0-
	
		static public twoint make+AF8-makenew(int x,int y)+AHs-
			return makenew(x,y)+ADs-
	+AH0-
	
	static public twoint plus(twoint t)+AHs-
	    t.a+AD0-t.a+ADs-	
	    t.b+AD0-t.b+ADs-
		return t+ADs-
	+AH0-

 
	public static void main (String+AFsAXQ- args) throws java.lang.Exception
	+AHs-
        twoint +AF8-ti+AD0-new twoint(10,20)+ADs-
		plus(+AF8-ti)+ADs-
		System.out.println(+AF8-ti.a)+ADs-
		+AF8-ti+AD0-setchild(+AF8-ti,4,5)+ADs-
		System.out.println(+AF8-ti.tiList.get(0).a)+ADs-
		+AF8-ti.tiList.add(+AF8-ti)+ADs-
	+AH0-
+AH0-
 
