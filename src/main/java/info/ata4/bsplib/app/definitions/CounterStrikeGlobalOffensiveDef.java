package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class CounterStrikeGlobalOffensiveDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Counter-Strike: Global Offensive")
			.setAppId(SourceAppId.COUNTER_STRIKE_GO)
			.setVersionMin(21)
			.setFilePattern(Pattern.compile("^[de|cs]_"))
			.setEntities(
					"flashbang_projectile",
					"func_bomb_target",
					"func_buyzone",
					"func_hostage_rescue",
					"func_no_defuse",
					"hostage_entity",
					"info_deathmatch_spawn",
					"info_hostage_spawn",
					"info_player_counterterrorist",
					"info_player_terrorist",
					"planted_c4_training"
			)
			.build();
}