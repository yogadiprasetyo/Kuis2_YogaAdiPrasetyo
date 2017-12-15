/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tib.kuis_1100.entity.MobilEntity;

/**
 *
 * @author Mahasiswa 23
 */
public interface MobilRepo extends CrudRepository<MobilEntity, Long>{
    
    @Query("select c from MobilEntity c")
    public List<MobilEntity> findAllCategory();
}
