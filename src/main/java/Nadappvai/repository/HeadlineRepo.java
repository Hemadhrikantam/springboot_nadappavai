package Nadappvai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Nadappvai.dto.Headlines;

public interface HeadlineRepo extends JpaRepository<Headlines, Integer>  {

}
