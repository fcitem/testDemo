package com.fc.bean;

import java.util.Date;

public class ProInfo {
    private String proid;

    private Date createtime;

    private Double nowvalue;

    private Integer pronumber;

    private String prosource;

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getNowvalue() {
        return nowvalue;
    }

    public void setNowvalue(Double nowvalue) {
        this.nowvalue = nowvalue;
    }

    public Integer getPronumber() {
        return pronumber;
    }

    public void setPronumber(Integer pronumber) {
        this.pronumber = pronumber;
    }

    public String getProsource() {
        return prosource;
    }

    public void setProsource(String prosource) {
        this.prosource = prosource == null ? null : prosource.trim();
    }
}