package studying.상속;

public class TireCar {
	
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);	//자동차의 4개 타이어
	Tire frontRightTire = new Tire("앞오른쪽", 2);	//자동차의 4개 타이어
	Tire backLeftTire = new Tire("뒤왼쪽", 3);	//자동차의 4개 타이어
	Tire backRightTire = new Tire("뒤오른쪽", 4);	//자동차의 4개 타이어
	
	//생성자
	
	//메소드
	int run() {				//모든 타이어를 1화 회전시키기 위해 각 Tire 객체의 roll()메소드 호출, false를 리턴하는 경우 stop()메소드 호출하고 해당 타이어 번호 리턴한다	
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(backLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		return 0;
	}
	
	void stop() {			//펑크날 시 실행
		System.out.println("[자동차가 멈춥니다.");
	}
}
