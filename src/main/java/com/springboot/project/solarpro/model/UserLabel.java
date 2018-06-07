package com.springboot.project.solarpro.model;

import javax.persistence.*;

@Table(name = "user_label")
public class UserLabel {
    /**
     * 主键
     */
    @Id
    private String id;

    @Column(name = "labelId")
    private String labelid;

    @Column(name = "userId")
    private String userid;

    @Column(name = "createTime")
    private String createtime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return labelId
     */
    public String getLabelid() {
        return labelid;
    }

    /**
     * @param labelid
     */
    public void setLabelid(String labelid) {
        this.labelid = labelid == null ? null : labelid.trim();
    }

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * @return createTime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}