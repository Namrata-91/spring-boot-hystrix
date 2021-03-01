package com.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shopping")
public class Shopping {

	@Id
	@GeneratedValue
	private int customerId;
	private String product;
	private String paymentMethod;
	private String product_review;
	
	
	
	public void setProduct_review(String product_review) {
		this.product_review = product_review;
	}
	public String getProduct_review() {
		return product_review;
	}
	public String getProduct() {
		return product;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Shopping [customerId=" + customerId + ", product=" + product + ", paymentMethod=" + paymentMethod
				+ ", product_review=" + product_review + "]";
	}
	public Shopping() {
	}
}
