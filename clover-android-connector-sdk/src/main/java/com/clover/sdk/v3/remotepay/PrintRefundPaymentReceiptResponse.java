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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getPayment payment}</li>
 * <li>{@link #getRefund refund}</li>
 * <li>{@link #getOrder order}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PrintRefundPaymentReceiptResponse extends com.clover.sdk.v3.remotepay.BaseResponse {

  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }

  public com.clover.sdk.v3.payments.Refund getRefund() {
    return genClient.cacheGet(CacheKey.refund);
  }

  public com.clover.sdk.v3.order.Order getOrder() {
    return genClient.cacheGet(CacheKey.order);
  }

  /**
   * If true then the requested operation succeeded
   */
  @Override
  public java.lang.Boolean getSuccess() {
    return genClient.cacheGet(CacheKey.success);
  }

  /**
   * The result of the requested operation.
   */
  @Override
  public com.clover.sdk.v3.remotepay.ResponseCode getResult() {
    return genClient.cacheGet(CacheKey.result);
  }

  /**
   * Optional information about result.
   */
  @Override
  public java.lang.String getReason() {
    return genClient.cacheGet(CacheKey.reason);
  }

  /**
   * Detailed information about result.
   */
  @Override
  public java.lang.String getMessage() {
    return genClient.cacheGet(CacheKey.message);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PrintRefundPaymentReceiptResponse> {
    payment {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.payments.Payment.JSON_CREATOR);
      }
    },
    refund {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractRecord("refund", com.clover.sdk.v3.payments.Refund.JSON_CREATOR);
      }
    },
    order {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractRecord("order", com.clover.sdk.v3.order.Order.JSON_CREATOR);
      }
    },
    success {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractOther("success", java.lang.Boolean.class);
      }
    },
    result {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractEnum("result", com.clover.sdk.v3.remotepay.ResponseCode.class);
      }
    },
    reason {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractOther("reason", java.lang.String.class);
      }
    },
    message {
      @Override
      public Object extractValue(PrintRefundPaymentReceiptResponse instance) {
        return instance.genClient.extractOther("message", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<PrintRefundPaymentReceiptResponse> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PrintRefundPaymentReceiptResponse() {
    super(false);
    genClient = new GenericClient<PrintRefundPaymentReceiptResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PrintRefundPaymentReceiptResponse(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PrintRefundPaymentReceiptResponse(String json) throws IllegalArgumentException {
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
  public PrintRefundPaymentReceiptResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PrintRefundPaymentReceiptResponse(PrintRefundPaymentReceiptResponse src) {
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

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'refund' field is set and is not null */
  public boolean isNotNullRefund() {
    return genClient.cacheValueIsNotNull(CacheKey.refund);
  }

  /** Checks whether the 'order' field is set and is not null */
  public boolean isNotNullOrder() {
    return genClient.cacheValueIsNotNull(CacheKey.order);
  }

  /** Checks whether the 'success' field is set and is not null */
  @Override
  public boolean isNotNullSuccess() {
    return genClient.cacheValueIsNotNull(CacheKey.success);
  }

  /** Checks whether the 'result' field is set and is not null */
  @Override
  public boolean isNotNullResult() {
    return genClient.cacheValueIsNotNull(CacheKey.result);
  }

  /** Checks whether the 'reason' field is set and is not null */
  @Override
  public boolean isNotNullReason() {
    return genClient.cacheValueIsNotNull(CacheKey.reason);
  }

  /** Checks whether the 'message' field is set and is not null */
  @Override
  public boolean isNotNullMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.message);
  }



  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'refund' field has been set, however the value could be null */
  public boolean hasRefund() {
    return genClient.cacheHasKey(CacheKey.refund);
  }

  /** Checks whether the 'order' field has been set, however the value could be null */
  public boolean hasOrder() {
    return genClient.cacheHasKey(CacheKey.order);
  }

  /** Checks whether the 'success' field has been set, however the value could be null */
  @Override
  public boolean hasSuccess() {
    return genClient.cacheHasKey(CacheKey.success);
  }

  /** Checks whether the 'result' field has been set, however the value could be null */
  @Override
  public boolean hasResult() {
    return genClient.cacheHasKey(CacheKey.result);
  }

  /** Checks whether the 'reason' field has been set, however the value could be null */
  @Override
  public boolean hasReason() {
    return genClient.cacheHasKey(CacheKey.reason);
  }

  /** Checks whether the 'message' field has been set, however the value could be null */
  @Override
  public boolean hasMessage() {
    return genClient.cacheHasKey(CacheKey.message);
  }


  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PrintRefundPaymentReceiptResponse setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'refund'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PrintRefundPaymentReceiptResponse setRefund(com.clover.sdk.v3.payments.Refund refund) {
    return genClient.setRecord(refund, CacheKey.refund);
  }

  /**
   * Sets the field 'order'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PrintRefundPaymentReceiptResponse setOrder(com.clover.sdk.v3.order.Order order) {
    return genClient.setRecord(order, CacheKey.order);
  }

  /**
   * Sets the field 'success'.
   */
  @Override
  public BaseResponse setSuccess(java.lang.Boolean success) {
    return genClient.setOther(success, CacheKey.success);
  }

  /**
   * Sets the field 'result'.
   */
  @Override
  public BaseResponse setResult(com.clover.sdk.v3.remotepay.ResponseCode result) {
    return genClient.setOther(result, CacheKey.result);
  }

  /**
   * Sets the field 'reason'.
   */
  @Override
  public BaseResponse setReason(java.lang.String reason) {
    return genClient.setOther(reason, CacheKey.reason);
  }

  /**
   * Sets the field 'message'.
   */
  @Override
  public BaseResponse setMessage(java.lang.String message) {
    return genClient.setOther(message, CacheKey.message);
  }


  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'refund' field, the 'has' method for this field will now return false */
  public void clearRefund() {
    genClient.clear(CacheKey.refund);
  }
  /** Clears the 'order' field, the 'has' method for this field will now return false */
  public void clearOrder() {
    genClient.clear(CacheKey.order);
  }
  /** Clears the 'success' field, the 'has' method for this field will now return false */
  @Override
  public void clearSuccess() {
    genClient.clear(CacheKey.success);
  }
  /** Clears the 'result' field, the 'has' method for this field will now return false */
  @Override
  public void clearResult() {
    genClient.clear(CacheKey.result);
  }
  /** Clears the 'reason' field, the 'has' method for this field will now return false */
  @Override
  public void clearReason() {
    genClient.clear(CacheKey.reason);
  }
  /** Clears the 'message' field, the 'has' method for this field will now return false */
  @Override
  public void clearMessage() {
    genClient.clear(CacheKey.message);
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
  public PrintRefundPaymentReceiptResponse copyChanges() {
    PrintRefundPaymentReceiptResponse copy = new PrintRefundPaymentReceiptResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PrintRefundPaymentReceiptResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PrintRefundPaymentReceiptResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PrintRefundPaymentReceiptResponse> CREATOR = new android.os.Parcelable.Creator<PrintRefundPaymentReceiptResponse>() {
    @Override
    public PrintRefundPaymentReceiptResponse createFromParcel(android.os.Parcel in) {
      PrintRefundPaymentReceiptResponse instance = new PrintRefundPaymentReceiptResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PrintRefundPaymentReceiptResponse[] newArray(int size) {
      return new PrintRefundPaymentReceiptResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PrintRefundPaymentReceiptResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PrintRefundPaymentReceiptResponse>() {
    @Override
    public PrintRefundPaymentReceiptResponse create(org.json.JSONObject jsonObject) {
      return new PrintRefundPaymentReceiptResponse(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean PAYMENT_IS_REQUIRED = false;
    public static final boolean REFUND_IS_REQUIRED = false;
    public static final boolean ORDER_IS_REQUIRED = false;
    public static final boolean SUCCESS_IS_REQUIRED = false;
    public static final boolean RESULT_IS_REQUIRED = false;
    public static final boolean REASON_IS_REQUIRED = false;
    public static final boolean MESSAGE_IS_REQUIRED = false;

  }

}
