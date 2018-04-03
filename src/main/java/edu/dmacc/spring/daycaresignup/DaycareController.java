package edu.dmacc.spring.daycaresignup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DaycareController {
	@Autowired ChildrenDao dao;
	
	@RequestMapping(value="/form")
		public ModelAndView children() {
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("childrenForm");
			modelAndView.addObject("children",new Children());
			
			
			return modelAndView;
	}
	
	@RequestMapping(value = "/result")
		public ModelAndView processChildren(Children children) {
			System.out.println("In processChildren");
			ModelAndView modelAndView = new ModelAndView();
			dao.insertChildren(children);
			modelAndView.setViewName("childrenResult");
			modelAndView.addObject("c", children);
			
			return modelAndView;
	}
	

	@RequestMapping(value = "/viewall")
		public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Children> allChildren = dao.getAllChildren();
		modelAndView.setViewName("viewAllChildren");
		modelAndView.addObject("all", allChildren);
		
		return modelAndView;
	}
	
	@Bean
	public ChildrenDao dao() {
	ChildrenDao bean = new ChildrenDao();
	return bean;
}
}

