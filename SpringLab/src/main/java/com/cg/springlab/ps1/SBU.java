package com.cg.springlab.ps1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("businessUnit")
public class SBU {
	
	@Value("12345")
	private Integer sbuId;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;

	public Integer getSbuId() {
		return sbuId;
	}

	public void setSbuId(Integer sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
}
