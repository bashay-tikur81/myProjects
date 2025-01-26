package learning_ds;
import java.util.*;

public class ArrayShift{
    public static void main(String[] args){

	int[] numSold = {1,2,3,4,5,6,7,8};
	int days = numSold.length;
	for(int i = numSold.length-1; i > 0; i--){
	    numSold[i] = numSold[i-1];
	}
	numSold[0] = 0;
    	System.out.println(Arrays.toString(numSold));
	
    }
}
