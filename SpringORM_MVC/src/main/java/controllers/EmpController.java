package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import DAO.EmpDAO;
import models.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO edao;         //hibernate-template (no query)
	
	@RequestMapping("/all")
	public ModelAndView getAll()
	{
		List<Emp> emplist = edao.getAll();
		return new ModelAndView("all","emplist",emplist);
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("empid") int eid)
	{
		Emp e = edao.getEmp(eid);
		return new ModelAndView("editemp","edit_emp",e);
	}
	
	
}
