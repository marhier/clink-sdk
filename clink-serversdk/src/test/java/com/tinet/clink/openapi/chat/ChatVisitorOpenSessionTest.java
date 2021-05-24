package com.tinet.clink.openapi.chat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tinet.clink.openapi.Client;
import com.tinet.clink.openapi.ClientConfiguration;
import com.tinet.clink.openapi.request.chat.ChatVisitorOpenSessionRequest;
import com.tinet.clink.openapi.response.chat.ChatVisitorOpenSessionResponse;
import org.junit.Before;
import org.junit.Test;

/**
 * 会话开始
 */
public class ChatVisitorOpenSessionTest {
    protected Client client = null;
    ClientConfiguration configuration = null;

    @Before
    public void init() {
        System.out.println("----------------------------->");
        configuration = new ClientConfiguration("706ff5f9bbb10286dcf7545262a7d702", "IO9Fpa392A3y54375Tvu");
        configuration.setScheme("http");
        configuration.setHost("api-bj-test3.clink.cn");

        client = new Client(configuration);
    }


    @Test
    public void testOpenSession() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        ChatVisitorOpenSessionRequest request = new ChatVisitorOpenSessionRequest();
        request.setAppId("086dd7a1-4daa-4295-a568-bb0854fa8d64");
        request.setAppName("sdk测试渠道01");
        ChatVisitorOpenSessionResponse responseModel = client.getResponseModel(request);
        //{"requestId":"51463cd4-bbb9-4337-947c-4658574214a6","sessionId":"ac7b807e-21e0-47c5-932c-4e91e94fdb9b.1621756479","startTime":1621756479000}
        System.out.println(mapper.writeValueAsString(responseModel));
    }
}