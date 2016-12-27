package com.codizer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private static final Log LOG = LogFactory.getLog(AdminController.class);
	
	private static final String PRODUCT_INVENTORY = "/admin/product-inventory";
	
	@GetMapping("/product-inventory")
	public ModelAndView productInventory() {
		
		LOG.info("METHOD: productInventory()");
		return new ModelAndView(PRODUCT_INVENTORY);
	}

}
