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

package com.clover.sdk.v3.customers;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getType type}</li>
 * <li>{@link #getNumber number}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class IdentityDocument extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Type of personal identification: National Document, Passport, etc
   */
  public java.lang.String getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * The identification number
   */
  public java.lang.String getNumber() {
    return genClient.cacheGet(CacheKey.number);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<IdentityDocument> {
    type {
      @Override
      public Object extractValue(IdentityDocument instance) {
        return instance.genClient.extractOther("type", java.lang.String.class);
      }
    },
    number {
      @Override
      public Object extractValue(IdentityDocument instance) {
        return instance.genClient.extractOther("number", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<IdentityDocument> genClient;

  /**
  * Constructs a new empty instance.
  */
  public IdentityDocument() {
    genClient = new GenericClient<IdentityDocument>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected IdentityDocument(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public IdentityDocument(String json) throws IllegalArgumentException {
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
  public IdentityDocument(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public IdentityDocument(IdentityDocument src) {
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

    genClient.validateLength(getNumber(), 9);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'number' field is set and is not null */
  public boolean isNotNullNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.number);
  }



  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'number' field has been set, however the value could be null */
  public boolean hasNumber() {
    return genClient.cacheHasKey(CacheKey.number);
  }


  /**
   * Sets the field 'type'.
   */
  public IdentityDocument setType(java.lang.String type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'number'.
   */
  public IdentityDocument setNumber(java.lang.String number) {
    return genClient.setOther(number, CacheKey.number);
  }


  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'number' field, the 'has' method for this field will now return false */
  public void clearNumber() {
    genClient.clear(CacheKey.number);
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
  public IdentityDocument copyChanges() {
    IdentityDocument copy = new IdentityDocument();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(IdentityDocument src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new IdentityDocument(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<IdentityDocument> CREATOR = new android.os.Parcelable.Creator<IdentityDocument>() {
    @Override
    public IdentityDocument createFromParcel(android.os.Parcel in) {
      IdentityDocument instance = new IdentityDocument(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public IdentityDocument[] newArray(int size) {
      return new IdentityDocument[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<IdentityDocument> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<IdentityDocument>() {
    @Override
    public IdentityDocument create(org.json.JSONObject jsonObject) {
      return new IdentityDocument(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean TYPE_IS_REQUIRED = false;
    public static final boolean NUMBER_IS_REQUIRED = false;
    public static final long NUMBER_MAX_LEN = 9;

  }

}
