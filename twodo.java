
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class twodo implements BasicDel1
{
	Del1 d;
	public twodo(Del1 old){
	  this.d=old;
	}
	
	public 
	int doit (int i){
		return	d.plustwo(i);
	}
}
 
