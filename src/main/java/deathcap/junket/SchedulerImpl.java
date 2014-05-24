package deathcap.junket;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scheduler.BukkitWorker;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class SchedulerImpl implements BukkitScheduler {
    @Override
    public int scheduleSyncDelayedTask(Plugin plugin, Runnable task, long delay) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int scheduleSyncDelayedTask(Plugin plugin, Runnable task) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int scheduleSyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int scheduleAsyncDelayedTask(Plugin plugin, Runnable task, long delay) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int scheduleAsyncDelayedTask(Plugin plugin, Runnable task) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int scheduleAsyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> Future<T> callSyncMethod(Plugin plugin, Callable<T> task) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void cancelTask(int taskId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void cancelTasks(Plugin plugin) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void cancelAllTasks() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isCurrentlyRunning(int taskId) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isQueued(int taskId) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<BukkitWorker> getActiveWorkers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<BukkitTask> getPendingTasks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTask(Plugin plugin, Runnable task) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTaskAsynchronously(Plugin plugin, Runnable task) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTaskLater(Plugin plugin, Runnable task, long delay) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTaskLaterAsynchronously(Plugin plugin, Runnable task, long delay) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTaskTimer(Plugin plugin, Runnable task, long delay, long period) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BukkitTask runTaskTimerAsynchronously(Plugin plugin, Runnable task, long delay, long period) throws IllegalArgumentException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
