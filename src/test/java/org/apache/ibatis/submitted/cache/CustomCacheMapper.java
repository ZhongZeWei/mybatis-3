/**
 *    Copyright 2009-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.cache;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Property;

@CacheNamespace(implementation = CustomCache.class, properties = {
    @Property(name = "stringValue", value = "bar"),
    @Property(name = "integerValue", value = "99"),
    @Property(name = "longValue", value = "9999")
})
public interface CustomCacheMapper {
}