package Sample;
public class Duplicata {
public static void main(String[] args) {
	int[]arr= {1,2,4,1,9};
	for(int i=0;i<arr.length-1;i++)
	{
	for(int j=0;j<arr.length;j++)
	{
		if(arr[i]==arr[j]) {
			System.out.println(arr[j]);
		}
	}
	}
}

}

