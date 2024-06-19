package com.alienators.SpringDataJpa2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
    public List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... args) {
        Example<Vaccine> example=Example.of(vaccine);
        Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,args);
        return repo.findAll(example,sort);
    }

    @Override
    public Vaccine searchVaccineById(Integer id) {
        // return repo.getById(id);
        System.out.println("control in service layer");
        return repo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccineByObj(Vaccine vaccine) {
        
        Example<Vaccine> example=Example.of(vaccine);
        return repo.findAll(example);
    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
        
        List<Vaccine> list=repo.findAllById(ids);
        if (list.size()!=0) {
            repo.deleteAllByIdInBatch(ids);
            return "Deleted the records of given ids";
        }
        return "Unable to delete records";

    }
 
    
    
}
