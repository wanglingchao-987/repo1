package PaiXu;
import java.util.Scanner;

public class TongPaiXu {//�����������Ӽ���������
	public  static void main(String [] args){
		Scanner shu=new Scanner(System.in);
		 String str =shu.next().toString();
		  String[] arr  = str.split(",");
		  int[] b = new int[arr.length];
		  //������������ַ�������ת��Ϊ�������͵�����
		  for(int j = 0; j<b.length;j++) {
		   b[j] = Integer.parseInt(arr[j]);
		  //System.out.println(b[j]); 
		   //funct(b);//���ú���
	}
		  funct(b);
}
	//�˺���������Ͱ����
	
		public static  void funct(int[] a){
			int [] b=new int[10];
			int i;
			for( i=0;i<a.length;i++){//����
				if(a[i]!=0) 
					b[i]++;
				
			}
			System.out.print(b[i]+" ");
			//System.out.print(b[i]+"");
			for(int j=0;j<b.length;j++){//���
				for(int f=1;f<=b[i];f++)
					System.out.print(i+" ");
			}	
		}
	
}



