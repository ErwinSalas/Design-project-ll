package Models;

/**
 * Created by Pavilion on 18/6/2017.
 */
public class RentRequest {
    private int id;
    private String status;
    private String applicant_name;
    private String department_name;
    private int id_applicant;
    private int id_department;

    public RentRequest(int id, String status, String applicant_name, String department_name, int id_applicant, int id_department) {
        this.id = id;
        this.status = status;
        this.applicant_name = applicant_name;
        this.department_name = department_name;
        this.id_applicant = id_applicant;
        this.id_department = id_department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplicant_name() {
        return applicant_name;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getId_applicant() {
        return id_applicant;
    }

    public void setId_applicant(int id_applicant) {
        this.id_applicant = id_applicant;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }
}
