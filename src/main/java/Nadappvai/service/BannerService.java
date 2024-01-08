package Nadappvai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import Nadappvai.dao.BannerDao;
import Nadappvai.dto.Banner;
import Nadappvai.util.ResponseStructure;

@Service
public class BannerService {

	@Autowired
	private BannerDao dao;
	
	
	public ResponseStructure<Banner>  saveBanner(Banner b){
		ResponseStructure<Banner> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.CREATED.value());
		rs.setMessage("Banner Added");
		rs.setData(dao.saveBanner(b));
		return rs;
	}
	
	public ResponseStructure<List<Banner>> fetchAllBanner(){
		ResponseStructure<List<Banner>> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("fetched All Bannners");
		rs.setData(dao.fetchAllBanner());
		return rs;
    }
	
	public ResponseStructure<String> deleteById(int id){
		ResponseStructure<String> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Banner Deleted");
		rs.setData( dao.deleteById(id));
		
		return rs;
	}
	public ResponseStructure<String> deleteAll() {
		ResponseStructure<String> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("All Banners Deleted");
		rs.setData( dao.deleteAll());
		
		return rs;
		
	}
	
}
