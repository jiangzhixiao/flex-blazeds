/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package flex.messaging;

import flex.messaging.messages.Message;

import java.util.EventObject;

/**
 * @exclude
 * This event indicates that the source message has been routed to the outbound message queues
 * for all target clients.
 * This can be used as the trigger for performing optimized IO to flush these queued messages to 
 * remote hosts over the network.
 */
public class MessageRoutedEvent extends EventObject
{
    /**
     * @exclude
     */
    private static final long serialVersionUID = -3063794416424805005L;

    /**
     * Constructs a new <tt>MessageRoutedEvent</tt> using the supplied source <tt>Message</tt>.
     * 
     * @param message The message that has been routed.
     */
    public MessageRoutedEvent(Message message)
    {
        super(message);
    }
    
    /**
     * Returns the message that has been routed.
     */
    public Message getMessage()
    {
        return (Message)getSource();
    }
}
