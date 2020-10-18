
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class onedo implements BasicDel1
{
	Del1 d;
	public onedo(Del1 old){
	  this.d=old;
	}
	
	public int doit (int i){
		return	d.plusone(i);
	}
}
 
