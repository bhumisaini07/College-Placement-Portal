package model;

public class Job {

    private int jobId;
    private int companyId;
    private String role;

    public Job(int jobId, int companyId, String role) {
        this.jobId = jobId;
        this.companyId = companyId;
        this.role = role;
    }

    public int getJobId() {
        return jobId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getRole() {
        return role;
    }
}
