package nix

import com.google.inject.Scopes
import com.google.inject.Provides
import com.google.inject.AbstractModule

import pluto.Module as PlutoModule

/**
 * Guice module responsible to bootstrap all required
 * dependencies
 *
 * @since 0.1.0
 */
class Module extends AbstractModule {
  @Override
  void configure() {
    // Pluto's dependencies
    install(new PlutoModule())

    // Worker's own dependencies
    bind(Service).in(Scopes.SINGLETON)
    bind(DockerEventsPublisher).in(Scopes.SINGLETON)
    bind(Application).in(Scopes.SINGLETON)
  }
}
