/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mercoa.api.resources.banklookup;

import com.mercoa.api.core.ClientOptions;
import com.mercoa.api.core.MercoaApiApiError;
import com.mercoa.api.core.MercoaApiError;
import com.mercoa.api.core.ObjectMappers;
import com.mercoa.api.core.RequestOptions;
import com.mercoa.api.resources.banklookup.requests.BankLookupRequest;
import com.mercoa.api.resources.banklookup.types.BankLookupResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class BankLookupClient {
    protected final ClientOptions clientOptions;

    public BankLookupClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Find bank account details
     */
    public BankLookupResponse find(BankLookupRequest request) {
        return find(request, null);
    }

    /**
     * Find bank account details
     */
    public BankLookupResponse find(BankLookupRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("bankLookup");
        httpUrl.addQueryParameter("routingNumber", request.getRoutingNumber());
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), BankLookupResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MercoaApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MercoaApiError("Network error executing HTTP request", e);
        }
    }
}
