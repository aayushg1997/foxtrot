/**
 * Copyright 2014 Flipkart Internet Pvt. Ltd.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flipkart.foxtrot.core.common;

import com.flipkart.foxtrot.common.ActionRequest;
import com.google.common.annotations.VisibleForTesting;

/**
 * Created by rishabh.goyal on 02/05/14.
 */

@VisibleForTesting
public class NonCacheableActionRequest extends ActionRequest {
    public NonCacheableActionRequest() {
        super("test");
    }
}
