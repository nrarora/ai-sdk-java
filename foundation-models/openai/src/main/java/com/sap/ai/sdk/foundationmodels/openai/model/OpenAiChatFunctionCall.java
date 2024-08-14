package com.sap.ai.sdk.foundationmodels.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Nonnull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/** The name of the function to call, or, the function that the model called. */
@Accessors(chain = true)
@EqualsAndHashCode
@ToString
public class OpenAiChatFunctionCall {
  /** Name of the function call. */
  @JsonProperty("name")
  @Getter(onMethod_ = @Nonnull)
  @Setter(onParam_ = @Nonnull)
  private String name;

  /**
   * The arguments to call the function with, as generated by the model in JSON format. Note that
   * the model does not always generate valid JSON, and may hallucinate parameters not defined by
   * your function schema. Validate the arguments in your code before calling your function.
   */
  @JsonProperty("arguments")
  @Getter(onMethod_ = @Nonnull)
  @Setter(onParam_ = @Nonnull)
  private String arguments;
}