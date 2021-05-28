package kz.solid.srp.employee_architecture;

public class ClientModel {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Dima", "surgery", true);
        ClientModel.hireNewEmployee(e1);
        ClientModel.printEmployeeReport(e1, FormatType.CSV);
        ClientModel.printEmployeeReport(e1, FormatType.XML);
        ClientModel.terminateNewEmployee(e1);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
