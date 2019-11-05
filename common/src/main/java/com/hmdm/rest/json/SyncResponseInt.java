/*
 *
 * Headwind MDM: Open Source Android MDM Software
 * https://h-mdm.com
 *
 * Copyright (C) 2019 Headwind Solutions LLC (http://h-sms.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hmdm.rest.json;

import com.hmdm.persistence.domain.Application;

import java.util.List;

/**
 * <p>An interface for the response sent to device in response to request for configuration synchronization.</p>
 *
 * @author isv
 */
public interface SyncResponseInt {

    String getBackgroundColor();

    String getTextColor();

    String getBackgroundImageUrl();

    List<Application> getApplications();

    String getPassword();

    String getImei();

    String getPhone();

    String getIconSize();

    String getTitle();

    Boolean getGps();

    Boolean getBluetooth();

    Boolean getWifi();

    Boolean getMobileData();

    boolean isKioskMode();

    String getMainApp();

    boolean isLockStatusBar();

    int getSystemUpdateType();

    String getSystemUpdateFrom();

    String getSystemUpdateTo();

    List<SyncApplicationSettingInt> getApplicationSettings();
}