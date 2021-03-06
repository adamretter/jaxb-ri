/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.codemodel;



/**
 * Captures the value of the annotation.
 *
 * @author
 *     Bhakti Mehta (bhakti.mehta@sun.com)
 */
final class JAnnotationStringValue extends JAnnotationValue {

    /**
     * The value of the Annotation member
     */
    private final JExpression value;

    JAnnotationStringValue(JExpression value) {
        this.value = value;
    }

    public void generate(JFormatter f) {
        f.g(value);
    }
}
