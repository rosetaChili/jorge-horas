package com.gmail.jorge.jorgegmail.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.jorge.jorgegmail.entity.Billionaires;
import com.gmail.jorge.jorgegmail.entity.BillionairesMonigote;
import com.gmail.jorge.jorgegmail.entity.Monigote;
import com.gmail.jorge.jorgegmail.enums.RetrasoType;
import com.gmail.jorge.jorgegmail.services.BillionairesMonigoteService;
import com.gmail.jorge.jorgegmail.services.BillionairesService;
import com.gmail.jorge.jorgegmail.services.MonigoteService;

@Controller
@Configurable
@RequestMapping("/")
public class HolaMundoController {

	@Autowired
	BillionairesService billionairesService;

	@Autowired
	MonigoteService monigoteService;
	
	@Autowired
	BillionairesMonigoteService billionairesMonigoteService;

	private List<Billionaires> list;
	private List<Monigote> monos;
	private List<BillionairesMonigote> todos;

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		if (list == null)
			list = new ArrayList<Billionaires>();
		list = billionairesService.findAll();
		model.addAttribute("list", list);
		return "hola.html";

	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if (id != null && id != 0) {
			// actualizar
			model.addAttribute(billionairesService.get(id));
		} else {
			Billionaires b = new Billionaires();
			model.addAttribute("billionaires", b);
			System.out.println("mensajke" + b.getFirstName());
		}
		return "save";
	}

	@PostMapping("/save")
	public String save(Billionaires persona, Model model) {
		billionairesService.save(persona);
		return "redirect:/";
	}

	@GetMapping("/monos")
	public String monos(Model model) {
		if (monos == null)
			monos = new ArrayList<Monigote>();
		monos = monigoteService.findAll();
		model.addAttribute("list", monos);
		return "monigote.html";
	}

	@GetMapping("/save/monigote/{id}")
	public String saveMono(@PathVariable("id") Long id, Model model) {
		RetrasoType[] retrasoTypeList = RetrasoType.values();
		if (id != null && id != 0) {
			// actualizar
			model.addAttribute(monigoteService.get(id));
			
		} else {
			model.addAttribute("monigote", new Monigote());
		}
		model.addAttribute("retrasoTypeList", retrasoTypeList);
		return "monigoteForm.html";
	}

	@PostMapping("/save/monigote")
	public String saveMono2(@Valid @ModelAttribute("monigote")Monigote pmonigote, Model model) {
		model.addAttribute("monigote", new Monigote());
		monigoteService.save(pmonigote);
		monos = monigoteService.findAll();
		model.addAttribute("list", monos);
		return "monigote.html";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		Billionaires b = billionairesService.get(id);
		System.out.println(b.getCareer().toString());

		billionairesService.delete(id);
		b = billionairesService.get(id);

		return "redirect:/";
	}
	
	@GetMapping("/delete/mono/{id}")
	public String deleteMono(@PathVariable Long id, Model model) {

		monigoteService.delete(id);
		if (monos == null)
			monos = new ArrayList<Monigote>();
		monos = monigoteService.findAll();
		model.addAttribute("list", monos);

		return "monigote.html";
	}
	
	
	@GetMapping("/cositasVarias")
	public String cositas(Model model) {
		if (todos == null)
			todos = new ArrayList<BillionairesMonigote>();
		BillionairesMonigote bv = new BillionairesMonigote(new Billionaires("jorge", "alb", "programador"), new Monigote("dasdas", "dsadas"));
		billionairesMonigoteService.save(bv);
		todos = billionairesMonigoteService.findAll();
		model.addAttribute("list", list);
		model.addAttribute("list2", monos);
		return "cositasVarias.html";
	}

	public List<Billionaires> getList() {
		return list;
	}

	public void setList(List<Billionaires> list) {
		this.list = list;
	}

	public List<Monigote> getMonos() {
		return monos;
	}

	public void setMonos(List<Monigote> monos) {
		this.monos = monos;
	}

	public List<BillionairesMonigote> getTodos() {
		return todos;
	}

	public void setTodos(List<BillionairesMonigote> todos) {
		this.todos = todos;
	}
	
	

}
