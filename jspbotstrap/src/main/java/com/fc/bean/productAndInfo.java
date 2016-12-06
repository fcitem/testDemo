package com.fc.bean;

import java.util.Date;

public class productAndInfo {
		private String proid;

	    private String proname;

	    private String protype;

	    private Double provalue;

	    private String proimg;

	    private String prodesc;

	    private String procontroller;

	    private Double proml;
	    
	    public String getProid() {
			return proid;
		}

		public void setProid(String proid) {
			this.proid = proid;
		}

		public String getProname() {
			return proname;
		}

		public void setProname(String proname) {
			this.proname = proname;
		}

		public String getProtype() {
			return protype;
		}

		public void setProtype(String protype) {
			this.protype = protype;
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
			this.proimg = proimg;
		}

		public String getProdesc() {
			return prodesc;
		}

		public void setProdesc(String prodesc) {
			this.prodesc = prodesc;
		}

		public String getProcontroller() {
			return procontroller;
		}

		public void setProcontroller(String procontroller) {
			this.procontroller = procontroller;
		}

		public Double getProml() {
			return proml;
		}

		public void setProml(Double proml) {
			this.proml = proml;
		}

		public Date getCreatetime() {
			return createtime;
		}

		public void setCreatetime(Date createtime) {
			this.createtime = createtime;
		}

		public Integer getPronumber() {
			return pronumber;
		}

		public Double getNowvalue() {
			return nowvalue;
		}

		public void setNowvalue(Double nowvalue) {
			this.nowvalue = nowvalue;
		}

		public void setPronumber(Integer pronumber) {
			this.pronumber = pronumber;
		}

		private Date createtime;

	    private Double nowvalue;

	    private Integer pronumber;
	    private String prosource;

		public String getProsource() {
			return prosource;
		}

		public void setProsource(String prosource) {
			this.prosource = prosource;
		}
}
