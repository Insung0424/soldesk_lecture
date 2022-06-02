package Practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

////p392~393
//class Powder{
//	public void doPrinting() {
//		System.out.println("파우더가 재료입니다");
//	}
//	
//	public String toString() {
//		return "재료는 powder";
//	}
//}
//class Plastic{
//	public void doPrinting() {
//		System.out.println("플라스틱이 재료입니다");
//	}
//	public String toString() {
//		return "재료는 plastic";
//	}
//}
//class Printer<T>{
//	private T material;
//	public T getMaterial() {
//		return material;
//	}
//	public void setMaterial(T material) {
//		this.material = material;
//	}
//	public String toString() {
//		return material.toString();
//	}
//}

////p407
//class Member{
//	private int memberId;
//	private String memberName;
//	public Member(int memberId,String memberName) {
//		this.memberId=memberId;
//		this.memberName=memberName;
//	}
//	public int getMemberId() {
//		return memberId;
//	}
//	public void setMemberId(int memberId) {
//		this.memberId = memberId;
//	}
//	public String getMemberName() {
//		return memberName;
//	}
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//	@Override
//	public String toString() {
//		return memberName+"회원의 아이디는 "+memberId+"입니다";
//	}
////	p427
//	@Override
//	public int hashCode() {
//		return memberId;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;//다운캐스팅
//			if(this.memberId == member.memberId) 
//				//기준이 되는 객체와 비교
//				return true;
//			else 
//				return false;
//		}
//		return false;
//	}
//}

////p436
//class Member2 implements Comparator<Member2>{
//	//comparator 인터페이스를 이용한 비교
//	private int memberId;
//	private String memberName;
//	public Member2(int memberId,String memberName) {
//		this.memberId=memberId;
//		this.memberName=memberName;
//	}
//	public int getMemberId() {
//		return memberId;
//	}
//	public void setMemberId(int memberId) {
//		this.memberId = memberId;
//	}
//	public String getMemberName() {
//		return memberName;
//	}
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//	@Override
//	public int compare(Member2 o1, Member2 o2) {
//		// 반환값이 int
//		return o1.getMemberId() - o2.getMemberId();
//		// o1을 기준으로 -계산 양수면 오름차순
//	}
//}

////p437
//class Mycompare implements Comparator<String>{
//	@Override
//	public int compare(String o1, String o2) { 
//		//Comparator 인터페이스의 compare메소드 @Override
////		return o1.compareTo(o2);// 양수: 오름차순
//		return (o1.compareTo(o2))*-1; 
//		// 계산한 값의 -1 곱해서 음수 : 내림차순
//	}
//}

public class Main{
	
	public static void main(String[] args) {
////		p394
//		Printer<Plastic> pp = new Printer<>();
//		pp.setMaterial(new Plastic());
//		Plastic plastic = pp.getMaterial();
//		System.out.println(pp);
//		
//		Printer<Powder> pw = new Printer<>();
//		pw.setMaterial(new Powder());
//		Powder powder = pw.getMaterial();
//		System.out.println(pw);
		
////		p437
//		Set<String> set = new TreeSet<>(new Mycompare());
//		set.add("aaa");
//		set.add("bbb");
//		set.add("ccc");
//		System.out.println(set);
		
		
	}
}