package kz.solid.ocp.loan_osp_solution;

public class PersonalLoanHandler implements Validator{

    @Override
    public boolean isValid() {
        System.out.println("Validating logic for personal loan");
        return true;
    }
}
