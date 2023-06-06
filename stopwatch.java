public class stopwatch{
	public static void main(String[] args){
		Time t=new Time(0,1,10);
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

	public void printtime(int h,int m,int s){
		System.out.println(h + ":" + m + ":" + s);
	}

	public void count(){
		int h=0,m=0,s=0;
		while(true){
			printtime(h,m,s);
			s++;
			try{
				Thread.sleep(500);
			}catch(Exception e){

			}

			if(s>60){
				m++;
				s=00;
			}
			if(m>60){
				h++;
				m=00;
			}
			if(h==this.hour && m==this.minute && s==this.second){
					break;
			}
		}
		System.out.println("Time Up");
	}
}