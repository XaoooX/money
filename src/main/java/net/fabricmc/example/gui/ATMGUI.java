package net.fabricmc.example.gui;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;


@Environment(EnvType.CLIENT)
public class ATMGUI implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("ATM", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_0,"test"));
    }}
