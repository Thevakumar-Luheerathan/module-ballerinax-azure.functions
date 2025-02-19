/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinax.azurefunctions.generator;

import io.ballerina.tools.diagnostics.Diagnostic;

/**
 * Represents Azure functions compiler extension errors.
 */
public class AzureFunctionsException extends Exception {

    private static final long serialVersionUID = -6540373040546296073L;
    private transient Diagnostic diagnostic;

    public AzureFunctionsException(Diagnostic diagnostic) {
        super(diagnostic.message());
        this.diagnostic = diagnostic;
    }

    public AzureFunctionsException(Diagnostic diagnostic, Throwable cause) {
        super(diagnostic.message(), cause);
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }
}
