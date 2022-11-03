package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService item_service;

	String dir = "item/";
	
	@RequestMapping("/medialist")
	public String medialist(Model model) {
		List<ItemDTO> list = null;
		try {
			list = item_service.select_cate(1);
			model.addAttribute("itemlist1", list);
			model.addAttribute("center", dir+"medialist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	@RequestMapping("/explist")
	public String explist(Model model) {
		List<ItemDTO> list = null;
		try {
			list = item_service.select_cate(2);
			model.addAttribute("itemlist2", list);
			model.addAttribute("center", dir+"explist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	@RequestMapping("/privatelist")
	public String privatelist(Model model) {
		List<ItemDTO> list = null;
		try {
			list = item_service.select_cate(3);
			model.addAttribute("itemlist3", list);
			model.addAttribute("center", dir+"privatelist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	@RequestMapping("/speciallist")
	public String speciallist(Model model) {
		List<ItemDTO> list = null;
		try {
			list = item_service.select_cate(4);
			model.addAttribute("itemlist4", list);
			model.addAttribute("center", dir+"speciallist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	
	@RequestMapping("/itemdetail_0")
	public String itemdetail_0(Model model, Integer itemid) {
		ItemDTO item1=null;
		try {
			item1=item_service.get(itemid);
			model.addAttribute("detail", item1);
			model.addAttribute("center", dir+"itemdetail_0");
			System.out.println("정상출력");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	
	
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model, int itemid) {
		ItemDTO item = null;
		ItemDTO item2=null;
		ItemDTO item3=null;
		try {
			item = item_service.get(itemid);
			item2=item_service.get2(itemid);
			item3=item_service.get3(itemid);
			model.addAttribute("itemdetail", item);
			model.addAttribute("itemdetail2", item2);
			model.addAttribute("itemdetail3", item3);
			model.addAttribute("center", dir+"itemdetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
}
