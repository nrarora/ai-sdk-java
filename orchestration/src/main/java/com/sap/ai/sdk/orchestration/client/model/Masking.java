

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

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sap.ai.sdk.orchestration.client.model.MaskingEntitiesInner;
import com.sap.ai.sdk.orchestration.client.model.MaskingProviderType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Masking
 */
// CHECKSTYLE:OFF
public class Masking 
// CHECKSTYLE:ON
{
  @JsonProperty("type")
  private MaskingProviderType type;

  @JsonProperty("entities")
  private List<MaskingEntitiesInner> entities = new ArrayList<>();

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();
  protected Masking() {  }

   /**
    * Set the type of this {@link Masking} instance and return the same instance.
    *
    * @param type  The type of this {@link Masking}
    * @return The same instance of this {@link Masking} class
    */
   @Nonnull public Masking type(@Nonnull final MaskingProviderType type) {
    this.type = type;
    return this;
  }

   /**
    * Get type
    * @return type  The type of this {@link Masking} instance.
    */
  @Nonnull public MaskingProviderType getType() {
    return type;
  }

  /**
   * Set the type of this {@link Masking} instance.
   *
   * @param type  The type of this {@link Masking}
   */
  public void setType( @Nonnull final MaskingProviderType type) {
    this.type = type;
  }

   /**
    * Set the entities of this {@link Masking} instance and return the same instance.
    *
    * @param entities  List of entities to be masked
    * @return The same instance of this {@link Masking} class
    */
   @Nonnull public Masking entities(@Nonnull final List<MaskingEntitiesInner> entities) {
    this.entities = entities;
    return this;
  }
  /**
   * Add one entities instance to this {@link Masking}.
   * @param entitiesItem The entities that should be added
   * @return The same instance of type {@link Masking}
   */
  @Nonnull public Masking addEntitiesItem( @Nonnull final MaskingEntitiesInner entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
    * List of entities to be masked
    * @return entities  The entities of this {@link Masking} instance.
    */
  @Nonnull public List<MaskingEntitiesInner> getEntities() {
    return entities;
  }

  /**
   * Set the entities of this {@link Masking} instance.
   *
   * @param entities  List of entities to be masked
   */
  public void setEntities( @Nonnull final List<MaskingEntitiesInner> entities) {
    this.entities = entities;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Masking}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link Masking} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Masking has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link Masking} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
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
    final Masking masking = (Masking) o;
    return Objects.equals(this.cloudSdkCustomFields, masking.cloudSdkCustomFields) &&
        Objects.equals(this.type, masking.type) &&
        Objects.equals(this.entities, masking.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, entities, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Masking {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

    /**
    * Create a type-safe, fluent-api builder object to construct a new {@link Masking} instance with all required arguments.
    */
    public static Builder create() {
        return (type) -> (entities) -> new Masking().type(type).entities(entities);
    }
    /**
    * Builder helper class.
    */
    public interface Builder {
        /**
        * Set the type of this {@link Masking} instance.
        *
        * @param type  The type of this {@link Masking}
        * @return The Masking builder.
        */
        Builder1 type( @Nonnull final MaskingProviderType type);
    }
    /**
    * Builder helper class.
    */
    public interface Builder1 {
        /**
        * Set the entities of this {@link Masking} instance.
        *
        * @param entities  List of entities to be masked
        * @return The Masking instance.
        */
        Masking entities( @Nonnull final List<MaskingEntitiesInner> entities);
        /**
        * Set the entities of this {@link Masking} instance.
        *
        * @param entities  List of entities to be masked
        * @return The Masking instance.
        */
        default Masking entities( @Nonnull final MaskingEntitiesInner... entities) {
            return entities(Arrays.asList(entities));
        }
    }

}
