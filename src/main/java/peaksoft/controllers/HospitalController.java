package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entities.Hospital;
import peaksoft.services.HospitalService;

@Controller
@RequestMapping("/hospitals")//база данныйдагы таблицанын аты
@RequiredArgsConstructor


public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping("/allHospitals")//html aty
    public String getAllHospitals(Model model) {
        model.addAttribute("allHospitals", hospitalService.getAllHospital());
        return "/getAllHospital";


    }

    @GetMapping("/new")
    public String createHospital(Model model) {
        model.addAttribute("newHospital", new Hospital());//new company data bazaga salsyk
        //anan at койуп койдук
        return "hospital/newHospital";
    }

    @PostMapping("/save")
    public String saveHospital(@ModelAttribute("newHospital") Hospital hospital) {
        hospitalService.saveHospital(hospital);//data bazaga save кылыш учун service чакырабыз
        return "redirect:/hospitals";//getAll путь указываем ал redirect,2-jolu getAll bolboit
    }

   /* @DeleteMapping("/delete")
    public String deleteById(@RequestParam("hospitalId") Long id) {
        hospitalService.removeId(id);HospitalById(hospitalService.getHospitalById(id));
        return "redirect:/hospitals";
    }
    @GetMapping("/{id}/edit")
    public String editHospital(Model model, @PathVariable("id") Long id){
        model.addAttribute("oldHospital", hospitalService.getHospitalById(id));
        return "hospital/updateHospital";*/


    @PostMapping("/{id}/update")
    public String updateHospital(@PathVariable("id") Long id, @ModelAttribute("hospital") Hospital newHospital){
        hospitalService.updateHospital(id, newHospital);
        return "redirect:/hospitals";
    }
}







