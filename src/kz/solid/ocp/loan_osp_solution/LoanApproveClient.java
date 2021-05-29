package kz.solid.ocp.loan_osp_solution;

public class LoanApproveClient {
    public static void main(String[] args) {
        Validator personValidator = new PersonalLoanHandler();
        Validator vehicleValidator = new VehicleLoanHandler();

        LoanApproveHandler handler = new LoanApproveHandler();
        handler.approveLoan(personValidator);
        handler.approveLoan(vehicleValidator);
    }
}
