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

package com.clover.sdk.v3.pay;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 */
@SuppressWarnings("all")
public enum CardFunction implements Parcelable {
  CREDIT, DEBIT, PREPAID, PINLESS_DEBIT, SIGNATURE_DEBIT, EBT, SNAP;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<CardFunction> CREATOR = new Creator<CardFunction>() {
    @Override
    public CardFunction createFromParcel(final Parcel source) {
      return CardFunction.valueOf(source.readString());
    }

    @Override
    public CardFunction[] newArray(final int size) {
      return new CardFunction[size];
    }
  };
}
