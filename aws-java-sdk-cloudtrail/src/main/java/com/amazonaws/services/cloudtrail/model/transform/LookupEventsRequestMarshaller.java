/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LookupEventsRequest Marshaller
 */
public class LookupEventsRequestMarshaller implements Marshaller<Request<LookupEventsRequest>, LookupEventsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public LookupEventsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<LookupEventsRequest> marshall(LookupEventsRequest lookupEventsRequest) {

        if (lookupEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<LookupEventsRequest> request = new DefaultRequest<LookupEventsRequest>(lookupEventsRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target", "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.LookupEvents");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<LookupAttribute> lookupAttributesList = (com.amazonaws.internal.SdkInternalList<LookupAttribute>) lookupEventsRequest
                    .getLookupAttributes();
            if (!lookupAttributesList.isEmpty() || !lookupAttributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("LookupAttributes");
                jsonGenerator.writeStartArray();
                for (LookupAttribute lookupAttributesListValue : lookupAttributesList) {
                    if (lookupAttributesListValue != null) {

                        LookupAttributeJsonMarshaller.getInstance().marshall(lookupAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (lookupEventsRequest.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(lookupEventsRequest.getStartTime());
            }
            if (lookupEventsRequest.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(lookupEventsRequest.getEndTime());
            }
            if (lookupEventsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(lookupEventsRequest.getMaxResults());
            }
            if (lookupEventsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(lookupEventsRequest.getNextToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
