package com.example.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import com.example.service.LoginUserDetails;

@Controller
@RequestMapping("customers")
public class CustomerController {
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@ModelAttribute
	CustomerForm setUpForm() {
		return new CustomerForm();
	}

	@GetMapping
	public String list(Model model) {
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		return "customers/list";
	}

	@PostMapping(path = "create")
	public String create(@Validated CustomerForm form, BindingResult result, Model model,
			@AuthenticationPrincipal LoginUserDetails userDetails) {
		if (result.hasErrors()) {
			return list(model);
		}
		Customer customer = new Customer();
		BeanUtils.copyProperties(form, customer);
		customerService.create(customer, userDetails.getUser());
		return "redirect:/customers";
	}

	@GetMapping(path = "edit", params = "form")
	public String editForm(@RequestParam Integer id, CustomerForm form) {
		Customer customer = customerService.findOne(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
						"The given customer id is not found : " + id));
		BeanUtils.copyProperties(customer, form);
		return "customers/edit";
	}

	@PostMapping(path = "edit")
	public String edit(@RequestParam Integer id, @Validated CustomerForm form,
			BindingResult result, @AuthenticationPrincipal LoginUserDetails userDetails) {
		if (result.hasErrors()) {
			return editForm(id, form);
		}
		Customer customer = new Customer();
		BeanUtils.copyProperties(form, customer);
		customer.setId(id);
		customerService.update(customer, userDetails.getUser());
		return "redirect:/customers";
	}

	@PostMapping(path = "edit", params = "goToTop")
	public String goToTop() {
		return "redirect:/customers";
	}

	@PostMapping(path = "delete")
	public String delete(@RequestParam Integer id) {
		customerService.delete(id);
		return "redirect:/customers";
	}
}