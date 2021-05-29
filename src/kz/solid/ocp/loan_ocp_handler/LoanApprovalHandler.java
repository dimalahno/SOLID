package kz.solid.ocp.loan_ocp_handler;

public class LoanApprovalHandler {
    public void approvePersonalLoan(PersonalLoanValidator validator){
        if (validator.isValid()){
            // Process of the loan
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator){
        if (validator.isValid()){
            // Process of the loan
        }
    }
}
