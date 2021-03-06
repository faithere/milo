/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.client.model.nodes.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.PropertyNode;
import org.eclipse.milo.opcua.sdk.client.model.types.objects.AuditConditionAcknowledgeEventType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

public class AuditConditionAcknowledgeEventNode extends AuditConditionEventNode implements AuditConditionAcknowledgeEventType {
    public AuditConditionAcknowledgeEventNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<PropertyNode> getEventIdNode() {
        return getPropertyNode(AuditConditionAcknowledgeEventType.EVENT_ID);
    }

    public CompletableFuture<ByteString> getEventId() {
        return getProperty(AuditConditionAcknowledgeEventType.EVENT_ID);
    }

    public CompletableFuture<StatusCode> setEventId(ByteString value) {
        return setProperty(AuditConditionAcknowledgeEventType.EVENT_ID, value);
    }

    public CompletableFuture<PropertyNode> getCommentNode() {
        return getPropertyNode(AuditConditionAcknowledgeEventType.COMMENT);
    }

    public CompletableFuture<LocalizedText> getComment() {
        return getProperty(AuditConditionAcknowledgeEventType.COMMENT);
    }

    public CompletableFuture<StatusCode> setComment(LocalizedText value) {
        return setProperty(AuditConditionAcknowledgeEventType.COMMENT, value);
    }
}
