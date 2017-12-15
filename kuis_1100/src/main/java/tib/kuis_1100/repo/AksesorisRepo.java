/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tib.kuis_1100.entity.AksesorisEntity;

/**
 *
 * @author Mahasiswa 23
 */
public interface AksesorisRepo extends CrudRepository<AksesorisEntity, Long>{ 
   
    @Query("select i from AksesorisEntity i")
    public List<AksesorisEntity> findAllCategory();
}
