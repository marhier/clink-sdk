package com.tinet.clink.openapi.request.chat;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.chat.ChatVisitorCloseSessionResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 访客结束会话
 *
 * @author wangpw
 * @date 2021年5月14日
 */
public class ChatVisitorCloseSessionRequest extends AbstractRequestModel<ChatVisitorCloseSessionResponse> {

    public ChatVisitorCloseSessionRequest() {
        super(PathEnum.ChatVisitorCloseSession.value(), HttpMethodType.POST);
    }

    /**
     * 会话id
     */
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        putQueryParameter("sessionId", sessionId);
        this.sessionId = sessionId;
    }

    @Override
    public Class<ChatVisitorCloseSessionResponse> getResponseClass() {
        return ChatVisitorCloseSessionResponse.class;
    }

    @Override
    public String toString() {
        return "ChatVisitorCloseSessionRequest{" +
                "sessionId='" + sessionId + '\'' +
                "} " + super.toString();
    }
}
