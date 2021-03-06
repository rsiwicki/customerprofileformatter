/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerProfile\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"next_best_action\",\"type\":[\"string\",\"null\"]},{\"name\":\"loyalty_card_number\",\"type\":[\"string\",\"null\"]},{\"name\":\"customer_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"estimated_lifetime_value\",\"type\":[\"int\",\"null\"]},{\"name\":\"purchase_history\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductPurchase\",\"fields\":[{\"name\":\"item\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"event_date\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence next_best_action;
  @Deprecated public java.lang.CharSequence loyalty_card_number;
  @Deprecated public java.lang.CharSequence customer_type;
  @Deprecated public java.lang.Integer estimated_lifetime_value;
  @Deprecated public java.util.List<example.avro.ProductPurchase> purchase_history;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CustomerProfile() {}

  /**
   * All-args constructor.
   */
  public CustomerProfile(java.lang.CharSequence name, java.lang.CharSequence next_best_action, java.lang.CharSequence loyalty_card_number, java.lang.CharSequence customer_type, java.lang.Integer estimated_lifetime_value, java.util.List<example.avro.ProductPurchase> purchase_history) {
    this.name = name;
    this.next_best_action = next_best_action;
    this.loyalty_card_number = loyalty_card_number;
    this.customer_type = customer_type;
    this.estimated_lifetime_value = estimated_lifetime_value;
    this.purchase_history = purchase_history;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return next_best_action;
    case 2: return loyalty_card_number;
    case 3: return customer_type;
    case 4: return estimated_lifetime_value;
    case 5: return purchase_history;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: next_best_action = (java.lang.CharSequence)value$; break;
    case 2: loyalty_card_number = (java.lang.CharSequence)value$; break;
    case 3: customer_type = (java.lang.CharSequence)value$; break;
    case 4: estimated_lifetime_value = (java.lang.Integer)value$; break;
    case 5: purchase_history = (java.util.List<example.avro.ProductPurchase>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'next_best_action' field.
   */
  public java.lang.CharSequence getNextBestAction() {
    return next_best_action;
  }

  /**
   * Sets the value of the 'next_best_action' field.
   * @param value the value to set.
   */
  public void setNextBestAction(java.lang.CharSequence value) {
    this.next_best_action = value;
  }

  /**
   * Gets the value of the 'loyalty_card_number' field.
   */
  public java.lang.CharSequence getLoyaltyCardNumber() {
    return loyalty_card_number;
  }

  /**
   * Sets the value of the 'loyalty_card_number' field.
   * @param value the value to set.
   */
  public void setLoyaltyCardNumber(java.lang.CharSequence value) {
    this.loyalty_card_number = value;
  }

  /**
   * Gets the value of the 'customer_type' field.
   */
  public java.lang.CharSequence getCustomerType() {
    return customer_type;
  }

  /**
   * Sets the value of the 'customer_type' field.
   * @param value the value to set.
   */
  public void setCustomerType(java.lang.CharSequence value) {
    this.customer_type = value;
  }

  /**
   * Gets the value of the 'estimated_lifetime_value' field.
   */
  public java.lang.Integer getEstimatedLifetimeValue() {
    return estimated_lifetime_value;
  }

  /**
   * Sets the value of the 'estimated_lifetime_value' field.
   * @param value the value to set.
   */
  public void setEstimatedLifetimeValue(java.lang.Integer value) {
    this.estimated_lifetime_value = value;
  }

  /**
   * Gets the value of the 'purchase_history' field.
   */
  public java.util.List<example.avro.ProductPurchase> getPurchaseHistory() {
    return purchase_history;
  }

  /**
   * Sets the value of the 'purchase_history' field.
   * @param value the value to set.
   */
  public void setPurchaseHistory(java.util.List<example.avro.ProductPurchase> value) {
    this.purchase_history = value;
  }

  /** Creates a new CustomerProfile RecordBuilder */
  public static example.avro.CustomerProfile.Builder newBuilder() {
    return new example.avro.CustomerProfile.Builder();
  }
  
  /** Creates a new CustomerProfile RecordBuilder by copying an existing Builder */
  public static example.avro.CustomerProfile.Builder newBuilder(example.avro.CustomerProfile.Builder other) {
    return new example.avro.CustomerProfile.Builder(other);
  }
  
  /** Creates a new CustomerProfile RecordBuilder by copying an existing CustomerProfile instance */
  public static example.avro.CustomerProfile.Builder newBuilder(example.avro.CustomerProfile other) {
    return new example.avro.CustomerProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for CustomerProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerProfile>
    implements org.apache.avro.data.RecordBuilder<CustomerProfile> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence next_best_action;
    private java.lang.CharSequence loyalty_card_number;
    private java.lang.CharSequence customer_type;
    private java.lang.Integer estimated_lifetime_value;
    private java.util.List<example.avro.ProductPurchase> purchase_history;

    /** Creates a new Builder */
    private Builder() {
      super(example.avro.CustomerProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.avro.CustomerProfile.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next_best_action)) {
        this.next_best_action = data().deepCopy(fields()[1].schema(), other.next_best_action);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.loyalty_card_number)) {
        this.loyalty_card_number = data().deepCopy(fields()[2].schema(), other.loyalty_card_number);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.customer_type)) {
        this.customer_type = data().deepCopy(fields()[3].schema(), other.customer_type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.estimated_lifetime_value)) {
        this.estimated_lifetime_value = data().deepCopy(fields()[4].schema(), other.estimated_lifetime_value);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.purchase_history)) {
        this.purchase_history = data().deepCopy(fields()[5].schema(), other.purchase_history);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CustomerProfile instance */
    private Builder(example.avro.CustomerProfile other) {
            super(example.avro.CustomerProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next_best_action)) {
        this.next_best_action = data().deepCopy(fields()[1].schema(), other.next_best_action);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.loyalty_card_number)) {
        this.loyalty_card_number = data().deepCopy(fields()[2].schema(), other.loyalty_card_number);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.customer_type)) {
        this.customer_type = data().deepCopy(fields()[3].schema(), other.customer_type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.estimated_lifetime_value)) {
        this.estimated_lifetime_value = data().deepCopy(fields()[4].schema(), other.estimated_lifetime_value);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.purchase_history)) {
        this.purchase_history = data().deepCopy(fields()[5].schema(), other.purchase_history);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public example.avro.CustomerProfile.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public example.avro.CustomerProfile.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'next_best_action' field */
    public java.lang.CharSequence getNextBestAction() {
      return next_best_action;
    }
    
    /** Sets the value of the 'next_best_action' field */
    public example.avro.CustomerProfile.Builder setNextBestAction(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.next_best_action = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'next_best_action' field has been set */
    public boolean hasNextBestAction() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'next_best_action' field */
    public example.avro.CustomerProfile.Builder clearNextBestAction() {
      next_best_action = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'loyalty_card_number' field */
    public java.lang.CharSequence getLoyaltyCardNumber() {
      return loyalty_card_number;
    }
    
    /** Sets the value of the 'loyalty_card_number' field */
    public example.avro.CustomerProfile.Builder setLoyaltyCardNumber(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.loyalty_card_number = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'loyalty_card_number' field has been set */
    public boolean hasLoyaltyCardNumber() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'loyalty_card_number' field */
    public example.avro.CustomerProfile.Builder clearLoyaltyCardNumber() {
      loyalty_card_number = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'customer_type' field */
    public java.lang.CharSequence getCustomerType() {
      return customer_type;
    }
    
    /** Sets the value of the 'customer_type' field */
    public example.avro.CustomerProfile.Builder setCustomerType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.customer_type = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'customer_type' field has been set */
    public boolean hasCustomerType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'customer_type' field */
    public example.avro.CustomerProfile.Builder clearCustomerType() {
      customer_type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'estimated_lifetime_value' field */
    public java.lang.Integer getEstimatedLifetimeValue() {
      return estimated_lifetime_value;
    }
    
    /** Sets the value of the 'estimated_lifetime_value' field */
    public example.avro.CustomerProfile.Builder setEstimatedLifetimeValue(java.lang.Integer value) {
      validate(fields()[4], value);
      this.estimated_lifetime_value = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'estimated_lifetime_value' field has been set */
    public boolean hasEstimatedLifetimeValue() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'estimated_lifetime_value' field */
    public example.avro.CustomerProfile.Builder clearEstimatedLifetimeValue() {
      estimated_lifetime_value = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'purchase_history' field */
    public java.util.List<example.avro.ProductPurchase> getPurchaseHistory() {
      return purchase_history;
    }
    
    /** Sets the value of the 'purchase_history' field */
    public example.avro.CustomerProfile.Builder setPurchaseHistory(java.util.List<example.avro.ProductPurchase> value) {
      validate(fields()[5], value);
      this.purchase_history = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'purchase_history' field has been set */
    public boolean hasPurchaseHistory() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'purchase_history' field */
    public example.avro.CustomerProfile.Builder clearPurchaseHistory() {
      purchase_history = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public CustomerProfile build() {
      try {
        CustomerProfile record = new CustomerProfile();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.next_best_action = fieldSetFlags()[1] ? this.next_best_action : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.loyalty_card_number = fieldSetFlags()[2] ? this.loyalty_card_number : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.customer_type = fieldSetFlags()[3] ? this.customer_type : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.estimated_lifetime_value = fieldSetFlags()[4] ? this.estimated_lifetime_value : (java.lang.Integer) defaultValue(fields()[4]);
        record.purchase_history = fieldSetFlags()[5] ? this.purchase_history : (java.util.List<example.avro.ProductPurchase>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
