package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.ReimbursementDao;
import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReimbursementServiceImpl implements ReimbursementService{

    @Autowired
    private ReimbursementDao reimbursementDao;

    @Override
    public List<Reimbursement> getReimbursements() {
        return this.reimbursementDao.findAll();
    }

    @Override
    public List<Reimbursement> findReimById(int empID) {
        return this.reimbursementDao.findReimById(empID);
    }

    @Override
    public Reimbursement getReimbursement(int reimID) {
        Optional<Reimbursement> r = reimbursementDao.findById(reimID);
        Reimbursement reim = null;
        if (r.isPresent()) {
            reim = r.get();
        } else {
            throw new RuntimeException(" Reimbursement not found for the given ID :: " + reimID);
        }
        return reim;
    }

    @Override
    public Reimbursement addReimbursement(Reimbursement reimbursement) {
        return this.reimbursementDao.save(reimbursement);
    }

    @Override
    public Reimbursement updateReimbursement(Reimbursement reimbursement) {
        return this.reimbursementDao.save(reimbursement);
    }

    @Override
    public String deleteReimbursement(int reimID) {
        this.reimbursementDao.deleteById(reimID);
        return "Deleted Successfully";
    }

    @Override
    public List<Reimbursement> getReimbursementByEmpID(int empID) {
        return this.reimbursementDao.findReimById(empID);
    }

    @Override
    public String updateReimStatus(int reimID, String status) {
        this.reimbursementDao.updateReimById(reimID, status);
        return "Updated successfully";
    }

    @Override
    public List<Reimbursement> getreimByStatus(String status) {
        return this.reimbursementDao.getReimByStatus(status);
    }

    @Override
    public int getEmpIdByReim(int reimId) {
        return this.reimbursementDao.getEmpIdByReimId(reimId);
    }


}
