package com.tinet.clink.openapi.request.chat;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.chat.ChatQuitQueueResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 访客退出排队
 *
 * @author wangpw
 * @date 2021年5月14日
 */
public class ChatQuitQueueRequest extends AbstractRequestModel<ChatQuitQueueResponse> {

    public ChatQuitQueueRequest() {
        super(PathEnum.ChatQuitQueue.value(), HttpMethodType.POST);
    }

    /**
     * 主会话标识
     */
    private String sessionId;


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
        putQueryParameter("sessionId", sessionId);
    }

    @Override
    public Class<ChatQuitQueueResponse> getResponseClass() {
        return ChatQuitQueueResponse.class;
    }

    @Override
    public String toString() {
        return "ChatQuitQueueRequest{" +
                "sessionId='" + sessionId + '\'' +
                "} " + super.toString();
    }
}
