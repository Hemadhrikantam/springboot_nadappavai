package Nadappvai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Nadappvai.dto.Banner;
import Nadappvai.service.BannerService;
import Nadappvai.util.ResponseStructure;

@RestController
public class BannerController {

	@ Autowired
	private BannerService service;
	
	@PostMapping("savebanner")
	public ResponseStructure<Banner>  saveBanner(@RequestBody Banner b){
		
	
		return service.saveBanner(b);
	}
	
	@GetMapping("fetchbanner")
	public ResponseStructure<List<Banner>> fetchAllBanners(){
		return service.fetchAllBanner();
	}
	
	@DeleteMapping("deletebanner")
	public ResponseStructure<String> deleteById( @RequestParam int id){
		
		return service.deleteById(id);
	}
	
	
	@DeleteMapping("deleteallbanner")
	public ResponseStructure<String> deleteAll() {
		return service.deleteAll();
	}
}
