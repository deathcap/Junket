package deathcap.junket;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.ServicesManager;

import java.util.Collection;
import java.util.List;

public class ServicesManagerImpl implements ServicesManager {
    @Override
    public <T> void register(Class<T> service, T provider, Plugin plugin, ServicePriority priority) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterAll(Plugin plugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregister(Class<?> service, Object provider) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregister(Object provider) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> T load(Class<T> service) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> RegisteredServiceProvider<T> getRegistration(Class<T> service) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<RegisteredServiceProvider<?>> getRegistrations(Plugin plugin) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> Collection<RegisteredServiceProvider<T>> getRegistrations(Class<T> service) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Class<?>> getKnownServices() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> boolean isProvidedFor(Class<T> service) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
