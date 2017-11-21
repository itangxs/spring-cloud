package com.tdw.fmis.account.entity;

import java.util.Date;
import javax.persistence.*;

public class Log4net {
    /**
     * 日志编号
     */
    @Id
    @Column(name = "log_id")
    private Integer logId;

    /**
     * 日志等级
     */
    @Column(name = "log_level")
    private String logLevel;

    /**
     * 日志收集人
     */
    private String logger;

    /**
     * 日志主机
     */
    @Column(name = "log_host")
    private String logHost;

    /**
     * 日志日期
     */
    @Column(name = "log_date")
    private Date logDate;

    /**
     * 日志线程
     */
    @Column(name = "log_thread")
    private String logThread;

    /**
     * 日志状态(空为未解决, 0为解决中, 1为已解决)
     */
    @Column(name = "log_status")
    private Integer logStatus;

    /**
     * 日志消息
     */
    @Column(name = "log_message")
    private String logMessage;

    /**
     * 日志异常
     */
    @Column(name = "log_exception")
    private String logException;

    /**
     * 获取日志编号
     *
     * @return log_id - 日志编号
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 设置日志编号
     *
     * @param logId 日志编号
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 获取日志等级
     *
     * @return log_level - 日志等级
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * 设置日志等级
     *
     * @param logLevel 日志等级
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * 获取日志收集人
     *
     * @return logger - 日志收集人
     */
    public String getLogger() {
        return logger;
    }

    /**
     * 设置日志收集人
     *
     * @param logger 日志收集人
     */
    public void setLogger(String logger) {
        this.logger = logger;
    }

    /**
     * 获取日志主机
     *
     * @return log_host - 日志主机
     */
    public String getLogHost() {
        return logHost;
    }

    /**
     * 设置日志主机
     *
     * @param logHost 日志主机
     */
    public void setLogHost(String logHost) {
        this.logHost = logHost;
    }

    /**
     * 获取日志日期
     *
     * @return log_date - 日志日期
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * 设置日志日期
     *
     * @param logDate 日志日期
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * 获取日志线程
     *
     * @return log_thread - 日志线程
     */
    public String getLogThread() {
        return logThread;
    }

    /**
     * 设置日志线程
     *
     * @param logThread 日志线程
     */
    public void setLogThread(String logThread) {
        this.logThread = logThread;
    }

    /**
     * 获取日志状态(空为未解决, 0为解决中, 1为已解决)
     *
     * @return log_status - 日志状态(空为未解决, 0为解决中, 1为已解决)
     */
    public Integer getLogStatus() {
        return logStatus;
    }

    /**
     * 设置日志状态(空为未解决, 0为解决中, 1为已解决)
     *
     * @param logStatus 日志状态(空为未解决, 0为解决中, 1为已解决)
     */
    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    /**
     * 获取日志消息
     *
     * @return log_message - 日志消息
     */
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * 设置日志消息
     *
     * @param logMessage 日志消息
     */
    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    /**
     * 获取日志异常
     *
     * @return log_exception - 日志异常
     */
    public String getLogException() {
        return logException;
    }

    /**
     * 设置日志异常
     *
     * @param logException 日志异常
     */
    public void setLogException(String logException) {
        this.logException = logException;
    }
}