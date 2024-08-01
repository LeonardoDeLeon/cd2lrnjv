package com.alienators.CRMSpringMVC.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alienators.CRMSpringMVC.model.Customer;
import com.alienators.CRMSpringMVC.service.ICustomerService;

@Controller
public class CustomerController 
{
    private ICustomerService service;

    @Autowired
    public void setService(ICustomerService service) 
    {
        this.service=service;
    }

    @GetMapping("/cxlist")
    public String getCustomerData(Model model) 
    {
        List<Customer> customerList=service.getCustomersInfo();
        model.addAttribute("customers",customerList);
        customerList.forEach(c->System.out.println(c));
        return "customerlist"; //LVN
    }

    @GetMapping("/showform")
    public String getForm(Map<String,Object> model)
    {
        Customer c=new Customer();
        model.put("customer",c);
        return "showform"; //LVN
    }

    @PostMapping("/registerCustomer")
    public String registerCx(@ModelAttribute("customer") Customer customer,Map<String,Object> model)
    {
        service.registerCustomer(customer);
        // model.put("customer",cx);
        return "redirect:/cxlist"; //LVN
    }

    @GetMapping("/updateForm")
    public String updateCxInfo(@RequestParam("customerId")Integer id, Map<String,Object> model)
    {
        Customer cx=service.fetchCxById(id);
        model.put("customer", cx);
        return "updateForm";
    }

    @GetMapping("/deleteData")
    public String deleteCx(@RequestParam("customerId")Integer id) 
    {
        service.deleteCxById(id);
        return "redirect:/cxlist";
    }
}
