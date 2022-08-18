package aa.bb.main;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {

	private int bnum;
	private String title;
	private String content;
	private String writer;
	private Date redate;
	private Date updateDate;
	
	public BoardVO() {}
}
