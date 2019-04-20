package ma.kriauto.api.response;


public class Location {
	
	private String mark;
	private String model;
	private String immatriculation;
	private String htmlColor;
	private String address;
	private String hour;
	private String date;
	private Integer markertype;
	private Integer markerdisplay;
	private Integer isrolling;
	private Integer totaldistance;
	private Long carid;
	private Integer rank;
	private Double lat;
	private Double lon;
	private Integer isinzone;
	private String  labelzone;
	private Double speed;
	private Double maxspeed;
	private Double totalcourse;
	private Double dailycourse;
	private Double prinfuelcons;
	private Double seconfuelcons;
	private Double maxtemperature;
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getHtmlColor() {
		return htmlColor;
	}
	public void setHtmlColor(String htmlColor) {
		this.htmlColor = htmlColor;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getMarkertype() {
		return markertype;
	}
	public void setMarkertype(Integer markertype) {
		this.markertype = markertype;
	}
	public Integer getMarkerdisplay() {
		return markerdisplay;
	}
	public void setMarkerdisplay(Integer markerdisplay) {
		this.markerdisplay = markerdisplay;
	}
	public Integer getIsrolling() {
		return isrolling;
	}
	public void setIsrolling(Integer isrolling) {
		this.isrolling = isrolling;
	}
	public Integer getTotaldistance() {
		return totaldistance;
	}
	public void setTotaldistance(Integer totaldistance) {
		this.totaldistance = totaldistance;
	}
	public Long getCarid() {
		return carid;
	}
	public void setCarid(Long carid) {
		this.carid = carid;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Integer getIsinzone() {
		return isinzone;
	}
	public void setIsinzone(Integer isinzone) {
		this.isinzone = isinzone;
	}
	public String getLabelzone() {
		return labelzone;
	}
	public void setLabelzone(String labelzone) {
		this.labelzone = labelzone;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Double getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(Double maxspeed) {
		this.maxspeed = maxspeed;
	}
	public Double getTotalcourse() {
		return totalcourse;
	}
	public void setTotalcourse(Double totalcourse) {
		this.totalcourse = totalcourse;
	}
	public Double getDailycourse() {
		return dailycourse;
	}
	public void setDailycourse(Double dailycourse) {
		this.dailycourse = dailycourse;
	}
	public Double getPrinfuelcons() {
		return prinfuelcons;
	}
	public void setPrinfuelcons(Double prinfuelcons) {
		this.prinfuelcons = prinfuelcons;
	}
	public Double getSeconfuelcons() {
		return seconfuelcons;
	}
	public void setSeconfuelcons(Double secoefuelcons) {
		this.seconfuelcons = secoefuelcons;
	}
	public Double getMaxtemperature() {
		return maxtemperature;
	}
	public void setMaxtemperature(Double maxtemperature) {
		this.maxtemperature = maxtemperature;
	}
	
	@Override
	public String toString() {
		return "Location [mark=" + mark + ", model=" + model + ", immatriculation=" + immatriculation + ", htmlColor="
				+ htmlColor + ", address=" + address + ", hour=" + hour + ", date=" + date + ", markertype="
				+ markertype + ", markerdisplay=" + markerdisplay + ", isrolling=" + isrolling + ", totaldistance="
				+ totaldistance + ", carid=" + carid + ", rank=" + rank + ", lat=" + lat + ", lon=" + lon
				+ ", isinzone=" + isinzone + ", labelzone=" + labelzone + ", speed=" + speed + ", maxspeed=" + maxspeed
				+ ", totalcourse=" + totalcourse + ", dailycourse=" + dailycourse + ", prinfuelcons=" + prinfuelcons
				+ ", seconfuelcons=" + seconfuelcons + ", maxtemperature=" + maxtemperature + "]";
	}
}