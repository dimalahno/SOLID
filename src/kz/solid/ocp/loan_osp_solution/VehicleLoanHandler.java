package kz.solid.ocp.loan_osp_solution;

public class VehicleLoanHandler implements Validator{
    @Override
    public boolean isValid() {
        System.out.println("Validating logic for vehicle loan");
        return true;
    }
}
