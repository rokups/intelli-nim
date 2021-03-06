/*
 *    Intellij platform plugin which adds support Nim programming language
 *    Copyright (C) 2015  intelli-nim developers
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 */
package nim.sdk;

import com.intellij.openapi.projectRoots.SdkAdditionalData;

import java.util.ArrayList;

public class NimSdkData implements SdkAdditionalData {

    public ArrayList<NimSdkPlatformData> platforms = new ArrayList<>();

    public String SDK_PATH = "";
    public String NIM_BIN_PATH = "";
    public String NIM_LIB_PATH = "";
    public String NIM_VERSION = "";

    public NimSdkData() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
