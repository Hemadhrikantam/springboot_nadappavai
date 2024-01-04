package Nadappvai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Nadappvai.dto.Headlines;
import Nadappvai.repository.HeadlineRepo;

@Repository
public class HeadlineDao {

	@Autowired
	private HeadlineRepo repo;
	
	public Headlines saveHeadline(Headlines h) {
		
		return repo.save(h);
	}
	
	
	public List<Headlines> fetchAllHeadlines(){
		return repo.findAll();
	}
	
	public String deleteById(int id) {
		
		repo.deleteById(id);
		
		return "Headline Deleted";
	}
}
