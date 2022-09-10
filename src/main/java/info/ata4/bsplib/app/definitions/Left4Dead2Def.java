package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class Left4Dead2Def {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Left 4 Dead 2")
			.setAppId(SourceAppId.LEFT_4_DEAD_2)
			.setVersionMin(21)
			.setFilePattern(Pattern.compile("^c\\d{1,2}m\\d{1,2}_"))
			.setEntities(
					"ambient_music",
					"commentary_zombie_spawner",
					"env_airstrike_indoors",
					"env_outtro_stats",
					"env_player_blocker",
					"env_rock_launcher",
					"env_tonemap_controller_ghost",
					"env_tonemap_controller_infected",
					"env_weaponfire",
					"filter_activator_infected_class",
					"filter_health",
					"filter_melee_damage",
					"func_block_charge",
					"func_button_timed",
					"func_elevator",
					"func_extinguisher",
					"func_nav_attribute_region",
					"func_nav_avoidance_obstacle",
					"func_nav_blocker",
					"func_nav_connection_blocker",
					"func_orator",
					"func_playerinfected_clip",
					"func_ragdoll_fader",
					"game_scavenge_progress_display",
					"info_ambient_mob",
					"info_ambient_mob_end",
					"info_ambient_mob_start",
					"info_director",
					"info_elevator_floor",
					"info_goal_infected_chase",
					"info_item_position",
					"info_l4d1_survivor_spawn",
					"info_map_parameters_versus",
					"info_remarkable",
					"info_survivor_position",
					"info_survivor_rescue",
					"info_zombie_border",
					"info_zombie_spawn",
					"logic_director_query",
					"logic_game_event",
					"logic_versus_random",
					"point_deathfall_camera",
					"point_prop_use_target",
					"point_viewcontrol_survivor",
					"prop_car_alarm",
					"prop_car_glass",
					"prop_door_rotating_checkpoint",
					"prop_fuel_barrel",
					"prop_health_cabinet",
					"prop_minigun",
					"prop_minigun_l4d1",
					"prop_mounted_machine_gun",
					"prop_wall_breakable",
					"trigger_active_weapon_detect",
					"trigger_auto_crouch",
					"trigger_escape",
					"trigger_finale",
					"trigger_hurt_ghost",
					"trigger_upgrade_laser_sight",
					"upgrade_spawn",
					"weapon_adrenaline_spawn",
					"weapon_ammo_spawn",
					"weapon_autoshotgun_spawn",
					"weapon_chainsaw_spawn",
					"weapon_defibrillator_spawn",
					"weapon_first_aid_kit_spawn",
					"weapon_gascan_spawn",
					"weapon_grenade_launcher_spawn",
					"weapon_hunting_rifle_spawn",
					"weapon_item_spawn",
					"weapon_melee_spawn",
					"weapon_molotov_spawn",
					"weapon_pain_pills_spawn",
					"weapon_pipe_bomb_spawn",
					"weapon_pistol_magnum_spawn",
					"weapon_pistol_spawn",
					"weapon_pumpshotgun_spawn",
					"weapon_rifle_ak47_spawn",
					"weapon_rifle_desert_spawn",
					"weapon_rifle_m60_spawn",
					"weapon_rifle_spawn",
					"weapon_scavenge_item_spawn",
					"weapon_shotgun_chrome_spawn",
					"weapon_shotgun_spas_spawn",
					"weapon_smg_silenced_spawn",
					"weapon_smg_spawn",
					"weapon_sniper_military_spawn",
					"weapon_spawn",
					"weapon_upgradepack_explosive_spawn",
					"weapon_upgradepack_incendiary_spawn",
					"weapon_vomitjar_spawn"
			)
			.build();
}