package Nadappavai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import Nadappavai.dto.Headlines;
import Nadappavai.repository.HeadlineRepo;

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
	public String deleteAllHeadlines(){
		  repo.deleteAll();
		return "Deleted All Headlines";
	}
	public Page<Headlines> getHeadlinesPagination(int number, int size) {
		Pageable pageable = PageRequest.of(number,size);
		return repo.findAll(pageable);
	}

//	public List<Headlines> getAllHeadlines(Pageable pageable) {
//		ResponseStructure<Headlines> responseStructure =new ResponseStructure<>();
//		//repo.findAll();
//		Page<Headlines> headlinesPage = repo.findAll(pageable);
//		return headlinesPage;
//	}
}
