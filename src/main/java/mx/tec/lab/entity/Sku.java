package mx.tec.lab.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * sku class entity
 * @author alejandroperez
 *
 */
@Entity
public class Sku implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1625094947434203413L;
	/**
	 * id parameter
	 */
	@Id
	@GeneratedValue
	private long id;
	/**
	 * parameter color
	 */
	private String color;
	
	/**
	 * parameter size
	 */
	private String size;
	
	/**
	 * parameter listPrice
	 */
	private double listPrice;
	
	/**
	 * parameter saleprice
	 */
	private double salePrice;
	
	/**
	 * parameter quantityOnHand
	 */
	private long quantityOnHand;
	
	/**
	 * parameter smallImageUrl
	 */
	private String smallImageUrl;
	
	/**
	 * parameter mediumImageUrl
	 */
	private String mediumImageUrl;
	
	/**
	 * parameter largeImageUrl
	 */
	private String largeImageUrl;
	
	/**
	 * parameter parentProduct
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Product parentProduct;
	
	/**
	 * Sku constructor
	 */
	public Sku() {

	}

	/**
	 * id
	 * @param id
	 * color
	 * @param color
	 * size
	 * @param size
	 * listPrice
	 * @param listPrice
	 * salePrice
	 * @param salePrice
	 * quantityOnHand
	 * @param quantityOnHand
	 * smallImageUrl
	 * @param smallImageUrl
	 * mediumImageUrl
	 * @param mediumImageUrl
	 * largeImageUrl
	 * @param largeImageUrl
	 */
	public Sku(long id, String color, String size, double listPrice, double salePrice, long quantityOnHand,
			String smallImageUrl, String mediumImageUrl, String largeImageUrl) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantityOnHand = quantityOnHand;
		this.smallImageUrl = smallImageUrl;
		this.mediumImageUrl = mediumImageUrl;
		this.largeImageUrl = largeImageUrl;
	}

	
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	
	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	
	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}
	
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	/**
	 * @return the quantityOnHand
	 */
	public long getQuantityOnHand() {
		return quantityOnHand;
	}
	
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
	/**
	 * @return the smallImageUrl
	 */
	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	/**
	 * @param smallImageUrl the smallImageUrl to set
	 */
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	
	/**
	 * @param mediumImageUrl the mediumImageUrl to set
	 */
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	
	/**
	 * @return the mediumImageUrl
	 */
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}

	/**
	 * @return the largeImageUrl
	 */
	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	/**
	 * @param largeImageUrl the largeImageUrl to set
	 */
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}

	/**
	 * @return the parentProduct
	 */
	public Product getParentProduct() {
		return parentProduct;
	}

	/**
	 * @param parentProduct the parentProduct to set
	 */
	public void setParentProduct(Product parentProduct) {
		this.parentProduct = parentProduct;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Sku [id=" + id + ", color=" + color + ", size=" + size + ", listPrice=" + listPrice + ", salePrice="
				+ salePrice + ", quantityOnHand=" + quantityOnHand + ", smallImageUrl=" + smallImageUrl
				+ ", mediumImageUrl=" + mediumImageUrl + ", largeImageUrl=" + largeImageUrl + ", parentProduct="
				+ parentProduct + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Sku)) {
			return false;
		}
		Sku other = (Sku) obj;
		return id == other.id;
	}







}
