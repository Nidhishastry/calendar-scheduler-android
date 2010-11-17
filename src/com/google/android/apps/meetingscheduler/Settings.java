/*
 * Copyright (c) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.apps.meetingscheduler;

/**
 * Settings and configuration for the Meeting Scheduler
 *
 * @since 2.2
 * @author Nicolas Garnier (nivco@google.com)
 */
public class Settings {

  /** Length of the meeting to find in minutes */
  public int meetingLength = 60;

  /** How long in the future do we have to look for in days */
  public int TimeSpan = 7;

  /**
   * True if we need to take into consideration some working hours instead of
   * matching any time in the day
   */
  public boolean useWorkingHours = false;

  /**
   * True if we should use the Google Calendar working hour setting of each
   * participant or false if we should just use the times manually set.
   */
  public boolean useWorkingHoursSetting = false;

  /** Time the working hours start in hours from midnight (0=midnight) */
  public double workingHoursStart = 9;

  /** Time the working hours end in hours from midnight (0=midnight) */
  public double workingHoursEnd = 18;

}