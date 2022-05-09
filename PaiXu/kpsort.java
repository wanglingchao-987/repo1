package PaiXu;

public class kpsort {
	public static  void fun(int  arr[],int left,int right){
		int temp;
		temp=arr[left];
		while(left<right){
			while(temp<=arr[right])
				right--;
			if(left<right ){
				arr[left]=arr[right];
				++left;
			}
			while(temp>=arr[left]){
				++left;
			}
			if(left<right){
				arr[right]=arr[left];
				--right;
			}
			
		}
		
	}

}
