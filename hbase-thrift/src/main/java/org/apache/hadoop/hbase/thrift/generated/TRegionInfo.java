/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * A TRegionInfo contains information about an HTable region.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2024-05-08")
public class TRegionInfo implements org.apache.thrift.TBase<TRegionInfo, TRegionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TRegionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRegionInfo");

  private static final org.apache.thrift.protocol.TField START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("startKey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("endKey", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField SERVER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serverName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRegionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRegionInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer startKey; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endKey; // required
  public long id; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer name; // required
  public byte version; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer serverName; // required
  public int port; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_KEY((short)1, "startKey"),
    END_KEY((short)2, "endKey"),
    ID((short)3, "id"),
    NAME((short)4, "name"),
    VERSION((short)5, "version"),
    SERVER_NAME((short)6, "serverName"),
    PORT((short)7, "port");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_KEY
          return START_KEY;
        case 2: // END_KEY
          return END_KEY;
        case 3: // ID
          return ID;
        case 4: // NAME
          return NAME;
        case 5: // VERSION
          return VERSION;
        case 6: // SERVER_NAME
          return SERVER_NAME;
        case 7: // PORT
          return PORT;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private static final int __PORT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_KEY, new org.apache.thrift.meta_data.FieldMetaData("startKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.END_KEY, new org.apache.thrift.meta_data.FieldMetaData("endKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.SERVER_NAME, new org.apache.thrift.meta_data.FieldMetaData("serverName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRegionInfo.class, metaDataMap);
  }

  public TRegionInfo() {
  }

  public TRegionInfo(
    java.nio.ByteBuffer startKey,
    java.nio.ByteBuffer endKey,
    long id,
    java.nio.ByteBuffer name,
    byte version,
    java.nio.ByteBuffer serverName,
    int port)
  {
    this();
    this.startKey = org.apache.thrift.TBaseHelper.copyBinary(startKey);
    this.endKey = org.apache.thrift.TBaseHelper.copyBinary(endKey);
    this.id = id;
    setIdIsSet(true);
    this.name = org.apache.thrift.TBaseHelper.copyBinary(name);
    this.version = version;
    setVersionIsSet(true);
    this.serverName = org.apache.thrift.TBaseHelper.copyBinary(serverName);
    this.port = port;
    setPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRegionInfo(TRegionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStartKey()) {
      this.startKey = org.apache.thrift.TBaseHelper.copyBinary(other.startKey);
    }
    if (other.isSetEndKey()) {
      this.endKey = org.apache.thrift.TBaseHelper.copyBinary(other.endKey);
    }
    this.id = other.id;
    if (other.isSetName()) {
      this.name = org.apache.thrift.TBaseHelper.copyBinary(other.name);
    }
    this.version = other.version;
    if (other.isSetServerName()) {
      this.serverName = org.apache.thrift.TBaseHelper.copyBinary(other.serverName);
    }
    this.port = other.port;
  }

  public TRegionInfo deepCopy() {
    return new TRegionInfo(this);
  }

  @Override
  public void clear() {
    this.startKey = null;
    this.endKey = null;
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    setVersionIsSet(false);
    this.version = 0;
    this.serverName = null;
    setPortIsSet(false);
    this.port = 0;
  }

  public byte[] getStartKey() {
    setStartKey(org.apache.thrift.TBaseHelper.rightSize(startKey));
    return startKey == null ? null : startKey.array();
  }

  public java.nio.ByteBuffer bufferForStartKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(startKey);
  }

  public TRegionInfo setStartKey(byte[] startKey) {
    this.startKey = startKey == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(startKey.clone());
    return this;
  }

  public TRegionInfo setStartKey(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer startKey) {
    this.startKey = org.apache.thrift.TBaseHelper.copyBinary(startKey);
    return this;
  }

  public void unsetStartKey() {
    this.startKey = null;
  }

  /** Returns true if field startKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.startKey != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.startKey = null;
    }
  }

  public byte[] getEndKey() {
    setEndKey(org.apache.thrift.TBaseHelper.rightSize(endKey));
    return endKey == null ? null : endKey.array();
  }

  public java.nio.ByteBuffer bufferForEndKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(endKey);
  }

  public TRegionInfo setEndKey(byte[] endKey) {
    this.endKey = endKey == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(endKey.clone());
    return this;
  }

  public TRegionInfo setEndKey(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endKey) {
    this.endKey = org.apache.thrift.TBaseHelper.copyBinary(endKey);
    return this;
  }

  public void unsetEndKey() {
    this.endKey = null;
  }

  /** Returns true if field endKey is set (has been assigned a value) and false otherwise */
  public boolean isSetEndKey() {
    return this.endKey != null;
  }

  public void setEndKeyIsSet(boolean value) {
    if (!value) {
      this.endKey = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public TRegionInfo setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public byte[] getName() {
    setName(org.apache.thrift.TBaseHelper.rightSize(name));
    return name == null ? null : name.array();
  }

  public java.nio.ByteBuffer bufferForName() {
    return org.apache.thrift.TBaseHelper.copyBinary(name);
  }

  public TRegionInfo setName(byte[] name) {
    this.name = name == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(name.clone());
    return this;
  }

  public TRegionInfo setName(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer name) {
    this.name = org.apache.thrift.TBaseHelper.copyBinary(name);
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public byte getVersion() {
    return this.version;
  }

  public TRegionInfo setVersion(byte version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public byte[] getServerName() {
    setServerName(org.apache.thrift.TBaseHelper.rightSize(serverName));
    return serverName == null ? null : serverName.array();
  }

  public java.nio.ByteBuffer bufferForServerName() {
    return org.apache.thrift.TBaseHelper.copyBinary(serverName);
  }

  public TRegionInfo setServerName(byte[] serverName) {
    this.serverName = serverName == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(serverName.clone());
    return this;
  }

  public TRegionInfo setServerName(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer serverName) {
    this.serverName = org.apache.thrift.TBaseHelper.copyBinary(serverName);
    return this;
  }

  public void unsetServerName() {
    this.serverName = null;
  }

  /** Returns true if field serverName is set (has been assigned a value) and false otherwise */
  public boolean isSetServerName() {
    return this.serverName != null;
  }

  public void setServerNameIsSet(boolean value) {
    if (!value) {
      this.serverName = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public TRegionInfo setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        if (value instanceof byte[]) {
          setStartKey((byte[])value);
        } else {
          setStartKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case END_KEY:
      if (value == null) {
        unsetEndKey();
      } else {
        if (value instanceof byte[]) {
          setEndKey((byte[])value);
        } else {
          setEndKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        if (value instanceof byte[]) {
          setName((byte[])value);
        } else {
          setName((java.nio.ByteBuffer)value);
        }
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Byte)value);
      }
      break;

    case SERVER_NAME:
      if (value == null) {
        unsetServerName();
      } else {
        if (value instanceof byte[]) {
          setServerName((byte[])value);
        } else {
          setServerName((java.nio.ByteBuffer)value);
        }
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_KEY:
      return getStartKey();

    case END_KEY:
      return getEndKey();

    case ID:
      return getId();

    case NAME:
      return getName();

    case VERSION:
      return getVersion();

    case SERVER_NAME:
      return getServerName();

    case PORT:
      return getPort();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START_KEY:
      return isSetStartKey();
    case END_KEY:
      return isSetEndKey();
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case VERSION:
      return isSetVersion();
    case SERVER_NAME:
      return isSetServerName();
    case PORT:
      return isSetPort();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRegionInfo)
      return this.equals((TRegionInfo)that);
    return false;
  }

  public boolean equals(TRegionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startKey = true && this.isSetStartKey();
    boolean that_present_startKey = true && that.isSetStartKey();
    if (this_present_startKey || that_present_startKey) {
      if (!(this_present_startKey && that_present_startKey))
        return false;
      if (!this.startKey.equals(that.startKey))
        return false;
    }

    boolean this_present_endKey = true && this.isSetEndKey();
    boolean that_present_endKey = true && that.isSetEndKey();
    if (this_present_endKey || that_present_endKey) {
      if (!(this_present_endKey && that_present_endKey))
        return false;
      if (!this.endKey.equals(that.endKey))
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_serverName = true && this.isSetServerName();
    boolean that_present_serverName = true && that.isSetServerName();
    if (this_present_serverName || that_present_serverName) {
      if (!(this_present_serverName && that_present_serverName))
        return false;
      if (!this.serverName.equals(that.serverName))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStartKey()) ? 131071 : 524287);
    if (isSetStartKey())
      hashCode = hashCode * 8191 + startKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndKey()) ? 131071 : 524287);
    if (isSetEndKey())
      hashCode = hashCode * 8191 + endKey.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + (int) (version);

    hashCode = hashCode * 8191 + ((isSetServerName()) ? 131071 : 524287);
    if (isSetServerName())
      hashCode = hashCode * 8191 + serverName.hashCode();

    hashCode = hashCode * 8191 + port;

    return hashCode;
  }

  @Override
  public int compareTo(TRegionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStartKey(), other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startKey, other.startKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEndKey(), other.isSetEndKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endKey, other.endKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVersion(), other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetServerName(), other.isSetServerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverName, other.serverName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPort(), other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRegionInfo(");
    boolean first = true;

    sb.append("startKey:");
    if (this.startKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.startKey, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endKey:");
    if (this.endKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.endKey, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.name, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverName:");
    if (this.serverName == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.serverName, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
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

  private static class TRegionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRegionInfoStandardScheme getScheme() {
      return new TRegionInfoStandardScheme();
    }
  }

  private static class TRegionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRegionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startKey = iprot.readBinary();
              struct.setStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endKey = iprot.readBinary();
              struct.setEndKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readBinary();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.version = iprot.readByte();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverName = iprot.readBinary();
              struct.setServerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRegionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startKey != null) {
        oprot.writeFieldBegin(START_KEY_FIELD_DESC);
        oprot.writeBinary(struct.startKey);
        oprot.writeFieldEnd();
      }
      if (struct.endKey != null) {
        oprot.writeFieldBegin(END_KEY_FIELD_DESC);
        oprot.writeBinary(struct.endKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeBinary(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeByte(struct.version);
      oprot.writeFieldEnd();
      if (struct.serverName != null) {
        oprot.writeFieldBegin(SERVER_NAME_FIELD_DESC);
        oprot.writeBinary(struct.serverName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRegionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRegionInfoTupleScheme getScheme() {
      return new TRegionInfoTupleScheme();
    }
  }

  private static class TRegionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRegionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartKey()) {
        optionals.set(0);
      }
      if (struct.isSetEndKey()) {
        optionals.set(1);
      }
      if (struct.isSetId()) {
        optionals.set(2);
      }
      if (struct.isSetName()) {
        optionals.set(3);
      }
      if (struct.isSetVersion()) {
        optionals.set(4);
      }
      if (struct.isSetServerName()) {
        optionals.set(5);
      }
      if (struct.isSetPort()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetStartKey()) {
        oprot.writeBinary(struct.startKey);
      }
      if (struct.isSetEndKey()) {
        oprot.writeBinary(struct.endKey);
      }
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeBinary(struct.name);
      }
      if (struct.isSetVersion()) {
        oprot.writeByte(struct.version);
      }
      if (struct.isSetServerName()) {
        oprot.writeBinary(struct.serverName);
      }
      if (struct.isSetPort()) {
        oprot.writeI32(struct.port);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.startKey = iprot.readBinary();
        struct.setStartKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endKey = iprot.readBinary();
        struct.setEndKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.name = iprot.readBinary();
        struct.setNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.version = iprot.readByte();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.serverName = iprot.readBinary();
        struct.setServerNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.port = iprot.readI32();
        struct.setPortIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

