package com.bags.best.the.model.products;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bags.best.the.model.enums.ProductStatus;


@Entity
@Table(name = "product")
public class Product
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false)
	private int id;
	@Column(name = "articleNumber")
	private String articleNumber;
	@Column(name = "sellable")
	private boolean sellable;
	@Column(name = "status")
	private ProductStatus status;
	@Column(name = "photos")
	@ElementCollection(targetClass=String.class)
	private List<String> photos;
	@Embedded
	private ProductCharacteristics productCharacteristics;
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<PriceRow> priceRow = new HashSet<>();

	public Product()
	{
	}

	public Product(String articleNumber, boolean sellable, ProductStatus status, List<String> photos,
			ProductCharacteristics productCharacteristics, Set<PriceRow> priceRow)
	{
		this.articleNumber = articleNumber;
		this.sellable = sellable;
		this.status = status;
		this.photos = photos;
		this.productCharacteristics = productCharacteristics;
		this.priceRow = priceRow;
	}

	public int getId()
	{
		return id;
	}

	public String getArticleNumber()
	{
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber)
	{
		this.articleNumber = articleNumber;
	}

	public boolean isSellable()
	{
		return sellable;
	}

	public void setSellable(boolean sellable)
	{
		this.sellable = sellable;
	}

	public ProductStatus getStatus()
	{
		return status;
	}

	public void setStatus(ProductStatus status)
	{
		this.status = status;
	}

	public List<String> getPhotos()
	{
		return photos;
	}

	public void setPhotos(List<String> photos)
	{
		this.photos = photos;
	}

	public ProductCharacteristics getProductCharacteristics()
	{
		return productCharacteristics;
	}

	public void setProductCharacteristics(ProductCharacteristics productCharacteristics)
	{
		this.productCharacteristics = productCharacteristics;
	}

	public Set<PriceRow> getPriceRow()
	{
		return priceRow;
	}

	public void setPriceRow(Set<PriceRow> priceRow)
	{
		this.priceRow = priceRow;
	}
}
