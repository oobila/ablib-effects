package com.github.oobila.bukkit.effects;

import lombok.Getter;

@Getter
public enum PotionEffectType {

    SPEED(org.bukkit.potion.PotionEffectType.SPEED),
    SLOWNESS(org.bukkit.potion.PotionEffectType.SLOWNESS),
    HASTE(org.bukkit.potion.PotionEffectType.HASTE),
    MINING_FATIGUE(org.bukkit.potion.PotionEffectType.MINING_FATIGUE),
    STRENGTH(org.bukkit.potion.PotionEffectType.STRENGTH),
    INSTANT_HEALTH(org.bukkit.potion.PotionEffectType.INSTANT_HEALTH),
    INSTANT_DAMAGE(org.bukkit.potion.PotionEffectType.INSTANT_DAMAGE),
    JUMP_BOOST(org.bukkit.potion.PotionEffectType.JUMP_BOOST),
    NAUSEA(org.bukkit.potion.PotionEffectType.NAUSEA),
    REGENERATION(org.bukkit.potion.PotionEffectType.REGENERATION),
    RESISTANCE(org.bukkit.potion.PotionEffectType.RESISTANCE),
    FIRE_RESISTANCE(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE),
    WATER_BREATHING(org.bukkit.potion.PotionEffectType.WATER_BREATHING),
    INVISIBILITY(org.bukkit.potion.PotionEffectType.INVISIBILITY),
    BLINDNESS(org.bukkit.potion.PotionEffectType.BLINDNESS),
    NIGHT_VISION(org.bukkit.potion.PotionEffectType.NIGHT_VISION),
    HUNGER(org.bukkit.potion.PotionEffectType.HUNGER),
    WEAKNESS(org.bukkit.potion.PotionEffectType.WEAKNESS),
    POISON(org.bukkit.potion.PotionEffectType.POISON),
    WITHER(org.bukkit.potion.PotionEffectType.WITHER),
    HEALTH_BOOST(org.bukkit.potion.PotionEffectType.HEALTH_BOOST),
    ABSORPTION(org.bukkit.potion.PotionEffectType.ABSORPTION),
    SATURATION(org.bukkit.potion.PotionEffectType.SATURATION),
    GLOWING(org.bukkit.potion.PotionEffectType.GLOWING),
    LEVITATION(org.bukkit.potion.PotionEffectType.LEVITATION),
    LUCK(org.bukkit.potion.PotionEffectType.LUCK),
    UNLUCK(org.bukkit.potion.PotionEffectType.UNLUCK),
    SLOW_FALLING(org.bukkit.potion.PotionEffectType.SLOW_FALLING),
    CONDUIT_POWER(org.bukkit.potion.PotionEffectType.CONDUIT_POWER),
    DOLPHINS_GRACE(org.bukkit.potion.PotionEffectType.DOLPHINS_GRACE),
    BAD_OMEN(org.bukkit.potion.PotionEffectType.BAD_OMEN),
    HERO_OF_THE_VILLAGE(org.bukkit.potion.PotionEffectType.HERO_OF_THE_VILLAGE),
    DARKNESS(org.bukkit.potion.PotionEffectType.DARKNESS),
    TRIAL_OMEN(org.bukkit.potion.PotionEffectType.TRIAL_OMEN),
    RAID_OMEN(org.bukkit.potion.PotionEffectType.RAID_OMEN),
    WIND_CHARGED(org.bukkit.potion.PotionEffectType.WIND_CHARGED),
    WEAVING(org.bukkit.potion.PotionEffectType.WEAVING),
    OOZING(org.bukkit.potion.PotionEffectType.OOZING),
    INFESTED(org.bukkit.potion.PotionEffectType.INFESTED),
    BREATH_OF_THE_NAUTILUS(org.bukkit.potion.PotionEffectType.BREATH_OF_THE_NAUTILUS);

    private final org.bukkit.potion.PotionEffectType type;

    PotionEffectType(org.bukkit.potion.PotionEffectType type) {
        this.type = type;
    }
}
