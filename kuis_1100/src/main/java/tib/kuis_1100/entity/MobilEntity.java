/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 23
 */
@Entity
@Table(name = "mobil_1100")
public class MobilEntity implements Serializable {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_mobil;
    @Column(length = 255, nullable = true)
    private String jenis_mobil;
    @Column(length = 255, nullable = true)
    private String merk_mobil;
    @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<AksesorisEntity>AksesorisEntity;

    /**
     * @return the id_mobil
     */
    public Long getId_mobil() {
        return id_mobil;
    }

    /**
     * @param id_mobil the id_mobil to set
     */
    public void setId_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    /**
     * @return the nama_mobil
     */
    public String getNama_mobil() {
        return nama_mobil;
    }

    /**
     * @param nama_mobil the nama_mobil to set
     */
    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    /**
     * @return the jenis_mobil
     */
    public String getJenis_mobil() {
        return jenis_mobil;
    }

    /**
     * @param jenis_mobil the jenis_mobil to set
     */
    public void setAlamat(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    /**
     * @return the merk_mobil
     */
    public String getMerk_mobil() {
        return merk_mobil;
    }

    /**
     * @param merk_mobil the merk_mobil to set
     */
    public void setMerk_mobil(String merk_mobil) {
        this.merk_mobil = merk_mobil;
    }
    
    
    
}

