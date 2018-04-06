package sample5;

//다형성을 이용해서 결합도를 낮춤
public class TvUser {
	public static void main(String[] args) {
		Tv tv=new LgTv();
//		Tv tv=new SamsungTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
