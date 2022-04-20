package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;
@Controller
public class CalculadoraController{
	@GetMapping("/menu")
	public String mostrarManuCalculadora() {
		return "index";
	}
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resulatdoS = 0;
		Calculadora nuevaCalculadora =  new Calculadora();
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		nuevaCalculadora.sumaNumero();
		resulatdoS = nuevaCalculadora.sumaNumero();
		model.addAttribute("resultadoS", resulatdoS);
		return "resultadoS";	
	}
	@GetMapping("/calculoResta")
	public String getRestaPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resultadoR = 0;
		Calculadora nuevaCalculadora =  new Calculadora();
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		nuevaCalculadora.restaNumero();
		resultadoR = nuevaCalculadora.restaNumero();
		model.addAttribute("resultadoR", resultadoR);
		return "resulatdoR";
	}
	@GetMapping("/calculoDivision")
	public String getDivisionPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resultadoD = 0;
		Calculadora nuevaCalculadora =  new Calculadora();
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		nuevaCalculadora.divisionNumero();
		resultadoD = nuevaCalculadora.divisionNumero();
		model.addAttribute("resultadoD", resultadoD);
		return "resultadoD";
	}
	@GetMapping("/calculoMultiplicacion")
	public String getMultiplicacionPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resultadoM = 0;
		Calculadora nuevaCalculadora =  new Calculadora();
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		nuevaCalculadora.multiplicacionNumero();
		resultadoM = nuevaCalculadora.multiplicacionNumero();
		model.addAttribute("resultadoM", resultadoM);
		return "resultadoM";
	}
	@GetMapping("/calculoPotencia")
	public String getPotenciaPage(@RequestParam(name = "n1")int n1, @RequestParam(name = "n2")int n2,Model model) {
		int resultadoP = 0;
		Calculadora nuevaCalculadora =  new Calculadora();
		nuevaCalculadora.setN1(n1);
		nuevaCalculadora.setN2(n2);
		nuevaCalculadora.multiplicacionNumero();
		resultadoP = nuevaCalculadora.potenciaNumero();
		model.addAttribute("resultadoP", resultadoP);
		return "resultadoP";
	}
}
