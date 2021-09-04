/*
 * EpicGuard is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EpicGuard is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.xneox.epicguard.core.user;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/** Represents an player who is currently connected to the server. */
public class OnlineUser {
  private final UUID uuid;
  private boolean notifications;
  private boolean settingsChanged;

  public OnlineUser(UUID uuid) {
    this.uuid = uuid;
  }

  /** @return The user's UUID. */
  @NotNull
  public UUID uuid() {
    return uuid;
  }

  /** @return Whenever the user has enabled the status notifications. */
  public boolean notifications() {
    return notifications;
  }

  public void notifications(boolean notifications) {
    this.notifications = notifications;
  }

  /** @return Whenever the user has sent the Settings packet at least once. */
  public boolean settingsChanged() {
    return settingsChanged;
  }

  public void settingsChanged(boolean settingsChanged) {
    this.settingsChanged = settingsChanged;
  }
}
