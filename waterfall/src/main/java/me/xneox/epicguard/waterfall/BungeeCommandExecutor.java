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

package me.xneox.epicguard.waterfall;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

// why bungee... why Command is an abstract class?
public class BungeeCommandExecutor extends Command implements TabExecutor {
  private final EpicGuardWaterfall epicGuardWaterfall;

  public BungeeCommandExecutor(EpicGuardWaterfall epicGuardWaterfall) {
    super("epicguard", "epicguard.admin", "guard", "eg", "ab", "antibot");
    this.epicGuardWaterfall = epicGuardWaterfall;
  }

  @Override
  public void execute(CommandSender sender, String[] args) {
    this.epicGuardWaterfall.epicGuard().commandHandler().handleCommand(args, this.epicGuardWaterfall.adventure().sender(sender));
  }

  @Override
  public Iterable<String> onTabComplete(CommandSender sender, String[] args) {
    return this.epicGuardWaterfall.epicGuard().commandHandler().handleSuggestions(args);
  }
}
