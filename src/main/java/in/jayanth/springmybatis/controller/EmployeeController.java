package in.jayanth.springmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.jayanth.springmybatis.dao.EmployeeMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeMapper mapper;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("list-employees");
		mav.addObject("listemployees",mapper.getAllEmployees());
		return mav;
	}
	@RequestMapping("/showFormForAddEmployee")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView ("add-employee");
		mav.addObject("employee",new Employee ());
		return mav;
	}
}
	
