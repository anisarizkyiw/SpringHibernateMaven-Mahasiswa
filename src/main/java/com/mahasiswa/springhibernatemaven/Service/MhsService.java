package com.crud.mahasiswa.MavenProject.service;

import com.crud.mahasiswa.MavenProject.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author Anisa Rizky
 */
public interface MahasiswaService {
    public List<Mahasiswa> getMhs();
    public Mahasiswa getMahasiswa(Integer id);
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa);
    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa);
    public Mahasiswa deleteMahasiswa(Mahasiswa mahasiswa);
}
