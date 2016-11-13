package edu.spring.fin.domain;

import java.util.Date;

public class GovVO {
	private int bno;
	private String category;
	private String title;
	private String userid;
	private String url;
	private Date finDate;
	
	public GovVO(){}

	public GovVO(int bno, String category, String title, String userid, String url, Date finDate) {
		this.bno = bno;
		this.category = category;
		this.title = title;
		this.userid = userid;
		this.url = url;
		this.finDate = finDate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFinDate() {
		return finDate;
	}

	public void setFinDate(Date finDate) {
		this.finDate = finDate;
	}
	
} // end class GovVO
