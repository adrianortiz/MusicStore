package com.codizer.model;

public class ProductModel {

	private int productId;
	private String productName;
	private String productCategory;
	private String productDescription;
	private double productPrice;
	private String productCondition;
	private String productStatus;
	private int unitInStock;
	private String productManufacturer;
	
	public ProductModel() {}

	public ProductModel(int productId, String productName, String productCategory, String productDescription,
			double productPrice, String productCondition, String productStatus, int unitInStock,
			String productManufacturer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitInStock = unitInStock;
		this.productManufacturer = productManufacturer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productDescription=" + productDescription + ", productPrice=" + productPrice
				+ ", productCondition=" + productCondition + ", productStatus=" + productStatus + ", unitInStock="
				+ unitInStock + ", productManufacturer=" + productManufacturer + "]";
	}
}
