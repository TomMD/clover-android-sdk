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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getPermission permission}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AndroidPermission extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.String getPermission() {
    return genClient.cacheGet(CacheKey.permission);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AndroidPermission> {
    id {
      @Override
      public Object extractValue(AndroidPermission instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    permission {
      @Override
      public Object extractValue(AndroidPermission instance) {
        return instance.genClient.extractOther("permission", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<AndroidPermission> genClient;

  /**
  * Constructs a new empty instance.
  */
  public AndroidPermission() {
    genClient = new GenericClient<AndroidPermission>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected AndroidPermission(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AndroidPermission(String json) throws IllegalArgumentException {
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
  public AndroidPermission(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AndroidPermission(AndroidPermission src) {
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
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getPermission(), 50);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'permission' field is set and is not null */
  public boolean isNotNullPermission() {
    return genClient.cacheValueIsNotNull(CacheKey.permission);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'permission' field has been set, however the value could be null */
  public boolean hasPermission() {
    return genClient.cacheHasKey(CacheKey.permission);
  }


  /**
   * Sets the field 'id'.
   */
  public AndroidPermission setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'permission'.
   */
  public AndroidPermission setPermission(java.lang.String permission) {
    return genClient.setOther(permission, CacheKey.permission);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'permission' field, the 'has' method for this field will now return false */
  public void clearPermission() {
    genClient.clear(CacheKey.permission);
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
  public AndroidPermission copyChanges() {
    AndroidPermission copy = new AndroidPermission();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AndroidPermission src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AndroidPermission(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AndroidPermission> CREATOR = new android.os.Parcelable.Creator<AndroidPermission>() {
    @Override
    public AndroidPermission createFromParcel(android.os.Parcel in) {
      AndroidPermission instance = new AndroidPermission(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AndroidPermission[] newArray(int size) {
      return new AndroidPermission[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AndroidPermission> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AndroidPermission>() {
    @Override
    public AndroidPermission create(org.json.JSONObject jsonObject) {
      return new AndroidPermission(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean PERMISSION_IS_REQUIRED = false;
    public static final long PERMISSION_MAX_LEN = 50;

  }

}
