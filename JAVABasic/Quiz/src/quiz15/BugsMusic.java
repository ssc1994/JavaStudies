package quiz15;

public class BugsMusic implements SongList{
	
	private String[] list = new String[100];
	private int count = 0;

	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	
	public void playList() {
		int a = (int)(Math.random()*playLength());
		System.out.println(list[a]);
	}
	
	public int playLength() {
		int length = 0;
		for(String a : list) {
			if(a==null) break;
			System.out.println(list[length]);
			length++;
		}
		return length;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
}
