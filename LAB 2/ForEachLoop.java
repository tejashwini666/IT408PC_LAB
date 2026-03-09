import java.util.Scanner;
class ForEachLoop{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int count=0;int countn=0;
	for(int num: arr){
		 count=0;
		for(int i=1;i<=num;i++){
			if (num%i==0)
				count++;
		}
		if (count==2){
			System.out.print(num+" ");
			countn++;
		}
      }
      System.out.println("\n"+countn);
  }
}
