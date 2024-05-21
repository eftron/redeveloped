package de.sage.java.command;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ButtonListener extends ListenerAdapter {

    public void onButtonInteraction(ButtonInteractionEvent event) {
        switch (event.getComponentId()) {
            case "like-1", "like-2" -> event.reply("<3").setEphemeral(true).queue();
            case "discord" -> event.reply("Our discord is [here](https://discord.gg/nFaDeRhazv)").setEphemeral(true).queue();
            default -> event.deferEdit().queue();
        }
    }
}
