
public class RevStack {
	static int index=0;
	static String[] stack = new String[10];
	static String push(String x)
	{
		String temp="";
     if(index<9)
     {
    	 stack[index++]= x;
    	 temp =x;
    }
    else 
    {
    	System.out.println("Stack is already full..");
    }
return temp;

}

static void display()
	{ 
	System.out.print("Elements of Stack are =");
	System.out.println("[");
	for(int i=0;i<=index-1;i++)
		{
			System.out.print(stack[i]+","); 
		}
	System.out.println("]"); 
	
	}


public static void main(String[] args)

{   
	System.out.println(push("hii nibedita")+" is added to Stack");
	System.out.println(push("hello midhuna")+" is added to Stack");
	System.out.println(push("hello chaitanya")+" is added to Stack");
	display();
	String str="";
	for(int i=0;i<=index-1;i++)
	{
		str=stack[i];
		String[] ch=str.split(" ");
	  
		for(int j=0;j<ch.length;j++)
			
		{   
			
			StringBuffer buffer = new StringBuffer(ch[j]);
			buffer.reverse();
			String s=new String(buffer);
			//System.out.println(toCharacterArray(s));
			Character[] charr=toCharacterArray(s);
			//System.out.println(charr);
			//toUpperCase(charr[0]);
			for(int p=0;p<charr.length;p++){
				if(p==0)
				{
					
				charr[0]=Character.toUpperCase(charr[0]);
				}
				System.out.print(charr[p]);
				
			//System.out.println("****"+charr[0].toUpperCase(0));
			}
			System.out.print(" ");
            
			 
		 
		}System.out.println("");
	}


}
public static Character[] toCharacterArray( String s ) {

	   if ( s == null ) {
	     return null;
	   }

	   int len = s.length();
	   Character[] array = new Character[len];
	   for (int i = 0; i < len ; i++) {
	      array[i] = new Character(s.charAt(i));
	   }

	   return array;
	}
}


