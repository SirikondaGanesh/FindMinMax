//implimenting a java program using to find minimum and maximum
package apjfsa;
//class-declaration
public class FindMinMax {
      //main function
	public static void main(String[] args) {
		//declaring array elements
		int a[]= {82,43,66,27,91,98};
		int min=a[0];
		int max=a[0];
		//to find minimum and maximum
		for (int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
			if(max<a[i]);
			    max=a[i];
		}
		//printing the values
		System.out.println("Minimum Number is:"+min);
		System.out.println("Maximum Number is:"+max);
	}

}
