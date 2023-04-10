package day03_10_26.src.com.ssc.stack;

import java.util.Date;

//여러개의 값을 묶어서 표현하기 위한 클래스  -> Value Object (V)
//getter와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
public class PersonVO {
	//번호, 이름, 생일, 전화번호를 저장
	private long num;
	private String name;
	private Date birthday;
	private String phoneNum;
	
	//매개변수가 없는 생성자 - default constructor
	//NoArgsConstructor
	public PersonVO() {
		super();
	}

	//AllArgsConstructor
	public PersonVO(long num, String name, Date birthday, String phoneNum) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
	}
	
	//getter만 있으면 읽기전용 (VO클래스는 대부분 getter만 생성함)
	public long getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phoneNum=" + phoneNum + "]";
	}
	
	
	

}
