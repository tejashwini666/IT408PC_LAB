import java.util.Scanner;
class Main1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);int n=sc.nextInt();
        int choice=0;
	int i=1;
	Outerwhile: while(i<=n){ 
	               for(int j=1;j<=10;j++){
			System.out.println(i+"x"+j+"="+i*j);
			if (j>=10){
			System.out.println("If you want to continue please enter 1 otherwise 0");
			choice=sc.nextInt();
			switch(choice){
				case 0: break Outerwhile;
				case 1: continue Outerwhile;
				}
			}
			i++;
        

			}
		}
	}
}
