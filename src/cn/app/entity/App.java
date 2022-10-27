package cn.app.entity;

import java.util.Date;

public class App {
    private int id;
    private String softwareName;
    private String APKName;
    private String supportROM;
    private String interfaceLanguage;
    private int softwareSize;
    private Date updateDate;
    private int devId;
    private String appInfo;
    private int status;
    private Date onSaleDate;
    private Date offSaleDate;
    private int flatformId;
    private int categoryLevel3;
    private int downloads;
    private int createdBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;
    private int categoryLevel1;
    private int categoryLevel2;
    private String logoPicPath;
    private String logoLocPath;
    private int versionId;

    public App(int id, String softwareName, String APKName, String supportROM, String interfaceLanguage, int softwareSize, Date updateDate, int devId, String appInfo, int status, Date onSaleDate, Date offSaleDate, int flatformId, int categoryLevel3, int downloads, int createdBy, Date creationDate, int modifyBy, Date modifyDate, int categoryLevel1, int categoryLevel2, String logoPicPath, String logoLocPath, int versionId) {
        this.id = id;
        this.softwareName = softwareName;
        this.APKName = APKName;
        this.supportROM = supportROM;
        this.interfaceLanguage = interfaceLanguage;
        this.softwareSize = softwareSize;
        this.updateDate = updateDate;
        this.devId = devId;
        this.appInfo = appInfo;
        this.status = status;
        this.onSaleDate = onSaleDate;
        this.offSaleDate = offSaleDate;
        this.flatformId = flatformId;
        this.categoryLevel3 = categoryLevel3;
        this.downloads = downloads;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.categoryLevel1 = categoryLevel1;
        this.categoryLevel2 = categoryLevel2;
        this.logoPicPath = logoPicPath;
        this.logoLocPath = logoLocPath;
        this.versionId = versionId;
    }

    public App() {}

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                ", softwareName='" + softwareName + '\'' +
                ", APKName='" + APKName + '\'' +
                ", supportROM='" + supportROM + '\'' +
                ", interfaceLanguage='" + interfaceLanguage + '\'' +
                ", softwareSize=" + softwareSize +
                ", updateDate=" + updateDate +
                ", devId=" + devId +
                ", appInfo='" + appInfo + '\'' +
                ", status=" + status +
                ", onSaleDate=" + onSaleDate +
                ", offSaleDate=" + offSaleDate +
                ", flatformId=" + flatformId +
                ", categoryLevel3=" + categoryLevel3 +
                ", downloads=" + downloads +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", categoryLevel1=" + categoryLevel1 +
                ", categoryLevel2=" + categoryLevel2 +
                ", logoPicPath='" + logoPicPath + '\'' +
                ", logoLocPath='" + logoLocPath + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
