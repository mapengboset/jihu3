package com.yqbing.servicebing.webapp.response;

import java.io.Serializable;

public class EntryVo implements Serializable{

	
		 /**
	 * 
	 */
	private static final long serialVersionUID = 6214413171318765012L;
		private String	cost;
		 private String		idea;
		 private Integer		rank;
		 private Integer		id;
		public String getCost() {
			return cost;
		}
		public void setCost(String cost) {
			this.cost = cost;
		}
		public String getIdea() {
			return idea;
		}
		public void setIdea(String idea) {
			this.idea = idea;
		}
		public Integer getRank() {
			return rank;
		}
		public void setRank(Integer rank) {
			this.rank = rank;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		 

}
