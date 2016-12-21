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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of the domain
 * you want to update and name of the suggester you want to delete.
 * </p>
 */
public class DeleteSuggesterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * Specifies the name of the suggester you want to delete.
     * </p>
     */
    private String suggesterName;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSuggesterRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the suggester you want to delete.
     * </p>
     * 
     * @param suggesterName
     *        Specifies the name of the suggester you want to delete.
     */

    public void setSuggesterName(String suggesterName) {
        this.suggesterName = suggesterName;
    }

    /**
     * <p>
     * Specifies the name of the suggester you want to delete.
     * </p>
     * 
     * @return Specifies the name of the suggester you want to delete.
     */

    public String getSuggesterName() {
        return this.suggesterName;
    }

    /**
     * <p>
     * Specifies the name of the suggester you want to delete.
     * </p>
     * 
     * @param suggesterName
     *        Specifies the name of the suggester you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSuggesterRequest withSuggesterName(String suggesterName) {
        setSuggesterName(suggesterName);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getSuggesterName() != null)
            sb.append("SuggesterName: ").append(getSuggesterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSuggesterRequest == false)
            return false;
        DeleteSuggesterRequest other = (DeleteSuggesterRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSuggesterName() == null ^ this.getSuggesterName() == null)
            return false;
        if (other.getSuggesterName() != null && other.getSuggesterName().equals(this.getSuggesterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSuggesterName() == null) ? 0 : getSuggesterName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSuggesterRequest clone() {
        return (DeleteSuggesterRequest) super.clone();
    }

}
