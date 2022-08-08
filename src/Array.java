
public class Array {
	public static void main(String[] args) {
		int[] a = {1,2,5,7,22};
		int r=0;
		for(int i=a.length-1;i>=0;i--) {
				a[r++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
