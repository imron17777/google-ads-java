/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.SharedCriterion;
import com.google.ads.googleads.v4.services.stub.SharedCriterionServiceStub;
import com.google.ads.googleads.v4.services.stub.SharedCriterionServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage shared criteria.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
 *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER]", "[SHARED_CRITERION]");
 *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the sharedCriterionServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SharedCriterionServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SharedCriterionServiceSettings sharedCriterionServiceSettings =
 *     SharedCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create(sharedCriterionServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SharedCriterionServiceSettings sharedCriterionServiceSettings =
 *     SharedCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create(sharedCriterionServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SharedCriterionServiceClient implements BackgroundResource {
  private final SharedCriterionServiceSettings settings;
  private final SharedCriterionServiceStub stub;

  /** Constructs an instance of SharedCriterionServiceClient with default settings. */
  public static final SharedCriterionServiceClient create() throws IOException {
    return create(SharedCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SharedCriterionServiceClient create(SharedCriterionServiceSettings settings)
      throws IOException {
    return new SharedCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use SharedCriterionServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SharedCriterionServiceClient create(SharedCriterionServiceStub stub) {
    return new SharedCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SharedCriterionServiceClient(SharedCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((SharedCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SharedCriterionServiceClient(SharedCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SharedCriterionServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SharedCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER]", "[SHARED_CRITERION]");
   *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the shared criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SharedCriterion getSharedCriterion(SharedCriterionName resourceName) {
    GetSharedCriterionRequest request =
        GetSharedCriterionRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getSharedCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER]", "[SHARED_CRITERION]");
   *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the shared criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SharedCriterion getSharedCriterion(String resourceName) {
    GetSharedCriterionRequest request =
        GetSharedCriterionRequest.newBuilder().setResourceName(resourceName).build();
    return getSharedCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER]", "[SHARED_CRITERION]");
   *   GetSharedCriterionRequest request = GetSharedCriterionRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SharedCriterion getSharedCriterion(GetSharedCriterionRequest request) {
    return getSharedCriterionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER]", "[SHARED_CRITERION]");
   *   GetSharedCriterionRequest request = GetSharedCriterionRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;SharedCriterion&gt; future = sharedCriterionServiceClient.getSharedCriterionCallable().futureCall(request);
   *   // Do something
   *   SharedCriterion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSharedCriterionRequest, SharedCriterion>
      getSharedCriterionCallable() {
    return stub.getSharedCriterionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedCriteriaResponse response = sharedCriterionServiceClient.mutateSharedCriteria(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose shared criteria are being modified.
   * @param operations Required. The list of operations to perform on individual shared criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedCriteriaResponse mutateSharedCriteria(
      String customerId, List<SharedCriterionOperation> operations) {
    MutateSharedCriteriaRequest request =
        MutateSharedCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateSharedCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedCriteriaRequest request = MutateSharedCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateSharedCriteriaResponse response = sharedCriterionServiceClient.mutateSharedCriteria(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedCriteriaResponse mutateSharedCriteria(
      MutateSharedCriteriaRequest request) {
    return mutateSharedCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedCriteriaRequest request = MutateSharedCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateSharedCriteriaResponse&gt; future = sharedCriterionServiceClient.mutateSharedCriteriaCallable().futureCall(request);
   *   // Do something
   *   MutateSharedCriteriaResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateSharedCriteriaRequest, MutateSharedCriteriaResponse>
      mutateSharedCriteriaCallable() {
    return stub.mutateSharedCriteriaCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
