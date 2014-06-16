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
/*
 =================== DO NOT EDIT THIS FILE ====================
 Generated by Modello 1.0.2 on 2009-11-11 15:14:14,
 any modifications will be overwritten.
 ==============================================================
 */

package com.sonatype.security.ldap.api.dto;

import javax.xml.bind.annotation.XmlType;

/**
 * Object that holds the configuration of each configured LDAP
 * server.
 *
 * @version $Revision$ $Date$
 */
@XmlType(name = "ldapServerConfiguration")
public class LdapServerConfigurationDTO
    implements java.io.Serializable
{

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * LDAP Connection Id.
   */
  private String id;

  /**
   * LDAP Connection resource URL (REST URL)
   */
  private String url;

  /**
   * LDAP Connection Name.
   */
  private String name;

  /**
   * LDAP Connection Information.
   */
  private LdapConnectionInfoDTO connectionInfo;

  /**
   * The user and group mapping configuration mapping.
   */
  private LdapUserAndGroupAuthConfigurationDTO userAndGroupConfig;


  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Get lDAP Connection Information.
   *
   * @return CConnectionInfo
   */
  public LdapConnectionInfoDTO getConnectionInfo() {
    return this.connectionInfo;
  } //-- CConnectionInfo getConnectionInfo()

  /**
   * Get lDAP Connection Id.
   *
   * @return String
   */
  public String getId() {
    return this.id;
  } //-- String getId()

  /**
   * Get url.
   *
   * @return String
   */
  public String getUrl() {
    return this.url;
  } //-- String getUrl()

  /**
   * Get lDAP Connection Name.
   *
   * @return String
   */
  public String getName() {
    return this.name;
  } //-- String getName()

  /**
   * Get the user and group mapping configuration mapping.
   *
   * @return CUserAndGroupAuthConfiguration
   */
  public LdapUserAndGroupAuthConfigurationDTO getUserAndGroupConfig() {
    return this.userAndGroupConfig;
  } //-- CUserAndGroupAuthConfiguration getUserAndGroupConfig()

  /**
   * Set lDAP Connection Information.
   */
  public void setConnectionInfo(LdapConnectionInfoDTO connectionInfo) {
    this.connectionInfo = connectionInfo;
  } //-- void setConnectionInfo( CConnectionInfo )

  /**
   * Set lDAP Connection Id.
   */
  public void setId(String id) {
    this.id = id;
  } //-- void setId( String )

  /**
   * Set url.
   */
  public void setUrl(String url) {
    this.url = url;
  } //-- void setUrl( String )

  /**
   * Set lDAP Connection Name.
   */
  public void setName(String name) {
    this.name = name;
  } //-- void setName( String )

  /**
   * Set the user and group mapping configuration mapping.
   */
  public void setUserAndGroupConfig(LdapUserAndGroupAuthConfigurationDTO userAndGroupConfig) {
    this.userAndGroupConfig = userAndGroupConfig;
  } //-- void setUserAndGroupConfig( CUserAndGroupAuthConfiguration )


}
