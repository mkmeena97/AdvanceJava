package DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import models.Emp;

@Transactional
public class EmpDAO {
	
	@Autowired
	HibernateTemplate template;
	
	public List<Emp> getAll()
	{
		return template.loadAll(Emp.class);
	}
	
	
	public Emp getEmp(int empid)
	{
		return template.get(Emp.class, empid);
	}
	
}
