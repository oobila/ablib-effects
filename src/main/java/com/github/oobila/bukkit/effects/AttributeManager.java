package com.github.oobila.bukkit.effects;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import static com.github.oobila.bukkit.common.ABCommon.log;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AttributeManager {

    private static final Map<String, Attribute> ATTRIBUTE_MAP = new HashMap<>();
    private static final Map<String, Effect<?>> EFFECT_MAP = new HashMap<>();

    public static Attribute register(Attribute attribute) {
        return register(attribute, ATTRIBUTE_MAP);
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> register(Effect<T> effect) {
        return (Effect<T>) register(effect, EFFECT_MAP);
    }

    private static <T extends Attribute> Attribute register(T attribute, Map<String, T> map) {
        if (map.containsKey(attribute.getName())) {
            log(Level.WARNING, "[{0}] already exists", attribute.getName());
            return null;
        }
        return map.put(attribute.getName(), attribute);
    }

    public static Collection<Attribute> getAttributes() {
        return ATTRIBUTE_MAP.values();
    }

    @SuppressWarnings("unchecked")
    public static <T extends Effect<T>> Collection<T> getEffects() {
        return (Collection<T>) EFFECT_MAP.values();
    }

    public static Attribute remove(Attribute attribute) {
        return ATTRIBUTE_MAP.remove(attribute.getName());
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> remove(Effect<T> effect) {
        return (Effect<T>) EFFECT_MAP.remove(effect.getName());
    }

    public static Attribute attributeOf(String name) {
        return ATTRIBUTE_MAP.get(name);
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> effectOf(String name) {
        return (Effect<T>) EFFECT_MAP.get(name);
    }
}