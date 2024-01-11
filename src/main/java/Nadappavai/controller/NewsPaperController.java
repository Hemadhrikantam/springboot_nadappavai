package Nadappavai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Nadappavai.dto.NewsPaper;
import Nadappavai.service.NewsPaperService;
import Nadappavai.util.ResponseStructure;

@RestController
public class NewsPaperController {
	@Autowired
	private NewsPaperService service;
	
	@PostMapping("savenewspaper")
	public ResponseStructure<NewsPaper> saveNewsPaper(@RequestBody NewsPaper n) {
		return service.saveNewsPaper(n);
	}

	@GetMapping("fetchallnewspapers")
	public ResponseStructure<List<NewsPaper>> fetchAllNewspaper(){
		return service.fetchAllNewsPaper();
	}
	@DeleteMapping("deletenewspaper")
	public ResponseStructure<NewsPaper> deleteById(NewsPaper n ,int id){
		return service.deleteById(id, n);
	}
	@DeleteMapping("deleteallnewspapers")
	public  ResponseStructure<String> deleteAllNewspapers(){
		return service.deleteAllNewsPapers();
	}
}
