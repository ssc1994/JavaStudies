package quiz17;

public class Validation {
	/* 문제1
	 * 주민번호 검증메서드 masking(String)
	 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
	 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
	 * 
	 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
	 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
	 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
	 * 4. 남, 여에 대한 정보를 출력해줍니다.
	 *  
	 * masking메서드를 만들어주세요 
	 * 검증데이터 950101-1000000 -> 남자
	 * 검증데이터 9501012000000 -> 여자
	 * 검증데이터 950101-5000000 -> 예외
	 * 검증데이터 9501015000000 -> 예외
	 * 검증데이터 950101511111 -> 예외
	 */
	
	static String gender;
	public static String Masking(String s) throws Exception {
		s=s.replace("-", "");
		
		try {
			if( s.length()!=13 || s.charAt(6)<'1' || s.charAt(6)>'4') throw new Exception();
			
			if(s.charAt(6)=='1'||s.charAt(6)=='3') System.out.println("남자");
			if(s.charAt(6)=='2'||s.charAt(6)=='4') System.out.println("여자");
			s=s.substring(0,6)+"-*******";
			return s;
			
		} catch (Exception e) {
			throw new Exception("오류 : 주민등록번호를 다시 적어주세요");
		}

		
	}
	 
	 /* 문제2
		1. String palindromeCheck(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		4. 문장은 공백을 포함하여 받을 수 있습니다.
		5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
		6. 힌트)
		* 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
		* 문장의 길이의 중간값을 구하세요. 
		* 첫문장과, 마지막문장을 비교하며 중간으로 이동
		* for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
	*/
			
			
			
	public static String PalindromeCheck(String s) {
		
		s=s.replace(" ", "");
		String temp = new StringBuilder(s).reverse().toString();
		if(s.equals(temp)) {
			System.out.println("회문입니다.");
			return "회문입니다.";
		}else {
			System.out.println("회문이 아닙니다.");
			return "회문이 아닙니다.";
		}
		
		
		
	}
	
	
	
	
	
}
