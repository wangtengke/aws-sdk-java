/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The results of a configuration update that applied environment variables.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/EnvironmentResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> variables;
    /**
     * <p>
     * Error messages for environment variables that could not be applied.
     * </p>
     */
    private EnvironmentError error;

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @return Environment variable key-value pairs.
     */

    public java.util.Map<String, String> getVariables() {
        if (variables == null) {
            variables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return variables;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @param variables
     *        Environment variable key-value pairs.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(variables);
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @param variables
     *        Environment variable key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResponse withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public EnvironmentResponse addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResponse clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * Error messages for environment variables that could not be applied.
     * </p>
     * 
     * @param error
     *        Error messages for environment variables that could not be applied.
     */

    public void setError(EnvironmentError error) {
        this.error = error;
    }

    /**
     * <p>
     * Error messages for environment variables that could not be applied.
     * </p>
     * 
     * @return Error messages for environment variables that could not be applied.
     */

    public EnvironmentError getError() {
        return this.error;
    }

    /**
     * <p>
     * Error messages for environment variables that could not be applied.
     * </p>
     * 
     * @param error
     *        Error messages for environment variables that could not be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResponse withError(EnvironmentError error) {
        setError(error);
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
        if (getVariables() != null)
            sb.append("Variables: ").append("***Sensitive Data Redacted***").append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentResponse == false)
            return false;
        EnvironmentResponse other = (EnvironmentResponse) obj;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentResponse clone() {
        try {
            return (EnvironmentResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.EnvironmentResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
