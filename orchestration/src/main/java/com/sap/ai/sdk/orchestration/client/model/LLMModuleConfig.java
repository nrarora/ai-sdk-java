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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** LLMModuleConfig */
// CHECKSTYLE:OFF
public class LLMModuleConfig
// CHECKSTYLE:ON
{
  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("model_params")
  private Object modelParams;

  @JsonProperty("model_version")
  private String modelVersion = "latest";

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  protected LLMModuleConfig() {}

  /**
   * Set the modelName of this {@link LLMModuleConfig} instance and return the same instance.
   *
   * @param modelName Model name as in LLM Access configuration
   * @return The same instance of this {@link LLMModuleConfig} class
   */
  @Nonnull
  public LLMModuleConfig modelName(@Nonnull final String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Model name as in LLM Access configuration
   *
   * @return modelName The modelName of this {@link LLMModuleConfig} instance.
   */
  @Nonnull
  public String getModelName() {
    return modelName;
  }

  /**
   * Set the modelName of this {@link LLMModuleConfig} instance.
   *
   * @param modelName Model name as in LLM Access configuration
   */
  public void setModelName(@Nonnull final String modelName) {
    this.modelName = modelName;
  }

  /**
   * Set the modelParams of this {@link LLMModuleConfig} instance and return the same instance.
   *
   * @param modelParams Model parameters
   * @return The same instance of this {@link LLMModuleConfig} class
   */
  @Nonnull
  public LLMModuleConfig modelParams(@Nonnull final Object modelParams) {
    this.modelParams = modelParams;
    return this;
  }

  /**
   * Model parameters
   *
   * @return modelParams The modelParams of this {@link LLMModuleConfig} instance.
   */
  @Nonnull
  public Object getModelParams() {
    return modelParams;
  }

  /**
   * Set the modelParams of this {@link LLMModuleConfig} instance.
   *
   * @param modelParams Model parameters
   */
  public void setModelParams(@Nonnull final Object modelParams) {
    this.modelParams = modelParams;
  }

  /**
   * Set the modelVersion of this {@link LLMModuleConfig} instance and return the same instance.
   *
   * @param modelVersion Version of the model to use
   * @return The same instance of this {@link LLMModuleConfig} class
   */
  @Nonnull
  public LLMModuleConfig modelVersion(@Nonnull final String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * Version of the model to use
   *
   * @return modelVersion The modelVersion of this {@link LLMModuleConfig} instance.
   */
  @Nonnull
  public String getModelVersion() {
    return modelVersion;
  }

  /**
   * Set the modelVersion of this {@link LLMModuleConfig} instance.
   *
   * @param modelVersion Version of the model to use
   */
  public void setModelVersion(@Nonnull final String modelVersion) {
    this.modelVersion = modelVersion;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link LLMModuleConfig}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link LLMModuleConfig} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException("LLMModuleConfig has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link LLMModuleConfig} instance. If the map previously
   * contained a mapping for the key, the old value is replaced by the specified value.
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
    final LLMModuleConfig llMModuleConfig = (LLMModuleConfig) o;
    return Objects.equals(this.cloudSdkCustomFields, llMModuleConfig.cloudSdkCustomFields)
        && Objects.equals(this.modelName, llMModuleConfig.modelName)
        && Objects.equals(this.modelParams, llMModuleConfig.modelParams)
        && Objects.equals(this.modelVersion, llMModuleConfig.modelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelParams, modelVersion, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class LLMModuleConfig {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelParams: ").append(toIndentedString(modelParams)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link LLMModuleConfig}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (modelName) ->
        (modelParams) -> new LLMModuleConfig().modelName(modelName).modelParams(modelParams);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the modelName of this {@link LLMModuleConfig} instance.
     *
     * @param modelName Model name as in LLM Access configuration
     * @return The LLMModuleConfig builder.
     */
    Builder1 modelName(@Nonnull final String modelName);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the modelParams of this {@link LLMModuleConfig} instance.
     *
     * @param modelParams Model parameters
     * @return The LLMModuleConfig instance.
     */
    LLMModuleConfig modelParams(@Nonnull final Object modelParams);
  }
}
