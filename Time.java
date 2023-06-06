import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		ShowTime t1 = new ShowTime(11,56,3);
		ShowTime t2 = new ShowTime(2,10,4);
		t1.add(t2);
		System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second);
	}
}

class ShowTime{
	int hour;
	int minute;
	int second;

	public ShowTime(int h, int m, int s){
		this.hour=h;
		this.minute=m;
		this.second=s;
	}

	void add(ShowTime t){
		this.second+=t.second;
		if(this.second>=60){
			this.minute++;
            this.second-=60;
		}
		this.minute+=t.minute;
		if(this.minute>=60){
			this.hour++;
			this.minute-=60;
		}
		this.hour+=t.hour;
	}
}