package vn.example.itviec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.example.itviec.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}