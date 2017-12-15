/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tib.kuis_1100.entity.MobilEntity;
import tib.kuis_1100.repo.MobilRepo;

/**
 *
 * @author Mahasiswa 23
 */
@Service("MobilService")
@Transactional
public class MobilService {
    
    @Autowired
    private MobilRepo repo;

    public MobilEntity insert(MobilEntity category) {
        return repo.save(category);
    }
    
    public MobilEntity update(MobilEntity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id_mobil){
        repo.delete(id_mobil);
        return true;
    }
    
    public MobilEntity getById(Long id_mobil){
        return repo.findOne(id_mobil);
    }
    
    public List<MobilEntity> getAll(){
        return repo.findAllCategory();
    }
}
