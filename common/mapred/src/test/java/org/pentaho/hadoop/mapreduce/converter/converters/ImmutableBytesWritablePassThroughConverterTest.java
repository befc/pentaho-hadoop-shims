/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.hadoop.mapreduce.converter.converters;

import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ImmutableBytesWritablePassThroughConverterTest {

  @Test
  public void canConvert() throws Exception {
    ImmutableBytesWritablePassThroughConverter c =
      new ImmutableBytesWritablePassThroughConverter();

    assertTrue( c.canConvert( ImmutableBytesWritable.class, Object.class ) );
    assertFalse( c.canConvert( null, null ) );
    assertFalse( c.canConvert( Object.class, ImmutableBytesWritable.class ) );
  }
}
