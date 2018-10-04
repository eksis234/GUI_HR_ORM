/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import entities.Job;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author X453MA
 */
public class JobController {

    private Class type;
    private InterfaceDAO idao;

    public JobController(SessionFactory sessionFactory) {
        this.idao = new GeneralDAO(sessionFactory, Job.class);
    }
    
    /**
     * Fungsi untuk menyimpan/update data
     * @param jobId - jobId
     * @param jobTitle - nama job
     * @param minSalary - mininal salary
     * @param MaxSalary - maximal salary
     * @return mengembalikan nilai boolean apakah proses save/update berhasil dilakukan
     */
    public boolean saveOrUpdate(String jobId, String jobTitle, String minSalary, String MaxSalary){
        Job job = new Job(jobId, jobTitle, new Integer(minSalary), new Integer(MaxSalary));
        return idao.saveOrUpdate(job);
    }
    
    /**
     * Fungsi untuk menghapus data pada tabel Job
     * @param jobId - job id
     * @return mengembalikan nilai boolean apakah proses delete berhasil dilakukan
     */
    public boolean delete(String jobId) {
        Job jobs = (Job) getById(jobId);
        return idao.delete(jobs);
    }
    
    /**
     * Fungsi untuk mendapatkan data berdasarkan job id
     * @param jobId - job id
     * @return mengembalikan data berupa Job
     */
    public Job getById(String jobId){
        return (Job) idao.getById(jobId);
    }
    
    /**
     * Fungsi untuk mendapatkan semua data yang ada pada tabel Job
     * @return mengembalikan semua data Job dalam bentuk List<Object>
     */
    public List<Object> getAll(){
        return idao.getAll();
    }
    
    /**
     * Fungsi untuk mencari data dalam tabel Job berdasarkan kategori yang telah dipilih
     * @param category - kategori dalam tabel Job (job id, job title, min salary, max salary)
     * @param key - kata kunci yang ingin dicari
     * @return mengembalikan hasil pencarian dalam bentuk List<Object>
     */
    public List<Object> search(String category, String key){
        if (category.equals("jobId") || category.equals("jobTitle")){
            return idao.search(category, key);
        } else {
            return idao.search(category, new Integer(key));
        } 
    }

}

