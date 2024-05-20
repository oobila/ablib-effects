package com.github.oobila.bukkit.effects;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import static com.github.oobila.bukkit.common.ABCommon.log;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AttributeManager {

    private static final Map<Class<? extends Attribute>, Map<String, Attribute>> ATTRIBUTE_MAP = new HashMap<>();

    public static Attribute register(Attribute attribute) {
        return register(attribute, Attribute.class);
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> register(Effect<T> effect) {
        return (Effect<T>) register(effect, Effect.class);
    }

    private static Attribute register(Attribute attribute, Class<? extends Attribute> type) {
        ATTRIBUTE_MAP.putIfAbsent(type, new HashMap<>());
        if (ATTRIBUTE_MAP.get(type).containsKey(attribute.getName())) {
            log(Level.WARNING, "{0} [{1}] already exists", type.getSimpleName(), attribute.getName());
            return null;
        }
        return ATTRIBUTE_MAP.get(type).put(attribute.getName(), attribute);
    }

    private static Collection<Attribute> getAttributes(Class<? extends Attribute> type) {
        if (ATTRIBUTE_MAP.containsKey(type)) {
            return ATTRIBUTE_MAP.get(type).values();
        } else {
            return Collections.emptySet();
        }
    }

    private static Collection<Attribute> getAttributes() {
        List<Attribute> allAttributes = new ArrayList<>();
        ATTRIBUTE_MAP.keySet().forEach(key ->
            allAttributes.addAll(ATTRIBUTE_MAP.get(key).values())
        );
        return allAttributes;
    }

    public static Attribute remove(Attribute attribute) {
        return ATTRIBUTE_MAP.get(Attribute.class).remove(attribute.getName());
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> remove(Effect<T> effect) {
        return (Effect<T>) ATTRIBUTE_MAP.get(Effect.class).remove(effect.getName());
    }

    public static Attribute attributeOf(String name) {
        return ATTRIBUTE_MAP.get(Attribute.class).get(name);
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> effectOf(String name) {
        return (Effect<T>) ATTRIBUTE_MAP.get(Effect.class).get(name);
    }
}