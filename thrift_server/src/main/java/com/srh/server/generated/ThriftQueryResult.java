/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.srh.server.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-10-12")
public class ThriftQueryResult implements org.apache.thrift.TBase<ThriftQueryResult, ThriftQueryResult._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftQueryResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftQueryResult");

  private static final org.apache.thrift.protocol.TField TOTAL_HITS_FIELD_DESC = new org.apache.thrift.protocol.TField("totalHits", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("queryType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField RECORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("records", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField AGG_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("aggType", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThriftQueryResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThriftQueryResultTupleSchemeFactory();

  public long totalHits; // optional
  public int limit; // optional
  public int offset; // optional
  /**
   * 
   * @see ThriftQueryType
   */
  public ThriftQueryType queryType; // optional
  public java.util.List<ThriftQueryOutputRecord> records; // optional
  public java.lang.String aggType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_HITS((short)1, "totalHits"),
    LIMIT((short)2, "limit"),
    OFFSET((short)3, "offset"),
    /**
     * 
     * @see ThriftQueryType
     */
    QUERY_TYPE((short)4, "queryType"),
    RECORDS((short)5, "records"),
    AGG_TYPE((short)6, "aggType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_HITS
          return TOTAL_HITS;
        case 2: // LIMIT
          return LIMIT;
        case 3: // OFFSET
          return OFFSET;
        case 4: // QUERY_TYPE
          return QUERY_TYPE;
        case 5: // RECORDS
          return RECORDS;
        case 6: // AGG_TYPE
          return AGG_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALHITS_ISSET_ID = 0;
  private static final int __LIMIT_ISSET_ID = 1;
  private static final int __OFFSET_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOTAL_HITS,_Fields.LIMIT,_Fields.OFFSET,_Fields.QUERY_TYPE,_Fields.RECORDS,_Fields.AGG_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_HITS, new org.apache.thrift.meta_data.FieldMetaData("totalHits", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QUERY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("queryType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftQueryType.class)));
    tmpMap.put(_Fields.RECORDS, new org.apache.thrift.meta_data.FieldMetaData("records", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftQueryOutputRecord.class))));
    tmpMap.put(_Fields.AGG_TYPE, new org.apache.thrift.meta_data.FieldMetaData("aggType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftQueryResult.class, metaDataMap);
  }

  public ThriftQueryResult() {
    this.aggType = "avg";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftQueryResult(ThriftQueryResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalHits = other.totalHits;
    this.limit = other.limit;
    this.offset = other.offset;
    if (other.isSetQueryType()) {
      this.queryType = other.queryType;
    }
    if (other.isSetRecords()) {
      java.util.List<ThriftQueryOutputRecord> __this__records = new java.util.ArrayList<ThriftQueryOutputRecord>(other.records.size());
      for (ThriftQueryOutputRecord other_element : other.records) {
        __this__records.add(new ThriftQueryOutputRecord(other_element));
      }
      this.records = __this__records;
    }
    if (other.isSetAggType()) {
      this.aggType = other.aggType;
    }
  }

  public ThriftQueryResult deepCopy() {
    return new ThriftQueryResult(this);
  }

  @Override
  public void clear() {
    setTotalHitsIsSet(false);
    this.totalHits = 0;
    setLimitIsSet(false);
    this.limit = 0;
    setOffsetIsSet(false);
    this.offset = 0;
    this.queryType = null;
    this.records = null;
    this.aggType = "avg";

  }

  public long getTotalHits() {
    return this.totalHits;
  }

  public ThriftQueryResult setTotalHits(long totalHits) {
    this.totalHits = totalHits;
    setTotalHitsIsSet(true);
    return this;
  }

  public void unsetTotalHits() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALHITS_ISSET_ID);
  }

  /** Returns true if field totalHits is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalHits() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALHITS_ISSET_ID);
  }

  public void setTotalHitsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALHITS_ISSET_ID, value);
  }

  public int getLimit() {
    return this.limit;
  }

  public ThriftQueryResult setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public int getOffset() {
    return this.offset;
  }

  public ThriftQueryResult setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  /**
   * 
   * @see ThriftQueryType
   */
  public ThriftQueryType getQueryType() {
    return this.queryType;
  }

  /**
   * 
   * @see ThriftQueryType
   */
  public ThriftQueryResult setQueryType(ThriftQueryType queryType) {
    this.queryType = queryType;
    return this;
  }

  public void unsetQueryType() {
    this.queryType = null;
  }

  /** Returns true if field queryType is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryType() {
    return this.queryType != null;
  }

  public void setQueryTypeIsSet(boolean value) {
    if (!value) {
      this.queryType = null;
    }
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public java.util.Iterator<ThriftQueryOutputRecord> getRecordsIterator() {
    return (this.records == null) ? null : this.records.iterator();
  }

  public void addToRecords(ThriftQueryOutputRecord elem) {
    if (this.records == null) {
      this.records = new java.util.ArrayList<ThriftQueryOutputRecord>();
    }
    this.records.add(elem);
  }

  public java.util.List<ThriftQueryOutputRecord> getRecords() {
    return this.records;
  }

  public ThriftQueryResult setRecords(java.util.List<ThriftQueryOutputRecord> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been assigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  public java.lang.String getAggType() {
    return this.aggType;
  }

  public ThriftQueryResult setAggType(java.lang.String aggType) {
    this.aggType = aggType;
    return this;
  }

  public void unsetAggType() {
    this.aggType = null;
  }

  /** Returns true if field aggType is set (has been assigned a value) and false otherwise */
  public boolean isSetAggType() {
    return this.aggType != null;
  }

  public void setAggTypeIsSet(boolean value) {
    if (!value) {
      this.aggType = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOTAL_HITS:
      if (value == null) {
        unsetTotalHits();
      } else {
        setTotalHits((java.lang.Long)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((java.lang.Integer)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Integer)value);
      }
      break;

    case QUERY_TYPE:
      if (value == null) {
        unsetQueryType();
      } else {
        setQueryType((ThriftQueryType)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((java.util.List<ThriftQueryOutputRecord>)value);
      }
      break;

    case AGG_TYPE:
      if (value == null) {
        unsetAggType();
      } else {
        setAggType((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_HITS:
      return getTotalHits();

    case LIMIT:
      return getLimit();

    case OFFSET:
      return getOffset();

    case QUERY_TYPE:
      return getQueryType();

    case RECORDS:
      return getRecords();

    case AGG_TYPE:
      return getAggType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_HITS:
      return isSetTotalHits();
    case LIMIT:
      return isSetLimit();
    case OFFSET:
      return isSetOffset();
    case QUERY_TYPE:
      return isSetQueryType();
    case RECORDS:
      return isSetRecords();
    case AGG_TYPE:
      return isSetAggType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftQueryResult)
      return this.equals((ThriftQueryResult)that);
    return false;
  }

  public boolean equals(ThriftQueryResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_totalHits = true && this.isSetTotalHits();
    boolean that_present_totalHits = true && that.isSetTotalHits();
    if (this_present_totalHits || that_present_totalHits) {
      if (!(this_present_totalHits && that_present_totalHits))
        return false;
      if (this.totalHits != that.totalHits)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_queryType = true && this.isSetQueryType();
    boolean that_present_queryType = true && that.isSetQueryType();
    if (this_present_queryType || that_present_queryType) {
      if (!(this_present_queryType && that_present_queryType))
        return false;
      if (!this.queryType.equals(that.queryType))
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    boolean this_present_aggType = true && this.isSetAggType();
    boolean that_present_aggType = true && that.isSetAggType();
    if (this_present_aggType || that_present_aggType) {
      if (!(this_present_aggType && that_present_aggType))
        return false;
      if (!this.aggType.equals(that.aggType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTotalHits()) ? 131071 : 524287);
    if (isSetTotalHits())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(totalHits);

    hashCode = hashCode * 8191 + ((isSetLimit()) ? 131071 : 524287);
    if (isSetLimit())
      hashCode = hashCode * 8191 + limit;

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + offset;

    hashCode = hashCode * 8191 + ((isSetQueryType()) ? 131071 : 524287);
    if (isSetQueryType())
      hashCode = hashCode * 8191 + queryType.getValue();

    hashCode = hashCode * 8191 + ((isSetRecords()) ? 131071 : 524287);
    if (isSetRecords())
      hashCode = hashCode * 8191 + records.hashCode();

    hashCode = hashCode * 8191 + ((isSetAggType()) ? 131071 : 524287);
    if (isSetAggType())
      hashCode = hashCode * 8191 + aggType.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ThriftQueryResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTotalHits()).compareTo(other.isSetTotalHits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalHits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalHits, other.totalHits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQueryType()).compareTo(other.isSetQueryType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryType, other.queryType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecords()).compareTo(other.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.records, other.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAggType()).compareTo(other.isSetAggType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAggType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aggType, other.aggType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ThriftQueryResult(");
    boolean first = true;

    if (isSetTotalHits()) {
      sb.append("totalHits:");
      sb.append(this.totalHits);
      first = false;
    }
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetQueryType()) {
      if (!first) sb.append(", ");
      sb.append("queryType:");
      if (this.queryType == null) {
        sb.append("null");
      } else {
        sb.append(this.queryType);
      }
      first = false;
    }
    if (isSetRecords()) {
      if (!first) sb.append(", ");
      sb.append("records:");
      if (this.records == null) {
        sb.append("null");
      } else {
        sb.append(this.records);
      }
      first = false;
    }
    if (isSetAggType()) {
      if (!first) sb.append(", ");
      sb.append("aggType:");
      if (this.aggType == null) {
        sb.append("null");
      } else {
        sb.append(this.aggType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftQueryResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThriftQueryResultStandardScheme getScheme() {
      return new ThriftQueryResultStandardScheme();
    }
  }

  private static class ThriftQueryResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThriftQueryResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftQueryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_HITS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalHits = iprot.readI64();
              struct.setTotalHitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.queryType = com.srh.server.generated.ThriftQueryType.findByValue(iprot.readI32());
              struct.setQueryTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RECORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.records = new java.util.ArrayList<ThriftQueryOutputRecord>(_list0.size);
                ThriftQueryOutputRecord _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ThriftQueryOutputRecord();
                  _elem1.read(iprot);
                  struct.records.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRecordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AGG_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aggType = iprot.readString();
              struct.setAggTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftQueryResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTotalHits()) {
        oprot.writeFieldBegin(TOTAL_HITS_FIELD_DESC);
        oprot.writeI64(struct.totalHits);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.queryType != null) {
        if (struct.isSetQueryType()) {
          oprot.writeFieldBegin(QUERY_TYPE_FIELD_DESC);
          oprot.writeI32(struct.queryType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.records != null) {
        if (struct.isSetRecords()) {
          oprot.writeFieldBegin(RECORDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.records.size()));
            for (ThriftQueryOutputRecord _iter3 : struct.records)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.aggType != null) {
        if (struct.isSetAggType()) {
          oprot.writeFieldBegin(AGG_TYPE_FIELD_DESC);
          oprot.writeString(struct.aggType);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftQueryResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThriftQueryResultTupleScheme getScheme() {
      return new ThriftQueryResultTupleScheme();
    }
  }

  private static class ThriftQueryResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThriftQueryResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftQueryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTotalHits()) {
        optionals.set(0);
      }
      if (struct.isSetLimit()) {
        optionals.set(1);
      }
      if (struct.isSetOffset()) {
        optionals.set(2);
      }
      if (struct.isSetQueryType()) {
        optionals.set(3);
      }
      if (struct.isSetRecords()) {
        optionals.set(4);
      }
      if (struct.isSetAggType()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTotalHits()) {
        oprot.writeI64(struct.totalHits);
      }
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetQueryType()) {
        oprot.writeI32(struct.queryType.getValue());
      }
      if (struct.isSetRecords()) {
        {
          oprot.writeI32(struct.records.size());
          for (ThriftQueryOutputRecord _iter4 : struct.records)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetAggType()) {
        oprot.writeString(struct.aggType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftQueryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.totalHits = iprot.readI64();
        struct.setTotalHitsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
      if (incoming.get(2)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.queryType = com.srh.server.generated.ThriftQueryType.findByValue(iprot.readI32());
        struct.setQueryTypeIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.records = new java.util.ArrayList<ThriftQueryOutputRecord>(_list5.size);
          ThriftQueryOutputRecord _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ThriftQueryOutputRecord();
            _elem6.read(iprot);
            struct.records.add(_elem6);
          }
        }
        struct.setRecordsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.aggType = iprot.readString();
        struct.setAggTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

