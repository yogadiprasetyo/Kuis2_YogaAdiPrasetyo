/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tib.kuis_1100.entity.AksesorisEntity;
import tib.kuis_1100.service.AksesorisService;
import tib.kuis_1100.service.MobilService;

/**
 *
 * @author Mahasiswa 23
 */
@RestController
@RequestMapping("/aksesoris_1100")
public class Aksesoris_controller {
    
    @Autowired
    private AksesorisService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public AksesorisEntity insert(@RequestBody AksesorisEntity category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public AksesorisEntity update(@RequestBody AksesorisEntity category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesoris}")
    public boolean delete(@PathVariable("id_aksesoris") Long id_aksesoris) {
        return categoryService.delete(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesoris}")
    public AksesorisEntity getById(@PathVariable("id_aksesoris") Long id_aksesoris){
        return categoryService.getById(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<AksesorisEntity> getAll(){
        return categoryService.getAll();
    }
}
