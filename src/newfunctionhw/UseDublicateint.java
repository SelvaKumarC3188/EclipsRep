package newfunctionhw;

import java.util.Arrays;

public class UseDublicateint {
public static void main(String[]args) {
	DublicateIint duint=new DublicateIint();	
	int[] a= {2,4,5,2,5,7,6,7,4,3,1};
	int[] b=duint.finddub(a);
	System.out.println(Arrays.toString(b));
	
}
}
