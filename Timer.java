public class Timer{
	public static void main(String[] args){
		Time t=new Time(0,0,10);
		t.count();
	}
}
class Time{
	int hour;
	int minute;
	int second;

	Time(int h,int m, int s){
		hour=h;
		minute=m;
		second=s;
	}

	public void printtime(){
		System.out.println(hour + ":" + minute + ":" + second);
	}

	public void count(){
		while(true){
			printtime();
			second--;
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			if(second<0 && minute>0){
				minute--;
				second=59;
			}
			if(minute<0 && hour>0){
				hour--;
				minute=59;
			}
			if(hour<=0){
				if(minute==0 && second==0){
					break;
				}
			}
		}
		System.out.println("Time Up");
	}
}