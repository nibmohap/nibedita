import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int travellers=4;
		boolean tratype=true;
		boolean daytime=true;
		if (daytime==true){
			System.out.println("Regular pass hours 9 AM � 5 PM, no additional charge applicable"
					);
		}else{
			System.out.println("Evening pass hours 5 PM � 9 PM, additional evening visit charge applicable for each pass");
		
		}
double cost=10;
boolean displaytype=true;
if (displaytype==true){
	System.out.println("Total base cost is"+cost);
	
			
}else{
	System.out.println("Total cost is"+3.5*cost);

}
int nonTravelrs=2;
int normTravelrs=travellers-nonTravelrs;
double totalcost=(nonTravelrs*3.5*cost)+(normTravelrs*cost);
System.out.println("Total cost is "+totalcost);
int duration=3;
if (!tratype){
	switch(duration){
	case 1:
		System.out.println("Added Evening fare ! No discount");
		break;
	case 3:
		System.out.println("Added evening fare. Discount for multiple day pass");
		break;
	case 5:
		System.out.println("Added evening fare. Discount for multiple day pass");
		break;
	   default:
		System.out.println("Error message. Indicate valid travel pass duration values.");
	}
	
}else
{
	switch(duration){
	case 1:
	System.out.println(" No added fare. Discounts based on number of days.");
	break;
	case 3:
		System.out.println(" No added fare. Discounts based on number of days.");
		break;
	case 5:
		System.out.println(" No added fare. Discounts based on number of days.");
		break;
		default:
		System.out.println("Error message. Indicate valid travel pass duration values.");
}
	
	}

}}
