package de.sage.java;

import de.sage.java.command.ButtonListener;
import de.sage.java.command.SlashCommand;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createLight(Secrets.token);

        builder.setActivity(Activity.customStatus("being redeveloped and soon to be released!")).setStatus(OnlineStatus.IDLE);

        builder.addEventListeners(new SlashCommand());
        builder.addEventListeners(new ButtonListener());

        try {
            builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}