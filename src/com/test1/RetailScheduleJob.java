package com.test1;

public class RetailScheduleJob {
	private Integer retailJobId;
	private String retailJobName;
	private String retailJobScript;
	private String retailJobStartTime;
	private String retailJobEndTime;
	private String retailJobOwner;
	private boolean autoRun;
	private String manualRunIndicator;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RetailScheduleJob() {

	}

	public RetailScheduleJob(Integer retailJobId, String retailJobName, String retailJobScript,
			String retailJobStartTime, String retailJobEndTime, String retailJobOwner, boolean autoRun,
			String manualRunIndicator, String creationDate, String modifiedDate, String entityState) {
		super();
		this.retailJobId = retailJobId;
		this.retailJobName = retailJobName;
		this.retailJobScript = retailJobScript;
		this.retailJobStartTime = retailJobStartTime;
		this.retailJobEndTime = retailJobEndTime;
		this.retailJobOwner = retailJobOwner;
		this.autoRun = autoRun;
		this.manualRunIndicator = manualRunIndicator;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRetailJobId() {
		return retailJobId;
	}

	public void setRetailJobId(Integer retailJobId) {
		this.retailJobId = retailJobId;
	}

	public String getRetailJobName() {
		return retailJobName;
	}

	public void setRetailJobName(String retailJobName) {
		this.retailJobName = retailJobName;
	}

	public String getRetailJobScript() {
		return retailJobScript;
	}

	public void setRetailJobScript(String retailJobScript) {
		this.retailJobScript = retailJobScript;
	}

	public String getRetailJobStartTime() {
		return retailJobStartTime;
	}

	public void setRetailJobStartTime(String retailJobStartTime) {
		this.retailJobStartTime = retailJobStartTime;
	}

	public String getRetailJobEndTime() {
		return retailJobEndTime;
	}

	public void setRetailJobEndTime(String retailJobEndTime) {
		this.retailJobEndTime = retailJobEndTime;
	}

	public String getRetailJobOwner() {
		return retailJobOwner;
	}

	public void setRetailJobOwner(String retailJobOwner) {
		this.retailJobOwner = retailJobOwner;
	}

	public boolean isAutoRun() {
		return autoRun;
	}

	public void setAutoRun(boolean autoRun) {
		this.autoRun = autoRun;
	}

	public String getManualRunIndicator() {
		return manualRunIndicator;
	}

	public void setManualRunIndicator(String manualRunIndicator) {
		this.manualRunIndicator = manualRunIndicator;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
