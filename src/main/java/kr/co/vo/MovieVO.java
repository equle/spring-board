package kr.co.vo;

import java.util.Date;

public class MovieVO {

	private int num;
	private String title;
	private String di;
	private String ac;
	private String src;
	private Date regDate;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDi() {
		return di;
	}
	public void setDi(String di) {
		this.di = di;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

//
//
//	@Override
//	public String toString() {
//		return "MemberVO [userEmail=" + userEmail + ", userPass=" + userPass + ", userName=" + userName + ", regDate="
//				+ regDate + "]";
//	}
	
}