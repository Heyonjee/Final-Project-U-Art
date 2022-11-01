package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ItemDTO {
	private Integer itemid;
	private String cateid;
	private String itemname;
	private String itemimg;
	private String itemplace;
	private float lat;
	private float lng;
	private String itemguide;
	private String itemticket;
	private Integer itemstock;
	private Date estart;
	private Date efin;
	
	private String itemoption_obj;
	private Integer itemoption_price;
	private String cate_catename;
	private float review_reviewgrade;

}
