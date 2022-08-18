package aa.bb.main;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {
	
	private int start, end;
	private boolean prev, next;
	
	private int total;
	private Basic b;
	
	public PageDTO(Basic b,int t) {
		this.b = b;
		total = t;
		
		this.end = (int) (Math.ceil(b.getPNum()/10.0)*10);
		//	1 / 10.0 -> 0.1 ceil(올림) -> 1 * 10 -> (int)10; 
		//	11 / 10.0 -> 1.1 ceil(올림) -> 2 * 10 -> (int)20; 
		
		this.start = this.end - 9;
		this.prev = this.start > 1;
		int eend = (int) (Math.ceil((total*1.0)/ b.getAmount()));
		// 전체끝 = 총게시글 수 * 1.0  / b.getAmount()
		this.end = eend <= end ? eend:end; 
		// 현재 끝은 전체끝보다 크거나 같다면 전체끝과같고, 반대라면 현재끝이된다
		this.next = this.end < eend; // 전체끝이 현재끝보다 클 때
	}
}
