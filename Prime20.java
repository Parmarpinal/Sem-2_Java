public class Prime20{
	public static void main(String[] args){
		int count=1,i,j=1,n=3;
		int flag=0;
		int a[] = new int[20];
		a[0]=2;
		while(count<20){
			for(i=2;i<n;i++){
				if(n%i==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				a[j]=n;
				j++;
				count++;
			}
			n++;
			flag=0;
		}
		System.out.println("Prime Numbers=");
		for(j=0;j<20;j++){
			System.out.println(a[j]);
		}
	}
}