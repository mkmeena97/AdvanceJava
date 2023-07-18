package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	/*	 @RequestMapping(value="/hello",method=RequestMethod.GET )
	public String sayHello()
	{
		return "hello";
	}
	*/
	
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String sayHello1()
	{
		return "hello";
	} 
	
	
	@RequestMapping("/info")
	public ModelAndView getInfo(HttpServletRequest request)
	{
		String msg="Welcome "+request.getParameter("name");
		return new ModelAndView("info","msg",msg);
	}
	@RequestMapping("/request_info")
	public String getRequestInfo(HttpServletRequest request, ModelMap map)
	{
		map.addAttribute("req_path", request.getContextPath());
		map.addAttribute("req_mathod", request.getMethod());
		map.addAttribute("req_type", request.getContentType());
		map.addAttribute("req_header", request.getHeader("user-agent"));
		return "request_info";
	}
	
	@RequestMapping("/coloredName")
	public String getColoredName(HttpServletRequest request, ModelMap map)
	{
		map.addAttribute("name",request.getParameter("name"));
		map.addAttribute("colour",request.getParameter("color"));
		return "color_name";
	}
	
}
