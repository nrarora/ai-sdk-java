package com.sap.ai.sdk.app.controllers;

import com.sap.ai.sdk.core.client.ScenarioApi;
import com.sap.ai.sdk.core.model.AiModelList;
import com.sap.ai.sdk.core.model.AiScenarioList;
import javax.annotation.Nonnull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Endpoint for Scenario operations */
@RestController
@SuppressWarnings("unused") // debug method that doesn't need to be tested
public class ScenarioController {

  private static final ScenarioApi CLIENT = new ScenarioApi();

  /**
   * Get the list of available scenarios
   *
   * @return the list of available scenarios
   */
  @GetMapping("/scenarios")
  @Nonnull
  AiScenarioList getScenarios() {
    return CLIENT.query("default");
  }

  /**
   * Get the list of available models
   *
   * @return the list of available models
   */
  @GetMapping("/models")
  @Nonnull
  public AiModelList getModels() {
    return CLIENT.queryModels("foundation-models", "default");
  }
}
