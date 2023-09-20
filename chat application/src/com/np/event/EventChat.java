package com.np.event;

import com.np.model.Model_Receive_Message;
import com.np.model.Model_Send_Message;

public interface EventChat {

    public void sendMessage(Model_Send_Message data);

    public void receiveMessage(Model_Receive_Message data);
}
