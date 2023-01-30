package com.macro.mall.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.macro.mall.dto.PmsProductAttributeParam;
import com.macro.mall.model.PmsProduct;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class MallDemoApplicationTests {
	private Logger logger = LoggerFactory.getLogger(MallDemoApplicationTests.class);
	@Test
	public void contextLoads() {
	}

	@Test
	public void testLogStash() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		PmsProduct product = new PmsProduct();
		product.setId(1L);
		product.setName("小米手机");
		product.setBrandName("小米");
		logger.info(mapper.writeValueAsString(product));
		logger.error(mapper.writeValueAsString(product));
	}

	@Test
	public void testStreamMap() {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("a111");
		strings.add("b111");
		List<String> collect = strings.stream().map(a -> a.toString()).collect(Collectors.toList());
		System.out.println(collect);
		PmsProductAttributeParam pmsProductAttributeParam = new PmsProductAttributeParam();
		pmsProductAttributeParam.setProductAttributeCategoryId(0L);
		System.out.println(pmsProductAttributeParam);
	}
}
