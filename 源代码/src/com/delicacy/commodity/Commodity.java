package com.delicacy.commodity;

import java.util.Date;

public class Commodity {
	private int id;						//商品ID
	private String name;				//商品名
	private String sourceID;			//原产地ID
	private String sourceName;			//原产地名
	private String sourceAddress;		//原产地地址
	private String pictureURL;			//商品图片URL
	private Date InTime;				//入库时间
	private float inventory;			//库存数量
	private String kind;				//商品类别
	private String info;				//商品描述
	private float price;				//单价
	private Date expirationDate;		//保质期	
	public float getInventory() {
		return inventory;
	}
	public void setInventory(float inventory) {
		this.inventory = inventory;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourceID() {
		return sourceID;
	}
	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}
	public String getPictureURL() {
		return pictureURL;
	}
	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}
	public Date getInTime() {
		return InTime;
	}
	public void setInTime(Date wareHouseInTime) {
		this.InTime = wareHouseInTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	

}
