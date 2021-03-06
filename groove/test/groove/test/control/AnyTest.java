/* GROOVE: GRaphs for Object Oriented VErification
 * Copyright 2003--2007 University of Twente
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * $Id: AnyTest.java 5780 2016-08-02 10:32:51Z rensink $
 */
package groove.test.control;

import org.junit.Test;

/**
 * Tests the qualified any construct.
 * @author Arend Rensink
 * @version $Revision $
 */
@SuppressWarnings("all")
public class AnyTest extends AControlTest {
    @Override
    protected String getDirectory() {
        return "junit/control/any.gps";
    }

    @Test
    public void testDefault() {
        explore("any", 2, 2, 3, 4);
        explore("sub1-any", 2, 1, 2, 1);
        explore("sub1-star-any", 2, 2, 2, 2);
    }

    @Test
    public void testSub1() {
        explore("sub1.any", 2, 2, 2, 3);
        explore("sub1.star-any", 2, 5, 2, 6);
        explore("sub1.sub1-any", 2, 1, 2, 1);
    }
}
