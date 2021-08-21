/**
 * 
 */
package mx.tec.lab.manager;


import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.lab.entity.Product;
import mx.tec.lab.entity.Sku;
import mx.tec.lab.repository.ProductRepository;

/**
 * Product manager class
 * @author alejandroperez
 *
 */
@Service
public class ProductManager {
	
	@Resource
	ProductRepository productRepository;
	
	/**
	 * shows all the products
	 * @return list of products
	 */
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	/**
	 * Retrieve an specific product based on a given product id
	 * @param pattern Pattern to search
	 * @return Optional containing a product if the product was found or empty otherwise
	 */
	public List<mx.tec.lab.entity.Product> getProducts(final String pattern) {
		return productRepository.findByNameLike(pattern);
	}
	
	/**
	 * get an specific product with the id
	 * @param id product id 
	 * @return found product
	 */
	public Optional<Product> getProduct(final long id) {
		return productRepository.findById(id);
	}
	/**
	 *  add a new product
	 * @param newProduct product to add
	 * @return new product created
	 */
	public Product addProduct(final Product newProduct) {
		for(final Sku newSku : newProduct.getChildSkus()) {
			newSku.setParentProduct(newProduct);
		}

		return productRepository.save(newProduct);
	}
	


	/**
	 * updates the products in the list
	 * @param id product to change
	 * @param modifiedProduct new product info
	 */
	public void updateProduct(final long id, final Product modifiedProduct) {
		if (modifiedProduct.getId() == id) {
			for (final Sku modifiedSku : modifiedProduct.getChildSkus()) {
				modifiedSku.setParentProduct(modifiedProduct);
			}				
			productRepository.save(modifiedProduct);
		}
	}
	
	
	/**
	 * deletes a specific product
	 * @param existingProduct product to delete
	 */
	public void deleteProduct(final Product existingProduct) {
		productRepository.delete(existingProduct);
		
	}
	



}
