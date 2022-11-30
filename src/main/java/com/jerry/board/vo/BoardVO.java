package com.jerry.board.vo;

import org.apache.ibatis.type.Alias;


/**
 * 
 * @author 0526
 * @Comment TableName : BOARD
 */
@Alias("Board")
public class BoardVO {
	private int wr_uid;
	private String subject;
	private String content;
	private String name;
	private int viewcnt;
	private String regdate;
	public int getWr_uid() {
		return wr_uid;
	}
	public void setWr_uid(int wr_uid) {
		this.wr_uid = wr_uid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
