/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models.
 *
 * The version of the OpenAPI document: 2.35.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** BckndGenericSecretDetails */
// CHECKSTYLE:OFF
public class BckndGenericSecretDetails
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  protected BckndGenericSecretDetails() {}

  /**
   * Set the name of this {@link BckndGenericSecretDetails} instance and return the same instance.
   *
   * @param name Name of the secret
   * @return The same instance of this {@link BckndGenericSecretDetails} class
   */
  @Nonnull
  public BckndGenericSecretDetails name(@Nullable final String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the secret
   *
   * @return name The name of this {@link BckndGenericSecretDetails} instance.
   */
  @Nonnull
  public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link BckndGenericSecretDetails} instance.
   *
   * @param name Name of the secret
   */
  public void setName(@Nullable final String name) {
    this.name = name;
  }

  /**
   * Set the createdAt of this {@link BckndGenericSecretDetails} instance and return the same
   * instance.
   *
   * @param createdAt Timestamp at which secret was created
   * @return The same instance of this {@link BckndGenericSecretDetails} class
   */
  @Nonnull
  public BckndGenericSecretDetails createdAt(@Nullable final String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp at which secret was created
   *
   * @return createdAt The createdAt of this {@link BckndGenericSecretDetails} instance.
   */
  @Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Set the createdAt of this {@link BckndGenericSecretDetails} instance.
   *
   * @param createdAt Timestamp at which secret was created
   */
  public void setCreatedAt(@Nullable final String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndGenericSecretDetails}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndGenericSecretDetails} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "BckndGenericSecretDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link BckndGenericSecretDetails} instance. If the map
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
    final BckndGenericSecretDetails bckndGenericSecretDetails = (BckndGenericSecretDetails) o;
    return Objects.equals(this.cloudSdkCustomFields, bckndGenericSecretDetails.cloudSdkCustomFields)
        && Objects.equals(this.name, bckndGenericSecretDetails.name)
        && Objects.equals(this.createdAt, bckndGenericSecretDetails.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndGenericSecretDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  /** Create a new {@link BckndGenericSecretDetails} instance. No arguments are required. */
  public static BckndGenericSecretDetails create() {
    return new BckndGenericSecretDetails();
  }
}
