package com.example.nguyenduccanh.service;

import java.util.List;

import com.example.nguyenduccanh.model.NhanVien;
import com.example.nguyenduccanh.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository repo;

    public List<NhanVien> listAll() {
        return repo.findAll();
    }

    public void save(NhanVien product) {
        repo.save(product);
    }

    public NhanVien get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
