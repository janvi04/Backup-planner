
package hib.dto;


public class Student {
    
   private String backupTopic;
   private String bTime;
   private String cName;
   private String stuName;
   private String cNo;
   private String reason;

    public Student() {
    }

    public Student(String backupTopic, String bTime, String cName, String stuName, String cNo, String reason) {
        this.backupTopic = backupTopic;
        this.bTime = bTime;
        this.cName = cName;
        this.stuName = stuName;
        this.cNo = cNo;
        this.reason = reason;
    }

 

    public String getBackupTopic() {
        return backupTopic;
    }

    public void setBackupTopic(String backupTopic) {
        this.backupTopic = backupTopic;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }
   
    
    
    
    
    
    
    
    
    
    
}
