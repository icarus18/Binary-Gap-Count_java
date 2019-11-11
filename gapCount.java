import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Integer;

public class gapCount {
	
	public static void main(String[] args)
	{
		System.out.print("***::Binary Gap count::***\n\n");
		
		boolean t = true;
		while(t)
		{
			System.out.print("Please Enter Integer(-9 to exit): ");
			Scanner in = new Scanner(System.in);
			int N = in.nextInt();
			
		if(N ==-9)
		{
			break;
		}
		
		int max = Number.num(N);
		
		System.out.print("\nLargest Gap==> ");	
		System.out.print(max);	
		System.out.print("\n\n");
		
		}
		System.out.print("\nThank you!");
	}

public static class Number
{
	public static int num(int N) 
	{
		
		String y = Integer.toString(N, 2);
		System.out.println("Binary Value: "+y);
        System.out.print("Formatted: ");
		String r = Format.formed(N,y);
		
		char[] str = r.toCharArray();
		int jay[] = new int[str.length];
			
		System.out.print(str);
		System.out.print("\n");
		
	int c = 0; int d = 0; 
	int i = 0; int j = 0;
	
	while( i  < str.length) 
	{
		if(str[i]=='1') 
		{
		d++;
		}	
		if(d>0&&str[i]=='0')
		{
				c++;
		}
		if(d>=2&&c>=1) 
		{
			jay[j]=c;
			j++;
			c=0;
			d=1;
		}
		if(d>1&&c<1) 
		{
			d--;
		}		
	i++;
	}
		
		
		System.out.print("Gaps: ");
		for(int v=0; v< jay.length;v++)
		{
		if(jay[v]>0) 
		{
			System.out.print(jay[v]);
		}	
		if(v+1<jay.length&& jay[v+1]>0) 
		{
			System.out.print(",");
		}
		}
		
		
		int max = jay[0];
		for(int z = 1; z<jay.length;z++) 
			{
				if(jay[z] > max) 
					{
						max = jay[z];
					}
			}
		return max;
	}
}

public static class Format {
		
		static String formed(int o, String p) 
		{
	        DecimalFormat df0 = new DecimalFormat("0000");
			DecimalFormat df1 = new DecimalFormat("00000000");
			DecimalFormat df2 = new DecimalFormat("000000000000");
					
			String r="";
			long w = Long.parseLong(p); 
			
			if(o>255)
			{
			String q = df2.format(w);
			r=q;
			}
			else if(o>15)
			{
				String q = df1.format(w);
				r=q;
			}else {
				String q = df0.format(w);
				r=q;
			}
			
			return r;
		}//end of formed
		
	}//end of Format




// 15 32 1041






}
