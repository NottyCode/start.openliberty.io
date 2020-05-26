/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.website.starter;

import java.util.zip.ZipOutputStream;

public interface StarterBuilder {

    StarterBuilder appName(String appName);

    StarterBuilder groupName(String groupId);

    StarterBuilder javaVersion(String javaVersion);

    StarterBuilder jakartaEEVersion(String jakartaEEVersion);

    StarterBuilder microProfileVersion(String microProfileVersion);

    boolean build(ZipOutputStream zipOut);

}