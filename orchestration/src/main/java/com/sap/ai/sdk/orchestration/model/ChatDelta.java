/*
 * Orchestration
 * Orchestration is an inference service which provides common additional capabilities for business AI scenarios, such as content filtering and data masking. At the core of the service is the LLM module which allows for an easy, harmonized access to the language models of gen AI hub. The service is designed to be modular and extensible, allowing for the addition of new modules in the future. Each module can be configured independently and at runtime, allowing for a high degree of flexibility in the orchestration of AI services.
 *
 * The version of the OpenAPI document: 0.29.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** ChatDelta */
@Beta // CHECKSTYLE:OFF
public class ChatDelta
// CHECKSTYLE:ON
{
  @JsonProperty("role")
  private String role;

  @JsonProperty("content")
  private String content = "";

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for ChatDelta. */
  protected ChatDelta() {}

  /**
   * Set the role of this {@link ChatDelta} instance and return the same instance.
   *
   * @param role The role of this {@link ChatDelta}
   * @return The same instance of this {@link ChatDelta} class
   */
  @Nonnull
  public ChatDelta role(@Nullable final String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   *
   * @return role The role of this {@link ChatDelta} instance.
   */
  @Nonnull
  public String getRole() {
    return role;
  }

  /**
   * Set the role of this {@link ChatDelta} instance.
   *
   * @param role The role of this {@link ChatDelta}
   */
  public void setRole(@Nullable final String role) {
    this.role = role;
  }

  /**
   * Set the content of this {@link ChatDelta} instance and return the same instance.
   *
   * @param content The content of this {@link ChatDelta}
   * @return The same instance of this {@link ChatDelta} class
   */
  @Nonnull
  public ChatDelta content(@Nonnull final String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content The content of this {@link ChatDelta} instance.
   */
  @Nonnull
  public String getContent() {
    return content;
  }

  /**
   * Set the content of this {@link ChatDelta} instance.
   *
   * @param content The content of this {@link ChatDelta}
   */
  public void setContent(@Nonnull final String content) {
    this.content = content;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ChatDelta}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ChatDelta} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException("ChatDelta has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ChatDelta} instance. If the map previously
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
    final ChatDelta chatDelta = (ChatDelta) o;
    return Objects.equals(this.cloudSdkCustomFields, chatDelta.cloudSdkCustomFields)
        && Objects.equals(this.role, chatDelta.role)
        && Objects.equals(this.content, chatDelta.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ChatDelta {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link ChatDelta} instance
   * with all required arguments.
   */
  public static Builder create() {
    return (content) -> new ChatDelta().content(content);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the content of this {@link ChatDelta} instance.
     *
     * @param content The content of this {@link ChatDelta}
     * @return The ChatDelta instance.
     */
    ChatDelta content(@Nonnull final String content);
  }
}
