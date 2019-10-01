package com.cg.SpringBootDemo.dto;

public class Product {

	private Integer prodId;
	private String prodName;
	private Double prodCost;
	private String prodDescription;

	public Product() {
		super();
	}

	public Product(Integer prodId, String prodName, Double prodCost, String prodDescription) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodDescription = prodDescription;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", prodDescription="
				+ prodDescription + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCost == null) ? 0 : prodCost.hashCode());
		result = prime * result + ((prodDescription == null) ? 0 : prodDescription.hashCode());
		result = prime * result + ((prodId == null) ? 0 : prodId.hashCode());
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCost == null) {
			if (other.prodCost != null)
				return false;
		} else if (!prodCost.equals(other.prodCost))
			return false;
		if (prodDescription == null) {
			if (other.prodDescription != null)
				return false;
		} else if (!prodDescription.equals(other.prodDescription))
			return false;
		if (prodId == null) {
			if (other.prodId != null)
				return false;
		} else if (!prodId.equals(other.prodId))
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		return true;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

}
