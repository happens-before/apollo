package com.ctrip.apollo.internals;

import java.util.Properties;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface ConfigRepository {
  /**
   * Get the config from this repository.
   * @return config
   */
  public Properties getConfig();

  /**
   * Set the fallback repo for this repository.
   * @param fallbackConfigRepository the fallback repo
   */
  public void setFallback(ConfigRepository fallbackConfigRepository);

  /**
   * Add change listener.
   * @param listener the listener to observe the changes
   */
  public void addChangeListener(RepositoryChangeListener listener);

  /**
   * Remove change listener.
   * @param listener the listener to remove
   */
  public void removeChangeListener(RepositoryChangeListener listener);
}
