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
import tib.kuis_1100.entity.AksesorisEntity;
import tib.kuis_1100.repo.AksesorisRepo;

/**
 *
 * @author Mahasiswa 23
 */
@Service("AksesorisService")
@Transactional
public class AksesorisService {
    
    @Autowired
    private AksesorisRepo repo;

   public AksesorisEntity insert(AksesorisEntity category) {
        return repo.save(category);
    }
    
    public AksesorisEntity update(AksesorisEntity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id_aksesoris){
        repo.delete(id_aksesoris);
        return true;
    }
    
    public AksesorisEntity getById(Long id_aksesoris){
        return repo.findOne(id_aksesoris);
    }
    
    public List<AksesorisEntity> getAll(){
        return repo.findAllCategory();
    }
}
