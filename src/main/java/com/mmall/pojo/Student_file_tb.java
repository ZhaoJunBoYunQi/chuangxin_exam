package com.mmall.pojo;

public class Student_file_tb {
    private Integer id;

    private String savename;

    private String filename;

    private String filetype;

    private Integer filesize;

    private String fileinfo;

    private String uptime;

    public Student_file_tb(Integer id, String savename, String filename, String filetype, Integer filesize, String fileinfo, String uptime) {
        this.id = id;
        this.savename = savename;
        this.filename = filename;
        this.filetype = filetype;
        this.filesize = filesize;
        this.fileinfo = fileinfo;
        this.uptime = uptime;
    }

    public Student_file_tb() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSavename() {
        return savename;
    }

    public void setSavename(String savename) {
        this.savename = savename == null ? null : savename.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getFileinfo() {
        return fileinfo;
    }

    public void setFileinfo(String fileinfo) {
        this.fileinfo = fileinfo == null ? null : fileinfo.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }
}