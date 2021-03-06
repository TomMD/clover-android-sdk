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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getLanguageIndicator languageIndicator}</li>
 * <li>{@link #getTransactionLocale transactionLocale}</li>
 * <li>{@link #getAccountSelection accountSelection}</li>
 * <li>{@link #getFiscalInvoiceNumber fiscalInvoiceNumber}</li>
 * <li>{@link #getInstallmentsQuantity installmentsQuantity}</li>
 * <li>{@link #getInstallmentsPlanCode installmentsPlanCode}</li>
 * <li>{@link #getInstallmentsPlanId installmentsPlanId}</li>
 * <li>{@link #getInstallmentsPlanDesc installmentsPlanDesc}</li>
 * <li>{@link #getCardTypeLabel cardTypeLabel}</li>
 * <li>{@link #getStan stan}</li>
 * <li>{@link #getIdentityDocument identityDocument}</li>
 * <li>{@link #getBatchNumber batchNumber}</li>
 * <li>{@link #getReceiptNumber receiptNumber}</li>
 * <li>{@link #getReversalStan reversalStan}</li>
 * <li>{@link #getReversalMac reversalMac}</li>
 * <li>{@link #getReversalMacKsn reversalMacKsn}</li>
 * <li>{@link #getTerminalIdentification terminalIdentification}</li>
 * <li>{@link #getMerchantIdentifier merchantIdentifier}</li>
 * <li>{@link #getMerchantNameLocation merchantNameLocation}</li>
 * <li>{@link #getMaskedTrack2 maskedTrack2}</li>
 * <li>{@link #getReceiptExtraData receiptExtraData}</li>
 * <li>{@link #getSelectedService selectedService}</li>
 * <li>{@link #getTransactionResult transactionResult}</li>
 * <li>{@link #getTransactionTags transactionTags}</li>
 * <li>{@link #getTxFormat txFormat}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TransactionInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * 2 character language used for the transaction.  Deprecated in factor of transactionLocale.
   */
  public String getLanguageIndicator() {
    return genClient.cacheGet(CacheKey.languageIndicator);
  }

  /**
   * Locale for the transaction (e.g. en-CA)
   */
  public String getTransactionLocale() {
    return genClient.cacheGet(CacheKey.transactionLocale);
  }

  public AccountType getAccountSelection() {
    return genClient.cacheGet(CacheKey.accountSelection);
  }

  /**
   * Consists of 4 digits prefix + 8 digits
   */
  public String getFiscalInvoiceNumber() {
    return genClient.cacheGet(CacheKey.fiscalInvoiceNumber);
  }

  /**
   * AR Installments: number of installments
   */
  public Integer getInstallmentsQuantity() {
    return genClient.cacheGet(CacheKey.installmentsQuantity);
  }

  /**
   * AR Installments: plan alphanum code
   */
  public String getInstallmentsPlanCode() {
    return genClient.cacheGet(CacheKey.installmentsPlanCode);
  }

  /**
   * AR Installments: selected plan id
   */
  public String getInstallmentsPlanId() {
    return genClient.cacheGet(CacheKey.installmentsPlanId);
  }

  /**
   * AR Installments: selected plan desc
   */
  public String getInstallmentsPlanDesc() {
    return genClient.cacheGet(CacheKey.installmentsPlanDesc);
  }

  /**
   * Card type label
   */
  public String getCardTypeLabel() {
    return genClient.cacheGet(CacheKey.cardTypeLabel);
  }

  /**
   * STAN(System Audit Trace Number)
   */
  public Integer getStan() {
    return genClient.cacheGet(CacheKey.stan);
  }

  /**
   * Customers identification number and type
   */
  public com.clover.sdk.v3.customers.IdentityDocument getIdentityDocument() {
    return genClient.cacheGet(CacheKey.identityDocument);
  }

  /**
   * Transaction Batch Number
   */
  public String getBatchNumber() {
    return genClient.cacheGet(CacheKey.batchNumber);
  }

  /**
   * Transaction Receipt Number
   */
  public String getReceiptNumber() {
    return genClient.cacheGet(CacheKey.receiptNumber);
  }

  /**
   * STAN for reversal
   */
  public Integer getReversalStan() {
    return genClient.cacheGet(CacheKey.reversalStan);
  }

  /**
   * MAC for reversal
   */
  public String getReversalMac() {
    return genClient.cacheGet(CacheKey.reversalMac);
  }

  /**
   * MAC KSN for reversal
   */
  public String getReversalMacKsn() {
    return genClient.cacheGet(CacheKey.reversalMacKsn);
  }

  /**
   * Designates the unique location of a terminal at a merchant
   */
  public String getTerminalIdentification() {
    return genClient.cacheGet(CacheKey.terminalIdentification);
  }

  /**
   * When concatenated with the Acquirer Identifier, uniquely identifies a given merchant
   */
  public String getMerchantIdentifier() {
    return genClient.cacheGet(CacheKey.merchantIdentifier);
  }

  /**
   * Indicates the name and location of the merchant
   */
  public String getMerchantNameLocation() {
    return genClient.cacheGet(CacheKey.merchantNameLocation);
  }

  /**
   * Masked track2 data
   */
  public String getMaskedTrack2() {
    return genClient.cacheGet(CacheKey.maskedTrack2);
  }

  /**
   * Extra data for receipt
   */
  public String getReceiptExtraData() {
    return genClient.cacheGet(CacheKey.receiptExtraData);
  }

  /**
   * Defines the Financial Service selected for the transaction
   */
  public SelectedService getSelectedService() {
    return genClient.cacheGet(CacheKey.selectedService);
  }

  /**
   * Result of the transaction
   */
  public TransactionResult getTransactionResult() {
    return genClient.cacheGet(CacheKey.transactionResult);
  }

  /**
   * Contains a hex string with needed TLV tags for certification
   */
  public String getTransactionTags() {
    return genClient.cacheGet(CacheKey.transactionTags);
  }

  /**
   * Contains the information how the data inside transactionTags
   * should be coded - initially we cause "default" and "nexo" as formats
   */
  public TxFormat getTxFormat() {
    return genClient.cacheGet(CacheKey.txFormat);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TransactionInfo> {
    languageIndicator {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("languageIndicator", String.class);
      }
    },
    transactionLocale {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("transactionLocale", String.class);
      }
    },
    accountSelection {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractEnum("accountSelection", AccountType.class);
      }
    },
    fiscalInvoiceNumber {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("fiscalInvoiceNumber", String.class);
      }
    },
    installmentsQuantity {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("installmentsQuantity", Integer.class);
      }
    },
    installmentsPlanCode {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("installmentsPlanCode", String.class);
      }
    },
    installmentsPlanId {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("installmentsPlanId", String.class);
      }
    },
    installmentsPlanDesc {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("installmentsPlanDesc", String.class);
      }
    },
    cardTypeLabel {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("cardTypeLabel", String.class);
      }
    },
    stan {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("stan", Integer.class);
      }
    },
    identityDocument {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractRecord("identityDocument", com.clover.sdk.v3.customers.IdentityDocument.JSON_CREATOR);
      }
    },
    batchNumber {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("batchNumber", String.class);
      }
    },
    receiptNumber {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("receiptNumber", String.class);
      }
    },
    reversalStan {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("reversalStan", Integer.class);
      }
    },
    reversalMac {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("reversalMac", String.class);
      }
    },
    reversalMacKsn {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("reversalMacKsn", String.class);
      }
    },
    terminalIdentification {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("terminalIdentification", String.class);
      }
    },
    merchantIdentifier {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("merchantIdentifier", String.class);
      }
    },
    merchantNameLocation {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("merchantNameLocation", String.class);
      }
    },
    maskedTrack2 {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("maskedTrack2", String.class);
      }
    },
    receiptExtraData {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("receiptExtraData", String.class);
      }
    },
    selectedService {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractEnum("selectedService", SelectedService.class);
      }
    },
    transactionResult {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractEnum("transactionResult", TransactionResult.class);
      }
    },
    transactionTags {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("transactionTags", String.class);
      }
    },
    txFormat {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractEnum("txFormat", TxFormat.class);
      }
    },
      ;
  }

  private GenericClient<TransactionInfo> genClient;

  /**
   * Constructs a new empty instance.
   */
  public TransactionInfo() {
    genClient = new GenericClient<TransactionInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected TransactionInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TransactionInfo(String json) throws IllegalArgumentException {
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
  public TransactionInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TransactionInfo(TransactionInfo src) {
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
    genClient.validateLength(getLanguageIndicator(), 2);

    genClient.validateLength(getFiscalInvoiceNumber(), 12);

    genClient.validateLength(getInstallmentsPlanCode(), 1);
  }

  /** Checks whether the 'languageIndicator' field is set and is not null */
  public boolean isNotNullLanguageIndicator() {
    return genClient.cacheValueIsNotNull(CacheKey.languageIndicator);
  }

  /** Checks whether the 'transactionLocale' field is set and is not null */
  public boolean isNotNullTransactionLocale() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionLocale);
  }

  /** Checks whether the 'accountSelection' field is set and is not null */
  public boolean isNotNullAccountSelection() {
    return genClient.cacheValueIsNotNull(CacheKey.accountSelection);
  }

  /** Checks whether the 'fiscalInvoiceNumber' field is set and is not null */
  public boolean isNotNullFiscalInvoiceNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.fiscalInvoiceNumber);
  }

  /** Checks whether the 'installmentsQuantity' field is set and is not null */
  public boolean isNotNullInstallmentsQuantity() {
    return genClient.cacheValueIsNotNull(CacheKey.installmentsQuantity);
  }

  /** Checks whether the 'installmentsPlanCode' field is set and is not null */
  public boolean isNotNullInstallmentsPlanCode() {
    return genClient.cacheValueIsNotNull(CacheKey.installmentsPlanCode);
  }

  /** Checks whether the 'installmentsPlanId' field is set and is not null */
  public boolean isNotNullInstallmentsPlanId() {
    return genClient.cacheValueIsNotNull(CacheKey.installmentsPlanId);
  }

  /** Checks whether the 'installmentsPlanDesc' field is set and is not null */
  public boolean isNotNullInstallmentsPlanDesc() {
    return genClient.cacheValueIsNotNull(CacheKey.installmentsPlanDesc);
  }

  /** Checks whether the 'cardTypeLabel' field is set and is not null */
  public boolean isNotNullCardTypeLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.cardTypeLabel);
  }

  /** Checks whether the 'stan' field is set and is not null */
  public boolean isNotNullStan() {
    return genClient.cacheValueIsNotNull(CacheKey.stan);
  }

  /** Checks whether the 'identityDocument' field is set and is not null */
  public boolean isNotNullIdentityDocument() {
    return genClient.cacheValueIsNotNull(CacheKey.identityDocument);
  }

  /** Checks whether the 'batchNumber' field is set and is not null */
  public boolean isNotNullBatchNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.batchNumber);
  }

  /** Checks whether the 'receiptNumber' field is set and is not null */
  public boolean isNotNullReceiptNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.receiptNumber);
  }

  /** Checks whether the 'reversalStan' field is set and is not null */
  public boolean isNotNullReversalStan() {
    return genClient.cacheValueIsNotNull(CacheKey.reversalStan);
  }

  /** Checks whether the 'reversalMac' field is set and is not null */
  public boolean isNotNullReversalMac() {
    return genClient.cacheValueIsNotNull(CacheKey.reversalMac);
  }

  /** Checks whether the 'reversalMacKsn' field is set and is not null */
  public boolean isNotNullReversalMacKsn() {
    return genClient.cacheValueIsNotNull(CacheKey.reversalMacKsn);
  }

  /** Checks whether the 'terminalIdentification' field is set and is not null */
  public boolean isNotNullTerminalIdentification() {
    return genClient.cacheValueIsNotNull(CacheKey.terminalIdentification);
  }

  /** Checks whether the 'merchantIdentifier' field is set and is not null */
  public boolean isNotNullMerchantIdentifier() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantIdentifier);
  }

  /** Checks whether the 'merchantNameLocation' field is set and is not null */
  public boolean isNotNullMerchantNameLocation() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantNameLocation);
  }

  /** Checks whether the 'maskedTrack2' field is set and is not null */
  public boolean isNotNullMaskedTrack2() {
    return genClient.cacheValueIsNotNull(CacheKey.maskedTrack2);
  }

  /** Checks whether the 'receiptExtraData' field is set and is not null */
  public boolean isNotNullReceiptExtraData() {
    return genClient.cacheValueIsNotNull(CacheKey.receiptExtraData);
  }

  /** Checks whether the 'selectedService' field is set and is not null */
  public boolean isNotNullSelectedService() {
    return genClient.cacheValueIsNotNull(CacheKey.selectedService);
  }

  /** Checks whether the 'transactionResult' field is set and is not null */
  public boolean isNotNullTransactionResult() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionResult);
  }

  /** Checks whether the 'transactionTags' field is set and is not null */
  public boolean isNotNullTransactionTags() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionTags);
  }

  /** Checks whether the 'txFormat' field is set and is not null */
  public boolean isNotNullTxFormat() {
    return genClient.cacheValueIsNotNull(CacheKey.txFormat);
  }



  /** Checks whether the 'languageIndicator' field has been set, however the value could be null */
  public boolean hasLanguageIndicator() {
    return genClient.cacheHasKey(CacheKey.languageIndicator);
  }

  /** Checks whether the 'transactionLocale' field has been set, however the value could be null */
  public boolean hasTransactionLocale() {
    return genClient.cacheHasKey(CacheKey.transactionLocale);
  }

  /** Checks whether the 'accountSelection' field has been set, however the value could be null */
  public boolean hasAccountSelection() {
    return genClient.cacheHasKey(CacheKey.accountSelection);
  }

  /** Checks whether the 'fiscalInvoiceNumber' field has been set, however the value could be null */
  public boolean hasFiscalInvoiceNumber() {
    return genClient.cacheHasKey(CacheKey.fiscalInvoiceNumber);
  }

  /** Checks whether the 'installmentsQuantity' field has been set, however the value could be null */
  public boolean hasInstallmentsQuantity() {
    return genClient.cacheHasKey(CacheKey.installmentsQuantity);
  }

  /** Checks whether the 'installmentsPlanCode' field has been set, however the value could be null */
  public boolean hasInstallmentsPlanCode() {
    return genClient.cacheHasKey(CacheKey.installmentsPlanCode);
  }

  /** Checks whether the 'installmentsPlanId' field has been set, however the value could be null */
  public boolean hasInstallmentsPlanId() {
    return genClient.cacheHasKey(CacheKey.installmentsPlanId);
  }

  /** Checks whether the 'installmentsPlanDesc' field has been set, however the value could be null */
  public boolean hasInstallmentsPlanDesc() {
    return genClient.cacheHasKey(CacheKey.installmentsPlanDesc);
  }

  /** Checks whether the 'cardTypeLabel' field has been set, however the value could be null */
  public boolean hasCardTypeLabel() {
    return genClient.cacheHasKey(CacheKey.cardTypeLabel);
  }

  /** Checks whether the 'stan' field has been set, however the value could be null */
  public boolean hasStan() {
    return genClient.cacheHasKey(CacheKey.stan);
  }

  /** Checks whether the 'identityDocument' field has been set, however the value could be null */
  public boolean hasIdentityDocument() {
    return genClient.cacheHasKey(CacheKey.identityDocument);
  }

  /** Checks whether the 'batchNumber' field has been set, however the value could be null */
  public boolean hasBatchNumber() {
    return genClient.cacheHasKey(CacheKey.batchNumber);
  }

  /** Checks whether the 'receiptNumber' field has been set, however the value could be null */
  public boolean hasReceiptNumber() {
    return genClient.cacheHasKey(CacheKey.receiptNumber);
  }

  /** Checks whether the 'reversalStan' field has been set, however the value could be null */
  public boolean hasReversalStan() {
    return genClient.cacheHasKey(CacheKey.reversalStan);
  }

  /** Checks whether the 'reversalMac' field has been set, however the value could be null */
  public boolean hasReversalMac() {
    return genClient.cacheHasKey(CacheKey.reversalMac);
  }

  /** Checks whether the 'reversalMacKsn' field has been set, however the value could be null */
  public boolean hasReversalMacKsn() {
    return genClient.cacheHasKey(CacheKey.reversalMacKsn);
  }

  /** Checks whether the 'terminalIdentification' field has been set, however the value could be null */
  public boolean hasTerminalIdentification() {
    return genClient.cacheHasKey(CacheKey.terminalIdentification);
  }

  /** Checks whether the 'merchantIdentifier' field has been set, however the value could be null */
  public boolean hasMerchantIdentifier() {
    return genClient.cacheHasKey(CacheKey.merchantIdentifier);
  }

  /** Checks whether the 'merchantNameLocation' field has been set, however the value could be null */
  public boolean hasMerchantNameLocation() {
    return genClient.cacheHasKey(CacheKey.merchantNameLocation);
  }

  /** Checks whether the 'maskedTrack2' field has been set, however the value could be null */
  public boolean hasMaskedTrack2() {
    return genClient.cacheHasKey(CacheKey.maskedTrack2);
  }

  /** Checks whether the 'receiptExtraData' field has been set, however the value could be null */
  public boolean hasReceiptExtraData() {
    return genClient.cacheHasKey(CacheKey.receiptExtraData);
  }

  /** Checks whether the 'selectedService' field has been set, however the value could be null */
  public boolean hasSelectedService() {
    return genClient.cacheHasKey(CacheKey.selectedService);
  }

  /** Checks whether the 'transactionResult' field has been set, however the value could be null */
  public boolean hasTransactionResult() {
    return genClient.cacheHasKey(CacheKey.transactionResult);
  }

  /** Checks whether the 'transactionTags' field has been set, however the value could be null */
  public boolean hasTransactionTags() {
    return genClient.cacheHasKey(CacheKey.transactionTags);
  }

  /** Checks whether the 'txFormat' field has been set, however the value could be null */
  public boolean hasTxFormat() {
    return genClient.cacheHasKey(CacheKey.txFormat);
  }


  /**
   * Sets the field 'languageIndicator'.
   */
  public TransactionInfo setLanguageIndicator(String languageIndicator) {
    return genClient.setOther(languageIndicator, CacheKey.languageIndicator);
  }

  /**
   * Sets the field 'transactionLocale'.
   */
  public TransactionInfo setTransactionLocale(String transactionLocale) {
    return genClient.setOther(transactionLocale, CacheKey.transactionLocale);
  }

  /**
   * Sets the field 'accountSelection'.
   */
  public TransactionInfo setAccountSelection(AccountType accountSelection) {
    return genClient.setOther(accountSelection, CacheKey.accountSelection);
  }

  /**
   * Sets the field 'fiscalInvoiceNumber'.
   */
  public TransactionInfo setFiscalInvoiceNumber(String fiscalInvoiceNumber) {
    return genClient.setOther(fiscalInvoiceNumber, CacheKey.fiscalInvoiceNumber);
  }

  /**
   * Sets the field 'installmentsQuantity'.
   */
  public TransactionInfo setInstallmentsQuantity(Integer installmentsQuantity) {
    return genClient.setOther(installmentsQuantity, CacheKey.installmentsQuantity);
  }

  /**
   * Sets the field 'installmentsPlanCode'.
   */
  public TransactionInfo setInstallmentsPlanCode(String installmentsPlanCode) {
    return genClient.setOther(installmentsPlanCode, CacheKey.installmentsPlanCode);
  }

  /**
   * Sets the field 'installmentsPlanId'.
   */
  public TransactionInfo setInstallmentsPlanId(String installmentsPlanId) {
    return genClient.setOther(installmentsPlanId, CacheKey.installmentsPlanId);
  }

  /**
   * Sets the field 'installmentsPlanDesc'.
   */
  public TransactionInfo setInstallmentsPlanDesc(String installmentsPlanDesc) {
    return genClient.setOther(installmentsPlanDesc, CacheKey.installmentsPlanDesc);
  }

  /**
   * Sets the field 'cardTypeLabel'.
   */
  public TransactionInfo setCardTypeLabel(String cardTypeLabel) {
    return genClient.setOther(cardTypeLabel, CacheKey.cardTypeLabel);
  }

  /**
   * Sets the field 'stan'.
   */
  public TransactionInfo setStan(Integer stan) {
    return genClient.setOther(stan, CacheKey.stan);
  }

  /**
   * Sets the field 'identityDocument'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TransactionInfo setIdentityDocument(com.clover.sdk.v3.customers.IdentityDocument identityDocument) {
    return genClient.setRecord(identityDocument, CacheKey.identityDocument);
  }

  /**
   * Sets the field 'batchNumber'.
   */
  public TransactionInfo setBatchNumber(String batchNumber) {
    return genClient.setOther(batchNumber, CacheKey.batchNumber);
  }

  /**
   * Sets the field 'receiptNumber'.
   */
  public TransactionInfo setReceiptNumber(String receiptNumber) {
    return genClient.setOther(receiptNumber, CacheKey.receiptNumber);
  }

  /**
   * Sets the field 'reversalStan'.
   */
  public TransactionInfo setReversalStan(Integer reversalStan) {
    return genClient.setOther(reversalStan, CacheKey.reversalStan);
  }

  /**
   * Sets the field 'reversalMac'.
   */
  public TransactionInfo setReversalMac(String reversalMac) {
    return genClient.setOther(reversalMac, CacheKey.reversalMac);
  }

  /**
   * Sets the field 'reversalMacKsn'.
   */
  public TransactionInfo setReversalMacKsn(String reversalMacKsn) {
    return genClient.setOther(reversalMacKsn, CacheKey.reversalMacKsn);
  }

  /**
   * Sets the field 'terminalIdentification'.
   */
  public TransactionInfo setTerminalIdentification(String terminalIdentification) {
    return genClient.setOther(terminalIdentification, CacheKey.terminalIdentification);
  }

  /**
   * Sets the field 'merchantIdentifier'.
   */
  public TransactionInfo setMerchantIdentifier(String merchantIdentifier) {
    return genClient.setOther(merchantIdentifier, CacheKey.merchantIdentifier);
  }

  /**
   * Sets the field 'merchantNameLocation'.
   */
  public TransactionInfo setMerchantNameLocation(String merchantNameLocation) {
    return genClient.setOther(merchantNameLocation, CacheKey.merchantNameLocation);
  }

  /**
   * Sets the field 'maskedTrack2'.
   */
  public TransactionInfo setMaskedTrack2(String maskedTrack2) {
    return genClient.setOther(maskedTrack2, CacheKey.maskedTrack2);
  }

  /**
   * Sets the field 'receiptExtraData'.
   */
  public TransactionInfo setReceiptExtraData(String receiptExtraData) {
    return genClient.setOther(receiptExtraData, CacheKey.receiptExtraData);
  }

  /**
   * Sets the field 'selectedService'.
   */
  public TransactionInfo setSelectedService(SelectedService selectedService) {
    return genClient.setOther(selectedService, CacheKey.selectedService);
  }

  /**
   * Sets the field 'transactionResult'.
   */
  public TransactionInfo setTransactionResult(TransactionResult transactionResult) {
    return genClient.setOther(transactionResult, CacheKey.transactionResult);
  }

  /**
   * Sets the field 'transactionTags'.
   */
  public TransactionInfo setTransactionTags(String transactionTags) {
    return genClient.setOther(transactionTags, CacheKey.transactionTags);
  }

  /**
   * Sets the field 'txFormat'.
   */
  public TransactionInfo setTxFormat(TxFormat txFormat) {
    return genClient.setOther(txFormat, CacheKey.txFormat);
  }


  /** Clears the 'languageIndicator' field, the 'has' method for this field will now return false */
  public void clearLanguageIndicator() {
    genClient.clear(CacheKey.languageIndicator);
  }
  /** Clears the 'transactionLocale' field, the 'has' method for this field will now return false */
  public void clearTransactionLocale() {
    genClient.clear(CacheKey.transactionLocale);
  }
  /** Clears the 'accountSelection' field, the 'has' method for this field will now return false */
  public void clearAccountSelection() {
    genClient.clear(CacheKey.accountSelection);
  }
  /** Clears the 'fiscalInvoiceNumber' field, the 'has' method for this field will now return false */
  public void clearFiscalInvoiceNumber() {
    genClient.clear(CacheKey.fiscalInvoiceNumber);
  }
  /** Clears the 'installmentsQuantity' field, the 'has' method for this field will now return false */
  public void clearInstallmentsQuantity() {
    genClient.clear(CacheKey.installmentsQuantity);
  }
  /** Clears the 'installmentsPlanCode' field, the 'has' method for this field will now return false */
  public void clearInstallmentsPlanCode() {
    genClient.clear(CacheKey.installmentsPlanCode);
  }
  /** Clears the 'installmentsPlanId' field, the 'has' method for this field will now return false */
  public void clearInstallmentsPlanId() {
    genClient.clear(CacheKey.installmentsPlanId);
  }
  /** Clears the 'installmentsPlanDesc' field, the 'has' method for this field will now return false */
  public void clearInstallmentsPlanDesc() {
    genClient.clear(CacheKey.installmentsPlanDesc);
  }
  /** Clears the 'cardTypeLabel' field, the 'has' method for this field will now return false */
  public void clearCardTypeLabel() {
    genClient.clear(CacheKey.cardTypeLabel);
  }
  /** Clears the 'stan' field, the 'has' method for this field will now return false */
  public void clearStan() {
    genClient.clear(CacheKey.stan);
  }
  /** Clears the 'identityDocument' field, the 'has' method for this field will now return false */
  public void clearIdentityDocument() {
    genClient.clear(CacheKey.identityDocument);
  }
  /** Clears the 'batchNumber' field, the 'has' method for this field will now return false */
  public void clearBatchNumber() {
    genClient.clear(CacheKey.batchNumber);
  }
  /** Clears the 'receiptNumber' field, the 'has' method for this field will now return false */
  public void clearReceiptNumber() {
    genClient.clear(CacheKey.receiptNumber);
  }
  /** Clears the 'reversalStan' field, the 'has' method for this field will now return false */
  public void clearReversalStan() {
    genClient.clear(CacheKey.reversalStan);
  }
  /** Clears the 'reversalMac' field, the 'has' method for this field will now return false */
  public void clearReversalMac() {
    genClient.clear(CacheKey.reversalMac);
  }
  /** Clears the 'reversalMacKsn' field, the 'has' method for this field will now return false */
  public void clearReversalMacKsn() {
    genClient.clear(CacheKey.reversalMacKsn);
  }
  /** Clears the 'terminalIdentification' field, the 'has' method for this field will now return false */
  public void clearTerminalIdentification() {
    genClient.clear(CacheKey.terminalIdentification);
  }
  /** Clears the 'merchantIdentifier' field, the 'has' method for this field will now return false */
  public void clearMerchantIdentifier() {
    genClient.clear(CacheKey.merchantIdentifier);
  }
  /** Clears the 'merchantNameLocation' field, the 'has' method for this field will now return false */
  public void clearMerchantNameLocation() {
    genClient.clear(CacheKey.merchantNameLocation);
  }
  /** Clears the 'maskedTrack2' field, the 'has' method for this field will now return false */
  public void clearMaskedTrack2() {
    genClient.clear(CacheKey.maskedTrack2);
  }
  /** Clears the 'receiptExtraData' field, the 'has' method for this field will now return false */
  public void clearReceiptExtraData() {
    genClient.clear(CacheKey.receiptExtraData);
  }
  /** Clears the 'selectedService' field, the 'has' method for this field will now return false */
  public void clearSelectedService() {
    genClient.clear(CacheKey.selectedService);
  }
  /** Clears the 'transactionResult' field, the 'has' method for this field will now return false */
  public void clearTransactionResult() {
    genClient.clear(CacheKey.transactionResult);
  }
  /** Clears the 'transactionTags' field, the 'has' method for this field will now return false */
  public void clearTransactionTags() {
    genClient.clear(CacheKey.transactionTags);
  }
  /** Clears the 'txFormat' field, the 'has' method for this field will now return false */
  public void clearTxFormat() {
    genClient.clear(CacheKey.txFormat);
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
  public TransactionInfo copyChanges() {
    TransactionInfo copy = new TransactionInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TransactionInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TransactionInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TransactionInfo> CREATOR = new android.os.Parcelable.Creator<TransactionInfo>() {
    @Override
    public TransactionInfo createFromParcel(android.os.Parcel in) {
      TransactionInfo instance = new TransactionInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TransactionInfo[] newArray(int size) {
      return new TransactionInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TransactionInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TransactionInfo>() {
    @Override
    public TransactionInfo create(org.json.JSONObject jsonObject) {
      return new TransactionInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean LANGUAGEINDICATOR_IS_REQUIRED = false;
    public static final long LANGUAGEINDICATOR_MAX_LEN = 2;
    public static final boolean TRANSACTIONLOCALE_IS_REQUIRED = false;
    public static final boolean ACCOUNTSELECTION_IS_REQUIRED = false;
    public static final boolean FISCALINVOICENUMBER_IS_REQUIRED = false;
    public static final long FISCALINVOICENUMBER_MAX_LEN = 12;
    public static final boolean INSTALLMENTSQUANTITY_IS_REQUIRED = false;
    public static final boolean INSTALLMENTSPLANCODE_IS_REQUIRED = false;
    public static final long INSTALLMENTSPLANCODE_MAX_LEN = 1;
    public static final boolean INSTALLMENTSPLANID_IS_REQUIRED = false;
    public static final boolean INSTALLMENTSPLANDESC_IS_REQUIRED = false;
    public static final boolean CARDTYPELABEL_IS_REQUIRED = false;
    public static final boolean STAN_IS_REQUIRED = false;
    public static final boolean IDENTITYDOCUMENT_IS_REQUIRED = false;
    public static final boolean BATCHNUMBER_IS_REQUIRED = false;
    public static final boolean RECEIPTNUMBER_IS_REQUIRED = false;
    public static final boolean REVERSALSTAN_IS_REQUIRED = false;
    public static final boolean REVERSALMAC_IS_REQUIRED = false;
    public static final boolean REVERSALMACKSN_IS_REQUIRED = false;
    public static final boolean TERMINALIDENTIFICATION_IS_REQUIRED = false;
    public static final boolean MERCHANTIDENTIFIER_IS_REQUIRED = false;
    public static final boolean MERCHANTNAMELOCATION_IS_REQUIRED = false;
    public static final boolean MASKEDTRACK2_IS_REQUIRED = false;
    public static final boolean RECEIPTEXTRADATA_IS_REQUIRED = false;
    public static final boolean SELECTEDSERVICE_IS_REQUIRED = false;
    public static final boolean TRANSACTIONRESULT_IS_REQUIRED = false;
    public static final boolean TRANSACTIONTAGS_IS_REQUIRED = false;
    public static final boolean TXFORMAT_IS_REQUIRED = false;
  }

}
