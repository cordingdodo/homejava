package sec2;

public class Tv {
	String color; //색깔
	boolean power; //전원상태
	int channel; //채널

	void power () {
		power= !power;
		}
	public Tv () {}
	public Tv(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	void channelUp() {
		channel++;
		} 
	void channelDown() {
		channel--;
		}

	void channelCheck() {
		System.out.println("현재 채널은" + channel + "번 입니다.");
	}
	
	public static void main(String[] args){
	Tv t = new Tv () ; //변수 선언문 TV는 기본형이 아닌 참조형// Tv클래스 타입의 참조변수 t를 선언
	
	// 제품의 사용 (객체의 사용)
	Tv t1 = new Tv(); // 
	Tv t2 = new Tv();
	t1.channel = 7;
	t2 = t1;
	System.out.println("t1의 채널값은" +t1.channel + "입니다.");
	System.out.println("t2의 채널값은" +t2.channel + "입니다.");
}
}
