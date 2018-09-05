/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Represents external merchant data linked to a merchant
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchantRef merchantRef}</li>
 * <li>{@link #getExternalMerchantNumber externalMerchantNumber}</li>
 * <li>{@link #getClientFlag clientFlag}</li>
 * <li>{@link #getUsageFlag usageFlag}</li>
 * <li>{@link #getXrefType xrefType}</li>
 * <li>{@link #getAuditUserId auditUserId}</li>
 * <li>{@link #getAuditDate auditDate}</li>
 * <li>{@link #getCreatedTime createdTime}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ExternalMerchant extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.base.Reference getMerchantRef() {
    return genClient.cacheGet(CacheKey.merchantRef);
  }

  /**
   * External merchant number
   */
  public java.lang.String getExternalMerchantNumber() {
    return genClient.cacheGet(CacheKey.externalMerchantNumber);
  }

  /**
   * Client flag
   */
  public java.lang.String getClientFlag() {
    return genClient.cacheGet(CacheKey.clientFlag);
  }

  /**
   * Usage flag
   */
  public java.lang.String getUsageFlag() {
    return genClient.cacheGet(CacheKey.usageFlag);
  }

  /**
   * Cross reference type
   */
  public java.lang.String getXrefType() {
    return genClient.cacheGet(CacheKey.xrefType);
  }

  /**
   * User performing audit
   */
  public java.lang.String getAuditUserId() {
    return genClient.cacheGet(CacheKey.auditUserId);
  }

  /**
   * Date of audit
   */
  public java.lang.Long getAuditDate() {
    return genClient.cacheGet(CacheKey.auditDate);
  }

  /**
   * Date record created
   */
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  /**
   * Date record updated
   */
  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<ExternalMerchant> {
    merchantRef {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractRecord("merchantRef", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    externalMerchantNumber {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("externalMerchantNumber", java.lang.String.class);
      }
    },
    clientFlag {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("clientFlag", java.lang.String.class);
      }
    },
    usageFlag {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("usageFlag", java.lang.String.class);
      }
    },
    xrefType {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("xrefType", java.lang.String.class);
      }
    },
    auditUserId {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("auditUserId", java.lang.String.class);
      }
    },
    auditDate {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("auditDate", java.lang.Long.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("createdTime", java.lang.Long.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(ExternalMerchant instance) {
        return instance.genClient.extractOther("modifiedTime", java.lang.Long.class);
      }
    },
      ;
  }

  private GenericClient<ExternalMerchant> genClient;

  /**
  * Constructs a new empty instance.
  */
  public ExternalMerchant() {
    genClient = new GenericClient<ExternalMerchant>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected ExternalMerchant(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ExternalMerchant(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public ExternalMerchant(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ExternalMerchant(ExternalMerchant src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {

    genClient.validateLength(getExternalMerchantNumber(), 20);

    genClient.validateLength(getClientFlag(), 1);

    genClient.validateLength(getUsageFlag(), 1);

    genClient.validateLength(getXrefType(), 20);

    genClient.validateLength(getAuditUserId(), 8);
  }

  /** Checks whether the 'merchantRef' field is set and is not null */
  public boolean isNotNullMerchantRef() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantRef);
  }

  /** Checks whether the 'externalMerchantNumber' field is set and is not null */
  public boolean isNotNullExternalMerchantNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.externalMerchantNumber);
  }

  /** Checks whether the 'clientFlag' field is set and is not null */
  public boolean isNotNullClientFlag() {
    return genClient.cacheValueIsNotNull(CacheKey.clientFlag);
  }

  /** Checks whether the 'usageFlag' field is set and is not null */
  public boolean isNotNullUsageFlag() {
    return genClient.cacheValueIsNotNull(CacheKey.usageFlag);
  }

  /** Checks whether the 'xrefType' field is set and is not null */
  public boolean isNotNullXrefType() {
    return genClient.cacheValueIsNotNull(CacheKey.xrefType);
  }

  /** Checks whether the 'auditUserId' field is set and is not null */
  public boolean isNotNullAuditUserId() {
    return genClient.cacheValueIsNotNull(CacheKey.auditUserId);
  }

  /** Checks whether the 'auditDate' field is set and is not null */
  public boolean isNotNullAuditDate() {
    return genClient.cacheValueIsNotNull(CacheKey.auditDate);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }



  /** Checks whether the 'merchantRef' field has been set, however the value could be null */
  public boolean hasMerchantRef() {
    return genClient.cacheHasKey(CacheKey.merchantRef);
  }

  /** Checks whether the 'externalMerchantNumber' field has been set, however the value could be null */
  public boolean hasExternalMerchantNumber() {
    return genClient.cacheHasKey(CacheKey.externalMerchantNumber);
  }

  /** Checks whether the 'clientFlag' field has been set, however the value could be null */
  public boolean hasClientFlag() {
    return genClient.cacheHasKey(CacheKey.clientFlag);
  }

  /** Checks whether the 'usageFlag' field has been set, however the value could be null */
  public boolean hasUsageFlag() {
    return genClient.cacheHasKey(CacheKey.usageFlag);
  }

  /** Checks whether the 'xrefType' field has been set, however the value could be null */
  public boolean hasXrefType() {
    return genClient.cacheHasKey(CacheKey.xrefType);
  }

  /** Checks whether the 'auditUserId' field has been set, however the value could be null */
  public boolean hasAuditUserId() {
    return genClient.cacheHasKey(CacheKey.auditUserId);
  }

  /** Checks whether the 'auditDate' field has been set, however the value could be null */
  public boolean hasAuditDate() {
    return genClient.cacheHasKey(CacheKey.auditDate);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }


  /**
   * Sets the field 'merchantRef'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ExternalMerchant setMerchantRef(com.clover.sdk.v3.base.Reference merchantRef) {
    return genClient.setRecord(merchantRef, CacheKey.merchantRef);
  }

  /**
   * Sets the field 'externalMerchantNumber'.
   */
  public ExternalMerchant setExternalMerchantNumber(java.lang.String externalMerchantNumber) {
    return genClient.setOther(externalMerchantNumber, CacheKey.externalMerchantNumber);
  }

  /**
   * Sets the field 'clientFlag'.
   */
  public ExternalMerchant setClientFlag(java.lang.String clientFlag) {
    return genClient.setOther(clientFlag, CacheKey.clientFlag);
  }

  /**
   * Sets the field 'usageFlag'.
   */
  public ExternalMerchant setUsageFlag(java.lang.String usageFlag) {
    return genClient.setOther(usageFlag, CacheKey.usageFlag);
  }

  /**
   * Sets the field 'xrefType'.
   */
  public ExternalMerchant setXrefType(java.lang.String xrefType) {
    return genClient.setOther(xrefType, CacheKey.xrefType);
  }

  /**
   * Sets the field 'auditUserId'.
   */
  public ExternalMerchant setAuditUserId(java.lang.String auditUserId) {
    return genClient.setOther(auditUserId, CacheKey.auditUserId);
  }

  /**
   * Sets the field 'auditDate'.
   */
  public ExternalMerchant setAuditDate(java.lang.Long auditDate) {
    return genClient.setOther(auditDate, CacheKey.auditDate);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public ExternalMerchant setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public ExternalMerchant setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }


  /** Clears the 'merchantRef' field, the 'has' method for this field will now return false */
  public void clearMerchantRef() {
    genClient.clear(CacheKey.merchantRef);
  }
  /** Clears the 'externalMerchantNumber' field, the 'has' method for this field will now return false */
  public void clearExternalMerchantNumber() {
    genClient.clear(CacheKey.externalMerchantNumber);
  }
  /** Clears the 'clientFlag' field, the 'has' method for this field will now return false */
  public void clearClientFlag() {
    genClient.clear(CacheKey.clientFlag);
  }
  /** Clears the 'usageFlag' field, the 'has' method for this field will now return false */
  public void clearUsageFlag() {
    genClient.clear(CacheKey.usageFlag);
  }
  /** Clears the 'xrefType' field, the 'has' method for this field will now return false */
  public void clearXrefType() {
    genClient.clear(CacheKey.xrefType);
  }
  /** Clears the 'auditUserId' field, the 'has' method for this field will now return false */
  public void clearAuditUserId() {
    genClient.clear(CacheKey.auditUserId);
  }
  /** Clears the 'auditDate' field, the 'has' method for this field will now return false */
  public void clearAuditDate() {
    genClient.clear(CacheKey.auditDate);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public ExternalMerchant copyChanges() {
    ExternalMerchant copy = new ExternalMerchant();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ExternalMerchant src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ExternalMerchant(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ExternalMerchant> CREATOR = new android.os.Parcelable.Creator<ExternalMerchant>() {
    @Override
    public ExternalMerchant createFromParcel(android.os.Parcel in) {
      ExternalMerchant instance = new ExternalMerchant(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ExternalMerchant[] newArray(int size) {
      return new ExternalMerchant[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ExternalMerchant> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ExternalMerchant>() {
    @Override
    public ExternalMerchant create(org.json.JSONObject jsonObject) {
      return new ExternalMerchant(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MERCHANTREF_IS_REQUIRED = false;
    public static final boolean EXTERNALMERCHANTNUMBER_IS_REQUIRED = false;
    public static final long EXTERNALMERCHANTNUMBER_MAX_LEN = 20;
    public static final boolean CLIENTFLAG_IS_REQUIRED = false;
    public static final long CLIENTFLAG_MAX_LEN = 1;
    public static final boolean USAGEFLAG_IS_REQUIRED = false;
    public static final long USAGEFLAG_MAX_LEN = 1;
    public static final boolean XREFTYPE_IS_REQUIRED = false;
    public static final long XREFTYPE_MAX_LEN = 20;
    public static final boolean AUDITUSERID_IS_REQUIRED = false;
    public static final long AUDITUSERID_MAX_LEN = 8;
    public static final boolean AUDITDATE_IS_REQUIRED = false;
    public static final boolean CREATEDTIME_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;

  }

}
