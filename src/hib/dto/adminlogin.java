package hib.dto;
public class adminlogin {
    private String adminId;
    private String password;

    public adminlogin(String adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public adminlogin() {
    }
            
            
            
            
            
}
