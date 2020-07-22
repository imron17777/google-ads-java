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
package com.google.ads.googleads.v2.services.stub;

import com.google.ads.googleads.v2.resources.KeywordPlanKeyword;
import com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest;
import com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest;
import com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class KeywordPlanKeywordServiceStub implements BackgroundResource {

  public UnaryCallable<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
      getKeywordPlanKeywordCallable() {
    throw new UnsupportedOperationException("Not implemented: getKeywordPlanKeywordCallable()");
  }

  public UnaryCallable<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
      mutateKeywordPlanKeywordsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateKeywordPlanKeywordsCallable()");
  }

  @Override
  public abstract void close();
}
