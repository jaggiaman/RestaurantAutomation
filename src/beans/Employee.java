package beans;

/**
 *
 * @author Aman
 */
public class Employee {

    private int employeeID;
    private String positionName;
    private String employeeName;
    private String employeeAddress;
    private String password;
    private int positionID;

    public Employee(int employeeID, String positionName, String employeeName, String employeeAddress, String password, int positionID) {
        this.employeeID = employeeID;
        this.positionName = positionName;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.password = password;
        this.positionID = positionID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }
    
}
