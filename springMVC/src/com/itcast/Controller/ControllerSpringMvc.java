package com.itcast.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itcast.pojo.Items;

@Controller
public class ControllerSpringMvc {

	@RequestMapping("/list")
	public ModelAndView list() throws Exception{
		
		List<Items> itemsList=new ArrayList<Items>();
		
		Items items1 = new Items();
		items1.setName("联想笔记本");
		items1.setPrice(6000f);
		items1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items2 = new Items();
		items2.setName("苹果手机");
		items2.setPrice(5000f);
		items2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items1);
		itemsList.add(items2);
		
		ModelAndView view = new ModelAndView();
		
		view.addObject("itemsList",itemsList);
		
		view.setViewName("WEB-INF/jsp/itemList.jsp");
		
		
		return view;

	}
	
	
}
