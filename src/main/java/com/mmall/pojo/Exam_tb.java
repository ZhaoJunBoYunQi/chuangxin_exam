package com.mmall.pojo;

public class Exam_tb {
    private Integer id;

    private String examSub;

    private Integer examNum;

    private String examHall;

    private String examPaper;

    private String examTeacher;

    private String examTime;

    private Integer examState;

    private String examStulist;

    public Exam_tb(Integer id, String examSub, Integer examNum, String examHall, String examPaper, String examTeacher, String examTime, Integer examState, String examStulist) {
        this.id = id;
        this.examSub = examSub;
        this.examNum = examNum;
        this.examHall = examHall;
        this.examPaper = examPaper;
        this.examTeacher = examTeacher;
        this.examTime = examTime;
        this.examState = examState;
        this.examStulist = examStulist;
    }

    public Exam_tb() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamSub() {
        return examSub;
    }

    public void setExamSub(String examSub) {
        this.examSub = examSub == null ? null : examSub.trim();
    }

    public Integer getExamNum() {
        return examNum;
    }

    public void setExamNum(Integer examNum) {
        this.examNum = examNum;
    }

    public String getExamHall() {
        return examHall;
    }

    public void setExamHall(String examHall) {
        this.examHall = examHall == null ? null : examHall.trim();
    }

    public String getExamPaper() {
        return examPaper;
    }

    public void setExamPaper(String examPaper) {
        this.examPaper = examPaper == null ? null : examPaper.trim();
    }

    public String getExamTeacher() {
        return examTeacher;
    }

    public void setExamTeacher(String examTeacher) {
        this.examTeacher = examTeacher == null ? null : examTeacher.trim();
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime == null ? null : examTime.trim();
    }

    public Integer getExamState() {
        return examState;
    }

    public void setExamState(Integer examState) {
        this.examState = examState;
    }

    public String getExamStulist() {
        return examStulist;
    }

    public void setExamStulist(String examStulist) {
        this.examStulist = examStulist == null ? null : examStulist.trim();
    }
}