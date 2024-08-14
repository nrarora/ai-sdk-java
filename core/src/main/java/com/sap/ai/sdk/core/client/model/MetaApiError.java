

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
 * MetaApiError
 */
// CHECKSTYLE:OFF
public class MetaApiError 
// CHECKSTYLE:ON
{
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("requestId")
  private String requestId;

  @JsonProperty("target")
  private String target;

  @JsonProperty("details")
  private Object details;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();
  protected MetaApiError() {  }

   /**
    * Set the code of this {@link MetaApiError} instance and return the same instance.
    *
    * @param code  Descriptive error code (not http status code)
    * @return The same instance of this {@link MetaApiError} class
    */
   @Nonnull public MetaApiError code(@Nonnull final String code) {
    this.code = code;
    return this;
  }

   /**
    * Descriptive error code (not http status code)
    * @return code  The code of this {@link MetaApiError} instance.
    */
  @Nonnull public String getCode() {
    return code;
  }

  /**
   * Set the code of this {@link MetaApiError} instance.
   *
   * @param code  Descriptive error code (not http status code)
   */
  public void setCode( @Nonnull final String code) {
    this.code = code;
  }

   /**
    * Set the message of this {@link MetaApiError} instance and return the same instance.
    *
    * @param message  Plaintext error description
    * @return The same instance of this {@link MetaApiError} class
    */
   @Nonnull public MetaApiError message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

   /**
    * Plaintext error description
    * @return message  The message of this {@link MetaApiError} instance.
    */
  @Nonnull public String getMessage() {
    return message;
  }

  /**
   * Set the message of this {@link MetaApiError} instance.
   *
   * @param message  Plaintext error description
   */
  public void setMessage( @Nonnull final String message) {
    this.message = message;
  }

   /**
    * Set the requestId of this {@link MetaApiError} instance and return the same instance.
    *
    * @param requestId  ID of the individual request
    * @return The same instance of this {@link MetaApiError} class
    */
   @Nonnull public MetaApiError requestId(@Nonnull final String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
    * ID of the individual request
    * @return requestId  The requestId of this {@link MetaApiError} instance.
    */
  @Nonnull public String getRequestId() {
    return requestId;
  }

  /**
   * Set the requestId of this {@link MetaApiError} instance.
   *
   * @param requestId  ID of the individual request
   */
  public void setRequestId( @Nonnull final String requestId) {
    this.requestId = requestId;
  }

   /**
    * Set the target of this {@link MetaApiError} instance and return the same instance.
    *
    * @param target  Invoked URL
    * @return The same instance of this {@link MetaApiError} class
    */
   @Nonnull public MetaApiError target(@Nonnull final String target) {
    this.target = target;
    return this;
  }

   /**
    * Invoked URL
    * @return target  The target of this {@link MetaApiError} instance.
    */
  @Nonnull public String getTarget() {
    return target;
  }

  /**
   * Set the target of this {@link MetaApiError} instance.
   *
   * @param target  Invoked URL
   */
  public void setTarget( @Nonnull final String target) {
    this.target = target;
  }

   /**
    * Set the details of this {@link MetaApiError} instance and return the same instance.
    *
    * @param details  Optional details of the error message
    * @return The same instance of this {@link MetaApiError} class
    */
   @Nonnull public MetaApiError details(@Nonnull final Object details) {
    this.details = details;
    return this;
  }

   /**
    * Optional details of the error message
    * @return details  The details of this {@link MetaApiError} instance.
    */
  @Nonnull public Object getDetails() {
    return details;
  }

  /**
   * Set the details of this {@link MetaApiError} instance.
   *
   * @param details  Optional details of the error message
   */
  public void setDetails( @Nonnull final Object details) {
    this.details = details;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link MetaApiError}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link MetaApiError} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("MetaApiError has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link MetaApiError} instance. If the map previously contained a mapping
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
    final MetaApiError metaApiError = (MetaApiError) o;
    return Objects.equals(this.cloudSdkCustomFields, metaApiError.cloudSdkCustomFields) &&
        Objects.equals(this.code, metaApiError.code) &&
        Objects.equals(this.message, metaApiError.message) &&
        Objects.equals(this.requestId, metaApiError.requestId) &&
        Objects.equals(this.target, metaApiError.target) &&
        Objects.equals(this.details, metaApiError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, requestId, target, details, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class MetaApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    * Create a type-safe, fluent-api builder object to construct a new {@link MetaApiError} instance with all required arguments.
    */
    public static Builder create() {
        return (code) -> (message) -> new MetaApiError().code(code).message(message);
    }
    /**
    * Builder helper class.
    */
    public interface Builder {
        /**
        * Set the code of this {@link MetaApiError} instance.
        *
        * @param code  Descriptive error code (not http status code)
        * @return The MetaApiError builder.
        */
        Builder1 code( @Nonnull final String code);
    }
    /**
    * Builder helper class.
    */
    public interface Builder1 {
        /**
        * Set the message of this {@link MetaApiError} instance.
        *
        * @param message  Plaintext error description
        * @return The MetaApiError instance.
        */
        MetaApiError message( @Nonnull final String message);
    }

}
