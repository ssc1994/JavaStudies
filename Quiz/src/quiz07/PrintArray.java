package quiz07;

public class PrintArray {
	//Arrays.toString
	String result ;
	
	String toArray(int[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
	
	String toArray(char[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
	
	String toArray(String[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
}
