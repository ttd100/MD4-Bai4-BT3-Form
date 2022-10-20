package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.Form;
import rikkei.academy.service.FormService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {
    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("form", FormService.getForm());
        return "form";
    }

    @GetMapping("/edit")
    public String edit(Model model) {
        model.addAttribute("allVehicle", allVehicle());
        model.addAttribute("allNational", allNational());
        model.addAttribute("allYear", allYear());
        model.addAttribute("form", FormService.getForm());
        return "edit";
    }

    @PostMapping("/update")
    public String update(Form form) {
        FormService.setForm(form);
        return "redirect:/";
    }

    private List<String> allVehicle() {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Tau bay");
        vehicles.add("Tau thuyen");
        vehicles.add("O to");
        vehicles.add("Khac");
        return vehicles;
    }

    private List<String> allNational() {
        List<String> national = new ArrayList<>();
        national.add("Viet Nam");
        national.add("My");
        national.add("Han Quoc");
        national.add("Nhat Ban");
        return national;
    }

    private List<Integer> allYear() {
        List<Integer> year = new ArrayList<>();
        for (int i = 2022; i > 1990; i--) {
            year.add(i);
        }
        return year;
    }
}