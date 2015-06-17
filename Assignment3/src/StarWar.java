
public class StarWar {

	public static void main(String[] args) {
		int num=7;int mid=0;
		if(num%2==0)
		{
			mid=num/2;

		}else{
			mid=(num+1)/2;	
		}

		for(int j=0;j<mid;j++)
		{
			for(int i=0;i<num;i++)
			{
				if(i<j || i>num-j)
				{
					System.out.print(" ");

				}else if((j%2==0 && i%2==0) || (j%2!=0 && i%2!=0))
				{
					System.out.print("*");
				}else if((j%2==0 && i%2!=0) || (j%2!=0 && i%2==0)){
					System.out.print(" ");
				}
				//else if(j%2!=0 && i%2==0){
				//	System.out.print(" ");
				//}
				//else if(j%2!=0 && i%2!=0){
				//System.out.print("*");
				//}

			}System.out.println();

		}

	}

}
