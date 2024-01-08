package Nadappvai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Nadappvai.dto.Banner;
import Nadappvai.repository.BannerRepo;
@Repository
public class BannerDao {

	@Autowired
	private  BannerRepo repo;
	
	public Banner saveBanner(Banner b) {
		return repo.save(b);
	}
	
	public List<Banner> fetchAllBanner(){
		return repo.findAll();
	}
	
	public String deleteById(int id) {
		
		repo.deleteById(id);
		
		return "Banner Deleted";
	}
	
	public String deleteAll() {
		repo.deleteAll();
		return "Deleted All Banners";
	}
}
