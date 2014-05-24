package deathcap.junket;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.bukkit.plugin.messaging.PluginMessageListenerRegistration;

import java.util.Set;

public class MessengerImpl implements Messenger {
    @Override
    public boolean isReservedChannel(String channel) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void registerOutgoingPluginChannel(Plugin plugin, String channel) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterOutgoingPluginChannel(Plugin plugin, String channel) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterOutgoingPluginChannel(Plugin plugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PluginMessageListenerRegistration registerIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterIncomingPluginChannel(Plugin plugin, String channel) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterIncomingPluginChannel(Plugin plugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getOutgoingChannels() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getOutgoingChannels(Plugin plugin) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getIncomingChannels() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<String> getIncomingChannels(Plugin plugin) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(String channel) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin, String channel) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isRegistrationValid(PluginMessageListenerRegistration registration) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isIncomingChannelRegistered(Plugin plugin, String channel) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isOutgoingChannelRegistered(Plugin plugin, String channel) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispatchIncomingMessage(Player source, String channel, byte[] message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
