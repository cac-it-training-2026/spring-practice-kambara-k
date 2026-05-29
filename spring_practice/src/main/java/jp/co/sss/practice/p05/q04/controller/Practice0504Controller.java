package jp.co.sss.practice.p05.q04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p05.repository.FruitsSeasonRepository;

@Controller
public class Practice0504Controller {

	@Autowired
	FruitsSeasonRepository fruitsSeasonRepository;

	@RequestMapping(path = "/fruits/search/input", method = RequestMethod.GET)
	public String input() {
		return "practice05/04/fruits_select_season";
	}

	@RequestMapping(path = "/fruits/search/result", method = RequestMethod.GET)
	public String result(Integer season, Model model) {
		model.addAttribute("fruits", fruitsSeasonRepository.findBySeasonMonthOrderByFruitId(season));
		String searchStr;
		if (season < 13) {
			searchStr = season + "月";
		} else {
			searchStr = "通年";
		}
		model.addAttribute("searchStr", searchStr);
		return "practice05/04/fruits_list";
	}

}
