package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;

import java.util.List;

public interface ReimbursementService {
    List<Reimbursement> getReimbursements();
    List<Reimbursement> findReimById(int empID);
    Reimbursement getReimbursement(int reimID);
    Reimbursement addReimbursement(Reimbursement reimbursement);
    Reimbursement updateReimbursement(Reimbursement reimbursement);
    String deleteReimbursement(int reimID);
    List<Reimbursement> getReimbursementByEmpID(int empID);
    String updateReimStatus(int reimID, String status);
    List<Reimbursement> getreimByStatus(String status);
    int getEmpIdByReim(int reimId);
}
