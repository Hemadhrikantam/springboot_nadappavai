package Nadappvai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import Nadappvai.dao.HeadlineDao;
import Nadappvai.dto.Headlines;
import Nadappvai.dto.NewsPaper;
import Nadappvai.util.ResponseStructure;

@Service
public class HeadlineService {

	@Autowired
	private HeadlineDao dao;
	
	public ResponseStructure<Headlines> saveHeadline(Headlines h) {
		
		ResponseStructure<Headlines> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.CREATED.value());
		rs.setMessage("Headline Added");
		rs.setData(dao.saveHeadline(h));
		return rs;
	}
	
	public ResponseStructure<List<Headlines>> fetchAllHeadlines(){
		ResponseStructure<List<Headlines>> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("fetched All Headlines");
		rs.setData(dao.fetchAllHeadlines());
		return rs;
    }
	
	public ResponseStructure<String> deleteById(int id){
		ResponseStructure<String> rs = new ResponseStructure<>();
		rs.setStatus(HttpStatus.OK.value());
		rs.setMessage("Headline Deleted");
		rs.setData( dao.deleteById(id));
		
		return rs;
	}
}