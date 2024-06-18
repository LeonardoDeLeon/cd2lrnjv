package com.alienators.SpringDataJpa2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.alienators.SpringDataJpa2.dao.IVaccineRepo;
import com.alienators.SpringDataJpa2.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService
{
    @Autowired
    private IVaccineRepo repo;
    @Override
    public Iterable<Vaccine> fetchDetails(boolean status, String... properties) {
        Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
        return repo.findAll(sort);
    }
    @Override
    public List<Vaccine> fetchDetails(int pgNo, int pgSize, boolean status, String... properties) {
        // Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
        // PageRequest.of(pgNo, pgSize, sort);
        
        PageRequest pageable=PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
        Page<Vaccine> page = repo.findAll(pageable);
        return page.getContent();
    }
    @Override
    public void fetchDetailsPagination(int pageSize) {
        long count=4L;
        long pagesCount= count/pageSize; // 4/2==>2
        pagesCount=count%pageSize==0?pagesCount:++pagesCount;
        for (int i=0; i<pagesCount; i++){
            PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Vaccine> page=repo.findAll(pageable);
            page.getContent().forEach(c->System.out.println(c+" : "+c.getVaccineCompany()));
            System.out.println("-----------"+i+"-----------");

        }
    }

}
