package learning_ds.src;
import java.util.*;
public class ArrayGrow{
    public static void main(String[] args){

	double[] height = {180.0,184.8,168.9};
	double[] temp = new double[2*(height.length)];
	for(int i = 0; i < height.length; i++){
	    temp[i] = height[i];
	}
	height = temp;

	System.out.println(Arrays.toString(height));
    }
}
