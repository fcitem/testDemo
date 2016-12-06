package com.fc.bean;

public class Product {
    private String proid;

    private String proname;

    private String protype;

    private Double provalue;

    private String proimg;

    private String prodesc;

    private String procontroller;

    private Double proml;

    private Double pronowvalue;

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype == null ? null : protype.trim();
    }

    public Double getProvalue() {
        return provalue;
    }

    public void setProvalue(Double provalue) {
        this.provalue = provalue;
    }

    public String getProimg() {
        return proimg;
    }

    public void setProimg(String proimg) {
        this.proimg = proimg == null ? null : proimg.trim();
    }

    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc == null ? null : prodesc.trim();
    }

    public String getProcontroller() {
        return procontroller;
    }

    public void setProcontroller(String procontroller) {
        this.procontroller = procontroller == null ? null : procontroller.trim();
    }

    public Double getProml() {
        return proml;
    }

    public void setProml(Double proml) {
        this.proml = proml;
    }

    public Double getPronowvalue() {
        return pronowvalue;
    }

    public void setPronowvalue(Double pronowvalue) {
        this.pronowvalue = pronowvalue;
    }
}