package org.sonatype.nexus.proxy.repository.threads;

import java.util.concurrent.ExecutorService;

import org.sonatype.nexus.proxy.repository.Repository;

public interface PoolManager
{
    ExecutorService getExecutorService( Repository repository );

    void createPool( Repository repository );

    void removePool( Repository repository );
}
