package PaiXu;
import java.util.Scanner;

public class TongPaiXu {//主程序用来从键盘输入数
	public  static void main(String [] args){
		Scanner shu=new Scanner(System.in);
		 String str =shu.next().toString();
		  String[] arr  = str.split(",");
		  int[] b = new int[arr.length];
		  //将键盘输入的字符串数组转化为整数类型的数组
		  for(int j = 0; j<b.length;j++) {
		   b[j] = Integer.parseInt(arr[j]);
		  //System.out.println(b[j]); 
		   //funct(b);//调用函数
	}
		  funct(b);
}
	//此函数用来做桶排序
	
		public static  void funct(int[] a){
			int [] b=new int[10];
			int i;
			for( i=0;i<a.length;i++){//计数
				if(a[i]!=0) 
					b[i]++;
				
			}
			System.out.print(b[i]+" ");
			//System.out.print(b[i]+"");
			for(int j=0;j<b.length;j++){//输出
				for(int f=1;f<=b[i];f++)
					System.out.print(i+" ");
			}	
		}
	
}



