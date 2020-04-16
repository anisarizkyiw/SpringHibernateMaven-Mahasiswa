package com.crud.mahasiswa.MavenProject.dao;

import com.agung.MavenProject.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author Anisa Rizky
 */
public interface MahasiswaDao {
    public List<Mahasiswa> getLagus();
    public Mahasiswa getMahasiswa(Integer id);
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa);
    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa);
    public Mahasiswa deleteMahasiswa(Mahasiswa mahasiswa);
}
