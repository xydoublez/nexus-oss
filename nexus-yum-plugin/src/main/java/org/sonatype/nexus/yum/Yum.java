/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2012 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.yum;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import org.sonatype.nexus.proxy.repository.Repository;
import org.sonatype.scheduling.ScheduledTask;

/**
 * @since 3.0
 */
public interface Yum
{

    static final long DEFAULT_DELETE_PROCESSING_DELAY = 10;

    Yum setProcessDeletes( boolean processDeletes );

    Yum setDeleteProcessingDelay( final long numberOfSeconds );

    boolean shouldProcessDeletes();

    long deleteProcessingDelay();

    File getBaseDir();

    Set<String> getVersions();

    void addVersion( String version );

    Yum addAlias( String alias, String version );

    Yum removeAlias( String alias );

    Yum setAliases( Map<String, String> aliases );

    String getVersion( String alias );

    Repository getRepository();

    YumRepository getYumRepository( String version, URL repoBaseUrl )
        throws Exception;

    void markDirty( String itemVersion );

    ScheduledTask<YumRepository> addToYumRepository( String path );

    void recreateRepository();

    void deleteRpm( String path );

    void deleteDirectory( String path );

}
