package cn.e3mall.utils;

import java.io.Serializable;
import java.util.List;

public class PageBeanResult implements Serializable{
	private Long total;
	private List<?> rows;

	public PageBeanResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
