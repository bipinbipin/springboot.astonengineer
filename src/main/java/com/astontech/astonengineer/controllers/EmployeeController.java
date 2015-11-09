package com.astontech.astonengineer.controllers;

import com.astontech.astonengineer.domain.Employee;
import com.astontech.astonengineer.domain.Ent;
import com.astontech.astonengineer.domain.EntityType;
import com.astontech.astonengineer.services.EmployeeService;
import com.astontech.astonengineer.services.EntityTypeService;
import com.astontech.astonengineer.services.PersonService;
import org.apache.log4j.Logger;
import org.dom4j.io.ElementModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Bipin on 10/8/2015.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PersonService personService;

    @Autowired
    private EntityTypeService entityTypeService;

    private Logger log = Logger.getLogger(EmployeeController.class);

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @RequestMapping("employee/{id}")
    public String showEmployee(@PathVariable Integer id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        model.addAttribute("allEmployees", employeeService.listAllEmployees());
        model.addAttribute("EmployeeCategory", entityTypeService.findByEntityTypeName("EmployeeCategory"));
        return "employee";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("allEmployees", employeeService.listAllEmployees());
        model.addAttribute("employee", new Employee());
        model.addAttribute("EmployeeCategory", entityTypeService.findByEntityTypeName("EmployeeCategory"));
        return "employee";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee/" + employee.getId();
    }
}
