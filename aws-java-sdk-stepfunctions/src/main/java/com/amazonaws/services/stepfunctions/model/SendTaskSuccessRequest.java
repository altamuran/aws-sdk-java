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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SendTaskSuccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     */
    private String taskToken;
    /**
     * <p>
     * The JSON output of the task.
     * </p>
     */
    private String output;

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @param taskToken
     *        The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *        to a worker (see GetActivityTask::taskToken).
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @return The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *         to a worker (see GetActivityTask::taskToken).
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @param taskToken
     *        The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *        to a worker (see GetActivityTask::taskToken).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTaskSuccessRequest withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * The JSON output of the task.
     * </p>
     * 
     * @param output
     *        The JSON output of the task.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON output of the task.
     * </p>
     * 
     * @return The JSON output of the task.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON output of the task.
     * </p>
     * 
     * @param output
     *        The JSON output of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTaskSuccessRequest withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendTaskSuccessRequest == false)
            return false;
        SendTaskSuccessRequest other = (SendTaskSuccessRequest) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public SendTaskSuccessRequest clone() {
        return (SendTaskSuccessRequest) super.clone();
    }

}
