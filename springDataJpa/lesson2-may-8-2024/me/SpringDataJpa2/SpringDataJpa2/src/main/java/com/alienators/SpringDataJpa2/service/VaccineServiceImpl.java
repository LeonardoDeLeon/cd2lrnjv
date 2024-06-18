package com.alienators.SpringDataJpa2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alienators.SpringDataJpa2.dao.IVaccineRepo;
import com.alienators.SpringDataJpa2.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService
{
    @Autowired
    private IVaccineRepo repo;

    @Override
    public String registerVaccineInfo(Vaccine vaccineInfo) 
    {
        Vaccine vaccine=repo.save(vaccineInfo);
        return "Vaccine id "+vaccine.getId()+" is registered!";  
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
        return repo.saveAll(vaccines);
    }

    @Override
    public Long getVaccineCount() {
        return repo.count();
    }

    @Override
    public Boolean checkAvailability(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccinesInfo() {
        return repo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccinesSpecific(Iterable<Integer> ids) {
        return repo.findAllById(ids);
    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public String removeVaccineById(Integer id) {
        Optional<Vaccine> optional=repo.findById(id);
        if(optional.isPresent()){
            repo.deleteById(id);
            return "Vaccine with id="+id+" is deleted";
        }
        
        return "Vaccine with id="+id+" not found";
    }

    @Override
    public String removeVaccinesByIds(List<Integer> ids) {
       List<Vaccine> vaccines=(List<Vaccine>)repo.findAllById(ids);
       int count1=ids.size();System.out.println("count1: "+count1);
       int count2=vaccines.size();System.out.println("count2: "+count2);
       if(count1==count2)
       {
            repo.deleteAllById(ids);
            return "Records of given ids are deleted";
       }
       return "Failed to Delete the records";
    }

    @Override
    public String removeVaccineUsingVaccineObj(Vaccine vaccine) {
        Integer id=vaccine.getId();
        Optional<Vaccine> vac=repo.findById(id);
        if(vac.isPresent())
        {
            repo.delete(vaccine);
            return "vaccine is deleted";
        }
        return "Failed to delete vaccine";
    }
    
}
