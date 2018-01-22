package campus_minds;

import java.io.Serializable;

public class CampusMinds implements Serializable {
	
	private int campus_mind_mid;
	private String name;
	private int age;
	private String track;
	private int orchardid;
	public int getCampus_mind_mid() {
		return campus_mind_mid;
	}
	public void setCampus_mind_mid(int campus_mind_mid) {
		this.campus_mind_mid = campus_mind_mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getOrchardid() {
		return orchardid;
	}
	public void setOrchardid(int orchardid) {
		this.orchardid = orchardid;
	}
	
	
	
}
