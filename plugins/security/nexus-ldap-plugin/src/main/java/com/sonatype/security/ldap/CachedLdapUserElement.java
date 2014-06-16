/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2014 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package com.sonatype.security.ldap;

import org.sonatype.security.ldap.dao.LdapUser;

public class CachedLdapUserElement
{
  private LdapUser ldapUser;

  private String ldapServerId;

  private String password;

  public CachedLdapUserElement(LdapUser ldapUser, String ldapServerId, String password) {
    super();
    this.ldapUser = ldapUser;
    this.ldapServerId = ldapServerId;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LdapUser getLdapUser() {
    return ldapUser;
  }

  public String getLdapServerId() {
    return ldapServerId;
  }

}
