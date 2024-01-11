package Nadappavai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import Nadappavai.dao.NewsPaperDao;
import Nadappavai.dto.NewsPaper;
import Nadappavai.util.ResponseStructure;

@Service
public class NewsPaperService {
    @Autowired
    private NewsPaperDao dao;

    public ResponseStructure<NewsPaper> saveNewsPaper(NewsPaper n) {
        dao.saveNewsPaper(n);
        ResponseStructure<NewsPaper> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.CREATED.value());
        rs.setMessage("NewsPaper Added");
        rs.setData(n);
        return rs;
    }


    public ResponseStructure<List<NewsPaper>> fetchAllNewsPaper() {
        ResponseStructure<List<NewsPaper>> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("fetched All datas");
        rs.setData(dao.fetchAllNewspaper());
        return rs;
    }

    public ResponseStructure<NewsPaper> deleteById(int id, NewsPaper n) {
        ResponseStructure<NewsPaper> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("NewsPaper " + id + " Deleted");
        rs.setData(n);
        dao.deleteById(id);
        return rs;
    }

    public ResponseStructure<String> deleteAllNewsPapers() {
        ResponseStructure<String> rs = new ResponseStructure<>();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("Deleted All NewsPapers");
        rs.setData(dao.deleteAllNewsPapers());
        return rs;
    }
}
