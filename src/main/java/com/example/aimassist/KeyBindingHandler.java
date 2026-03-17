package com.example.aimassist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.options.KeyBinding;
import net.fabricmc.api.ModInitializer;
import org.lwjgl.glfw.GLFW;

public class KeyBindingHandler implements ModInitializer {
    private static final String CATEGORY = "key.categories.aimassist";
    public static KeyBinding aimAssistToggle;

    @Override
    public void onInitialize() {
        aimAssistToggle = new KeyBinding("key.aimassist.toggle", GLFW.GLFW_KEY_G, CATEGORY);
    }
}