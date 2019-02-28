package com.springboot.project.solarpro.aspect;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_log")
public class Log{
    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;

    /**
     * 描述
     */
    @Column(length = 255)
    private String description;

    /**
     * 方法名
     */
    @Column(length = 255)
    private String method;

    /**
     * 日志类型
     */
    @Column
    private String logType;

    /**
     * 请求ip
     */
    @Column(length = 64)
    private String requestIp;

    /**
     * 异常代码
     */
    @Column(length = 64)
    private String exceptioncode;

    /**
     * 异常详细
     */
    @Column(length = 255)
    private String exceptionDetail;

    /**
     * 参数
     */
    @Column(length = 64)
    private String params;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }



    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getExceptioncode() {
        return exceptioncode;
    }

    public void setExceptioncode(String exceptioncode) {
        this.exceptioncode = exceptioncode == null ? null : exceptioncode.trim();
    }

    public String getExceptionDetail() {
        return exceptionDetail;
    }

    public void setExceptionDetail(String exceptionDetail) {
        this.exceptionDetail = exceptionDetail == null ? null : exceptionDetail.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

}

