package com.bags.best.the.model.products;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bags.best.the.model.enums.Currency;
import com.bags.best.the.model.enums.PriceGroups;


@Entity
@Table(name = "priceRow")
public class PriceRow
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "priceRow_id", nullable = false)
	private int id;
	@Column(name = "price")
	private BigDecimal price;
	@Column(name = "currency")
	private Currency currency;
	@Column(name = "priceGroup")
	private PriceGroups priceGroup;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;

	public PriceRow()
	{
	}

	public PriceRow(BigDecimal price, Currency currency, PriceGroups priceGroup, Product product)
	{
		this.price = price;
		this.currency = currency;
		this.priceGroup = priceGroup;
		this.product = product;
	}

	public int getId()
	{
		return id;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public void setCurrency(Currency currency)
	{
		this.currency = currency;
	}

	public PriceGroups getPriceGroup()
	{
		return priceGroup;
	}

	public void setPriceGroup(PriceGroups priceGroup)
	{
		this.priceGroup = priceGroup;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}
}
