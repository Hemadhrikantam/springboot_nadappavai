package Nadappvai.controller;

import java.io.Serial;
import java.util.List;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Nadappvai.dto.Headlines;
import Nadappvai.service.HeadlineService;
import Nadappvai.util.ResponseStructure;

@RestController
public class HeadlineController {

	@Autowired
	private HeadlineService  service ;
	
	
	@PostMapping("saveheadline")
	public ResponseStructure<Headlines>  saveHeadline(@RequestBody Headlines h) {
		return service.saveHeadline(h);
		
	}
	
	
	@GetMapping("fetchheadlines")
	public ResponseStructure<List<Headlines>> fetchAllHeadlines(){
		return service.fetchAllHeadlines();
	}
	
	@DeleteMapping("deleteheadline")
	public ResponseStructure<String> deleteById( @RequestParam int id){
		
		return service.deleteById(id);
	}
}
