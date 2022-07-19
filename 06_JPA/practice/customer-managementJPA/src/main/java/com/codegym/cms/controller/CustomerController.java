package com.codegym.cms.controller;


import com.codegym.cms.model.Customer;
import com.codegym.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    /*Tiêm customerService vào để lấy các phương thức đã định ngĩa ở nó*/
    @Autowired
    private ICustomerService customerService;

    /*Tạo và hiển thị bảng create, Phần post save lại khi create*/
    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer" , new Customer());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

    /*Tạo và hiển thị danh sách list findAll*/
    @GetMapping("/customers")
    public ModelAndView listCustomer(){
        List<Customer> customers = customerService.findAll();

        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers" , customers);
        return modelAndView;
    }

    /*Hiển thị phần edit theo id lấy ra từ customer, Phần post save lại khi edit*/
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditPage(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if(customer != null){
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("/erros");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView editCustomer(@ModelAttribute Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("", customer);
        modelAndView.addObject("message","Cập nhât thành công");
        return modelAndView;
    }



    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/erros");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:customers";
    }






}
