package kz.solid.ocp.loan_osp_solution;

public class LoanApproveHandler {

    public void approveLoan(Validator validator) {
        if (validator.isValid()){
            System.out.println("Get loan");
        }
    }
}
