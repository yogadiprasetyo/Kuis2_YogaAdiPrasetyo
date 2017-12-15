/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1100.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 23
 */
@Entity
@Table(name = "aksesoris_1100")
public class AksesorisEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesoris;
    @Column(length = 150, nullable = false)
    private String nama_aksesoris;
    @Column(length = 150, nullable = false)
    private String harga_aksesoris;
    @Column(length = 255, nullable = true)
    private String merk_aksesoris;
    /**
     * @return the id_aksesoris
     */
    public Long getId_aksesoris() {
        return id_aksesoris;
    }

    /**
     * @param id_aksesoris the id_aksesoris to set
     */
    public void setId_aksesoris(Long id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }

    /**
     * @return the nama_aksesoris
     */
    public String getNama_aksesoris() {
        return nama_aksesoris;
    }

    /**
     * @param nama_aksesoris the nama_aksesoris to set
     */
    public void setNama_aksesoris(String nama_aksesoris) {
        this.nama_aksesoris = nama_aksesoris;
    }

    /**
     * @return the harga_aksesoris
     */
    public String getHarga_aksesoris() {
        return harga_aksesoris;
    }

    /**
     * @param harga_aksesoris the harga_aksesoris to set
     */
    public void setHarga_aksesoris(String harga_aksesoris) {
        this.harga_aksesoris = harga_aksesoris;
    }

    /**
     * @return the merk_aksesoris
     */
    public String getMerk_aksesoris() {
        return merk_aksesoris;
    }

    /**
     * @param merk_aksesoris the merk_aksesoris to set
     */
    public void setMerk_aksesoris(String merk_aksesoris) {
        this.merk_aksesoris = merk_aksesoris;
    }
}