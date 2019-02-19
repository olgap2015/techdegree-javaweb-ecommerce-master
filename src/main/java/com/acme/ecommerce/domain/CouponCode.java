package com.acme.ecommerce.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

@Component
@Scope("session")
public class CouponCode {

	// TODO: figure out how to accept an empty coupon or 5-10 character
	@Size(min = 5, max = 10, message = "Invalid coupon code! Must contain 5 to 10 characters")
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
