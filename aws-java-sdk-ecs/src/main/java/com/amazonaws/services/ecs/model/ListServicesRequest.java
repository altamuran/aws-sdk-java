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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListServices</code> in paginated output. When
     * this parameter is used, <code>ListServices</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 10. If this parameter is not used, then <code>ListServices</code> returns up to 10 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListServices</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListServices</code> in paginated output. When
     * this parameter is used, <code>ListServices</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 10. If this parameter is not used, then <code>ListServices</code> returns up to 10 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of container instance results returned by <code>ListServices</code> in paginated
     *        output. When this parameter is used, <code>ListServices</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListServices</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     *        <code>ListServices</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListServices</code> in paginated output. When
     * this parameter is used, <code>ListServices</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 10. If this parameter is not used, then <code>ListServices</code> returns up to 10 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of container instance results returned by <code>ListServices</code> in paginated
     *         output. When this parameter is used, <code>ListServices</code> only returns <code>maxResults</code>
     *         results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another <code>ListServices</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     *         <code>ListServices</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListServices</code> in paginated output. When
     * this parameter is used, <code>ListServices</code> only returns <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListServices</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 10. If this parameter is not used, then <code>ListServices</code> returns up to 10 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of container instance results returned by <code>ListServices</code> in paginated
     *        output. When this parameter is used, <code>ListServices</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListServices</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used, then
     *        <code>ListServices</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicesRequest == false)
            return false;
        ListServicesRequest other = (ListServicesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesRequest clone() {
        return (ListServicesRequest) super.clone();
    }

}
