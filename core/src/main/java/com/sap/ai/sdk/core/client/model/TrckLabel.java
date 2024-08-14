

/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models. 
 *
 * The version of the OpenAPI document: 2.33.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.client.model;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * a classifying phrase/name applied to a metric
 */
// CHECKSTYLE:OFF
public class TrckLabel 
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();
  protected TrckLabel() {  }

   /**
    * Set the name of this {@link TrckLabel} instance and return the same instance.
    *
    * @param name  Label name to label one or more metrics. \&quot;metrics.ai.sap.com/Artifact.name\&quot; is a reserved label to associate an artifact with the metrics
    * @return The same instance of this {@link TrckLabel} class
    */
   @Nonnull public TrckLabel name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
    * Label name to label one or more metrics. \&quot;metrics.ai.sap.com/Artifact.name\&quot; is a reserved label to associate an artifact with the metrics
    * @return name  The name of this {@link TrckLabel} instance.
    */
  @Nonnull public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link TrckLabel} instance.
   *
   * @param name  Label name to label one or more metrics. \&quot;metrics.ai.sap.com/Artifact.name\&quot; is a reserved label to associate an artifact with the metrics
   */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
    * Set the value of this {@link TrckLabel} instance and return the same instance.
    *
    * @param value  Metric Label Value
    * @return The same instance of this {@link TrckLabel} class
    */
   @Nonnull public TrckLabel value(@Nonnull final String value) {
    this.value = value;
    return this;
  }

   /**
    * Metric Label Value
    * @return value  The value of this {@link TrckLabel} instance.
    */
  @Nonnull public String getValue() {
    return value;
  }

  /**
   * Set the value of this {@link TrckLabel} instance.
   *
   * @param value  Metric Label Value
   */
  public void setValue( @Nonnull final String value) {
    this.value = value;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TrckLabel}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TrckLabel} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TrckLabel has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TrckLabel} instance. If the map previously contained a mapping
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
    final TrckLabel trckLabel = (TrckLabel) o;
    return Objects.equals(this.cloudSdkCustomFields, trckLabel.cloudSdkCustomFields) &&
        Objects.equals(this.name, trckLabel.name) &&
        Objects.equals(this.value, trckLabel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TrckLabel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    * Create a type-safe, fluent-api builder object to construct a new {@link TrckLabel} instance with all required arguments.
    */
    public static Builder create() {
        return (name) -> (value) -> new TrckLabel().name(name).value(value);
    }
    /**
    * Builder helper class.
    */
    public interface Builder {
        /**
        * Set the name of this {@link TrckLabel} instance.
        *
        * @param name  Label name to label one or more metrics. \&quot;metrics.ai.sap.com/Artifact.name\&quot; is a reserved label to associate an artifact with the metrics
        * @return The TrckLabel builder.
        */
        Builder1 name( @Nonnull final String name);
    }
    /**
    * Builder helper class.
    */
    public interface Builder1 {
        /**
        * Set the value of this {@link TrckLabel} instance.
        *
        * @param value  Metric Label Value
        * @return The TrckLabel instance.
        */
        TrckLabel value( @Nonnull final String value);
    }

}
