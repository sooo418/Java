package day05;

public class TV {
	//데이터(속성) + 기능(method)
	String color;		
	int size;				
	boolean power;
	int channel;
	//멤버 variable
	
	public void channelUp() {
		this.channel++;		//this.속성 <- 힙에서만 사용가능
	}
	public void channelDown() {
		this.channel--;
	}
	public void power() {
		this.power = !this.power;
	}
	public void print() {
		System.out.printf("TV[전원상태 %b, 현재채널:%d, %s] %n",this.power, this.channel, this.color);
	}
	
}
