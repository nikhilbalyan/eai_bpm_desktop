package one_to_many;

import java.io.Serializable;
import java.util.List;

import campus_minds.CampusMinds;

public class OrchardCampusMindsPOJO implements Serializable{
	private int batch_Id;
	private String monthFrom;
	private String endDate;
	private String managerName;
	private List<CampusMinds> campusMinds;

	public int getBatch_Id() {
		return batch_Id;
	}

	public void setBatch_Id(int batch_Id) {
		this.batch_Id = batch_Id;
	}

	public String getMonthFrom() {
		return monthFrom;
	}

	public void setMonthFrom(String monthFrom) {
		this.monthFrom = monthFrom;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<CampusMinds> getCampusMinds() {
		return campusMinds;
	}

	public void setCampusMinds(List<CampusMinds> campusMinds) {
		this.campusMinds = campusMinds;
	}

}
