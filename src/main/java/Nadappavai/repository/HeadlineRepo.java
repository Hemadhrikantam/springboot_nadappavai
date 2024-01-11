package Nadappavai.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import Nadappavai.dto.Headlines;

public interface HeadlineRepo extends JpaRepository<Headlines, Integer>  {
//    Page<Headlines> findAll(Headlines headlines);

}
