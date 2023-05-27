public class Job {
    private String jobDescription;
    private boolean isGoodSalary;

    public Job(String jobDescription, boolean isGoodSalary) {
        this.jobDescription = jobDescription;
        this.isGoodSalary = isGoodSalary;
    }

    public  Job(){

    }

    public String getJobDescription() {
        return jobDescription;
    }
    public boolean getisGoodSalary(){
        return isGoodSalary;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setGoodSalary(boolean goodSalary) {
        isGoodSalary = goodSalary;
    }
}
