package object_class;


//은행계좌라는 클래스 만들기(신한은행)
public class Account {
	
	
	//1.멤버변수(필드) : 클래스에서 정의한 변수
	static final String BANKNAME = "신한은행";		//static = 정적멤버변수
	String accountNo; //계좌번호					// static 붙지 않으면 인스턴트 멤버변수 (new로 객체 생성해서 사용)
	String ownerName; // 예금주이름
	int balance; //잔액
	
	
	
	//2.생성자   ( : 객체를 생성과 동시에 초기화) (만들지 않으면 빈 생성자 생성) (상단 좌측의 source >> generate 이용)
	public Account(String accountNo, String ownerName, int bal) {	  
		this.accountNo=accountNo;	 //멤버변수와 매개변수의 이름이 같을경우 "this."로 구분해준다 
		this.ownerName=ownerName;
		balance=bal;
	}
	
	public Account() {		//빈 생성자 (ctrl + space로 생성)
		
	}
	
	
	
	//3.메소드 (클래스가 가진 기능)
	//예금한다 메소드
	void deposit(int amount) {	// void = 리턴 값이 없음, 내가 설정한 메소드 이름, (괄호안은 매개변수:값을 받는 변수)
		balance+= amount; // 잔액값 + 들어오는 값 
	}

	
	//인출한다
	int withdraw(int amount) throws Exception{	//	throws Exception 인위적 예외처리(: 개발자가 만드는 예외처리)
		if(balance <amount) {
			throw new Exception("잔액이 부족합니다");
		}
		balance-=amount;
		return amount;	//int 에 꼭 return 값이 따름
	}
	
}
