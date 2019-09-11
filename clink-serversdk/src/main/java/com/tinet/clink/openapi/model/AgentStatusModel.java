package com.tinet.clink.openapi.model;

/**
 * 座席状态监控返回对象
 *
 * @author wangll
 * @date 2019/09/11
 */
public class AgentStatusModel {
    /**
     * 座席号
     */
    private String cno;

    /**
     * 座席名
     */
    private String clientName;

    /**
     * 绑定类型
     */
    private Integer bindType;

    /**
     * 绑定电话
     */
    private String bindTel;

    /**
     * 主叫号码，即来电客户号码
     */
    private String customerNumber;

    /**
     * 置忙类型
     */
    private Integer pauseType;

    /**
     * 设备状态 (空闲、置忙(具体置忙原因)、通话、振铃、整理、外呼中(离线不展示))
     */
    private String agentStatus;

    /**
     * 来电接听数
     */
    private Integer incomingCallCount;

    /**
     * 队列来电接听数
     */
    private Integer queueIncomingCallCount;

    /**
     * 状态时长
     */
    private Long stateDuration;

    /**
     * 登录时长
     */
    private Long loginDuration;


    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public String getBindTel() {
        return bindTel;
    }

    public void setBindTel(String bindTel) {
        this.bindTel = bindTel;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Integer getPauseType() {
        return pauseType;
    }

    public void setPauseType(Integer pauseType) {
        this.pauseType = pauseType;
    }

    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public Integer getIncomingCallCount() {
        return incomingCallCount;
    }

    public void setIncomingCallCount(Integer incomingCallCount) {
        this.incomingCallCount = incomingCallCount;
    }

    public Integer getQueueIncomingCallCount() {
        return queueIncomingCallCount;
    }

    public void setQueueIncomingCallCount(Integer queueIncomingCallCount) {
        this.queueIncomingCallCount = queueIncomingCallCount;
    }

    public Long getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(Long stateDuration) {
        this.stateDuration = stateDuration;
    }

    public Long getLoginDuration() {
        return loginDuration;
    }

    public void setLoginDuration(Long loginDuration) {
        this.loginDuration = loginDuration;
    }
}
