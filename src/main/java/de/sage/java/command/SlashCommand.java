package de.sage.java.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.time.Instant;

public class SlashCommand extends ListenerAdapter {

    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();

        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Hello " + event.getUser().getGlobalName() + "!", "https://eftron24.win");
        builder.setColor(Color.decode("#5ce2ce"));
        builder.setAuthor("SageSphinx63920", "https://sagesphinx63920.dev", "https://cdn.discordapp.com/avatars/660887621169446964/0bf3ce7a76dc47615984dca041930280.webp?size=512");
        builder.setTimestamp(Instant.now());
        builder.setDescription("I see.... You have summoned me! \n \n You know, the life of a discord radio bot is hard work. I have to play music, skip music, and even stop music! I know my last vacation was very long, but I'm back now! I just need a couple weeks to get back into the groove of things. \n \n So to make it clear: I'm going back to work soon!!! \n \n Maybe take a look at my Website to see what I'm up to! \n Click [here <3](https://eftron24.win) \n \n I'm looking forward to seeing you again! \n \n Best regards <3, \n <@660887621169446964>, The Developer of Eftron 24/7! \n *and <@658302673707204627>, somewhat useful Dude*");
        builder.setThumbnail("https://media1.tenor.com/m/7tmctu7fDOQAAAAC/soon-cat.gif");
        builder.setFooter("Eftron 24/7 | New bot coming soon!", event.getJDA().getSelfUser().getAvatarUrl());
        builder.setImage("https://cdn.discordapp.com/attachments/747061203385450499/1242254533552242838/soon-no_bg.png?ex=664d2b30&is=664bd9b0&hm=b993297e98682d70b3311e1bcd64116520594a31d70dfc40a5c8f16220fbc340&");

        event.getHook().editOriginalEmbeds(builder.build()).setActionRow(
                Button.success("like-1", Emoji.fromCustom("dscordboost", 759539475763953664L, true)),
                Button.primary("discord", "Join our Discord Server!").withEmoji(Emoji.fromCustom("nitrowumps", 759536516845404160L, true)),
                Button.success("like-2", Emoji.fromCustom("dscordboost", 759539475763953664L, true)))
                .queue();
    }
}