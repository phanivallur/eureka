package com.vogella.git.snowplay;

public class RuckusDatabase {
	private String database;
	private String status;
	private String version;
	private String datadir;
	private String catalog;
	private float sizeInGb;
	private boolean tse;
	private String started;
	private boolean primary;
	private String usage;
	private boolean readOnly;
	private int cxn;
	private int qps;
	private float rssInMb;
	private float buffInMb;
	private String capacity;
	private String binlogFormat;
	
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDatadir() {
		return datadir;
	}
	public void setDatadir(String datadir) {
		this.datadir = datadir;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public float getSizeInGb() {
		return sizeInGb;
	}
	public void setSizeInGb(float sizeInGb) {
		this.sizeInGb = sizeInGb;
	}
	public boolean isTse() {
		return tse;
	}
	public void setTse(boolean tse) {
		this.tse = tse;
	}
	public String getStarted() {
		return started;
	}
	public void setStarted(String started) {
		this.started = started;
	}
	public boolean isPrimary() {
		return primary;
	}
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public int getCxn() {
		return cxn;
	}
	public void setCxn(int cxn) {
		this.cxn = cxn;
	}
	public int getQps() {
		return qps;
	}
	public void setQps(int qps) {
		this.qps = qps;
	}
	public float getRssInMb() {
		return rssInMb;
	}
	public void setRssInMb(float rssInMb) {
		this.rssInMb = rssInMb;
	}
	public float getBuffInMb() {
		return buffInMb;
	}
	public void setBuffInMb(float buffInMb) {
		this.buffInMb = buffInMb;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getBinlogFormat() {
		return binlogFormat;
	}
	public void setBinlogFormat(String binlogFormat) {
		this.binlogFormat = binlogFormat;
	}
}
