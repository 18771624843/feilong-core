/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.lang.numberutiltest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * The Class FeiLongNumberUtilSuiteTests.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
@RunWith(Suite.class)
@SuiteClasses({
                NumberUtilSetScaleTest.class,
                NumberUtilSetScaleParameterizedTest.class,
                NumberUtilSetScaleRoundingModeParameterizedTest.class,

                NumberUtilGetAddValueTest.class,
                NumberUtilGetMultiplyValueTest.class,
                NumberUtilGetMultiplyValueParameterizedTest.class,
                NumberUtilGetDivideValueTest.class,
                NumberUtilGetDivideValueParameterizedTest.class,

                NumberUtilGetProgressTest.class,
                NumberUtilGetProgressParameterizedTest.class,

                NumberUtilToStringTest.class,
                NumberUtilToStringParameterizedTest.class,
        //
})
public class FeiLongNumberUtilSuiteTests{

}
