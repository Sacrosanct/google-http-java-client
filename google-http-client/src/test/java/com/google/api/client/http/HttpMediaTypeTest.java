/*
 * Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.http;

import junit.framework.TestCase;

/**
 * Tests for the {@link HttpMediaType} class.
 *
 * @author Matthias Linder (mlinder)
 * @since 1.10
 */
public class HttpMediaTypeTest extends TestCase {

  public void testBuild() {
    HttpMediaType m = new HttpMediaType("main", "sub");
    assertEquals("main/sub", m.build());
  }

  public void testBuild_star() {
    HttpMediaType m = new HttpMediaType("*", "*");
    assertEquals("*/*", m.build());
  }

  public void testBuild_parameters() {
    HttpMediaType m = new HttpMediaType("main", "sub");
    m.setParameter("bbb", ";/ ");
    m.setParameter("aaa", "1");
    assertEquals("main/sub; aaa=1; bbb=\";/ \"", m.build());
  }

  public void testBuild_parametersCasing() {
    HttpMediaType m = new HttpMediaType("main", "sub");
    m.setParameter("foo", "FooBar");
    assertEquals("main/sub; foo=FooBar", m.build());
  }

  public void testFromString() {
    HttpMediaType m = new HttpMediaType("main/sub");
    assertEquals("main", m.getType());
    assertEquals("sub", m.getSubType());
  }

  public void testFromString_star() {
    HttpMediaType m = new HttpMediaType("text/*");
    assertEquals("text", m.getType());
    assertEquals("*", m.getSubType());
  }

  public void testFromString_null() {
    try {
      new HttpMediaType(null);
      fail("Method did not NullPointerException");
    } catch (NullPointerException expected) {}
  }

  public void testFromString_full() {
    HttpMediaType m = new HttpMediaType("text/plain; charset=utf-8; foo=\"foo; =bar\"");
    assertEquals("text", m.getType());
    assertEquals("plain", m.getSubType());
    assertEquals("utf-8", m.getParameter("charset"));
    assertEquals("foo; =bar", m.getParameter("foo"));
    assertEquals(2, m.getParameters().size());
  }

  public void testFromString_case() {
    HttpMediaType m = new HttpMediaType("text/plain; Foo=Bar");
    assertEquals("Bar", m.getParameter("fOO"));
  }

  public void testSetMainType() {
    assertEquals("foo", new HttpMediaType("text", "plain").setType("foo").getType());
  }

  public void testSetMainType_invalid() {
    try {
      new HttpMediaType("text", "plain").setType("foo/bar");
      fail("Method did not throw IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  public void testSetSubType() {
    assertEquals("foo", new HttpMediaType("text", "plain").setSubType("foo").getSubType());
  }

  public void testSetSubType_invalid() {
    try {
      new HttpMediaType("text", "plain").setSubType("foo/bar");
      fail("Method did not throw IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  public void testSetParameter_casing() {
    HttpMediaType mt = new HttpMediaType("text", "plain");
    mt.setParameter("Foo", "Bar");
    assertEquals("Bar", mt.getParameter("FOO"));
  }

  private boolean containsInvalidChar(String str) {
    try {
      new HttpMediaType("text", "plain").setSubType(str);
      return false;
    } catch (IllegalArgumentException expected) {
      return true;
    }
  }

  private void assertFullSerialization(String str) {
    assertEquals(str, new HttpMediaType(str).build());
  }

  public void testFullSerialization() {
    assertFullSerialization("text/plain");
    assertFullSerialization("text/plain; foo=bar");
    assertFullSerialization("text/plain; foo=foo; bar=bar");
    assertFullSerialization("text/plain; foo=Foo; bar=\"Bar Bar\"");
    assertFullSerialization("text/*");
    assertFullSerialization("*/*");
    assertFullSerialization("text/*; charset=utf-8; foo=\"bar bar bar\"");
  }

  public void testInvalidCharsRegex() {
    assertEquals(false, containsInvalidChar("foo"));
    assertEquals(false, containsInvalidChar("X-Foo-Bar"));
    assertEquals(true, containsInvalidChar("foo/bar"));
    assertEquals(true, containsInvalidChar("  foo"));
    assertEquals(true, containsInvalidChar("foo;bar"));
  }
}
