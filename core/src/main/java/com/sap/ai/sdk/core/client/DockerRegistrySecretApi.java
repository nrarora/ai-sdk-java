

package com.sap.ai.sdk.core.client;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.ai.sdk.core.client.model.BckndErrorResponse;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretCreationResponse;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretDeletionResponse;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretModificationResponse;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretStatus;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretStatusResponse;
import com.sap.ai.sdk.core.client.model.BcknddockerRegistrySecretWithSensitiveDataRequest;
import com.sap.ai.sdk.core.client.model.KubesubmitV4DockerRegistrySecretsCreateRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.annotations.Beta;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;

/**
 * AI Core in version 2.33.0.
 *
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models. 
 */
public class DockerRegistrySecretApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the AI Core.
     *
     * @param httpDestination The destination that API should be used with
     */
    public DockerRegistrySecretApi( @Nonnull final Destination httpDestination )
    {
        super(httpDestination);
    }

    /**
     * Instantiates this API class to invoke operations on the AI Core based on a given {@link ApiClient}.
     *
     * @param apiClient
     *            ApiClient to invoke the API on
     */
    @Beta
    public DockerRegistrySecretApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Create a secret</p>
     *<p>Create a secret based on the configuration in the request body. </p>
     * <p><b>202</b> - The request to create a k8s secret based on the given configuration has been accepted. 
     * <p><b>400</b> - One of the following failure cases has occurred: &lt;ul&gt; &lt;li&gt; Neither JSON nor YAML was able to be parsed. &lt;li&gt; The request was invalidly formatted 
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param kubesubmitV4DockerRegistrySecretsCreateRequest  (required)
        The value for the parameter kubesubmitV4DockerRegistrySecretsCreateRequest
     * @param authorization  (optional)
        Authorization bearer token containing a JWT token.
     * @return BcknddockerRegistrySecretCreationResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretCreationResponse kubesubmitV4DockerRegistrySecretsCreate( @Nonnull final KubesubmitV4DockerRegistrySecretsCreateRequest kubesubmitV4DockerRegistrySecretsCreateRequest,  @Nullable final String authorization) throws OpenApiRequestException {
        final Object localVarPostBody = kubesubmitV4DockerRegistrySecretsCreateRequest;
        
        // verify the required parameter 'kubesubmitV4DockerRegistrySecretsCreateRequest' is set
        if (kubesubmitV4DockerRegistrySecretsCreateRequest == null) {
            throw new OpenApiRequestException("Missing the required parameter 'kubesubmitV4DockerRegistrySecretsCreateRequest' when calling kubesubmitV4DockerRegistrySecretsCreate");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/admin/dockerRegistrySecrets").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
            localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "Oauth2" };

        final ParameterizedTypeReference<BcknddockerRegistrySecretCreationResponse> localVarReturnType = new ParameterizedTypeReference<BcknddockerRegistrySecretCreationResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Create a secret</p>
     * <p>Create a secret based on the configuration in the request body. </p>
     * <p><b>202</b> - The request to create a k8s secret based on the given configuration has been accepted. 
     * <p><b>400</b> - One of the following failure cases has occurred: &lt;ul&gt; &lt;li&gt; Neither JSON nor YAML was able to be parsed. &lt;li&gt; The request was invalidly formatted 
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param kubesubmitV4DockerRegistrySecretsCreateRequest
     *      The value for the parameter kubesubmitV4DockerRegistrySecretsCreateRequest
     * @return BcknddockerRegistrySecretCreationResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretCreationResponse kubesubmitV4DockerRegistrySecretsCreate( @Nonnull final KubesubmitV4DockerRegistrySecretsCreateRequest kubesubmitV4DockerRegistrySecretsCreateRequest) throws OpenApiRequestException {
        return kubesubmitV4DockerRegistrySecretsCreate(kubesubmitV4DockerRegistrySecretsCreateRequest, null);
    }

    /**
     * <p>Delete docker registry secret</p>
     *<p>Delete a secret with the name of dockerRegistryName if it exists.</p>
     * <p><b>202</b> - The request to delete the secret has been accepted.
     * <p><b>404</b> - The specified resource was not found
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName  (required)
        Name of the docker Registry store for the secret.
     * @param authorization  (optional)
        Authorization bearer token containing a JWT token.
     * @return BcknddockerRegistrySecretDeletionResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretDeletionResponse kubesubmitV4DockerRegistrySecretsDelete( @Nonnull final String dockerRegistryName,  @Nullable final String authorization) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'dockerRegistryName' is set
        if (dockerRegistryName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'dockerRegistryName' when calling kubesubmitV4DockerRegistrySecretsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("dockerRegistryName", dockerRegistryName);
        final String localVarPath = UriComponentsBuilder.fromPath("/admin/dockerRegistrySecrets/{dockerRegistryName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
            localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "Oauth2" };

        final ParameterizedTypeReference<BcknddockerRegistrySecretDeletionResponse> localVarReturnType = new ParameterizedTypeReference<BcknddockerRegistrySecretDeletionResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Delete docker registry secret</p>
     * <p>Delete a secret with the name of dockerRegistryName if it exists.</p>
     * <p><b>202</b> - The request to delete the secret has been accepted.
     * <p><b>404</b> - The specified resource was not found
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName
     *      Name of the docker Registry store for the secret.
     * @return BcknddockerRegistrySecretDeletionResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretDeletionResponse kubesubmitV4DockerRegistrySecretsDelete( @Nonnull final String dockerRegistryName) throws OpenApiRequestException {
        return kubesubmitV4DockerRegistrySecretsDelete(dockerRegistryName, null);
    }

    /**
     * <p>Returns the of metadata of secrets which match the query parameter.</p>
     *<p>Retrieve the stored secret metadata which matches the parameter dockerRegistryName. The base64 encoded field for the stored secret is not returned. </p>
     * <p><b>200</b> - The request was processed successfully and the metadata of the of stored secrets wil be returned.
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>404</b> - The specified resource was not found
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName  (required)
        Name of the docker Registry store for the secret.
     * @param authorization  (optional)
        Authorization bearer token containing a JWT token.
     * @return BcknddockerRegistrySecretStatus
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretStatus kubesubmitV4DockerRegistrySecretsGet( @Nonnull final String dockerRegistryName,  @Nullable final String authorization) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'dockerRegistryName' is set
        if (dockerRegistryName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'dockerRegistryName' when calling kubesubmitV4DockerRegistrySecretsGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("dockerRegistryName", dockerRegistryName);
        final String localVarPath = UriComponentsBuilder.fromPath("/admin/dockerRegistrySecrets/{dockerRegistryName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
            localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "Oauth2" };

        final ParameterizedTypeReference<BcknddockerRegistrySecretStatus> localVarReturnType = new ParameterizedTypeReference<BcknddockerRegistrySecretStatus>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Returns the of metadata of secrets which match the query parameter.</p>
     * <p>Retrieve the stored secret metadata which matches the parameter dockerRegistryName. The base64 encoded field for the stored secret is not returned. </p>
     * <p><b>200</b> - The request was processed successfully and the metadata of the of stored secrets wil be returned.
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>404</b> - The specified resource was not found
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName
     *      Name of the docker Registry store for the secret.
     * @return BcknddockerRegistrySecretStatus
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretStatus kubesubmitV4DockerRegistrySecretsGet( @Nonnull final String dockerRegistryName) throws OpenApiRequestException {
        return kubesubmitV4DockerRegistrySecretsGet(dockerRegistryName, null);
    }

    /**
     * <p>Update a secret</p>
     *<p>Update a secret with name of dockerRegistryName if it exists. </p>
     * <p><b>202</b> - The request to update the secret based on the the given configuration has been accepted. 
     * <p><b>404</b> - The specified resource was not found
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName  (required)
        Name of the docker Registry store for the secret.
     * @param bcknddockerRegistrySecretWithSensitiveDataRequest  (required)
        The value for the parameter bcknddockerRegistrySecretWithSensitiveDataRequest
     * @param authorization  (optional)
        Authorization bearer token containing a JWT token.
     * @return BcknddockerRegistrySecretModificationResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretModificationResponse kubesubmitV4DockerRegistrySecretsPatch( @Nonnull final String dockerRegistryName,  @Nonnull final BcknddockerRegistrySecretWithSensitiveDataRequest bcknddockerRegistrySecretWithSensitiveDataRequest,  @Nullable final String authorization) throws OpenApiRequestException {
        final Object localVarPostBody = bcknddockerRegistrySecretWithSensitiveDataRequest;
        
        // verify the required parameter 'dockerRegistryName' is set
        if (dockerRegistryName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'dockerRegistryName' when calling kubesubmitV4DockerRegistrySecretsPatch");
        }
        
        // verify the required parameter 'bcknddockerRegistrySecretWithSensitiveDataRequest' is set
        if (bcknddockerRegistrySecretWithSensitiveDataRequest == null) {
            throw new OpenApiRequestException("Missing the required parameter 'bcknddockerRegistrySecretWithSensitiveDataRequest' when calling kubesubmitV4DockerRegistrySecretsPatch");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("dockerRegistryName", dockerRegistryName);
        final String localVarPath = UriComponentsBuilder.fromPath("/admin/dockerRegistrySecrets/{dockerRegistryName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
            localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/merge-patch+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "Oauth2" };

        final ParameterizedTypeReference<BcknddockerRegistrySecretModificationResponse> localVarReturnType = new ParameterizedTypeReference<BcknddockerRegistrySecretModificationResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Update a secret</p>
     * <p>Update a secret with name of dockerRegistryName if it exists. </p>
     * <p><b>202</b> - The request to update the secret based on the the given configuration has been accepted. 
     * <p><b>404</b> - The specified resource was not found
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param dockerRegistryName
     *      Name of the docker Registry store for the secret.
     * @param bcknddockerRegistrySecretWithSensitiveDataRequest
     *      The value for the parameter bcknddockerRegistrySecretWithSensitiveDataRequest
     * @return BcknddockerRegistrySecretModificationResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretModificationResponse kubesubmitV4DockerRegistrySecretsPatch( @Nonnull final String dockerRegistryName,  @Nonnull final BcknddockerRegistrySecretWithSensitiveDataRequest bcknddockerRegistrySecretWithSensitiveDataRequest) throws OpenApiRequestException {
        return kubesubmitV4DockerRegistrySecretsPatch(dockerRegistryName, bcknddockerRegistrySecretWithSensitiveDataRequest, null);
    }

    /**
     * <p>Get a list of metadata of secrets.</p>
     *<p>Retrieve a list of metadata of the stored secrets </p>
     * <p><b>200</b> - The request was successful and the requested metadata for the secret will be returned. This includes a list of attributes of the stored secret like - creationTimestamp, namespace etc. The secret&#39;s data field is not returned.
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @param $top  (optional)
        Number of results to display
     * @param $skip  (optional)
        Number of results to be skipped from the ordered list of results
     * @param $count  (optional)
        When the $count field is set to false, the response contains a count of the items present in the response. When the $count field is set to true, the response contains a count of all the items present on the server, and not just the ones in the response. When the $count field is not passed, it is false by default.
     * @param authorization  (optional)
        Authorization bearer token containing a JWT token.
     * @return BcknddockerRegistrySecretStatusResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretStatusResponse kubesubmitV4DockerRegistrySecretsQuery( @Nullable final Integer $top,  @Nullable final Integer $skip,  @Nullable final Boolean $count,  @Nullable final String authorization) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/admin/dockerRegistrySecrets").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$top", $top));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$skip", $skip));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$count", $count));
        

        if (authorization != null)
            localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "Oauth2" };

        final ParameterizedTypeReference<BcknddockerRegistrySecretStatusResponse> localVarReturnType = new ParameterizedTypeReference<BcknddockerRegistrySecretStatusResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get a list of metadata of secrets.</p>
     * <p>Retrieve a list of metadata of the stored secrets </p>
     * <p><b>200</b> - The request was successful and the requested metadata for the secret will be returned. This includes a list of attributes of the stored secret like - creationTimestamp, namespace etc. The secret&#39;s data field is not returned.
     * <p><b>400</b> - The request was malformed and could thus not be processed.
     * <p><b>0</b> - HTTP status codes 401, 403 or 500. Response body contains further details.
     * @return BcknddockerRegistrySecretStatusResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public BcknddockerRegistrySecretStatusResponse kubesubmitV4DockerRegistrySecretsQuery() throws OpenApiRequestException {
        return kubesubmitV4DockerRegistrySecretsQuery(null, null, null, null);
    }
}