package vn.example.itviec.service;

import org.springframework.stereotype.Service;

import vn.example.itviec.domain.Company;
import vn.example.itviec.repository.CompanyRepository;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company handleCreateCompany(Company c) {
        return this.companyRepository.save(c);
    }
}