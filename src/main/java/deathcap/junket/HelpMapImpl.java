package deathcap.junket;

import org.bukkit.help.HelpTopic;
import org.bukkit.help.HelpTopicFactory;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HelpMapImpl implements org.bukkit.help.HelpMap {
    @Override
    public HelpTopic getHelpTopic(String topicName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<HelpTopic> getHelpTopics() {
        return Collections.emptySet();
    }

    @Override
    public void addTopic(HelpTopic topic) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void registerHelpTopicFactory(Class<?> commandClass, HelpTopicFactory<?> factory) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getIgnoredPlugins() {
        return Collections.emptyList();
    }
}
