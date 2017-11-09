package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DangerousGoods database table.
 * 
 */
@Entity
@Table(name="DangerousGoods")
@NamedQuery(name="DangerousGood.findAll", query="SELECT d FROM DangerousGood d")
public class DangerousGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Air_Waybill_Consignment_Tracking_Number", length=60)
	private String air_Waybill_Consignment_Tracking_Number;

	@Column(name="Dangerous_Good", length=60)
	private String dangerous_Good;

	@Column(name="Number_Of_Inner_Packages", length=60)
	private String number_Of_Inner_Packages;

	@Column(name="Origin_Of_Goods", length=60)
	private String origin_Of_Goods;

	@Column(name="Packing_Group_Class_7_Category", length=60)
	private String packing_Group_Class_7_Category;

	@Column(name="Quantity_Per_Inner_Packaging", length=60)
	private String quantity_Per_Inner_Packaging;

	@Column(name="Shipper_Name", length=60)
	private String shipper_Name;

	@Column(name="Subsidiary_Risk", length=60)
	private String subsidiary_Risk;

	@Column(name="Total_Number_Of_Packages_In_Consignment", length=60)
	private String total_Number_Of_Packages_In_Consignment;

	@Column(name="Type_Of_Inner_Packaging", length=60)
	private String type_Of_Inner_Packaging;

	@Column(name="Type_Of_Outer_Packaging", length=60)
	private String type_Of_Outer_Packaging;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public DangerousGood() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAir_Waybill_Consignment_Tracking_Number() {
		return this.air_Waybill_Consignment_Tracking_Number;
	}

	public void setAir_Waybill_Consignment_Tracking_Number(String air_Waybill_Consignment_Tracking_Number) {
		this.air_Waybill_Consignment_Tracking_Number = air_Waybill_Consignment_Tracking_Number;
	}

	public String getDangerous_Good() {
		return this.dangerous_Good;
	}

	public void setDangerous_Good(String dangerous_Good) {
		this.dangerous_Good = dangerous_Good;
	}

	public String getNumber_Of_Inner_Packages() {
		return this.number_Of_Inner_Packages;
	}

	public void setNumber_Of_Inner_Packages(String number_Of_Inner_Packages) {
		this.number_Of_Inner_Packages = number_Of_Inner_Packages;
	}

	public String getOrigin_Of_Goods() {
		return this.origin_Of_Goods;
	}

	public void setOrigin_Of_Goods(String origin_Of_Goods) {
		this.origin_Of_Goods = origin_Of_Goods;
	}

	public String getPacking_Group_Class_7_Category() {
		return this.packing_Group_Class_7_Category;
	}

	public void setPacking_Group_Class_7_Category(String packing_Group_Class_7_Category) {
		this.packing_Group_Class_7_Category = packing_Group_Class_7_Category;
	}

	public String getQuantity_Per_Inner_Packaging() {
		return this.quantity_Per_Inner_Packaging;
	}

	public void setQuantity_Per_Inner_Packaging(String quantity_Per_Inner_Packaging) {
		this.quantity_Per_Inner_Packaging = quantity_Per_Inner_Packaging;
	}

	public String getShipper_Name() {
		return this.shipper_Name;
	}

	public void setShipper_Name(String shipper_Name) {
		this.shipper_Name = shipper_Name;
	}

	public String getSubsidiary_Risk() {
		return this.subsidiary_Risk;
	}

	public void setSubsidiary_Risk(String subsidiary_Risk) {
		this.subsidiary_Risk = subsidiary_Risk;
	}

	public String getTotal_Number_Of_Packages_In_Consignment() {
		return this.total_Number_Of_Packages_In_Consignment;
	}

	public void setTotal_Number_Of_Packages_In_Consignment(String total_Number_Of_Packages_In_Consignment) {
		this.total_Number_Of_Packages_In_Consignment = total_Number_Of_Packages_In_Consignment;
	}

	public String getType_Of_Inner_Packaging() {
		return this.type_Of_Inner_Packaging;
	}

	public void setType_Of_Inner_Packaging(String type_Of_Inner_Packaging) {
		this.type_Of_Inner_Packaging = type_Of_Inner_Packaging;
	}

	public String getType_Of_Outer_Packaging() {
		return this.type_Of_Outer_Packaging;
	}

	public void setType_Of_Outer_Packaging(String type_Of_Outer_Packaging) {
		this.type_Of_Outer_Packaging = type_Of_Outer_Packaging;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}