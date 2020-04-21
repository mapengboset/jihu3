package com.yqbing.servicebing.repository.redis;

import java.util.List;

public interface RAntCreditRefundData {
	 public List<Object> getlist(String outtraid);
	    
	    void setlist(String outtraid, Object rawJSON);
}
