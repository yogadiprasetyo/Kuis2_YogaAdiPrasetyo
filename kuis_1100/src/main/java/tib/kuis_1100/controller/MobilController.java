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
import tib.kuis_1100.entity.MobilEntity;
import tib.kuis_1100.service.MobilService;

/**
 *
 * @author Mahasiswa 23
 */
@RestController
@RequestMapping("/mobil_1100")
public class MobilController {
    @Autowired
    private MobilService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public MobilEntity insert(@RequestBody MobilEntity category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MobilEntity update(@RequestBody MobilEntity category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") Long id_mobil) {
        return categoryService.delete(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public MobilEntity getById(@PathVariable("id_mobil") Long id_mobil){
        return categoryService.getById(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<MobilEntity> getAll(){
        return categoryService.getAll();
    }
}
