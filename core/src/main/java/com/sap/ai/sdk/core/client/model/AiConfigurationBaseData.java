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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** AiConfigurationBaseData */
// CHECKSTYLE:OFF
public class AiConfigurationBaseData
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("executableId")
  private String executableId;

  @JsonProperty("scenarioId")
  private String scenarioId;

  @JsonProperty("parameterBindings")
  private List<AiParameterArgumentBinding> parameterBindings = new ArrayList<>();

  @JsonProperty("inputArtifactBindings")
  private List<AiArtifactArgumentBinding> inputArtifactBindings = new ArrayList<>();

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  protected AiConfigurationBaseData() {}

  /**
   * Set the name of this {@link AiConfigurationBaseData} instance and return the same instance.
   *
   * @param name Name of the configuration
   * @return The same instance of this {@link AiConfigurationBaseData} class
   */
  @Nonnull
  public AiConfigurationBaseData name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the configuration
   *
   * @return name The name of this {@link AiConfigurationBaseData} instance.
   */
  @Nonnull
  public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link AiConfigurationBaseData} instance.
   *
   * @param name Name of the configuration
   */
  public void setName(@Nonnull final String name) {
    this.name = name;
  }

  /**
   * Set the executableId of this {@link AiConfigurationBaseData} instance and return the same
   * instance.
   *
   * @param executableId ID of the executable
   * @return The same instance of this {@link AiConfigurationBaseData} class
   */
  @Nonnull
  public AiConfigurationBaseData executableId(@Nonnull final String executableId) {
    this.executableId = executableId;
    return this;
  }

  /**
   * ID of the executable
   *
   * @return executableId The executableId of this {@link AiConfigurationBaseData} instance.
   */
  @Nonnull
  public String getExecutableId() {
    return executableId;
  }

  /**
   * Set the executableId of this {@link AiConfigurationBaseData} instance.
   *
   * @param executableId ID of the executable
   */
  public void setExecutableId(@Nonnull final String executableId) {
    this.executableId = executableId;
  }

  /**
   * Set the scenarioId of this {@link AiConfigurationBaseData} instance and return the same
   * instance.
   *
   * @param scenarioId ID of the scenario
   * @return The same instance of this {@link AiConfigurationBaseData} class
   */
  @Nonnull
  public AiConfigurationBaseData scenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * ID of the scenario
   *
   * @return scenarioId The scenarioId of this {@link AiConfigurationBaseData} instance.
   */
  @Nonnull
  public String getScenarioId() {
    return scenarioId;
  }

  /**
   * Set the scenarioId of this {@link AiConfigurationBaseData} instance.
   *
   * @param scenarioId ID of the scenario
   */
  public void setScenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
  }

  /**
   * Set the parameterBindings of this {@link AiConfigurationBaseData} instance and return the same
   * instance.
   *
   * @param parameterBindings The parameterBindings of this {@link AiConfigurationBaseData}
   * @return The same instance of this {@link AiConfigurationBaseData} class
   */
  @Nonnull
  public AiConfigurationBaseData parameterBindings(
      @Nonnull final List<AiParameterArgumentBinding> parameterBindings) {
    this.parameterBindings = parameterBindings;
    return this;
  }

  /**
   * Add one parameterBindings instance to this {@link AiConfigurationBaseData}.
   *
   * @param parameterBindingsItem The parameterBindings that should be added
   * @return The same instance of type {@link AiConfigurationBaseData}
   */
  @Nonnull
  public AiConfigurationBaseData addParameterBindingsItem(
      @Nonnull final AiParameterArgumentBinding parameterBindingsItem) {
    if (this.parameterBindings == null) {
      this.parameterBindings = new ArrayList<>();
    }
    this.parameterBindings.add(parameterBindingsItem);
    return this;
  }

  /**
   * Get parameterBindings
   *
   * @return parameterBindings The parameterBindings of this {@link AiConfigurationBaseData}
   *     instance.
   */
  @Nonnull
  public List<AiParameterArgumentBinding> getParameterBindings() {
    return parameterBindings;
  }

  /**
   * Set the parameterBindings of this {@link AiConfigurationBaseData} instance.
   *
   * @param parameterBindings The parameterBindings of this {@link AiConfigurationBaseData}
   */
  public void setParameterBindings(
      @Nonnull final List<AiParameterArgumentBinding> parameterBindings) {
    this.parameterBindings = parameterBindings;
  }

  /**
   * Set the inputArtifactBindings of this {@link AiConfigurationBaseData} instance and return the
   * same instance.
   *
   * @param inputArtifactBindings The inputArtifactBindings of this {@link AiConfigurationBaseData}
   * @return The same instance of this {@link AiConfigurationBaseData} class
   */
  @Nonnull
  public AiConfigurationBaseData inputArtifactBindings(
      @Nonnull final List<AiArtifactArgumentBinding> inputArtifactBindings) {
    this.inputArtifactBindings = inputArtifactBindings;
    return this;
  }

  /**
   * Add one inputArtifactBindings instance to this {@link AiConfigurationBaseData}.
   *
   * @param inputArtifactBindingsItem The inputArtifactBindings that should be added
   * @return The same instance of type {@link AiConfigurationBaseData}
   */
  @Nonnull
  public AiConfigurationBaseData addInputArtifactBindingsItem(
      @Nonnull final AiArtifactArgumentBinding inputArtifactBindingsItem) {
    if (this.inputArtifactBindings == null) {
      this.inputArtifactBindings = new ArrayList<>();
    }
    this.inputArtifactBindings.add(inputArtifactBindingsItem);
    return this;
  }

  /**
   * Get inputArtifactBindings
   *
   * @return inputArtifactBindings The inputArtifactBindings of this {@link AiConfigurationBaseData}
   *     instance.
   */
  @Nonnull
  public List<AiArtifactArgumentBinding> getInputArtifactBindings() {
    return inputArtifactBindings;
  }

  /**
   * Set the inputArtifactBindings of this {@link AiConfigurationBaseData} instance.
   *
   * @param inputArtifactBindings The inputArtifactBindings of this {@link AiConfigurationBaseData}
   */
  public void setInputArtifactBindings(
      @Nonnull final List<AiArtifactArgumentBinding> inputArtifactBindings) {
    this.inputArtifactBindings = inputArtifactBindings;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AiConfigurationBaseData}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AiConfigurationBaseData} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "AiConfigurationBaseData has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link AiConfigurationBaseData} instance. If the map
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
    final AiConfigurationBaseData aiConfigurationBaseData = (AiConfigurationBaseData) o;
    return Objects.equals(this.cloudSdkCustomFields, aiConfigurationBaseData.cloudSdkCustomFields)
        && Objects.equals(this.name, aiConfigurationBaseData.name)
        && Objects.equals(this.executableId, aiConfigurationBaseData.executableId)
        && Objects.equals(this.scenarioId, aiConfigurationBaseData.scenarioId)
        && Objects.equals(this.parameterBindings, aiConfigurationBaseData.parameterBindings)
        && Objects.equals(
            this.inputArtifactBindings, aiConfigurationBaseData.inputArtifactBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        executableId,
        scenarioId,
        parameterBindings,
        inputArtifactBindings,
        cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AiConfigurationBaseData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executableId: ").append(toIndentedString(executableId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    parameterBindings: ").append(toIndentedString(parameterBindings)).append("\n");
    sb.append("    inputArtifactBindings: ")
        .append(toIndentedString(inputArtifactBindings))
        .append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link
   * AiConfigurationBaseData} instance with all required arguments.
   */
  public static Builder create() {
    return (name) ->
        (executableId) ->
            (scenarioId) ->
                new AiConfigurationBaseData()
                    .name(name)
                    .executableId(executableId)
                    .scenarioId(scenarioId);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the name of this {@link AiConfigurationBaseData} instance.
     *
     * @param name Name of the configuration
     * @return The AiConfigurationBaseData builder.
     */
    Builder1 name(@Nonnull final String name);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the executableId of this {@link AiConfigurationBaseData} instance.
     *
     * @param executableId ID of the executable
     * @return The AiConfigurationBaseData builder.
     */
    Builder2 executableId(@Nonnull final String executableId);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the scenarioId of this {@link AiConfigurationBaseData} instance.
     *
     * @param scenarioId ID of the scenario
     * @return The AiConfigurationBaseData instance.
     */
    AiConfigurationBaseData scenarioId(@Nonnull final String scenarioId);
  }
}
