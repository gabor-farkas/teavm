/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.dom.html;

import org.teavm.jso.JSProperty;

/**
 *
 * @author Alexey Andreev <konsoletyper@gmail.com>
 */
public interface HTMLLinkElement extends HTMLElement {
    @JSProperty
    String getHref();

    @JSProperty
    void setHref(String href);

    @JSProperty
    String getCrossOrigin();

    @JSProperty
    void setCrossOrigin(String crossOrigin);

    @JSProperty
    String getRel();

    @JSProperty
    void setRel(String rel);

    @JSProperty
    String getMedia();

    @JSProperty
    void setMedia(String media);

    @JSProperty
    String getHreflang();

    @JSProperty
    void setHreflang(String hreflang);

    @JSProperty
    String getType();

    @JSProperty
    void setType(String property);
}
