package mx.tec.lab.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * product class entity
 * @author alejandroperez
 *
 */
@Entity
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5834952474454604066L;
	/**
	 * id parameter
	 */
	@Id
	@GeneratedValue
	private long id;
	/**
	 * name parameter
	 */
	private String name;
	/**
	 * description of the product
	 */
	private String description;
	
	/**
	 * parameter childSkus
	 */
	@OneToMany(mappedBy = "parentProduct", cascade = CascadeType.ALL)
	private List<Sku> childSkus;
	
	
	/**
	 * Product constructor
	 */
	public Product() {
		
	}

	/**
	 * Product constructor with variables
	 * id
	 * @param id
	 * name
	 * @param name
	 * description
	 * @param description
	 * child sku
	 * @param childSkus
	 * sku
	 */
	public Product(long id, String name, String description, List<Sku> childSkus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.childSkus = childSkus;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the childSkus
	 */
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	}
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", childSkus=" + childSkus
				+ "]";
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
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return id == other.id;
	}

}
