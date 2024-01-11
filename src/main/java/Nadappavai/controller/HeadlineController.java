package Nadappavai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import Nadappavai.dto.Headlines;
import Nadappavai.service.HeadlineService;
import Nadappavai.util.ResponseStructure;

@RestController
public class HeadlineController {

    @Autowired
    private HeadlineService service;


    @PostMapping("saveheadline")
    public ResponseStructure<Headlines> saveHeadline(@RequestBody Headlines h) {
        return service.saveHeadline(h);

    }


    @GetMapping("fetchheadlines")
    public ResponseStructure<List<Headlines>> fetchAllHeadlines() {
        return service.fetchAllHeadlines();
    }
//    @GetMapping("fetchallheadlines")
//    public ResponseStructure<Headlines> fetchHeadlines(Pageable pageable){
//        return service.fetchHeadlines(pageable);
//    }

    @GetMapping("fetchHeadlinesPagination/{number}/{size}")
    public ResponseStructure<Headlines> getHeadlinesPagination(@PathVariable Integer number, @PathVariable Integer size){
       return    service.getHeadLinesPagination(number,size);
    }
    @DeleteMapping("deleteheadline")
    public ResponseStructure<String> deleteById(@RequestParam int id) {
        return service.deleteById(id);
    }
    @DeleteMapping("deleteallheadlines")
    public  ResponseStructure<String> deleteAllHedlines(){
        return service.deleteAllHeadlines();
    }

}
