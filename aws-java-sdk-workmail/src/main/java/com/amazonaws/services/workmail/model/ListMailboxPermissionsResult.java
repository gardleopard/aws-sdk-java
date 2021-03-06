/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMailboxPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One page of the entity's mailbox permissions.
     * </p>
     */
    private java.util.List<Permission> permissions;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One page of the entity's mailbox permissions.
     * </p>
     * 
     * @return One page of the entity's mailbox permissions.
     */

    public java.util.List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * One page of the entity's mailbox permissions.
     * </p>
     * 
     * @param permissions
     *        One page of the entity's mailbox permissions.
     */

    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<Permission>(permissions);
    }

    /**
     * <p>
     * One page of the entity's mailbox permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        One page of the entity's mailbox permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailboxPermissionsResult withPermissions(Permission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        }
        for (Permission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One page of the entity's mailbox permissions.
     * </p>
     * 
     * @param permissions
     *        One page of the entity's mailbox permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailboxPermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is "null" when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is "null" when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMailboxPermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMailboxPermissionsResult == false)
            return false;
        ListMailboxPermissionsResult other = (ListMailboxPermissionsResult) obj;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMailboxPermissionsResult clone() {
        try {
            return (ListMailboxPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
