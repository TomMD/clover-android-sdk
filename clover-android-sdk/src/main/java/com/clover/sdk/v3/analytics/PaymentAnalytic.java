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

package com.clover.sdk.v3.analytics;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getOrderId orderId}</li>
 * <li>{@link #getMerchantId merchantId}</li>
 * <li>{@link #getMerchantGatewayId merchantGatewayId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PaymentAnalytic extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Long getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }

  public java.lang.Long getMerchantId() {
    return genClient.cacheGet(CacheKey.merchantId);
  }

  public java.lang.Long getMerchantGatewayId() {
    return genClient.cacheGet(CacheKey.merchantGatewayId);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentAnalytic> {
    orderId {
      @Override
      public Object extractValue(PaymentAnalytic instance) {
        return instance.genClient.extractOther("orderId", java.lang.Long.class);
      }
    },
    merchantId {
      @Override
      public Object extractValue(PaymentAnalytic instance) {
        return instance.genClient.extractOther("merchantId", java.lang.Long.class);
      }
    },
    merchantGatewayId {
      @Override
      public Object extractValue(PaymentAnalytic instance) {
        return instance.genClient.extractOther("merchantGatewayId", java.lang.Long.class);
      }
    },
      ;
  }

  private GenericClient<PaymentAnalytic> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PaymentAnalytic() {
    genClient = new GenericClient<PaymentAnalytic>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PaymentAnalytic(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentAnalytic(String json) throws IllegalArgumentException {
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
  public PaymentAnalytic(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentAnalytic(PaymentAnalytic src) {
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
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'merchantId' field is set and is not null */
  public boolean isNotNullMerchantId() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantId);
  }

  /** Checks whether the 'merchantGatewayId' field is set and is not null */
  public boolean isNotNullMerchantGatewayId() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantGatewayId);
  }



  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'merchantId' field has been set, however the value could be null */
  public boolean hasMerchantId() {
    return genClient.cacheHasKey(CacheKey.merchantId);
  }

  /** Checks whether the 'merchantGatewayId' field has been set, however the value could be null */
  public boolean hasMerchantGatewayId() {
    return genClient.cacheHasKey(CacheKey.merchantGatewayId);
  }


  /**
   * Sets the field 'orderId'.
   */
  public PaymentAnalytic setOrderId(java.lang.Long orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'merchantId'.
   */
  public PaymentAnalytic setMerchantId(java.lang.Long merchantId) {
    return genClient.setOther(merchantId, CacheKey.merchantId);
  }

  /**
   * Sets the field 'merchantGatewayId'.
   */
  public PaymentAnalytic setMerchantGatewayId(java.lang.Long merchantGatewayId) {
    return genClient.setOther(merchantGatewayId, CacheKey.merchantGatewayId);
  }


  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'merchantId' field, the 'has' method for this field will now return false */
  public void clearMerchantId() {
    genClient.clear(CacheKey.merchantId);
  }
  /** Clears the 'merchantGatewayId' field, the 'has' method for this field will now return false */
  public void clearMerchantGatewayId() {
    genClient.clear(CacheKey.merchantGatewayId);
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
  public PaymentAnalytic copyChanges() {
    PaymentAnalytic copy = new PaymentAnalytic();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentAnalytic src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentAnalytic(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PaymentAnalytic> CREATOR = new android.os.Parcelable.Creator<PaymentAnalytic>() {
    @Override
    public PaymentAnalytic createFromParcel(android.os.Parcel in) {
      PaymentAnalytic instance = new PaymentAnalytic(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentAnalytic[] newArray(int size) {
      return new PaymentAnalytic[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentAnalytic> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentAnalytic>() {
    @Override
    public PaymentAnalytic create(org.json.JSONObject jsonObject) {
      return new PaymentAnalytic(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final boolean MERCHANTID_IS_REQUIRED = false;
    public static final boolean MERCHANTGATEWAYID_IS_REQUIRED = false;

  }

}
