package vn.example.itviec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import vn.example.itviec.domain.Company;
import vn.example.itviec.domain.User;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>,JpaSpecificationExecutor<Company> {

}
