package net.agedaddition.config;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.gui.ConfigScreenProvider;
import net.agedaddition.access.ScreenAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModMenuIntegration implements ModMenuApi {

    @Override
    @SuppressWarnings("deprecation")
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            ConfigScreenProvider<AgedAdditionConfig> supplier = (ConfigScreenProvider<AgedAdditionConfig>) AutoConfig.getConfigScreen(AgedAdditionConfig.class, parent);
            supplier.setBuildFunction(builder -> {
                builder.setAfterInitConsumer(screen -> {
                    // MinecraftClient client = MinecraftClient.getInstance();
                    // if (client.player != null) {
                    ((ScreenAccess) screen).addAnotherDrawable(ButtonWidget.builder(Text.translatable("text.autoconfig.agedaddition.option.print"), (button) -> {
                        writeId("---Effects---");
                        for (Identifier identifier : Registries.STATUS_EFFECT.getIds()) {
                            writeId(identifier.toString());
                        }
                        writeId("---Attributes---");
                        for (Identifier identifier : Registries.ATTRIBUTE.getIds()) {
                            writeId(identifier.toString());
                        }
                    }).dimensions((screen.width - 104), 4, 50, 20).build());
                    // }
                });
                return builder.build();
            });
            return supplier.get();
        };
    }

    private static void writeId(String string) {
        try (FileWriter idFile = new FileWriter("printlist.json", true)) {
            idFile.append("\"" + string + "\",");
            idFile.append(System.lineSeparator());
        } catch (IOException e) {
        }
    }
}
