package PaiXu;

public class maopao {
	public static void main(String[] args) {
		int i,j,tem;
		int[] arr={5,6,4,1,3};
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for(j=1;j<arr.length-1;j++){
			for(int k=0;k<arr.length-j;k++){
				if(arr[k]<arr[k+1]){
					tem=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=tem;
				
				}
				//else
					//System.out.print(arr[k]);
					
			}
		}
	for(int m=0;m<arr.length;m++)
		System.out.print(arr[m]+" ");

	}

}
