package adhocpes.erp.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("")
public class HomeController {

	protected static Logger logger = Logger.getLogger("controller");
	
	public HomeController(){}
	
	@RequestMapping("")
	public String getLoginView(){
		return "home";
	}
	
}
