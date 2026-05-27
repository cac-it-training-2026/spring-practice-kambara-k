package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {

	@RequestMapping(path = "/bmi/input", method = RequestMethod.GET)
	public String input() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String result(BmiForm bmiForm, Model model) {
		bmiForm.setBmi(bmiForm.getWeight() / Math.pow((bmiForm.getHeight() / 100), 2));
		model.addAttribute("bmi", bmiForm.getBmi());
		return "practice04/01/bmi_result";
	}
}
