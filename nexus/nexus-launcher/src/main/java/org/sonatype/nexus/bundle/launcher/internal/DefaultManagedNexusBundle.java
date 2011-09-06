/**
 * Copyright (c) 2008-2011 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://www.sonatype.com/products/nexus/attributions.
 *
 * This program is free software: you can redistribute it and/or modify it only under the terms of the GNU Affero General
 * Public License Version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License Version 3
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License Version 3 along with this program.  If not, see
 * http://www.gnu.org/licenses.
 *
 * Sonatype Nexus (TM) Open Source Version is available from Sonatype, Inc. Sonatype and Sonatype Nexus are trademarks of
 * Sonatype, Inc. Apache Maven is a trademark of the Apache Foundation. M2Eclipse is a trademark of the Eclipse Foundation.
 * All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.bundle.launcher.internal;

import com.google.common.base.Preconditions;
import java.io.File;
import java.util.EnumMap;
import javax.inject.Inject;
import org.sonatype.nexus.bundle.launcher.ManagedNexusBundle;
import org.sonatype.nexus.bundle.launcher.NexusPort;
import org.sonatype.nexus.bundle.launcher.util.ResolvedArtifact;

/**
 * Default implementation of {@link ManagedNexusBundle}
 * @author plynch
 */
public class DefaultManagedNexusBundle implements ManagedNexusBundle {
    private final String id;
    private final File nexusWorkDirectory;
    private final File nexusRuntimeDirectory;
    private final String host;
    private final String contextPath;
    private final ResolvedArtifact artifact;
    private EnumMap<NexusPort, Integer> portMap;

    @Inject
    DefaultManagedNexusBundle(final String id, final ResolvedArtifact artifact, final String host, EnumMap<NexusPort, Integer> portMap, final String contextPath, File nexusWorkDirectory, File nexusRuntimeDirectory) {
        Preconditions.checkNotNull(id);
        Preconditions.checkNotNull(artifact);
        Preconditions.checkNotNull(host);
        Preconditions.checkNotNull(portMap);
        Preconditions.checkNotNull(contextPath);
        Preconditions.checkNotNull(nexusWorkDirectory);
        Preconditions.checkNotNull(nexusRuntimeDirectory);
        this.id = id;
        this.artifact = artifact;
        this.host = host;
        if(!portMap.containsKey(NexusPort.HTTP)){
            throw new IllegalArgumentException("missing http port");
        }
        if(!"".equals(contextPath) && !contextPath.startsWith("/")){
            throw new IllegalArgumentException("Context path should be empty string or begin with a forward slash");
        }
        this.contextPath = contextPath;
        this.portMap = new EnumMap<NexusPort,Integer>(portMap);
        this.nexusWorkDirectory = nexusWorkDirectory;
        this.nexusRuntimeDirectory = nexusRuntimeDirectory;
    }

    @Override
    public int getHttpPort() {
        return portMap.get(NexusPort.HTTP);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public ResolvedArtifact getArtifact() {
        return artifact;
    }

    @Override
    public int getPort(final NexusPort portType) {
        Integer port = portMap.get(portType);
        if(port == null){
            return -1;
        }
        return port;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public File getNexusWorkDirectory() {
        return nexusWorkDirectory;
    }

    @Override
    public File getNexusRuntimeDirectory() {
        return nexusRuntimeDirectory;
    }

    @Override
    public String getContextPath() {
        return contextPath;
    }


}
