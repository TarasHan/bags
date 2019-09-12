package com.bags.best.the.model.products;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bags.best.the.model.enums.Category;


@Embeddable
public class ProductCharacteristics
{
	@Column(name = "category")
	private Category category;
	@Column(name = "material")
	private String material;
	@Column(name = "color")
	private String color;
	@Column(name = "composition")
	private String composition;
	@Column(name = "size")
	private String size;
	@Column(name = "country")
	private String country;
	@Column(name = "description")
	private String description;

	public ProductCharacteristics()
	{
	}

	public ProductCharacteristics(Category category, String material, String color, String composition, String size,
			String country, String description)
	{
		this.category = category;
		this.material = material;
		this.color = color;
		this.composition = composition;
		this.size = size;
		this.country = country;
		this.description = description;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getComposition()
	{
		return composition;
	}

	public void setComposition(String composition)
	{
		this.composition = composition;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
