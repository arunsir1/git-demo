class Pattern{
	public static void main(String[] args){
		int[] arr = {40, 20,10,50,30};
		int n= arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				int temp = 0;
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}

