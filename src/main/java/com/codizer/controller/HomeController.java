package com.codizer.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Log LOG = LogFactory.getLog(HomeController.class);
	
	private static final String INDEX_HOME_VIEW = "index";
	private static final String PRODUCT_LIST_HOME_VIEW = "productListHome";
	private static final String VIEW_PRODUCT_HOME_VIEW = "viewProductHome";
	
	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView(INDEX_HOME_VIEW);
	}
	
	@GetMapping("/productList")
	public ModelAndView productList() {

		LOG.info("METHOD: productList()");
		ModelAndView mav = new ModelAndView(PRODUCT_LIST_HOME_VIEW);
		return mav;
	}
	
	@GetMapping("/productList/viewProduct/{productId}")
	public ModelAndView viewProduct(@PathVariable String productId) {
		
		LOG.info("METHOD: viewProduct() -- PARAMETER: productId=" + productId);
		ModelAndView mav = new ModelAndView(VIEW_PRODUCT_HOME_VIEW);
		return mav;
	}
}
