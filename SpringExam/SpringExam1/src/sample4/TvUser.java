package sample4;

// 결합도가 높다
public class TvUser {
	public static void main(String[] args) {
		SamsungTv tv=new SamsungTv();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
//		LgTv tv=new LgTv();
//		tv.turnOn();
//		tv.turnOff();
//		tv.soundUp();
//		tv.soundDown();
	}
}
