/**
 * Copyright 2015 freiheit.com technologies gmbh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.freiheit.fuava.simplebatch.fetch;

import com.freiheit.fuava.simplebatch.util.StringUtils;

public class FetchedItem<T> {
    public static final int FIRST_ROW = 0;
    private final int num;
    private final T value;

    protected FetchedItem( final T value, final int num ) {
        this.value = value;
        this.num = num;
    }

    public static <T> FetchedItem<T> of( final T value, final int rowNum ) {
        return new FetchedItem<T>( value, rowNum );

    }

    /**
     * The number of the item within the fetcher run.
     */
    public int getNum() {
        return num;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[" + this.num + "] " + StringUtils.toMaxLengthString( value, 40 );
    }
}
