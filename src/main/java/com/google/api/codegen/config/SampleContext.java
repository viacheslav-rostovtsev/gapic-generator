/* Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.config;

import com.google.api.codegen.metacode.InitCodeContext.InitCodeOutputType;
import com.google.api.codegen.viewmodel.CallingForm;
import com.google.auto.value.AutoValue;

/** The context of transforming a sample into a view model. */
@AutoValue
public abstract class SampleContext {

  /** The unique sample ID generated by the generator. */
  public abstract String uniqueSampleId();

  /**
   * A valid calling form for the the method and matches one of the calling_pattern specified by the
   * user.
   */
  public abstract CallingForm callingForm();

  public abstract SampleSpec.SampleType sampleType();

  public abstract SampleConfig sampleConfig();

  /** Whether to pass a single object or a list of fields to the method call. */
  public abstract InitCodeOutputType initCodeOutputType();

  public static Builder newBuilder() {
    return new AutoValue_SampleContext.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder uniqueSampleId(String val);

    public abstract Builder callingForm(CallingForm val);

    public abstract Builder sampleType(SampleSpec.SampleType val);

    public abstract Builder sampleConfig(SampleConfig val);

    public abstract Builder initCodeOutputType(InitCodeOutputType val);

    public abstract SampleContext build();
  }
}