package com.multi.kitem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.KItemDTO;
import com.multi.service.KItemService;

@SpringBootTest
class UpdateKItem {
	@Autowired
	KItemService service;

	@Test
	void contextLoads() {
		try {
			service.modify(new KItemDTO(123, 4, "마르크 샤갈 특별전", null, "서울시립미술관", 37.56413149288777, 126.97376903007732, null, null, null, null, null, null, null, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("updated");
	}

}
