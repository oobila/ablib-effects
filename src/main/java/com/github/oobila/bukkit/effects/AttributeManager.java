package com.github.oobila.bukkit.effects;

import com.github.oobila.bukkit.common.ABCommon;
import com.github.oobila.bukkit.common.CannotFindABCoreException;
import com.github.oobila.bukkit.common.ServerContextException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.logging.Level;

import static com.github.oobila.bukkit.common.ABCommon.log;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AttributeManager {

    public static Attribute register(Attribute attribute) {
        return register(attribute, Attribute.class);
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> register(Effect<T> effect) {
        return (Effect<T>) register(effect, Effect.class);
    }

    private static Attribute register(Attribute attribute, Class<? extends Attribute> type) {
        try {
            return ABCommon.store(type, attribute.getName(), attribute);
        } catch (CannotFindABCoreException e) {
            log(Level.SEVERE, e.getMessage());
        } catch (ServerContextException e) {
            log(Level.WARNING, "{0} [{1}] already exists", type.getSimpleName(), attribute.getName());
        }
        return null;
    }

    public static Attribute remove(Attribute attribute) {
        try {
            return ABCommon.remove(Attribute.class, attribute.getName());
        } catch (CannotFindABCoreException e) {
            log(Level.SEVERE, e.getMessage());
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> remove(Effect<T> effect) {
        try {
            return ABCommon.remove(Effect.class, effect.getName());
        } catch (CannotFindABCoreException e) {
            log(Level.SEVERE, e.getMessage());
        }
        return null;
    }

    public static Attribute attributeOf(String name) {
        try {
            return ABCommon.get(Attribute.class, name);
        } catch (CannotFindABCoreException e) {
            log(Level.SEVERE, e.getMessage());
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <T> Effect<T> effectOf(String name) {
        try {
            return ABCommon.get(Effect.class, name);
        } catch (CannotFindABCoreException e) {
            log(Level.SEVERE, e.getMessage());
        }
        return null;
    }
}