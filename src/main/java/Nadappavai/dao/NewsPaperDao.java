package Nadappavai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Nadappavai.dto.NewsPaper;
import Nadappavai.repository.NewsPapersRepo;


@Repository
public class NewsPaperDao {
    @Autowired
    private NewsPapersRepo rep;

    public NewsPaper saveNewsPaper(NewsPaper n) {

        return rep.save(n);
    }

    public List<NewsPaper> fetchAllNewspaper() {
        return rep.findAll();
    }

    public String deleteById(int id) {
        rep.deleteById(id);
        return "Deleted";
    }

    public String deleteAllNewsPapers() {
        rep.deleteAll();
        return "DeletedAllNewsPapers";
    }
}
