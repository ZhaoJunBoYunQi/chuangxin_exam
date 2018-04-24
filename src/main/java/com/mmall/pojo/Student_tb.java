package com.mmall.pojo;

public class Student_tb {
    private Integer id;

    private String stdId;

    private String stdName;

    private String stdClass;

    private String stdSex;

    private String stdPwd;

    private String stdIp;

    private String stdExam;

    private String stdState;

    public Student_tb(Integer id, String stdId, String stdName, String stdClass, String stdSex, String stdPwd, String stdIp, String stdExam, String stdState) {
        this.id = id;
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdClass = stdClass;
        this.stdSex = stdSex;
        this.stdPwd = stdPwd;
        this.stdIp = stdIp;
        this.stdExam = stdExam;
        this.stdState = stdState;
    }

    public Student_tb() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId == null ? null : stdId.trim();
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName == null ? null : stdName.trim();
    }

    public String getStdClass() {
        return stdClass;
    }

    public void setStdClass(String stdClass) {
        this.stdClass = stdClass == null ? null : stdClass.trim();
    }

    public String getStdSex() {
        return stdSex;
    }

    public void setStdSex(String stdSex) {
        this.stdSex = stdSex == null ? null : stdSex.trim();
    }

    public String getStdPwd() {
        return stdPwd;
    }

    public void setStdPwd(String stdPwd) {
        this.stdPwd = stdPwd == null ? null : stdPwd.trim();
    }

    public String getStdIp() {
        return stdIp;
    }

    public void setStdIp(String stdIp) {
        this.stdIp = stdIp == null ? null : stdIp.trim();
    }

    public String getStdExam() {
        return stdExam;
    }

    public void setStdExam(String stdExam) {
        this.stdExam = stdExam == null ? null : stdExam.trim();
    }

    public String getStdState() {
        return stdState;
    }

    public void setStdState(String stdState) {
        this.stdState = stdState == null ? null : stdState.trim();
    }
}