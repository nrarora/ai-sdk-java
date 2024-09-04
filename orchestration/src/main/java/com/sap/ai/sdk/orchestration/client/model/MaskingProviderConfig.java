/*
 * Internal Orchestration Service API
 * SAP AI Core - Orchestration Service API
 *
 * The version of the OpenAPI document: 0.0.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** MaskingProviderConfig */
// CHECKSTYLE:OFF
public class MaskingProviderConfig
// CHECKSTYLE:ON
{
  /** Type of masking service provider */
  public enum TypeEnum {
    /** The SAP_DATA_PRIVACY_INTEGRATION option of this MaskingProviderConfig */
    SAP_DATA_PRIVACY_INTEGRATION("sap_data_privacy_integration");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * Get the value of the enum
     *
     * @return The enum value
     */
    @JsonValue
    @Nonnull
    public String getValue() {
      return value;
    }

    /**
     * Get the String value of the enum value.
     *
     * @return The enum value as String
     */
    @Override
    @Nonnull
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * Get the enum value from a String value
     *
     * @param value The String value
     * @return The enum value of type MaskingProviderConfig
     */
    @JsonCreator
    @Nonnull
    public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /** Type of masking method to be used */
  public enum MethodEnum {
    /** The ANONYMIZATION option of this MaskingProviderConfig */
    ANONYMIZATION("anonymization"),

    /** The PSEUDONYMIZATION option of this MaskingProviderConfig */
    PSEUDONYMIZATION("pseudonymization");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    /**
     * Get the value of the enum
     *
     * @return The enum value
     */
    @JsonValue
    @Nonnull
    public String getValue() {
      return value;
    }

    /**
     * Get the String value of the enum value.
     *
     * @return The enum value as String
     */
    @Override
    @Nonnull
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * Get the enum value from a String value
     *
     * @param value The String value
     * @return The enum value of type MaskingProviderConfig
     */
    @JsonCreator
    @Nonnull
    public static MethodEnum fromValue(@Nonnull final String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("method")
  private MethodEnum method;

  @JsonProperty("entities")
  private List<DPIEntityConfig> entities = new ArrayList<>();

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  protected MaskingProviderConfig() {}

  /**
   * Set the type of this {@link MaskingProviderConfig} instance and return the same instance.
   *
   * @param type Type of masking service provider
   * @return The same instance of this {@link MaskingProviderConfig} class
   */
  @Nonnull
  public MaskingProviderConfig type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of masking service provider
   *
   * @return type The type of this {@link MaskingProviderConfig} instance.
   */
  @Nonnull
  public TypeEnum getType() {
    return type;
  }

  /**
   * Set the type of this {@link MaskingProviderConfig} instance.
   *
   * @param type Type of masking service provider
   */
  public void setType(@Nonnull final TypeEnum type) {
    this.type = type;
  }

  /**
   * Set the method of this {@link MaskingProviderConfig} instance and return the same instance.
   *
   * @param method Type of masking method to be used
   * @return The same instance of this {@link MaskingProviderConfig} class
   */
  @Nonnull
  public MaskingProviderConfig method(@Nonnull final MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Type of masking method to be used
   *
   * @return method The method of this {@link MaskingProviderConfig} instance.
   */
  @Nonnull
  public MethodEnum getMethod() {
    return method;
  }

  /**
   * Set the method of this {@link MaskingProviderConfig} instance.
   *
   * @param method Type of masking method to be used
   */
  public void setMethod(@Nonnull final MethodEnum method) {
    this.method = method;
  }

  /**
   * Set the entities of this {@link MaskingProviderConfig} instance and return the same instance.
   *
   * @param entities List of entities to be masked
   * @return The same instance of this {@link MaskingProviderConfig} class
   */
  @Nonnull
  public MaskingProviderConfig entities(@Nonnull final List<DPIEntityConfig> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Add one entities instance to this {@link MaskingProviderConfig}.
   *
   * @param entitiesItem The entities that should be added
   * @return The same instance of type {@link MaskingProviderConfig}
   */
  @Nonnull
  public MaskingProviderConfig addEntitiesItem(@Nonnull final DPIEntityConfig entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * List of entities to be masked
   *
   * @return entities The entities of this {@link MaskingProviderConfig} instance.
   */
  @Nonnull
  public List<DPIEntityConfig> getEntities() {
    return entities;
  }

  /**
   * Set the entities of this {@link MaskingProviderConfig} instance.
   *
   * @param entities List of entities to be masked
   */
  public void setEntities(@Nonnull final List<DPIEntityConfig> entities) {
    this.entities = entities;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link MaskingProviderConfig}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link MaskingProviderConfig} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "MaskingProviderConfig has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link MaskingProviderConfig} instance. If the map
   * previously contained a mapping for the key, the old value is replaced by the specified value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final MaskingProviderConfig maskingProviderConfig = (MaskingProviderConfig) o;
    return Objects.equals(this.cloudSdkCustomFields, maskingProviderConfig.cloudSdkCustomFields)
        && Objects.equals(this.type, maskingProviderConfig.type)
        && Objects.equals(this.method, maskingProviderConfig.method)
        && Objects.equals(this.entities, maskingProviderConfig.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, method, entities, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class MaskingProviderConfig {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Create a type-safe, fluent-api builder object to construct a new {@link MaskingProviderConfig}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (type) ->
        (method) ->
            (entities) -> new MaskingProviderConfig().type(type).method(method).entities(entities);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the type of this {@link MaskingProviderConfig} instance.
     *
     * @param type Type of masking service provider
     * @return The MaskingProviderConfig builder.
     */
    Builder1 type(@Nonnull final TypeEnum type);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the method of this {@link MaskingProviderConfig} instance.
     *
     * @param method Type of masking method to be used
     * @return The MaskingProviderConfig builder.
     */
    Builder2 method(@Nonnull final MethodEnum method);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the entities of this {@link MaskingProviderConfig} instance.
     *
     * @param entities List of entities to be masked
     * @return The MaskingProviderConfig instance.
     */
    MaskingProviderConfig entities(@Nonnull final List<DPIEntityConfig> entities);

    /**
     * Set the entities of this {@link MaskingProviderConfig} instance.
     *
     * @param entities List of entities to be masked
     * @return The MaskingProviderConfig instance.
     */
    default MaskingProviderConfig entities(@Nonnull final DPIEntityConfig... entities) {
      return entities(Arrays.asList(entities));
    }
  }
}