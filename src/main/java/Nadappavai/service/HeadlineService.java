package Nadappavai.service;

import java.util.List;

import Nadappavai.repository.HeadlineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Nadappavai.dao.HeadlineDao;
import Nadappavai.dto.Headlines;
import Nadappavai.util.ResponseStructure;

@Service
@Repository
public class HeadlineService {

    @Autowired
    private HeadlineDao dao;
    @Autowired
    private HeadlineRepo repo;

    public ResponseStructure<Headlines> saveHeadline(Headlines h) {

        ResponseStructure<Headlines> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.CREATED.value());
        rs.setMessage("Headline Added");
        rs.setData(dao.saveHeadline(h));
        return rs;
    }

    public ResponseStructure<List<Headlines>> fetchAllHeadlines() {
        ResponseStructure<List<Headlines>> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("fetched All Headlines");
        rs.setData(dao.fetchAllHeadlines());
        return rs;
    }

    public ResponseStructure<String> deleteById(int id) {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("Headline Deleted");
        rs.setData(dao.deleteById(id));
        return rs;
    }

    public ResponseStructure<String> deleteAllHeadlines() {
        ResponseStructure<String> responseStructure = new ResponseStructure<>();
        responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Deleted All Headlines");
		responseStructure.setData(dao.deleteAllHeadlines());
		return responseStructure;
    }

    //	public ResponseStructure<Headlines> fetchHeadlines(Pageable pageable) {
//		ResponseStructure<Headlines> responseStructure = new ResponseStructure<>();
//		responseStructure.setStatus(HttpStatus.OK.value());
//		responseStructure.setMessage("fetched All Headlines");
//		Page<Headlines> headlinesPage =   repo.findAll(pageable);
//		responseStructure.setData(headlinesPage);
//		return responseStructure;
//	}
    public ResponseStructure<Headlines> getHeadLinesPagination(int number, int size) {
        dao.getHeadlinesPagination(number, size);
        ResponseStructure<Headlines> responseStructure = new ResponseStructure<>();
        responseStructure.setStatus(HttpStatus.OK.value());
        responseStructure.setMessage("fetched All Headlines");
        //responseStructure.setData(dao.getHeadlinesPagination(number,size));
        return responseStructure;
    }


}