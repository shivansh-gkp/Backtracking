import java.util.*;
public class nqueen {
	int count=0;
	boolean check(int arr2[][],int i, int y)
	{
		int di=i;
		int dy=y;
		while(di>0&&dy>0)
		{
			di=di-1;
			dy=dy-1;
			if(arr2[di][dy]==1)
			{
				return false;
				
			}
		}
		int ddi=i;
		int ddy=y;
		while(ddi<(arr2.length-1)&&ddy>0)
		{ 
			ddi=ddi+1;
			ddy=ddy-1;
			//System.out.println(ddi + " "+ ddy);
			if(arr2[ddi][ddy]==1)
			{
				return false;
			}
		}
		int si=i;
		int sy=y;
		while(sy>0)
		{
			//ddi=ddi+1;
			sy=sy-1;
			if(arr2[si][sy]==1)
			{
				return false;
			}
		}
		return true;
	}
	 void queen(int arr2[][], int y)
	{
		int i=0;
		if(y==arr2.length)
		{
			count++;
			int g=0;
			int h=0;
		//for(g=0;g<arr2.length;g++)
			//{
				//for(h=0;h<arr2.length;h++)
				//{
				//	System.out.print(arr2[g][h]+" ");
				//}
				//System.out.println();
		//	}
			System.out.println(count);
			return;
		}
		for(i=0;i<arr2.length;i++)
		{
			if(check(arr2,i,y)!= false)
			{
				arr2[i][y]=1;
				queen(arr2,y+1);
				arr2[i][y]=0;
			}
		}
		return;
	}
public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int arr2[][]= new int[n][n];
	nqueen n1=new nqueen();
	n1.queen(arr2,0);
	}
}
