package kr.co.softcampus.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

public class DataBean1 {

	@AssertTrue
	private boolean data1;

	@AssertFalse
	private boolean data2;
	
	public DataBean1() {
		this.data1 = true;
	}
	
	
	public boolean isData1() {
		return data1;
	}

	public void setData1(boolean data1) {
		this.data1 = data1;
	}


	public boolean isData2() {
		return data2;
	}


	public void setData2(boolean data2) {
		this.data2 = data2;
	}
	
	
}
